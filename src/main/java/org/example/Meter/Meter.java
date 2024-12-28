package org.example.Meter;

public class Meter {

    private String meter_id;
    private String customer_id;
    public String type_of_meter; //celui si va ns aider a conaitre si le compteur est indistruelle ou menager
    private Float current_reading;
    private Float previous_reading;
    public  Meter(String meter_id,Float current_reading,String customer_id,Float previous_reading){

        this.current_reading=current_reading;
        this.meter_id=meter_id;
        this.customer_id=customer_id;
        this.previous_reading=previous_reading;
    }
    //Getters
    public Float get_current_reading() {return current_reading;}

    public String get_meter_id() {return meter_id;}

    public Float get_previous_reading() {return previous_reading;}

    public String get_customer_id() {return customer_id;}

    // setters
    //a question for u🫵🏾, should our system authaurize us to set th meter readings value⁉️,ps No.Please let me know yr point of view
// bon je croie que ont peut set le customer_id si et sellement si il  y a un changement de proprietaire
    public void set_customer_id(String customer_id) {
        this.customer_id = customer_id;
    }
}


