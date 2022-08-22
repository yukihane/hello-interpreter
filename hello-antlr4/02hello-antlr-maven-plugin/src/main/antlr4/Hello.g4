grammar Hello;

stat
:
  returnstat
  | assign
  | ifstat
;

returnstat
:
  'return' expr ';'
;

assign
:
  'x' '=' expr
;

ifstat
:
  'if' expr 'then' stat
;

expr
:
  'x' '+' '0'
  | 'x' '<' '0'
  | '0'
;