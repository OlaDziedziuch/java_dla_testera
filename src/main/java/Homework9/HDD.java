package Homework9;

import java.util.Objects;

public class HDD {

    private String brand;
    private int capacity;

    public HDD(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "HDD{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HDD hdd = (HDD) o;
        return capacity == hdd.capacity && Objects.equals(brand, hdd.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, capacity);
    }
}
