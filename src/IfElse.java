import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("enter your age");

        int age = obj.nextInt();
        System.out .println( "your age is "   +age+  "   and ");

        if ( age >=18){
            System.out.println( "you are  a adult");

        }
        else if ( age>= 12){
            System.out.print ("you are a tinager");

        }
        else{
            System.out.println("you are miner");
        }


    }
}
