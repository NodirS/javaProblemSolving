
import java.util.Arrays;
import java.util.List;

public class Exercise94 {


    // Exercise 7
    public static void main(String[] args) {

        int [] numbers = {3, 5, 7, 9, 11, 12, 13, 45, 56, 67, 78};
        int [] newNumber;

        newNumber = new int[numbers.length];


        for (int i = 0; i <= numbers.length; i++) {

//            System.out.println(numbers[i]);

            if ((numbers[i])%2 == 1) {

                System.out.println(numbers[i]);
            }

        }





    }
}


