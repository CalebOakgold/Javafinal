import java.util.*;
class Main {

 public static int Withdrawal(int checking, int userpick){ int total = checking- userpick;
  return total;   
                                                       
}
  public static int Deposit (int checking, int userpick){ int total = checking+ userpick;
  return total;
  
  
}
   public static void Balance (int checking){
     System.out.println("the balance is " + checking);
   }

  
public static void main(String[] args) {
  int checking = 2000;
  String caleb= "yes";
System.out.println("Welcome to Gebreselissie online banking");
Scanner keyb = new Scanner(System.in);  
while(caleb.equals("yes")){ 

  System.out.println("What do you want to do today?: ");
System.out.println("withdrawal ,deposit ,balance,  or quit");
  String options = keyb.next();
 if (options.equals( "withdrawal")){
System.out.println("How much do you want to take out?: ");
int userpick = keyb.nextInt();
System.out.println(Withdrawal(checking, userpick));
   checking=Withdrawal(checking, userpick);
 }
else if (options.equals("deposit")){
System.out.println("How much do you want to add? : ");
int userpick = keyb.nextInt();
System.out.println(Deposit(checking, userpick));
checking=Deposit(checking, userpick);
}
  else if(options.equals("balance")){
    Balance(checking);
  }
else{
System.out.println("have a great day!!! ");  
}
System.out.println("Do you want to do another transaction?");
  caleb=keyb.next();
}
System.out.println("have a great day see you soon !! "); 
}

















}