package org.example.Bill;

import java.util.Date;

public class Bill {
    private String bill_id;
    private Float amount;
    private Date issue_date;
    public Boolean is_paid = false;
    private Date due_date;
    public Bill(String bill_id,Float amount,Date issue_date,Date due_date,Boolean is_paid){
        this.bill_id=bill_id;
        this.is_paid=is_paid;
        this.amount=amount;
        this.due_date=due_date;
        this.issue_date=issue_date;
    }
    public String get_bill_id(){return  this.bill_id;}

    public Float get_amount() {return amount;}

    public Date get_due_date() {return due_date;}

    public Date get_issue_date() {return issue_date;}

    // For the setters ,je ne voie aucune variable qui doit etre modifier .Peutetre que je me trompe🤷🏾‍♂️
}

