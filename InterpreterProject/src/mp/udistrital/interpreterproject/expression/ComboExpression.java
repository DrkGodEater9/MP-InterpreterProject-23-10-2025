package mp.udistrital.interpreterproject.expression;

public class ComboExpression implements Expression {
    private Expression action1;
    private Expression action2;
    
    public ComboExpression(Expression action1, Expression action2) {
        this.action1 = action1;
        this.action2 = action2;
    }
    
    @Override
    public void interpret() {
        action1.interpret();
        action2.interpret();
    }
}