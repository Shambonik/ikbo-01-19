package task_2;

import java.util.StringTokenizer;

public class Address {
    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String building;
    private String apartment;


    //a)
    public Address(String address, String regex) {
        address = address.replace(" ", "");
        String[] parts = address.split(regex);
        if (parts.length != 7) {
            System.out.println("Неверный ввод");
            return;
        }
        this.country = parts[0].trim();
        this.region = parts[1].trim();
        this.city = parts[2].trim();
        this.street = parts[3].trim();
        this.house = parts[4].trim();
        this.building = parts[5].trim();
        this.apartment = parts[6].trim();
    }

    //б)
    public Address(String address){
        address = address.replace(" ", "");
        StringTokenizer tokens = new StringTokenizer(address, ",.;-");
        if (tokens.countTokens() != 7) {
            System.out.println("Неверный ввод");
            return;
        }
        this.country = tokens.nextToken().trim();
        this.region = tokens.nextToken().trim();
        this.city = tokens.nextToken().trim();
        this.street = tokens.nextToken().trim();
        this.house = tokens.nextToken().trim();
        this.building = tokens.nextToken().trim();
        this.apartment = tokens.nextToken().trim();
    }

    @Override
    public String toString() {
        return "Address{" +
                "country='" + country + '\'' +
                ", region='" + region + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", building='" + building + '\'' +
                ", apartment='" + apartment + '\'' +
                '}';
    }
}
