public class tick {

    public static void main(String args[])
    {
        int theory,practical;
        theory=76;
        practical=78;
        if(theory<40&&practical>=40){
            System.out.println("need to improve theory");
        }
        else if(theory>=40&&practical<40){
            System.out.println("need to improve practical");
        }
        else if(theory<40&&practical<40){
            System.out.println("failed");
        }
        else if(theory>=75&&practical>=75){
            System.out.println("excellent performance");
        }
    }
}



