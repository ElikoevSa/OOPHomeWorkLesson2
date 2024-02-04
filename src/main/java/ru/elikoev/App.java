package ru.elikoev;

import ru.elikoev.classes.animals.Animal;
import ru.elikoev.classes.animals.canine.Dog;
import ru.elikoev.classes.animals.feline.Cat;
import ru.elikoev.classes.clinic.VeterinaryClinic;
import ru.elikoev.classes.clinic.personal.Doctor;
import ru.elikoev.classes.clinic.personal.Nurse;

import java.util.List;

public class App {

    void initApp(){
        VeterinaryClinic veterinaryClinic = new VeterinaryClinic("VetClinic");
        List<Animal> animals = veterinaryClinic.getInitAnimalList();
        delimiter();
        veterinaryClinic.flyFiltered(animals);
        delimiter();
        veterinaryClinic.goingFilter(animals);
        delimiter();
        veterinaryClinic.swimFilter(animals);
        delimiter();
        Nurse nurse = (Nurse) veterinaryClinic.getPersonalList().get(0);
        veterinaryClinic.injection(nurse, animals.get(2));
        delimiter();
        veterinaryClinic.researchAnimal((Doctor) veterinaryClinic.getPersonalList().get(1), animals.get(4));
        delimiter();
        nurse.careAnimal(animals.get(0));
        delimiter();
        Dog dog = (Dog) animals.get(2);
        dog.swim(2.1d);
        delimiter();
        dog.run(8.2d);
        delimiter();
        veterinaryClinic.addNewAnimalInClinic(new Cat("Жиробас",18,"NULL",(Doctor) veterinaryClinic.getPersonalList().get(1)));
        delimiter();
        veterinaryClinic.showAllAnimalsInClinic();

    }

    private void delimiter(){
        System.out.println("====================================");
    }

}
