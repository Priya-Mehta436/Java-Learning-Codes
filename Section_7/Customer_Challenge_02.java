package Section_7;

public class Customer_Challenge_02 {

    public static void main(String[] args) {
        
        Customer_Challenge customer = new Customer_Challenge ("Asha", 67789.00, "asha87675@gmail.com");
            System.out.println(customer.getName());
            System.out.println(customer.getLimit());
            System.out.println(customer.getEmail());
            
        Customer_Challenge secondcustomer = new Customer_Challenge();
            System.out.println(secondcustomer.getName());
            System.out.println(secondcustomer.getLimit());
            System.out.println(secondcustomer.getEmail());

        Customer_Challenge thirdcustomer = new Customer_Challenge();
            System.out.println(thirdcustomer.getName());
            System.out.println(thirdcustomer.getLimit());
            System.out.println(thirdcustomer.getEmail());


    }
    
}

