
interface MyInterface2{
    CheckMethodReference display(String s);
}

class CheckMethodReference{
    public CheckMethodReference(String str){
        System.out.println("Value is: "+str);
    }
}
public class MethodReference3 {

    public static void main(String[] args) {
        MyInterface2 m2=CheckMethodReference::new;
        m2.display("Abhijeet");
    }
}
