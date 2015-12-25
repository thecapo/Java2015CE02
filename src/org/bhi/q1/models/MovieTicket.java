package org.bhi.q1.models;

import java.util.Date;

/**
 *
 * @author carlo nino mabalatan
 */
public class MovieTicket {

    private int ticketID;
    private String moviename;
    private Date starttime;
    private float price;
    private String seatnumber;

    public MovieTicket(int ticketID, String moviename, Date starttime, float price, String seatnumber) {
        this.ticketID = ticketID;
        this.moviename = moviename;
        this.starttime = starttime;
        this.price = price;
        this.seatnumber = seatnumber;
    }

    public MovieTicket() {
    }

    public int getTicketID() {
        return ticketID;
    }

    public void setTicketID(int ticketID) {
        this.ticketID = ticketID;
    }

    public String getMoviename() {
        return moviename;
    }

    public void setMoviename(String moviename) {
        this.moviename = moviename;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSeatnumber() {
        return seatnumber;
    }

    public void setSeatnumber(String seatnumber) {
        this.seatnumber = seatnumber;
    }

    @Override
    public String toString() {
        return "MovieTicket{" + "ticketID=" + ticketID + ", moviename=" + moviename + ", starttime=" + starttime + ", price=" + price + ", seatnumber=" + seatnumber + '}';
    }

}
