grammar Characters;

charstring : (somechar)+ EOF ;

somechar
    : Uppercase             #UppercaseChar
    | Lowercase             #LowercaseChar
    | Number                #Number
;


Number : [0-9];
Lowercase : [a-z];
Uppercase : [A-Z] ;
Others : . -> skip ;
