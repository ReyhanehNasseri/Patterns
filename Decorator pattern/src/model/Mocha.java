package model;

public class Mocha extends CondimentDecorator{
    public Mocha(Beverage beverage1){
        beverage=beverage1;
    }
    @Override
    public double cost() {
        return beverage.cost() + 1;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " mocha";
    }
}
