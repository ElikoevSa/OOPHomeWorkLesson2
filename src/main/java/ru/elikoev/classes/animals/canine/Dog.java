package ru.elikoev.classes.animals.canine;

import ru.elikoev.classes.animals.Animal;
import ru.elikoev.classes.clinic.personal.Doctor;
import ru.elikoev.interfaces.Goable;
import ru.elikoev.interfaces.Swimable;

public class Dog extends Animal implements Goable, Swimable {

    public Dog() {
    }

    public Dog(String name, int age, String disease, Doctor therapist) {
        super(name, age, disease, therapist);
    }

    @Override
    public double run(double speed) {
        System.out.println(super.getName() +  " бегает со скоростью " + speed);
        return speed;
    }

    @Override
    public double swim(double speed) {
        System.out.println(super.getName() +  " плавает со скоростью " + speed);
        return speed;
    }
}
