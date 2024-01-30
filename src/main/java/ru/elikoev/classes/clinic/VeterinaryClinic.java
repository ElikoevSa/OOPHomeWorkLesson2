package ru.elikoev.classes.clinic;

import ru.elikoev.classes.animals.Animal;
import ru.elikoev.classes.clinic.personal.Doctor;
import ru.elikoev.classes.clinic.personal.Nurse;
import ru.elikoev.interfaces.*;

import java.util.List;

public class VeterinaryClinic implements FlyingFilterable, SwimingFiltereted, GoingFiltered,Injectionable,Researchable {

    private String clinicName;


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
}
