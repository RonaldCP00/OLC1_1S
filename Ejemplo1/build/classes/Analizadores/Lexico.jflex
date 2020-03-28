package Analizadores;

import java_cup.runtime.*;
import ejemplo1.SalidaConsola;

%%

%{
%}

%public 
%class Lexico
%cupsym Simbolos
%cup
%char
%column
%full
%ignorecase
%line
%unicode

id          = [a-zA-Z"_"][a-zA-Z0-9"_"]*
numero      = [0-9]+ "."? [0-9]*

%%

"var"       { return new Symbol(Simbolos.tk_var, yyline, yycolumn); }
"imprimir"  { return new Symbol(Simbolos.tk_imprimir, yyline, yycolumn); }


"="         { return new Symbol(Simbolos.tk_asig, yyline, yycolumn); }
";"         { return new Symbol(Simbolos.tk_pyc, yyline, yycolumn); }
","         { return new Symbol(Simbolos.tk_coma, yyline, yycolumn); }
"("         { return new Symbol(Simbolos.tk_paren1, yyline, yycolumn); }
")"         { return new Symbol(Simbolos.tk_paren2, yyline, yycolumn); }
"+"         { return new Symbol(Simbolos.tk_suma, yyline, yycolumn); }
"-"         { return new Symbol(Simbolos.tk_resta, yyline, yycolumn); }
"*"         { return new Symbol(Simbolos.tk_mul, yyline, yycolumn); }
"/"         { return new Symbol(Simbolos.tk_div, yyline, yycolumn); }
"^"         { return new Symbol(Simbolos.tk_poten, yyline, yycolumn); }


{id}            { return new Symbol(Simbolos.tk_id, yyline, yycolumn, yytext()); }
{numero}        { return new Symbol(Simbolos.tk_numero, yyline, yycolumn, yytext()); }

[ \t\r\n\f]     { /*se ignoran*/ }

.               { SalidaConsola.agregar(">>>Error Lexico: Linea "+yyline+": Caracter Invalido "+yytext()); }
