import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        
        int maths, physics,english,computer;
        double score;
        boolean result;
        Scanner marks= new Scanner(System.in);
        do{
            System.out.println("Enter marks for maths");
            maths= marks.nextInt();
             System.out.println("Enter marks for Physics");
            physics= marks.nextInt();
             System.out.println("Enter marks for english");
            english= marks.nextInt();
             System.out.println("Enter marks for computer");
            computer= marks.nextInt();

             score=(maths+english+computer+physics)/4;

              if(score> 90)
               System.out.println("Excellent");
            else if( score>80)
             System.out.println("Very Good");
             else if(score >60)
              System.out.println("Average");
            else if(score>40)
             System.out.println("Good");
            else
             System.out.println("Poor");

             System.out.println("Any more Students?(True/ False)");
             result=marks.nextBoolean();
        }while(result);
        marks.close();
    }
}
