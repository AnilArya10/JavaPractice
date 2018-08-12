class RBI{
double rateOfIntrest=6.5;
public void getIntrestRate()
{
  System.out.println("RBI rate of intrest:"+rateOfIntrest);
}
}
class HDFC extends RBI{
double rateOfIntrest=8.99;
public void getIntrestRate()
{
  System.out.println("HDFC rate of intrest:"+rateOfIntrest);
}
}
class SBI extends RBI{
double rateOfIntrest=8.5;
public void getIntrestRate()
{
  System.out.println("SBI rate of intrest:"+rateOfIntrest);
}
}
class ICICI extends RBI{
double rateOfIntrest=8.3;
public void getIntrestRate()
{
  System.out.println("ICICI rate of intrest:"+rateOfIntrest);
}
}
public class BankIntrestDemo{
public static void main(String args[]){
RBI rbi=new RBI();
    rbi.getIntrestRate();
HDFC hdfc=new HDFC();
     hdfc.getIntrestRate();
RBI rbi1=new SBI();
    rbi1.getIntrestRate();
RBI rbi2=new ICICI();
    rbi2.getIntrestRate();
}
}