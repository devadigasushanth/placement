import java.util.Scanner;

public class while_1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=-1;
        while(num!=0){
            System.out.println("enter value");
            num= sc.nextInt();
        }
        System.out.println("\n loop ends");
    }
}
