package Section_07;

public class L04_account_1 {
    private String customerName;
    private String email;
    private String accNumber;
    private double accBalance;
    private String phoneNumber;

    //for deposit

    public void depositFunds(double depositAmount){
        accBalance += depositAmount;
        System.out.println("Deposit of $ " + depositAmount + "made. New balance is $" + accBalance);
    }

    // for withdrawal

   public void withdrawFunds(double withdrawalAmount){
    if (accBalance - withdrawalAmount<0){
        System.out.println("Insufficient Funds! You only have $" + accBalance + "in your account.");
    } else {
        accBalance -= withdrawalAmount;
        System.out.println("Withdrawal of $" + withdrawalAmount + "processed, Remaining balance = $" + accBalance);

    }

} 

 //for update
    public String getNumber(){
        return phoneNumber;
    }
    public void setNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }


    public double getBalance(){
        return accBalance;
    }
    public void setBalance(double accBalance) {
        this.accBalance = accBalance;
    }


    public String getaccNumber(){
        return accNumber;
    }
    public void setaccNumber(String accNumber){
        this.accNumber = accNumber;
    }


    public String getEmail(){
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getName(){
        return customerName ;
    }
    public void setName(String customerName) {
        this.customerName = customerName;
    }

}
