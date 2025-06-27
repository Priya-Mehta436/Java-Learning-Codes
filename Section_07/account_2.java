package Section_07;

public class account_2 {

public static void main(String[] args) {

    // L04_account_1 bobsL04_account_1 = new L04_account_1("123456778985", 30000.0, "User", "abcdef123@gmail.com", "8765433776" );

    L04_account_1 bobsL04_account_1 = new L04_account_1(); 

    System.out.println(bobsL04_account_1.getNumber());
    System.out.println(bobsL04_account_1.getBalance());

    // bobsL04_account_1.setNumber("8765433776");
    // bobsL04_account_1.setBalance(30000.0);
    // bobsL04_account_1.setName("User");
    // bobsL04_account_1.setEmail("abcdef123@gmail.com");
    // bobsL04_account_1.setaccNumber("123456778985");


    bobsL04_account_1.withdrawFunds(300.0);
    bobsL04_account_1.depositFunds(50);
    bobsL04_account_1.withdrawFunds(50);
    bobsL04_account_1.depositFunds(200);
    bobsL04_account_1.withdrawFunds(100.0);
    bobsL04_account_1.withdrawFunds(100.0);
    
    L04_account_1 ashL04_account_1 = new L04_account_1("Ash", "Ash345@gmail.com", "6577888");
    System.out.println("Account No. : " + ashL04_account_1.getaccNumber() + "; name " + ashL04_account_1.getName());
 }
    
}
