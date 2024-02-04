package ru.elikoev.classes.clinic;

import ru.elikoev.classes.animals.Animal;
import ru.elikoev.classes.animals.birds.Duck;
import ru.elikoev.classes.animals.birds.Raven;
import ru.elikoev.classes.animals.canine.Dog;
import ru.elikoev.classes.animals.feline.Cat;
import ru.elikoev.classes.animals.fish.Fish;
import ru.elikoev.classes.clinic.personal.Doctor;
import ru.elikoev.classes.clinic.personal.Nurse;
import ru.elikoev.classes.clinic.personal.Personal;
import ru.elikoev.interfaces.*;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic implements FlyingFilterable, SwimingFiltereted, GoingFiltered,Injectionable,Researchable {

    private final String clinicName;


    public VeterinaryClinic(String clinicName) {
        this.clinicName = clinicName;
    }

    @Override
    public String toString() {
        return "VeterinaryClinic{" +
                "clinicName='" + clinicName + '\'' +
                '}';
    }

    @Override
    public void flyFiltered(List<Animal> animals) {
        List<Flyable> flyableList = animals.stream()
                .filter(animal -> animal instanceof Flyable)
                .map(animal -> (Flyable) animal).toList();
        flyableList.forEach(System.out::println);
    }

    @Override
    public void goingFilter(List<Animal> animals) {
        List<Goable> goablesList = animals.stream()
                .filter(animal -> animal instanceof Goable)
                .map(animal -> (Goable) animal)
                .toList();
        goablesList.forEach(System.out::println);
    }

    @Override
    public void swimFilter(List<Animal> animals) {
        List<Swimable> swimableList = animals.stream()
                .filter(animal -> animal instanceof Swimable)
                .map(animal -> (Swimable) animal)
                .toList();
        swimableList.forEach(System.out::println);
    }

    @Override
    public void injection(Nurse nurse,Animal animal) {
        System.out.println(nurse.getName() + " делает укол " + animal.getName());
    }

    @Override
    public void researchAnimal(Doctor doctor,Animal animal) {
        System.out.println(doctor.getName() + " исследует и выясняет чем болеет " + animal.getName());
    }

    private Nurse nurseInit(Nurse nurse) {
        return nurse;
    }

    private Doctor doctorInit(Doctor doctor) {
        return doctor;
    }

    private List<Animal> initAnimalList() {
        Doctor doctor = (Doctor) getPersonalList().get(1);
        List<Animal> animals = new ArrayList<>();
        animals.add(new Duck("Утка", 2, "Перелом", doctor));
        animals.add(new Raven("RavenName", 1, "лишай", doctor));
        animals.add(new Dog("Полкан", 7, "Инфекция", doctor));
        animals.add(new Cat("Барсик", 9, "Травма уха", doctor));
        animals.add(new Fish("Зеля", 1, "NULL", doctor));
        return animals;
    }

    public List<Personal> getPersonalList() {
        Nurse nurse = nurseInit(new Nurse("Анна Валерьевна", 'f', 23));
        Doctor doctor = doctorInit(new Doctor("Виктор Анатольевич", 'm', 28, nurse));
        List<Personal> personals = new ArrayList<>();
        personals.add(nurse);
        personals.add(doctor);
        return personals;
    }

    public List<Animal> getInitAnimalList() {
        return initAnimalList();
    }

    public void addNewAnimalInClinic(Animal animal) {
        initAnimalList().add(animal);
    }

    public void deleteAnimalIsClinic(int id) {
        initAnimalList().remove(id);
    }

    public void showAllAnimalsInClinic() {
        initAnimalList().forEach(System.out::println);
    }
}
