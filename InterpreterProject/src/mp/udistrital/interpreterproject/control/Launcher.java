package mp.udistrital.interpreterproject.control;

import mp.udistrital.interpreterproject.expression.*;

public class Launcher {
    public static void main(String[] args) {
        
        Expression move = new MoveForwardExpression();
        Expression jump = new JumpExpression();
        
        Expression combo1 = new ComboExpression(move, jump);
        System.out.println("MOVE FORWARD JUMP = ");
        combo1.interpret();
        
        System.out.println();
        
        Expression attack = new AttackExpression();
        Expression combo2 = new ComboExpression(
            new ComboExpression(move, jump),
            attack
        );
        System.out.println("MOVE FORWARD JUMP ATTACK = ");
        combo2.interpret();
        
        System.out.println();
        
        Expression combo3 = new ComboExpression(move, move);
        System.out.println("MOVE FORWARD MOVE FORWARD = ");
        combo3.interpret();
    }
}