package Section_07;

public class account_2 {

public static void main(String[] args) {

    L04_account_1 bobsL04_account_1 = new L04_account_1();

    bobsL04_account_1.setNumber("6567366373");
    bobsL04_account_1.setBalance(30000.0);
    bobsL04_account_1.setName("User");
    bobsL04_account_1.setEmail("abcdef123@gmail.com");
    bobsL04_account_1.setaccNumber("6373665456373727");


    bobsL04_account_1.withdrawFunds(300.0);
    bobsL04_account_1.depositFunds(50);
    bobsL04_account_1.withdrawFunds(50);
    bobsL04_account_1.depositFunds(200);
    bobsL04_account_1.withdrawFunds(100.0);
    bobsL04_account_1.withdrawFunds(100.0);
    
 }
    
}
