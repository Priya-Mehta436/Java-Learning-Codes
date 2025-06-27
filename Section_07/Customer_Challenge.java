package Section_07;

public class Customer_Challenge {
    private String name;
    private double credit_limit;
    private String email;

    public String getName(){
        return name;
    }

public double getLimit(){
        return credit_limit;
    }
    public String getEmail(){
        return email;
    }

    public Customer_Challenge(String name, double credit_limit, String email){
        this.name = name;
        this.credit_limit = credit_limit;
        this.email = email;
    }

    public Customer_Challenge(){
        this("Sam", 7688.0, "samedaren@gmail.com");
    }

    public Customer_Challenge(String name, String email) {
        this(name, 87339.0, email);
    }
}



