// private,default,protected,public........

public class Accessmodifier {
    public static void main(String args[]){
       bankacc a1 = new bankacc();
       a1.name ="Aniket Pal";
       //a1.password = 123;....this will not work as it is private but name is default (bankacc a1 = new bankacc()) so it will work.
       //we have to use setpass() and getpass() function to acess password;
       a1.setpass(123);
       System.out.println("the account name is = "+a1.name +"\nThe password is = "+a1.getpass());

    }
}

class bankacc{
    String name;
    private int password;

    void setpass(int pass){
        this.password =pass;
    }

    int getpass(){
        return this.password;
    }
}
