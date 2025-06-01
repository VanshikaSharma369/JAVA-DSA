public class IllegalException {
    public static void checkNumber(int val){
        if(val<0){
            throw new IllegalArgumentException("Number must not be negative:"+val);
        }else{
            System.out.println("Number is valid.");
        }
    }
    public static void main(String[] args){
        try{
            checkNumber(10);
            checkNumber(-8);
        }catch(IllegalArgumentException e){
            System.out.println("Exception Caught: "+ e.getMessage());
        }finally{
            System.out.println("Program Executed.");
        }
    }
}
