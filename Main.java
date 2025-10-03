import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a integer : ");
        int a=sc.nextInt();

        Scanner sa=new Scanner(System.in);
        System.out.println("enter a character : ");
        char c=sa.next().charAt(0);

        Scanner sb=new Scanner(System.in);
        System.out.println("enter a float : ");
        float f=sb.nextFloat();

        Scanner sd=new Scanner(System.in);
        System.out.println("enter a double : ");
        double d=sd.nextDouble();

        Scanner se=new Scanner(System.in);
        System.out.println("enter a byte : ");
        byte b=se.nextByte();

        Scanner sf=new Scanner(System.in);
        System.out.println("string : ");
        String s=sf.nextLine();

        System.out.println("entered integer is "+a);
        System.out.println("entered character is "+c);
        System.out.println("entered float is "+f);
        System.out.println("entered string is "+s);
        System.out.println("entered double is "+d);
        System.out.println("entered byte is "+b);

    }
}