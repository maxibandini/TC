grammar MiLenguaje;

// Punto de entrada renombrado
inicio: (instruccionIniciales | nota)* EOF;

//Instrucciones que se pueden instanciar en ambito global
instruccionIniciales:
	definicionFuncion
	| definicionVariable
	| asignacionVariable;

// Instrucciones principales
instruccion:
	bucleFor
	| instruccionIniciales
	| condicionIf
	| bucleWhile
	| interrupcion
	| retornoInst
	| llamadaExpr PYC
	| expresion PYC;

// Invocación de funciones
llamadaExpr: ID PA listaArgumentos? PC;

// Bloque de código
cuerpo: LA (instruccion | nota)* LC;

// Comentarios
nota: COMENTARIO_LINEA | COMENTARIO_BLOQUE;

// Estructuras de control
condicionIf: IF PA expresion PC cuerpo (ELSE cuerpo)?;

bucleWhile: WHILE PA expresion PC cuerpo;

bucleFor:
	FOR PA initFor? PYC expresion? PYC updateFor? PC cuerpo;

// Partes del for
initFor: definicionSinPunto | asignacionSinPunto;

updateFor: asignacionSinPunto | incDec;

incDec: ID (INCREMENTO | DECREMENTO);

// Rompe bucles
interrupcion: BREAK PYC;

// Declaración de funciones
definicionFuncion: tipoDato ID PA listaParams? PC cuerpo;

// Lista de parámetros
listaParams: parametro (COMA parametro)*;

parametro: tipoDato ID;

// Declaraciones de variables
definicionVariable: (CONST)? tipoDato ID (IGUAL expresion)? PYC;

definicionSinPunto: (CONST)? tipoDato ID (IGUAL expresion)?;

// Asignaciones
asignacionVariable: ID IGUAL expresion PYC;

asignacionSinPunto: ID IGUAL expresion;

// Retorno de función
retornoInst: RETURN expresion? PYC;

// Tipos básicos
tipoDato: INT | CHAR | DOUBLE | VOID | FLOAT | STRING_TIPO;

// Expresiones (igual funcionalidad)
expresion:
	expresion opBinaria expresion	# expBinaria
	| NOT expresion					# expNegacion
	| PA expresion PC				# expParentesis
	| INCREMENTO ID					# expPreIncremento
	| DECREMENTO ID					# expPreDecremento
	| ID INCREMENTO					# expPostIncremento
	| ID DECREMENTO					# expPostDecremento
	| ID							# expVariable
	| INTEGER						# expEntero
	| DECIMAL						# expDecimal
	| CHARACTER						# expCaracter
	| STRING						# expString
	| URL							# expURL
	| EMAIL							# expEmail
	| DNI							# expDNI
	| CUIL							# expCUIL
	| FECHA							# expFecha
	| FECHAISO						# expFechaISO
	| TELEFONO_INTERNACIONAL		# expTelInt
	| TELEFONO_NACIONAL				# expTelNac
	| CODIGO_POSTAL					# expCodPostal
	| IP							# expIP
	| PASSWORD						# expPass
	| NOMBRE_APELLIDO				# expNomApe
	| PATENTE						# expPatente
	| TARJETA_CREDITO				# expTarjeta
	| llamadaExpr					# expFuncion
	| TRUE							# expTrue
	| FALSE							# expFalse;

// Operadores binarios
opBinaria:
	SUM
	| RES
	| MUL
	| DIV
	| MOD
	| MAYOR
	| MAYOR_IGUAL
	| MENOR
	| MENOR_IGUAL
	| EQL
	| DISTINTO
	| AND
	| OR;

// Argumentos en llamadas
listaArgumentos: expresion (COMA expresion)*;

// TOKENS
PA: '(';
PC: ')';
CA: '[';
CC: ']';
LA: '{';
LC: '}';

PYC: ';';
COMA: ',';

IGUAL: '=';

MAYOR: '>';
MAYOR_IGUAL: '>=';
MENOR: '<';
MENOR_IGUAL: '<=';
EQL: '==';
DISTINTO: '!=';

SUM: '+';
RES: '-';
MUL: '*';
DIV: '/';
MOD: '%';

OR: '||';
AND: '&&';
NOT: '!';

FOR: 'for';
WHILE: 'while';
IF: 'if';
ELSE: 'else';
BREAK: 'break';

INT: 'int';
CHAR: 'char';
CONST: 'const';
DOUBLE: 'double';
VOID: 'void';
FLOAT: 'float';
STRING_TIPO: 'string';
RETURN: 'return';

INCREMENTO: '++';
DECREMENTO: '--';
TRUE: 'true';
FALSE: 'false';

URL: ('http' | 'https') '://' [a-zA-Z0-9@:%_+.~#?&=/\\-]+;
EMAIL: [a-zA-Z0-9._%+-]+ '@' [a-zA-Z0-9.-]+ '.' [a-zA-Z]+;
CUIL: ('20' | '23' | '24' | '27' | '30' | '33' | '34') '-' DIGITO DIGITO DIGITO DIGITO DIGITO DIGITO
		DIGITO DIGITO '-' DIGITO;
DNI: DIGITO DIGITO DIGITO DIGITO DIGITO DIGITO DIGITO (DIGITO)?;
FECHA: ('0' [1-9] | '1' [0-9] | '2' [0-9] | '3' [01]) '/' (
		'0' [1-9]
		| '1' [0-2]
	) '/' DIGITO DIGITO DIGITO DIGITO;
FECHAISO:
	DIGITO DIGITO DIGITO DIGITO '/' ('0' [1-9] | '1' [0-2]) '/' (
		'0' [1-9]
		| '1' [0-9]
		| '2' [0-9]
		| '3' [01]
	);
TELEFONO_INTERNACIONAL: '+' DIGITO+;
TELEFONO_NACIONAL: '0' DIGITO+ | '15' DIGITO+;
CODIGO_POSTAL: DIGITO DIGITO DIGITO DIGITO (LETRA LETRA LETRA)?;
IP: DIGITO+ '.' DIGITO+ '.' DIGITO+ '.' DIGITO+;
PASSWORD:
	MAYUSCULA (LETRA | DIGITO | SIMBOLO)+ (
		LETRA
		| DIGITO
		| SIMBOLO
	)+ (LETRA | DIGITO | SIMBOLO)+ (LETRA | DIGITO | SIMBOLO)+ (
		LETRA
		| DIGITO
		| SIMBOLO
	)+;
NOMBRE_APELLIDO:
	MAYUSCULA LETRA_MINUSCULA+ ' ' MAYUSCULA LETRA_MINUSCULA+;
PATENTE:
	LETRA LETRA LETRA ' ' DIGITO DIGITO DIGITO
	| LETRA LETRA ' ' DIGITO DIGITO LETRA LETRA;
TARJETA_CREDITO:
	DIGITO DIGITO DIGITO DIGITO ' ' DIGITO DIGITO DIGITO DIGITO ' ' DIGITO DIGITO DIGITO DIGITO ' '
		DIGITO DIGITO DIGITO DIGITO;

// Fragments
fragment LETRA: [A-Za-z];
fragment LETRA_MINUSCULA: [a-záéíóúñ];
fragment MAYUSCULA: [A-ZÁÉÍÓÚÑ];
fragment DIGITO: [0-9];
fragment SIMBOLO: [!@#$%^&*()_+=<>.?/-];

// Identificadores
ID: (LETRA | '_') (LETRA | DIGITO | '_')*;

// Literales
STRING: '"' ( ~["] | '\\' .)* '"';
INTEGER: DIGITO+;
DECIMAL: DIGITO+ '.' DIGITO+;
CHARACTER: '\'' ( ~['] | '\\' .) '\'';

// Comentarios - Se ignoran durante el análisis COMENTARIO_LINEA : '//' ~[\r\n]*; sin ocultar
COMENTARIO_LINEA: '//' ~[\r\n]*;
COMENTARIO_BLOQUE: '/*' .*? '*/';

WS: [ \r\n\t]+ -> skip;
OTRO: .;