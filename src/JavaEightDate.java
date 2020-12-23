import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Optional;

public class JavaEightDate {

    Integer calculateLength(String str){
        Optional<String> check=Optional.ofNullable(str);
        if(check.isPresent()){
            return str.length();
        }
        return 0;
    }

    public static void main(String[] args) {
        DateFormat dateFormat=new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        Date date=new Date();

        LocalDateTime now=LocalDateTime.now();
        System.out.println(dateFormat.format(date));
        System.out.println(dtf.format(now));

        // Java 8, Duration and Period
        // Duration -> It measures time in seconds
        // Period -> It measures time in years, months, days

        Duration seconds=Duration.ofHours(1);
        System.out.println("Seconds = "+seconds.getSeconds());

        LocalDate firstDate= LocalDate.of(2019, Month.DECEMBER,1);
        LocalDate secondDate=LocalDate.of(2020,Month.JANUARY,23);

        Period period= Period.between(firstDate,secondDate);
        System.out.println("Period in Years: "+period.getYears());
        System.out.println("Period in Months: "+period.getMonths());
        System.out.println("Period in Days: "+period.getDays());

        Optional<String> withValue=Optional.of("Abhijeet");
        Optional<String> noValue=Optional.empty();

        String str1="Yes";
        String str2=null;
     //   System.out.println("Length: "+str2.length());

        System.out.println("With Value: "+withValue);
        System.out.println("Only value: "+withValue.get());
        System.out.println("Empty : "+Optional.empty());

        System.out.println("With Value Check: "+Optional.ofNullable(str1));
        System.out.println("No value: "+Optional.ofNullable(str2));

        JavaEightDate j=new JavaEightDate();
       // Integer i1=j.calculateLength(str1);
      //  System.out.println("Length: "+i1);
       Integer i2= j.calculateLength(str2);
      //  System.out.println("Str2 Length: "+i2);

        String name="Abhi";
        Optional<String> s=Optional.of(name);

    }
}
