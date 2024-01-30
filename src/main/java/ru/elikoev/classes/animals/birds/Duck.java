package ru.elikoev.classes.animals.birds;

import ru.elikoev.classes.clinic.personal.Doctor;
import ru.elikoev.interfaces.Swimable;

public class Duck extends Bird implements Swimable {
    public Duck() {
    }

    public Duck(String name, int age, String disease, Doctor therapist) {
        super(name, age, disease, therapist);
    }

    @Override
    public double swim(double speed) {
        System.out.println(super.getName() +  " плавает со скоростью " + speed);
        return speed;
    }

}
