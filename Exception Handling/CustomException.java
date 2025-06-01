class MyException extends Exception{
    public MyException(String message){
        super(message);
    }
}
public class CustomException {
    static void validate(int age) throws MyException{
        if(age<18){
            throw new MyException("Age must be 18.");
        }else{
            System.out.println("Age is valid.");
        }
    }
    public static void main(String[] args){
        try{
            validate(16);
        }catch(MyException e){
            System.out.println("Exception caught:"+e.getMessage());
        }
    }
}
