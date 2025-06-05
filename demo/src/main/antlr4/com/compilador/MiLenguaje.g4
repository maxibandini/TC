grammar MiLenguaje;

// Regla parser mínima (requerida por ANTLR)
// Extendé la regla programa para incluir declaraciones
programa
    : (declaracionVariable | expr | literal | validacion | token)* EOF
    ;

// Reglas para análisis ascendente de expresiones
expr : expr SUM term     # Addition
     | term              # JustTerm
     ;
term : term MUL factor   # Multiplication
     | factor           # JustFactor
     ;

factor : PA expr PC      # Parentheses
       | INTEGER        # Number
       | DECIMAL        # DecimalNumber
       | ID             # Identifier
       ;


// Agregalo debajo de la regla "factor"
declaracionVariable
    : tipo ID IGUAL expr PYC      # DeclaracionInicializada
    | tipo ID PYC                 # DeclaracionSimple
    ;

tipo
    : INT
    | FLOAT
    | DOUBLE
    | CHAR
    | STRING_TIPO
    | VOID
    ;

literal
    : STRING
    | CHARACTER
    ;

validacion
    : EMAIL
    | CUIL
    | DNI
    | FECHA
    | IP
    | TARJETA_CREDITO
    ;


token : PA | PC | CA | CC | LA | LC | PYC | COMA | IGUAL | MAYOR | MAYOR_IGUAL 
      | MENOR | MENOR_IGUAL | EQL | DISTINTO | SUM | RES | MUL | DIV | MOD
      | OR | AND | NOT | FOR | WHILE | IF | ELSE | INT | CHAR | DOUBLE | VOID
      | RETURN | ID | INTEGER | DECIMAL | CHARACTER | OTRO 
      ;

fragment LETRA : [A-Za-z];
fragment DIGITO : [0-9];

// TOKENS 
PA   : '(' ;
PC   : ')' ;
CA   : '[' ;
CC   : ']' ;
LA   : '{' ;
LC   : '}' ;

PYC  : ';' ;
COMA : ',' ;

IGUAL : '=' ;

MAYOR  : '>' ;
MAYOR_IGUAL: '>=';
MENOR  : '<' ;
MENOR_IGUAL: '<=';
EQL  : '==';
DISTINTO  : '!=';

SUM  : '+' ;
RES  : '-' ;
MUL  : '*' ;
DIV  : '/' ;
MOD  : '%' ;

OR   : '||' ;
AND  : '&&' ;
NOT  : '!'  ;

FOR  : 'for';
WHILE: 'while';

IF   : 'if' ;
ELSE : 'else' ;

INT     : 'int' ;
CHAR    : 'char' ;
DOUBLE  : 'double' ;
VOID    : 'void' ;

RETURN : 'return';



// Nuevos tokens
INCREMENTO : '++' ;
DECREMENTO : '--' ;
TRUE : 'true' ;
FALSE : 'false' ;
FLOAT : 'float' ;
STRING_TIPO : 'string' ;
EMAIL : [a-zA-Z0-9._%+-]+ '@' [a-zA-Z0-9.-]+ '.' [a-zA-Z]+ ;
CUIL : ('20' | '23' | '24' | '27' | '30' | '33' | '34') '-' DIGITO DIGITO DIGITO DIGITO DIGITO DIGITO DIGITO DIGITO '-' DIGITO ;
DNI : DIGITO DIGITO DIGITO DIGITO DIGITO DIGITO DIGITO (DIGITO)? ;
FECHA : ('0' [1-9] | '1' [0-9] | '2' [0-9] | '3' [01]) '/' ('0' [1-9] | '1' [0-2]) '/' DIGITO DIGITO DIGITO DIGITO ;
IP : DIGITO+ '.' DIGITO+ '.' DIGITO+ '.' DIGITO+ ;
TARJETA_CREDITO : DIGITO DIGITO DIGITO DIGITO ' ' DIGITO DIGITO DIGITO DIGITO ' ' DIGITO DIGITO DIGITO DIGITO ' ' DIGITO DIGITO DIGITO DIGITO ;
STRING : '"' ( ~["] | '\\' . )* '"' ;

// Fragments nuevos
fragment LETRA_MINUSCULA : [a-záéíóúñ] ;
fragment MAYUSCULA : [A-ZÁÉÍÓÚÑ] ;
fragment SIMBOLO : [!@#$%^&*()_+=<>.?/-] ;


ID : (LETRA | '_') (LETRA | DIGITO | '_')*;

INTEGER : DIGITO+;
DECIMAL : INTEGER'.'INTEGER;
CHARACTER: '\'' (~['\r\n] | '\\' .) '\'' ;

// Comentarios - Se ignoran durante el análisis
//COMENTARIO_LINEA : '//' ~[\r\n]*; sin ocultar
COMENTARIO_LINEA : '//' ~[\r\n]* -> skip;
COMENTARIO_BLOQUE : '/*' .*? '*/' -> skip;

WS : [ \r\n\t] -> skip ;
OTRO : . ;