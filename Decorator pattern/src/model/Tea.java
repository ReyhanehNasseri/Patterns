package model;

public class Tea extends Beverage{
    public Tea(){
        description = "tea";
    }
    @Override
    public double cost() {
        return 3.2;
    }
}
