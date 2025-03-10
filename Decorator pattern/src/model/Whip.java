package model;

public class Whip extends CondimentDecorator{
    public Whip(Beverage beverage1){
        beverage = beverage1;
    }
    @Override
    public double cost() {
        return beverage.cost() + 5;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + " whip";
    }
}
