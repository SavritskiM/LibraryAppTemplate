/**
 * Address Class
 */
public class Address {
    String street;
    String city;
    String state;
    String postalCode;
    public String toString() {
        return this.street + ", " + this.city + ", " + this.state + " " + this.postalCode;
    }
}
