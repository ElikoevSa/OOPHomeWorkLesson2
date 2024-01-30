package ru.elikoev.classes.animals;

import ru.elikoev.classes.clinic.personal.Doctor;

import java.util.Objects;

public abstract class Animal {
    private String name;
    private int age;
    private String disease;
    private Doctor Therapist;

    public Animal() {
    }

    public Animal(String name, int age, String disease, Doctor therapist) {
        this.name = name;
        this.age = age;
        this.disease = disease;
        Therapist = therapist;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal animal)) return false;
        return age == animal.age && Objects.equals(name, animal.name) && Objects.equals(disease, animal.disease) && Objects.equals(Therapist, animal.Therapist);
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDisease() {
        return disease;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, disease, Therapist);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", disease='" + disease + '\'' +
                ", Therapist=" + Therapist +
                '}';
    }


}
