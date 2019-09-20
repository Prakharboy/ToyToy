package hello.boy;

import helloboy.fly;
import helloboy.move;

public class CarToy extends toy implements move, fly {


    public CarToy(double d, String string) {

        super(d,string);
    }

    public String flyNow()
    {
        return "flying now";
    }

    public  String moveNow()
    {
        return "i am moving";

    }

    public static void main(String[] args)
    {
        CarToy carToy=new CarToy(8.0,"orange");

        System.out.println(carToy.flyNow());
        System.out.println(carToy.moveNow());
        System.out.println("car price is"+carToy.getPrice());





    }





}