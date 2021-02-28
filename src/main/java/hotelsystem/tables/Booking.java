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



