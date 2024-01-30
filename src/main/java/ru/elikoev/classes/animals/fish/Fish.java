package ru.elikoev.classes.animals.fish;

import ru.elikoev.classes.animals.Animal;
import ru.elikoev.classes.clinic.personal.Doctor;
import ru.elikoev.interfaces.Swimable;

public class Fish extends Animal implements Swimable {

    public Fish() {
    }

    public Fish(String name, int age, String disease, Doctor therapist) {
        super(name, age, disease, therapist);
    }

    @Override
    public double swim(double speed) {
        System.out.println(super.getName() +  " плавает со скоростью " + speed);
        return speed;
    }
}
