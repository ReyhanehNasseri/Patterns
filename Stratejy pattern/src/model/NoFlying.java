package model;

public class NoFlying implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("do not fly");
    }
}
