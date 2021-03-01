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

    @Column(name = "fk_clientId")
    private int fk_clientId;

    @Column(name = "fk_roomId")
    private int fk_roomId;

    @Column(name = "fk_paymentId")
    private int fk_paymentId;

    public Booking() {
    }

    public Booking(int bookingId, int chechIn, int checkOut, String paymentMethod, int totalPrice, int fk_clientId, int fk_roomId, int fk_paymentId) {
        this.bookingId = bookingId;
        this.chechIn = chechIn;
        this.checkOut = checkOut;
        this.paymentMethod = paymentMethod;
        this.totalPrice = totalPrice;
        this.fk_clientId = fk_clientId;
        this.fk_roomId = fk_roomId;
        this.fk_paymentId = fk_paymentId;
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

    public int getFk_clientId() {
        return fk_clientId;
    }

    public void setFk_clientId(int fk_clientId) {
        this.fk_clientId = fk_clientId;
    }

    public int getFk_roomId() {
        return fk_roomId;
    }

    public void setFk_roomId(int fk_roomId) {
        this.fk_roomId = fk_roomId;
    }

    public int getFk_paymentId() {
        return fk_paymentId;
    }

    public void setFk_paymentId(int fk_paymentId) {
        this.fk_paymentId = fk_paymentId;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", chechIn=" + chechIn +
                ", checkOut=" + checkOut +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", totalPrice=" + totalPrice +
                ", fk_clientId=" + fk_clientId +
                ", fk_roomId=" + fk_roomId +
                ", fk_paymentId=" + fk_paymentId +
                '}';
    }
}



