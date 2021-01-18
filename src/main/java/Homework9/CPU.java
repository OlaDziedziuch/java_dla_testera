package Homework9;

import java.util.Objects;

public class CPU {

        private String brand;
        private double clockSpeed;
        private int cores;

    public CPU(String brand, double clockSpeed, int cores) {
        this.brand = brand;
        this.clockSpeed = clockSpeed;
        this.cores = cores;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getClockSpeed() {
        return clockSpeed;
    }

    public void setClockSpeed(double clockSpeed) {
        this.clockSpeed = clockSpeed;
    }

    public int getCores() {
        return cores;
    }

    public void setCores(int cores) {
        this.cores = cores;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CPU cpu = (CPU) o;
        return clockSpeed == cpu.clockSpeed && cores == cpu.cores && Objects.equals(brand, cpu.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, clockSpeed, cores);
    }

    @Override
    public String toString() {
        return "CPU{" +
                "brand='" + brand + '\'' +
                ", clockSpeed=" + clockSpeed +
                ", capacity=" + cores +
                '}';
    }
}
