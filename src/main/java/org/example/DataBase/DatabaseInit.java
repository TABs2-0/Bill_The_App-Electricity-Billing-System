package org.example.DataBase;

import java.sql.*;

public class DatabaseInit {

    public static void main(String[] args) {
        //Try tests the connection
     try(   Connection connection= DriverManager.getConnection(
          "jdbc:mysql://localhost:3307/bill_the_app_scheme",// la localisation de ma BD
                "root", // mn nom utilisateur
                "MySqlPa$$"// mon pass mais vous devriez precisez le votre pour pouvoir utiliser ce fichier
        )) {
        Statement statement=connection.createStatement(); //statement instance to be able to run queries
        // customer table initialisation
        String CreateCustomersTable = "CREATE TABLE IF NOT EXISTS Customer("+
                "customer_id VARCHAR(150)   PRIMARY KEY,"+
                "customer_name VARCHAR(150) NOT NULL, "+
                "customer_address VARCHAR(150) NOT NULL ,"+
                "phone_number INT NOT NULL)";
        statement.executeUpdate(CreateCustomersTable);

        // bill table initialisation
        String CreateBillTable= "CREATE TABLE IF NOT EXISTS Bill ("+
                " bill_id VARCHAR(150) PRIMARY KEY,"+
                "amount FLOAT NOT NULL,"+
                "issue_date DATE  NOT NULL,"+
                "is_payed BOOLEAN NOT NULL,"+
                "due_date DATE NOT NULL)";
        statement.executeUpdate(CreateBillTable);
        //payment table init
         String CreatePaymentTable =  "CREATE TABLE IF NOT EXISTS Payment("+
                 " payment_id VARCHAR(150) PRIMARY KEY,"+
                 "amount FLOAT NOT NULL,"+
                 "payment_date DATE  NOT NULL)";
         statement.executeUpdate(CreatePaymentTable);

         // meter table init
         String createMeterTable = "CREATE TABLE IF NOT EXISTS Meter (" +
                 "meter_id VARCHAR(150) PRIMARY KEY," +
                 "customer_id VARCHAR(150) NOT NULL," +
                 "type_of_meter VARCHAR(150) NOT NULL," +
                 "current_reading FLOAT NOT NULL," +
                 "previous_reading FLOAT NOT NULL," +
                 "FOREIGN KEY (customer_id) REFERENCES Customer(customer_id))";
          statement.executeUpdate(createMeterTable);
          System.out.println("Database initialized successfully!");





     } catch (SQLException e) {
         throw new RuntimeException(e);
     }
    }
}
