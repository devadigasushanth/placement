import java.security.cert.CertPathValidatorSpi;

public class pgm4 {
    public static void main(String[] args){
        int num=145,sum=0;
        for(int i=145;i>0;i/=10){
            int digits=i%10;
            sum+=digits;
        }
        System.out.println(sum);
    }
}
