package org.bhi.q1.models;

/**
 *
 * @author carlo nino mabalatan student-activities-2015 see that the customer
 * doesn't get constructor week 5
 */
public class Customer {

    private int customerID;
    private String customername;
    private MovieTicket movieticket;

    public Customer(int customerID, String customername) {
        this.customerID = customerID;
        this.customername = customername;

    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public MovieTicket getMovieticket() {
        return movieticket;
    }

    public void setMovieticket(MovieTicket movieticket) {
        this.movieticket = movieticket;
    }

    @Override
    public String toString() {
        return "Customer{" + "customerID=" + customerID + ", customername=" + customername + ", movieticket=" + movieticket + '}';
    }

}
