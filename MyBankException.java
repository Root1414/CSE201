public class MyBankException {
    public static void  main(String[] args) throws MyException {
        System.out.println("Welcome D.akhlaq");
        int balance=500, withdraw=1000;
        try{
            if(balance<withdraw)
                throw new MyException("poor man !! Insufficient funds \n go sell your kidney!");
            else System.out.println("Take your papers");
        }
        catch (MyException e){
            System.out.println("Exception caught :" +e);
        }

        System.out.println("GoodBye");
        }
    }
class MyException extends Exception{
    MyException(){}
    MyException(String msg){
        System.out.println("My Exception defined by me ..." +msg);
    }

}