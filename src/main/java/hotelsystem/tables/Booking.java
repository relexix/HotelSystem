package hotelsystem.tables;

import javax.persistence.*;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookingId")
    private int bookingId;

    @Column(name = "checkIn")
    private int chechIn;

    @Column(name = "checkOut")
    private int checkOut;

    @Column(name = "paymentMethod")
    private String paymentMethod;

    @Column(name = "totalPrice")
    private int totalPrice;

    public Booking() {
    }

    public Booking(int bookingId, int chechIn, int checkOut, String paymentMethod, int totalPrice) {
        this.bookingId = bookingId;
        this.chechIn = chechIn;
        this.checkOut = checkOut;
        this.paymentMethod = paymentMethod;
        this.totalPrice = totalPrice;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public int getChechIn() {
        return chechIn;
    }

    public void setChechIn(int chechIn) {
        this.chechIn = chechIn;
    }

    public int getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(int checkOut) {
        this.checkOut = checkOut;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public int getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(int totalPrice) {
        this.totalPrice = totalPrice;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", chechIn=" + chechIn +
                ", checkOut=" + checkOut +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", totalPrice=" + totalPrice +
                '}';
    }
}



