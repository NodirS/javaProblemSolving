import java.util.Scanner;

public class Exercise7 {


    // Exercise 7
    public static void main(String[] args) {

        int a;

        Scanner scan = new Scanner(System.in);
        System.out.println("Input a: ");
        a = scan.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(a + "x" + i + "=" + a*i);

        }


    }




}


