public class MultipleCatchException {
    public static void main(String[] args) {
        try {
            //int res = 10 / 0;

            String str = null;
            System.out.println(str.length());
        } catch (ArithmeticException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }finally{
            System.out.println("Program Executed.");
        }

    }
}
