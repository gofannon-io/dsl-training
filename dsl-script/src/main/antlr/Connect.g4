grammar Connect;

@header {
    package org.example.dsl_script.dsl.connect.grammar;
}

connect
    : (planeDecl | equipmentDecl | cableDecl | connectionDecl)+
    ;

planeDecl
    : DEFINE PLANE idDecl nameDecl LBRACE connectorsDecl RBRACE
    ;

idDecl
    : ID ASSIGN ID_VALUE
    ;
nameDecl
    : NAME ASSIGN StringLiteral
    ;

equipmentDecl
    : DEFINE EquipmentNature idDecl eqTypeDecl LBRACE connectorsDecl RBRACE
    ;

eqTypeDecl
    : TYPE ASSIGN EquipementType
    ;

cableDecl
    : DEFINE CABLE idDecl connTypeDecl
    ;

connTypeDecl
    : TYPE ASSIGN ConnType
    ;

connectionDecl
    : CONNECT ID_VALUE '/' ID_VALUE TO ID_VALUE '/' ID_VALUE  WITH ID_VALUE
    ;

connectorsDecl
    : 'connectors' LBRACE  connectorDecl+ RBRACE
    ;

connectorDecl
    : 'connector' idDecl connTypeDecl
    ;


EquipmentNature
    : RADIO
    | COCKPIT
    | SENSOR
    ;

EquipementType
    : HF
    | RF4_COCKPIT
    | IR
    | RADAR
    ;

ConnType
    : FIBER_CON
    | RJ45_CON
    ;

LBRACE : '{';
RBRACE : '}';

ID_VALUE            : [A-Z]+('-'[A-Z0-9]+)+;
PLANE               : 'plane';
DEFINE              : 'define';
ID                  : 'id' ;
NAME                : 'name' ;
TYPE                : 'type' ;
ASSIGN              : '=';
CABLE               : 'cable' ;
CONNECT             : 'connect';

RADIO               : 'radio';
COCKPIT             : 'cockpit';
SENSOR              : 'sensor';

HF                  : 'HF';
RADAR               : 'Radar';
IR                  : 'IR';
RF4_COCKPIT         : 'RF4Cockpit';

FIBER_CON           : 'Fiber';
RJ45_CON            : 'RJ45';

TO                  : 'to';
WITH                : 'with';


StringLiteral: '"' StringCharacters? '"';
fragment StringCharacters: StringCharacter+;
fragment StringCharacter: ~["\\\r\n] ;


WS                  : ('\u0020' | '\u0009' | '\u000A' | '\u000C' | '\u000D') -> channel (HIDDEN);

COMMENT             : '#' ~ ('\n' | '\r')* '\r'? '\n' -> channel (HIDDEN);
