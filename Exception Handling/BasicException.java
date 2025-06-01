public class BasicException{
    public static void main(String[] args){
        try{
            //Integer res = 12/0;
        }catch(ArithmeticException e){
            System.out.println("Division by zero not allowed.");
        }finally{
            System.out.println("Execution completed.");
        }
    }
}
// UNCOMMENTS THE COMMENTS TO RUN AND SEE THE EXCEPTION.