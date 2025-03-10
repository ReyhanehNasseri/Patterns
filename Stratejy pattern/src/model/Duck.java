package model;

public abstract  class Duck {
    FlyBehaviour duckFlyBehaviour;
    public void setFlyBehaviour (FlyBehaviour flyBehaviour){
        duckFlyBehaviour=flyBehaviour;
    }
    public void fly(){
        duckFlyBehaviour.fly();
    }
}
