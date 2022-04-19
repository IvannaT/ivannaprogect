package day_47_contstrucrors;

public class Address {

    private   String street;
    private   String city;
    private   String state;
    private   String zipCode;
    private   String country = "USA";
//constructor- automatically called
    public Address(){
        System.out.println("Address constructor");
        street= "123 unknown st";
        city = "java";
        state = "unknown";
        zipCode = "OOO0";

    }
    //second constructor,overload cons,-provides shortcut to initialise variables
    //in same statement ex;Address address = new address (7387 shychevicha<rivne rv)
    public Address(String street ,String city,String state, String zipCode){
        setStreet(street);
        setCity(city);
        setState(state);
        setZipCode(zipCode);
    }
    public String getStreet() {
        return street;
    }

    public String toString() {
        return street +", "+ city + ", "+ state +" "+ zipCode;
    }

    public void setStreet(String street){
        if(street.isEmpty() || street.length() > 50){
            System.out.println("Error : invalid street");
        }else{
            this.street = street;
        }
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

}
