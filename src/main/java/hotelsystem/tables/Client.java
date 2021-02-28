package hotelsystem.tables;

import javax.persistence.*;

@Entity
@Table(name = "client")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clientId")
    private int clientId;

    @Column(name = "firstName")
    private String firstName;

    @Column(name = "lastName")
    private String lastName;

    @Column(name = "age")
    private int age;

    @Column(name = "address")
    private String address;

    @Column(name = "phoneNumber")
    private int phoneNumber;

    @Column(name = "eMailAddress")
    private String eMailAddress;

    public Client() {
    }

    public Client(String firstName, String lastName, int age, String address, int phoneNumber, String eMailAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.eMailAddress = eMailAddress;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String geteMailAddress() {
        return eMailAddress;
    }

    public void seteMailAddress(String eMailAddress) {
        this.eMailAddress = eMailAddress;
    }

    @Override
    public String toString() {
        return "Client{" +
                "clientId=" + clientId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", eMailAddress='" + eMailAddress + '\'' +
                '}';
    }
}
