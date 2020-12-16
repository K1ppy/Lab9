package src.main.java.com.bsu;

import java.util.Objects;

public class Ninja {
    private String name;
    private String surname;
    private int power;
    private double rate;

    public Ninja(String name, String surname, int power, double rate) {
        this.name = name;
        this.surname = surname;
        this.power = power;
        this.rate = rate;
    }

    public Ninja() {
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getPower() {
        return power;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ninja ninja = (Ninja) o;
        return power == ninja.power &&
                Double.compare(ninja.rate, rate) == 0 &&
                name.equals(ninja.name) &&
                surname.equals(ninja.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, power, rate);
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", power=" + power +
                ", rate=" + rate +
                '}';
    }
}
