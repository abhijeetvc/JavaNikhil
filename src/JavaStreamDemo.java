import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaStreamDemo {

    public static void main(String[] args) {

        List<String> countries= Arrays
                .asList("India","France","Germany","China","Australia");

        List<String> newList=countries.stream()
                .filter(c->!"China".equals(c)).collect(Collectors.toList());

        System.out.println(newList);

        Optional<String> country=countries.stream().findFirst();
        System.out.println("Country Name is: "+country.get());

        Optional<String> country1=countries.stream().findAny();
        System.out.println("Country1 Name is: "+country1.get());

    }
}
