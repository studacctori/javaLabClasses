package org.example;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;
import java.util.Objects;

public class Client {
    private  int id;
    private String name;
    private String phone;
    private String email;
    public Animal[] animals;

    public Client() {
    }

    public Client(int id, String name, String phone, String email, Animal[] animals) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.animals = animals;
    }

    public Client(int id, String name, String phone, String email) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return id == client.id && name.equals(client.name) && phone.equals(client.phone) && email.equals(client.email) && Arrays.equals(animals, client.animals);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, phone, email);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", animals=" + Arrays.toString(animals) +
                '}';
    }
}
