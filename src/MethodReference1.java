//Method reference: (::)

// a) Reference to static method of class
// b) Reference to instance method of class of particular type
// c) Reference to instance method of arbitrary object of particular type
// d) Reference to constructor

import java.util.Arrays;
import java.util.List;

interface MyInterface{
    void check();
}

public class MethodReference1 {

    public static void main(String[] args) {

        List<String> list= Arrays.asList("India","US","France","Germany");
        list.forEach(MyDemo::display);

        MyDemo m=new MyDemo();
        list.forEach(m::display1);

        MyInterface m1=m::display2;
        m1.check();
    }
}

class MyDemo{

    static void display(String str){
        System.out.println("Name : "+str);
    }

     void display1(String str){
        System.out.println("In display1 of MyDemo");
    }

    void display2(){
        System.out.println("In display2 of MyDemo");
    }
}