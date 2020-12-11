import java.util.Arrays;

public class MethodReference2 {

    public static void main(String[] args) {

        String[] str={"Orange","Apple","Banana","Grapes"};

        Arrays.sort(str,String::compareToIgnoreCase);

        for(String s:str){
            System.out.println(s);
        }
    }
}
