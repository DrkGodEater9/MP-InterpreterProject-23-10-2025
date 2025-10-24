package mp.udistrital.interpreterproject.expression;

public class JumpExpression implements Expression {
    
    @Override
    public void interpret() {
        System.out.println("Jumping");
    }
}