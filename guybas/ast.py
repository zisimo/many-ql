# Grammar
from pyparsing import *
       
# Answer types
class Option: 
    def __init__(self, tokens):
        if tokens[0] == "Default":
            if tokens[1] == "True":
                self.ev = True 
            else: 
                self.ev = False
            self.sentence = tokens[2]
        # Default is False
        else:   
            self.ev = False
            self.sentence = tokens[0]
    def __str__(self):
        return self.sentence + str(self.ev)
        
class Checkbox:
    def __init__(self, tokens):
        self.options = []
        for i in tokens:
            x = Option(i)
            self.options.append(x)
    def __str__(self):
        s = "Checkbox\n"
        for i in self.options:
            s += str(i) + "\n"
        return s
         
class Radiobox(Checkbox):
    def __str__(self):
        s = "Radiobox\n"
        for i in self.options:
            s += str(i) + "\n"
        return s
    def checkValid(self):
        count = 0
        for i in self.options:
            if i.ev == True:
                count += 1
        if count > 1:
            print("Warning: there are too many true values!")
            
class Scale:
    def __init__(self, tokens):
        self.min = int(tokens[0])
        self.max = int(tokens[1])
            
def makeSentence(tokens):
    return ' '.join(tokens) 