package model;

public class Espresso extends Beverage{
    public Espresso(){
        description = " espresso";
    }

    @Override
    public double cost() {
        return 2.1;
    }
}
