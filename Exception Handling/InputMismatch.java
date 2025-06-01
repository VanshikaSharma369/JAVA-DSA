import java.util.InputMismatchException;
import java.util.Scanner;
public class InputMismatch {
    public static void readInteger(){
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter Number:");
            int val = sc.nextInt();
            System.out.println("You Entered:"+val);
        }catch(InputMismatchException e){
            System.out.println("Exception Caught: Please Enter a Valid Number.");
        }finally{
            sc.close();
            System.out.println("Program Executed.");
        }
    }
    public static void main(String[] args){
        readInteger();
    }
}
