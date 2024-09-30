grammar Characters;

charstring : (somechar | somechar2 | somenum)+ EOF ;

somechar
    : Uppercase             #UppercaseChar
;

somechar2
    : Lowercase             #LowercaseChar
;

somenum
    : Numeric             #Numeric
;

Numeric : [0-9];
Lowercase : [a-z];
Uppercase : [A-Z] ;
Others : . -> skip ;
