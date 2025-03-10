import model.BrownDuck;
import model.NoFlying;
import model.RedDuck;

public class Main {

    public static void main(String[] args) {
        BrownDuck brownDuck = new BrownDuck();
        RedDuck redDuck = new RedDuck();
        brownDuck.fly();
        redDuck.fly();
        redDuck.setFlyBehaviour(new NoFlying());
        redDuck.fly();
    }
}