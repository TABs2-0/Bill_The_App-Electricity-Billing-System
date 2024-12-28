package org.example.Payement;

import java.util.Date;

public class Payment {
    private String payment_id;
    private Float amount;
    private Date payment_date;


    public  String get_payment_details(){
        return  "the "+this.amount+" bill fees payment has been given the id :"+this.payment_id+"on the "+this.payment_date;
    }
}
