package org.bhi.q1.testmodels;

import java.util.Date;
import java.util.Calendar;
import org.bhi.q1.models.Customer;
import org.bhi.q1.models.MovieTicket;

/**
 *
 * @author carlo nino mabalatan //check week 5
 */
public class TestModels {

    public static void main(String[] args) {
        Calendar cal1 = Calendar.getInstance();
        cal1.set(2012, 7, 7, 19, 0, 0);

        Date moviestart1 = cal1.getTime();

        Calendar cal2 = Calendar.getInstance();
        cal2.set(2012, 7, 8, 13, 0, 0);

        Date moviestart2 = cal2.getTime();

        MovieTicket ted1 = new MovieTicket(34555, "TED", moviestart1, 18.5f, "22J");

        MovieTicket ted2 = new MovieTicket(34556, "TED", moviestart1, 18.5f, "20M");

        MovieTicket ted3 = new MovieTicket(34557, "TED", moviestart1, 18.5f, "21G");

        MovieTicket batman1 = new MovieTicket(34600, "The Dark Knight Rises", moviestart2, 20.0f, "08M");

        MovieTicket batman2 = new MovieTicket(34601, "The Dark Knight Rises", moviestart2, 20.0f, "10P");

        Customer john = new Customer(45, "John Lennon");
        john.setMovieticket(ted1);

        Customer paul = new Customer(46, "Paul MacCartney");
        paul.setMovieticket(batman1);

        Customer george = new Customer(47, "George Harrison");
        george.setMovieticket(batman2);

        System.out.println("Customer Details");
        System.out.println("****************");
        System.out.println("");

        System.out.println("Customer Name: " + john.getCustomername());
        System.out.println("Movie Attending: " + ted1.getMoviename());
        System.out.println("Time of Movie: " + ted1.getStarttime());
        System.out.println("Seat Number: " + ted1.getSeatnumber());
        System.out.println("");

        System.out.println("Customer Name: " + paul.getCustomername());
        System.out.println("Movie Attending: " + batman1.getMoviename());
        System.out.println("Time of Movie: " + batman1.getStarttime());
        System.out.println("Seat Number: " + batman1.getSeatnumber());
        System.out.println("");

        System.out.println("Customer Name: " + george.getCustomername());
        System.out.println("Movie Attending: " + batman2.getMoviename());
        System.out.println("Time of Movie: " + batman2.getStarttime());
        System.out.println("Seat Number: " + batman2.getSeatnumber());
    }

}
