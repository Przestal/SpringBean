package main.java;

import com.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Traveller {


    public static void main(String[] args) {

        ApplicationContext ctx = new
                ClassPathXmlApplicationContext("main/resources/Travel.xml");
        Car car= (Car) ctx.getBean("car");

        car.move();
    }
}
