public class ArrayIndexException {
    public static void main(String[] args){
        try{
            //int[] arr = {1,2,3,4,5,6};
            //int val = arr[9];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Caught "+e.getMessage());
        }finally{
            System.out.println("Program Executed.");
        }
    }
}
// UNCOMMENTS THE COMMENTS TO RUN AND SEE THE EXCEPTION.