package model;

import utils.Helpers;

import java.util.Date;

public class Reservation {

    private final Customer customer;
    private final IRoom room;
    private final Date checkInDate;
    private final Date checkOutDate;

    public Reservation(Customer customer, IRoom room, Date checkInDate, Date checkOutDate) {
        this.customer = customer;
        this.room = room;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public final Customer getCustomer() {
        return customer;
    }

    public final IRoom getRoom() {
        return room;
    }

    public final Date getCheckInDate() {
        return checkInDate;
    }

    public final Date getCheckOutDate() {
        return checkOutDate;
    }

    @Override
    public String toString() {
        String formattedCheckInDate = Helpers.formatDate(this.getCheckInDate());
        String formattedCheckOutDate = Helpers.formatDate(this.getCheckOutDate());
        return "Reservation:\n" +
                this.getCustomer() +"\n" +
                this.getRoom() +
                ", checkInDate: " + formattedCheckInDate +
                ", checkOutDate: " + formattedCheckOutDate;
    }
}
