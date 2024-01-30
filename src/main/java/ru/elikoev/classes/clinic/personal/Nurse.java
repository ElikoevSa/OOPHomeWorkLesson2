package ru.elikoev.classes.clinic.personal;

import ru.elikoev.classes.animals.Animal;
import ru.elikoev.interfaces.Careable;

public class Nurse extends Personal implements Careable {
    public Nurse() {
    }

    public Nurse(String name, char sex, int age) {
        super(name, sex, age);
    }


    @Override
    public void careAnimal(Animal animal) {
        System.out.println(super.getName() + " ухаживает за " + animal.getName());
    }
}
