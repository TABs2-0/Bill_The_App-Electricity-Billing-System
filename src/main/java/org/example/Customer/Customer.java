package org.example.Customer;

public class Customer {
    private String customer_name;
    private String customer_id;
    private String customer_address;
    private Double phone_number;


    public  Customer(String customer_id,String customer_name,String customer_address, Double phone_number){

        this.customer_id=customer_id;
        this.customer_name=customer_name;
        this.customer_address=customer_address;
        this.phone_number=phone_number;

    }


    public String get_customer_id(){return  this.customer_id;}
    public String get_customer_name(){return  this.customer_name;}
    public String get_customer_address(){return  this.customer_address;}
    public Double get_phone_number(){return this.phone_number;}
    public  String get_customer_details(){
        return "The customer number :"+this.customer_id+"has been registered with the name :"+this.customer_name+"currently living at "+this.customer_address+" and can be contacted at "+this.phone_number;
    }
    //setters
    public  void Set_customer_name(String new_name){ this.customer_name=new_name;}
    public  void Set_customer_address(String new_address){ this.customer_address=new_address;}
    public  void Set_phone_number(Double new_number){ this.phone_number=new_number;}
}


