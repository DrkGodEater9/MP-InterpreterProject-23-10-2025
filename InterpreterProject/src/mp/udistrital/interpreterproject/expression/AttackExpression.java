package mp.udistrital.interpreterproject.expression;

public class AttackExpression implements Expression {
    
    @Override
    public void interpret() {
        System.out.println("Attacking");
    }


}