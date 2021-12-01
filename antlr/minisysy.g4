grammar minisysy;    //定义规则文件grammar
@header {        //一种action,定义生成的词法语法解析文件的头，当使用java的时候，生成的类需要包名，可以在这里统一定义
 package antlr;
 }
//LEXERS
NUMBER: DECIMAL_CONST|OCTAL_CONST|HEXADECIMAL_CONST;
HEXADECIMAL_DIGIT:'0'|'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9'|'a'|'b'|'c'|'d'|'e'|'f'|'A'|'B'|'C'|'D'|'E'|'F';
NONZERO_DIGIT:'1'|'2'|'3'|'4'|'5'|'6'|'7'|'8'|'9';
DIGIT:'0'|NONZERO_DIGIT;
OCTAL_DIGIT:'0'|'1'|'2'|'3'|'4'|'5'|'6'|'7';
HEXADECIMAL_PREFIX:'0x'|'0X';
HEXADECIMAL_CONST:HEXADECIMAL_PREFIX (HEXADECIMAL_DIGIT)*;
OCTAL_CONST:'0'(OCTAL_DIGIT)*;
DECIMAL_CONST:NONZERO_DIGIT (DIGIT)*;
INDENT:'main';
FUNCTYPE:'int';
RETURN:'return';
LEFT_S:'(';
RIGHT_S:')';
LEFT_L:'{';
RIGHT_L:'}';
EXC:';';
//INVISIBLE
SPACE:[ \t\r\n]+->skip;
ONE_LINE:'/''/'(~'\n')*?'\n'->skip;
MULTI_LINE:'/*'.*?'*/'->skip;
//PARSERS
stmt : RETURN NUMBER EXC;
block : LEFT_L stmt RIGHT_L;
funcdef : FUNCTYPE INDENT LEFT_S RIGHT_S block;
comunit : funcdef;