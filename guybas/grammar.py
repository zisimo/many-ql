# Grammar
from pyparsing import Word, oneOf, OneOrMore, ZeroOrMore, Forward, Group, Literal, nums, restOfLine, Optional, delimitedList
from ast import *    

# Normal sentence grammar
endSignEsc      = Word('?', exact = 3) | Word ('.', exact = 3) | Word('!', exact = 3)
word            = Word("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890()[]{},@#$%^&*-+=/\'\"`~_") | endSignEsc
integer         = Word(nums).setName("integer")
hexaColor       = Word("#" + hexnums)
endSign         = oneOf(". ? !")
sentence        = (OneOrMore(word) + endSign).setParseAction(makeSentence)
sentences       = OneOrMore(sentence).setParseAction(makeSentence)
comment         = Literal("//") + restOfLine | cStyleComment

# Brackets
obrac           = Literal("{")
cbrac           = Literal("}")
opar            = Literal("(")
cpar            = Literal(")")
col             = Literal(":")

# Answer types
bool            = Word("True") | Word("False") | Word("bool")           
option          = Group(Suppress("Option:") + Optional(Word("Default:") + bool) + sentence)
multiOption     = Forward()
multiOption     <<= option + Optional(delimitedList(multiOption))
checkbox        = (Suppress("Checkbox") + Suppress(obrac) + multiOption + Suppress(cbrac)).setParseAction(Checkbox)
radiobutton     = (Suppress("Radiobox") + Suppress(obrac) + multiOption + Suppress(cbrac)).setParseAction(Radiobox)
scale           = (Suppress("Scale") + integer + integer).setParseAction(Scale) 

# Constraints
exp             = bool | Word("between") + integer + Word("and") + integer | integer | integer + Word(">=<") + integer
compare         = oneOf("> >= < <= ==")
condition       = Word("Question") + integer + compare + exp
pIf             = Word("if") + opar + condition + cpar
pElse           = Word("else")

# Form
fontProp        = (Word("font-family:") + word) | \
                  (Word("font-size:") + integer) | \
                  (Word("color:") + hexaColor)
font            = Word("Font") + obrac + \
                  ZeroOrMore(fontProp) + \
                  cbrac
formProp        = Word("Introduction:") + sentences | font  
category        = Word ("Category:") + word
hint            = Word ("Hint:") + sentence
questionProp    = font | category | hint               
answerType      = checkbox | radiobutton | scale | Word ("text") | bool
answer          = Word("Answer-type:") + answerType.setName("answer")
question        = Word("Question") + integer + col + sentence +\
                  obrac + answer + ZeroOrMore(questionProp) + cbrac  
questions       = OneOrMore(question)
questions2       = pIf + obrac + questions + cbrac + \
                  Optional(pElse + obrac + questions + cbrac) | \
                  questions
form            = word + ZeroOrMore(formProp) + OneOrMore(questions2)      

# Test
myfile = open('example.txt', 'r').read()
l = form.ignore(comment).parseString(myfile)
for i in l:
    print(i)