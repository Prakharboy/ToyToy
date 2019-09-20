package hello.boy;

import helloboy.move;

public class TrainToy extends toy implements move {


    public TrainToy(double d, String string) {

        super(d,string);
    }

    public String moveNow()
    {
        return "maoving";
    }


    public static void main(String[] args)
    {


        System.out.println("hello");


    }




}