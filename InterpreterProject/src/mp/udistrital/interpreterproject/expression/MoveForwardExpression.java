package mp.udistrital.interpreterproject.expression;

public class MoveForwardExpression implements Expression {
    
    @Override
    public void interpret() {
        System.out.println("Moving forward");
    }
}