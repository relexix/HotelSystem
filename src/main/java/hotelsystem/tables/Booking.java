package hotelsystem.tables;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "booking")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "bookingId")
    private int bookingId;

    @Column(name = "checkIn")
    private LocalDate chechIn;

    @Column(name = "checkOut")
    private LocalDate checkOut;

    @Column(name = "paymentMethod")
    private String paymentMethod;

    @Column(name = "totalPrice")
    private int totalPrice;

    @ManyToOne
    @JoinColumn(name = "clientId")
    private Client client;

    @ManyToOne
    @JoinColumn(name = "roomId")
    private Room room;

    @OneToOne
    @JoinColumn(name = "paymentId")
    private Payment payment;

    public Booking() {
    }

    public Booking(LocalDate chechIn, LocalDate checkOut, String paymentMethod, int totalPrice, Client client, Room room, Payment payment) {
        this.chechIn = chechIn;
        this.checkOut = checkOut;
        this.paymentMethod = paymentMethod;
        this.totalPrice = totalPrice;
        this.client = client;
        this.room = room;
        this.payment = payment;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public LocalDate getChechIn() {
        return chechIn;
    }

    public void setChechIn(LocalDate chechIn) {
        this.chechIn = chechIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", chechIn=" + chechIn +
                ", checkOut=" + checkOut +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", totalPrice=" + totalPrice +
                ", client=" + client +
                ", room=" + room +
                ", payment=" + payment +
                '}';
    }
}



