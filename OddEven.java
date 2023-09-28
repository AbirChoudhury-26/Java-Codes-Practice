import java.util.Scanner;

/**
 * OddEven
 */
public class OddEven {

    public static void main(String[] args) {
        int series;
       // To take user object we need to create Scanner Class object

       Scanner number= new Scanner(System.in);
       System.out.println("Enter the number series you want:");
       series = number.nextInt();

        for(int i=0;i<series;i++)
        {
             if(i%2==0)
               continue;
             System.out.println(i);
        }

        number.close();
    }
}