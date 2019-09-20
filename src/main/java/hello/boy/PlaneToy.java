package hello.boy;

import helloboy.fly;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PlaneToy extends toy implements fly {



    public PlaneToy(double d, String string) {

        super(d,string);
    }

    public String flyNow()
    {
        return "flying";
    }


    public static void main(String[] args)
    {
//        PlaneToy planeToy=new PlaneToy(3.0,"red");
//        planeToy.flyNow();

        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        PlaneToy a=context.getBean("PlaneToyKind",PlaneToy.class);

        a.flyNow();


    }







}