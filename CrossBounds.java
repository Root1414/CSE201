import java.lang.reflect.Array;

public class CrossBounds {
    public static void main(String[] args)  {
        int[] a={1,2,3,4};   //عدد الخانات 3 وحنا بنقوله اطبع 4
        System.out.println("Welcome D.Akhlaq");
        try{
            System.out.println(a[5]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("لا تطبع خليه ليست موجوده !"+e);
        }

        finally {
            System.out.println("Good Bye D.Akhlaq");
        }


    }
}
