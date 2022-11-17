class RBI{
int i=4;
public static void main(String args[]) {}
public void Rate(){System.out.println("Minimum interest rate is- "+i+"%");}}

class SBI extends RBI{
    int i=8;public static void main(String args[]){}
public void Rate(){System.out.println("Minimum interest rate is- "+i+"%");}}

class BOI extends RBI{public static void main(String args[]){}
    public void Rate(){System.out.println("Minimum interest rate is- "+i+"%");}}

class he{
public static void main(String args[]){
    RBI a= new RBI();
    RBI b= new SBI();
    RBI c= new BOI();
    a.Rate();b.Rate();c.Rate();
    RBI d= new SBI();
d.Rate();
    }}
