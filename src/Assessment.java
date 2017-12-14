import java.lang.reflect.Array;
import java.util.*;

public class Assessment {

//square: should accept and return a single integer number. The method should return the number times itself.
int numberUno;
int numberTwo;
int total;

    public static long square(int numberUno){
        int total;
        total = numberUno * numberUno;
        return total;

    }


//sum: should accept 2 numbers, either integers or doubles, and returns the result of adding the two numbers together.

    public static long sum(int numberUno, int numberTwo){
        int totalsum = numberUno * numberTwo;
        return totalsum;

    }

// average: should accept an array of integers, and return the average of the passed numbers as a double.



//    public class Arrays() {
        public static void main(String[] args){
        double [] values = {1, 2, 3, 4, 5};
        double total = 0;
        for (double element : values){
        total += element;
    }
        System.out.println(total);
         double average = 0;
         if (values.lenth > 0) {
             average = total / values.length;
         };

         public static void capitalizeRecords() {
             ArrayList<String> fullNames = new ArrayList<>();
             fullNames.add(User.firstName, User.lastNAme);
         }

             System.out.println(capitalizeRecords());

    }

    }}

