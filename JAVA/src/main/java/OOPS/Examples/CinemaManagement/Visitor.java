package OOPS.Examples.CinemaManagement;

import java.util.ArrayList;

public class Visitor extends User {

    private ArrayList<Booking> bookings;

    public Visitor() {
        super();
    }

    @Override
    public void showList() {
        System.out.println("1. View Movies");
        System.out.println("2. Book Ticket");
        System.out.println("3. Cancel Ticket");
        System.out.println("4. Quit");
    }

    public ArrayList<Booking> getBookings() {
        return bookings;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }
}
