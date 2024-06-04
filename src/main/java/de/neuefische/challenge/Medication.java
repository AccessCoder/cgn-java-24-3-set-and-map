package de.neuefische.challenge;

import java.util.Objects;

public class Medication {

    /**
     *
     Step 1: Create a class 'Medication' with the methods 'getName', 'getPrice', and 'getAvailability'.


     */

    private String name;
    private double price;
    private String availability;

    public Medication(String name, double price, String availability) {
        this.name = name;
        this.price = price;
        this.availability = availability;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getAvailability() {
        return availability;
    }

    @Override
    public String toString() {
        return "Medication{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", availability='" + availability + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Medication that = (Medication) o;
        return Double.compare(that.price, price) == 0 && Objects.equals(name, that.name) && Objects.equals(availability, that.availability);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, availability);
    }
}
