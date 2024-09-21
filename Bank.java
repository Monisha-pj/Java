 class Bank {
     double balance;
     int AccNo;
     String name;

     Bank(double bal, int acc_no, String cname) {
         balance = bal;
         AccNo = acc_no;
         name = cname;
     }

     void desposit(double amt) {

     balance+=amt;
    System.out.println("Amount Desposited Successfully");
     }
     void withdrawal(double amt){
         balance-=amt;
         System.out.println("Amount withdrawed Successfully");

     }
     double Print(){
         return balance;
     }

   public static void main(String[] args){
         System.out.println("Monisha P J 2022503704");
       Bank n1=new Bank(5000,1234,"monisha");
       n1.desposit(2000);
       System.out.println(n1.name+" Balance:"+ n1.Print());
       Bank n2=new Bank(34656,3264,"keerthi");
       n2.withdrawal(1890);
       System.out.println(n2.name+" Balance:"+ n2.Print());
   }
}
