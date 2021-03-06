package hotelsystem.tables;

import javax.persistence.*;
import java.util.List;

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

//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_clientId")
//    private Client fk_clientId;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_roomId")
//    private Room fk_roomId;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fk_paymentId")
//    private Payment paymentId;

    public Booking() {
    }

    public Booking(int chechIn, int checkOut, String paymentMethod, int totalPrice) {
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
//                ", fk_clientId=" + fk_clientId +
//                ", fk_roomId=" + fk_roomId +
//                ", fk_paymentId=" + paymentId +
                '}';
    }
}



