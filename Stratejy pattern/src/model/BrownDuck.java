package model;

public class BrownDuck extends Duck{
    public BrownDuck(){
        duckFlyBehaviour = new NoFlying();
    }
}
