import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("enter your age");

        int age = obj.nextInt();
//        System.out .println( age);

        if ( age >=18){
            System.out.println( "you are adult");

        }
        else if ( age>= 12){
            System.out.print ("you are tinager");

        }
        else{
            System.out.println("you are miner");
        }


    }
}
