package hotelsystem.tables;


import javax.persistence.*;

@Entity
@Table(name = "room")
public class Room {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "roomId")
    private int roomId;

    @Column(name = "number")
    private int number;

    @Column(name = "size")
    private String size;

    @Column(name = "beds")
    private int beds;

    @Column(name = "price")
    private int price;

    public Room() {
    }

    public Room(int roomId, int number, String size, int beds, int price) {
        this.roomId = roomId;
        this.number = number;
        this.size = size;
        this.beds = beds;
        this.price = price;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", number=" + number +
                ", size='" + size + '\'' +
                ", beds=" + beds +
                ", price=" + price +
                '}';
    }
}
