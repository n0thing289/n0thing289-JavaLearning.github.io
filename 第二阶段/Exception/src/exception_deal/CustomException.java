package exception_deal;

public class CustomException {
    public static void main(String[] args) {
        int age = 100;
        if(!(age >=18 && age<=100)){
            throw new AgeException("年龄不对");
        }
    }
}

class AgeException extends RuntimeException{
    public AgeException(String message){
        super(message);
    }
}