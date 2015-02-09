grammar TaZQL;

init  : form ;

form  : FORM SPACE ID SPACE questionblock ;
questionblock : OPENINGCURLYBRACKET questions CLOSINGCURLYBRACKET ;
questions : question questions | question ;
conditionblock : ifstatement ID questionblock;
ifstatement : IF OPENINGBRACKET ID CLOSINGBRACKET ; 

question : ID COLON QUOTATIONMARK STRING QUOTATIONMARK type SEMICOLON;
phrase : STRING SPACE phrase | STRING ; 
type : BOOLEAN | MONEY | MONEY calculationblock ;
calculationblock : OPENINGBRACKET calculation CLOSINGBRACKET ;
calculation : ID OPERATOR calculation | ID OPERATOR ID | UNARYOPERATOR ID;

FORM : 'form' ;
ID : [a-zA-Z0-9]+ ;
IF : 'if' ;
OPENINGBRACKET : '(' ;
CLOSINGBRACKET : ')' ;
OPENINGCURLYBRACKET : '{' ;
CLOSINGCURLYBRACKET : '}' ;
COLON : ':' ;
SEMICOLON : ';' ;
QUOTATIONMARK : '"' ;
QUESTIONMARK : '?' ;

BOOLEAN : 'boolean' ;
MONEY : 'money' ;
STRING : [a-zA-Z]+ ;
OPERATOR : '+' | '-' | '*' | '/' ;
UNARYOPERATOR : '-' | '+' ;

EMPTY : '';
NEWLINE : [\n]+ ;
SPACE : [' ']+ ;
WS : [ \t\r\n]+ -> skip ; // skip spaces, tabs, newlines

