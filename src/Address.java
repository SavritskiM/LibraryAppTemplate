/**
 * Address Class
 */
public class Address {


    /**
     * toString() : void
     * Overrides the default toString() method.
     * This will format the address in the form of
     *
     * street
     * city, province
     * postalCode
     *
     * @return
     *          String consisting of a formatted mailing address.
     */

class Address {
    String street;
    String city;
    String state;
    String postalCode;
    public String toString() {
        return this.street + ", " + this.city + ", " + this.state + " " + this.postalCode;
}
