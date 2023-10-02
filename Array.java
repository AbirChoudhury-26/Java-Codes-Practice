import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

         // Creatong a multi dimensional array  with size specifying as row(15) and column(2)
         double invoice[][] =new double[5][2];
          Scanner inp=new Scanner(System.in);

         // Accessing multi dimensional array

          for(int i=0;i<5;i++)
          {
            for(int j=0;j<2;j++)
            {
                System.out.println("Enter the input:");
                 invoice[i][j]=inp.nextDouble();
            }
          }

           for(int i=0;i<5;i++)
           {
             for(int j=0;j<2;j++)
             {
                 System.out.println(invoice[i][j]);
             }
            }
    }
}
