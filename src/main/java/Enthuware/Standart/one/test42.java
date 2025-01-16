package Enthuware.Standart.one;

public class test42 {
}
//Which of the following statements are true?
//The condition expression in an if statement can be a method call.
//If a and b are of type boolean, the expression (a = b) can be used as the condition expression of an if statement.
//Only expressions which evaluate to a boolean value can be used as the condition in an if statement.


/**The expression (a = b) does not compare the variables a and b, but rather assigns the value of b to the variable a.
 * The result of the expression is the value being assigned. Since a and b are boolean variables,
 * the value returned by the expression is also boolean. This allows the expressions to be used as the condition for an if-statement.
 * if-clause and the else-clause can have empty statements. Empty statement ( i.e. just ; ) is a valid statement.
 * But this is illegal : if (true) else; because the if part doesn't contain any valid statement.
 * ( A statement cannot start with an else!) So, the following is valid. if(true) if(false); because if(false); is a valid statement.*/