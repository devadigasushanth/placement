import java.util.Scanner;

public class pgm5 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number ");
        int num=sc.nextInt();

        int fnum=0,sNum=1;
        System.out.print(fnum+"   "+sNum+"    ");
        for( int i=0;i<num;i++){
            int nextNum=fnum + sNum;
            fnum=sNum;
            sNum=nextNum;
            System.out.print(nextNum+"    ");
        }
    }
}
