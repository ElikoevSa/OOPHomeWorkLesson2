package ru.elikoev.classes.animals.feline;

import ru.elikoev.classes.animals.Animal;
import ru.elikoev.classes.clinic.personal.Doctor;
import ru.elikoev.interfaces.Goable;

public class Cat extends Animal implements Goable {
    public Cat() {
    }

    public Cat(String name, int age, String disease, Doctor therapist) {
        super(name, age, disease, therapist);
    }

    @Override
    public double run(double speed) {
        System.out.println(super.getName() +  " бегает со скоростью " + speed);
        return speed;
    }
}
