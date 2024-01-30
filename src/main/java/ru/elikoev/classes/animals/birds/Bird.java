package ru.elikoev.classes.animals.birds;

import ru.elikoev.classes.animals.Animal;
import ru.elikoev.classes.clinic.personal.Doctor;
import ru.elikoev.interfaces.Flyable;
import ru.elikoev.interfaces.Swimable;

public abstract class Bird extends Animal implements Flyable {


    public Bird() {
    }

    public Bird(String name, int age, String disease, Doctor therapist) {
        super(name, age, disease, therapist);
    }

    @Override
    public double fly(double speed) {
        System.out.println(super.getName() + " летает со скоростью " + speed);
        return speed;
    }

}
