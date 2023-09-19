
public class BankException {
    public static void main(String[] args) throws Exception {
        System.out.println("Welcome D.Akhlaq");
        int balance=500, withdraw=1000;
        try{
            if(balance<withdraw)
                throw new Exception("poor man !! Insufficient funds \n go sell your kidney!");
            else System.out.println("Take your papers");
        }
        catch (Exception e){
            System.out.println("Exception caught :" +e);
        }

        System.out.println("GoodBye");
    }
}
