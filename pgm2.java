import java.util.Scanner;

public class pgm2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your marks ");
        System.out.println("ENTER MARK OF SUB 1: ");
        int m1=sc.nextInt();
        System.out.println("ENTER MARK OF SUB 2: ");
        int m2= sc.nextInt();
        System.out.println("ENTER MARK OF SUB 3: ");
        int m3= sc.nextInt();
        System.out.println("ENTER MARK OF SUB 4: ");
        int m4= sc.nextInt();
        System.out.println("ENTER MARK OF SUB 5: ");
        int m5= sc.nextInt();

        int total=(m1+m2+m3+m4+m5);
        System.out.println("Totl marks of 5 subject is: "+total);
        float percent=(total/5);
        System.out.println("percentage of toatl mark is: "+percent);
        if(percent>=90){
            System.out.println("A grade");
        }
        else if(percent>=75){
            System.out.println("B grade");
        }
        else if(percent>=50){
            System.out.println("C garde");
        }
        else{
            System.out.println("Fail");
        }

    }
}
