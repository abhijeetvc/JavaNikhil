import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

//interface Demo{
//    Integer calculateLength(String str);
//}

public class HelloJava{

    public static void main(String[] args) {

        List<Integer> list= Arrays.asList(10,5,15,20,25,30);
//        for(int i=0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

//        for(Integer i:list){
//            System.out.println(i);
//        }
      //  Consumer<Integer> c= a-> System.out.println(a);
      //  c.accept(10);

        //Java 8 lambda expression
      //  list.forEach(a-> System.out.println(a));

        //Java 8, method reference (::) -> method reference
      //  list.forEach(System.out::println);

        // Functional Interface
        Function<String,Integer> f=str->str.length();
        Integer i=f.apply("Abhijeet");
        System.out.println(i);

//        HelloJava hj=new HelloJava();
//        Integer i=hj.calculateLength("Abhi");
//        System.out.println(i);

        BiFunction<Integer,Integer,Integer> f1=(a,b)->a+b;
        Integer i1=f1.apply(30,40);
        System.out.println(i1);

        // Function chaining
        Function<String,Integer> f2=str->str.length();
        Function<Integer,Integer> f3=val->val*10;

        Integer i2=f2.andThen(f3).apply("Abhi");
        System.out.println("Result is: "+i2);

        BinaryOperator<Integer> f4=(val1,val2)->val1+val2;
        Integer i4=f4.apply(70,80);
        System.out.println("Value of i4: "+i4);

        UnaryOperator<Integer> f5=val3->val3+10;
        Integer i5=f5.apply(100);
        System.out.println("Value of i5: "+i5);

        Predicate<Integer> p=val->val>10;
        List<Integer> list1=list.stream().filter(p).collect(Collectors.toList());
        System.out.println("New List: "+list1);

        //BiPredicate
        BiPredicate<String,Integer> bip=(val1,val2)->{
            return val1.length()==val2;
        };
        Boolean flag=bip.test("Abhijeet",8);
        System.out.println("Flag is: "+flag);

        Consumer<Integer> c=c1-> System.out.println(c1);
        c.accept(20);
        //System.out.println("Value of c: ");

        BiConsumer<Integer,Integer> bic=(c1,c2)-> System.out.println(c1+c2);
        bic.accept(30,40);
    }
//    @Override
//    public Integer calculateLength(String str) {
//        return str.length();
//    }
}
