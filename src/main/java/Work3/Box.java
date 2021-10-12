package Work3;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Box <F> {
    ArrayList<F> fruits = new ArrayList();
    private double weightFruit=0.0;

    public <F> Box(double weightFruit) {
        this.weightFruit=weightFruit;
    }

    public void addFruit(F fruit) {
        fruits.add(fruit);
    }

    public double getBoxWeight(){
        return fruits.size()*weightFruit;
    }

    public boolean compare(Box<?> box){
        return Math.abs(getBoxWeight()-box.getBoxWeight()) <0.00001;
    }

    public void addFruits(Box<F> boxFruit){
        System.out.println("Box1: "+ fruits.size());
        System.out.println("Box2: "+ boxFruit.fruits.size());
        fruits.addAll(boxFruit.fruits);
        boxFruit.fruits.clear();
        boxFruit.fruits.trimToSize();
        System.out.println("Box1: "+ fruits.size());
        System.out.println("Box2: "+ boxFruit.fruits.size());
    }
}
