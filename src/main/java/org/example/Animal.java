package org.example;


import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.Objects;

public class Animal implements Comparable<Animal>{
    private int id;

    private int owner;
    private String name;
    private LocalDate birthDate;

    private Doctor.Specialization kind;

    private Animal(AnimalBuilder builder) {
        this.id = builder.id;
        this.owner = builder.owner;
        this.name = builder.name;
        this.kind = builder.kind;

    }

    public static class AnimalBuilder{
        private int id;
        private int owner;
        private String name;
        private LocalDate birthDate;
        private Doctor.Specialization kind;

        public AnimalBuilder(int id){
            this.id = id;
        }

        public AnimalBuilder setOwner(int owner) {
            this.owner = owner;
            return this;
        }

        public AnimalBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public AnimalBuilder setBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public AnimalBuilder setKind(Doctor.Specialization kind) {
            this.kind = kind;
            return  this;
        }

        public Animal build(){
            return new Animal(this);
        }
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Doctor.Specialization getKind() {
        return kind;
    }

    public void setKind(Doctor.Specialization kind) {
        this.kind = kind;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", kind=" + kind +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && Objects.equals(name, animal.name) && Objects.equals(birthDate, animal.birthDate) && kind == animal.kind;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, kind);
    }

    @Override
    public int compareTo(Animal a){return this.id - a.id;}
}

class CompareAnimal implements Comparator<Animal>{
    @Override
    public int compare(Animal o1, Animal o2){
        return o1.getName().compareTo(o2.getName());
    }
}