package ru.elikoev;

import ru.elikoev.classes.animals.Animal;
import ru.elikoev.classes.animals.birds.Duck;
import ru.elikoev.classes.animals.birds.Raven;
import ru.elikoev.classes.animals.canine.Dog;
import ru.elikoev.classes.animals.feline.Cat;
import ru.elikoev.classes.animals.fish.Fish;
import ru.elikoev.classes.clinic.VeterinaryClinic;
import ru.elikoev.classes.clinic.personal.Doctor;
import ru.elikoev.classes.clinic.personal.Nurse;

import java.util.ArrayList;
import java.util.List;

public class App {

    void initApp(){
        List<Animal> animals = initAnimalList();
        VeterinaryClinic veterinaryClinic = new VeterinaryClinic("VetClinic");
        delimiter();
        veterinaryClinic.flyFiltered(animals);
        delimiter();
        veterinaryClinic.goingFilter(animals);
        delimiter();
        veterinaryClinic.swimFilter(animals);
        delimiter();
        veterinaryClinic.injection(nurseInit(),animals.get(2));
        delimiter();
        veterinaryClinic.researchAnimal(initPersonal(),animals.get(4));
        delimiter();
        nurseInit().careAnimal(animals.get(0));
        delimiter();
        Dog dog = (Dog) animals.get(2);
        dog.swim(2.1d);
        delimiter();
        dog.run(8.2d);
    }

    private void delimiter(){
        System.out.println("====================================");
    }
    private Nurse nurseInit(){
        return new Nurse("Анна Валерьевна",'f',23);
    }
   private Doctor initPersonal(){
                 return new Doctor("Виктор Анатольевич",'m',28,nurseInit());
    }
     List<Animal>  initAnimalList(){
        List<Animal> animals = new ArrayList<>();
        animals.add(new Duck("Утка", 2, "Перелом", initPersonal()));
        animals.add(new Raven("RavenName", 1, "лишай", initPersonal()));
        animals.add(new Dog("Полкан",7,"Инфекция",initPersonal()));
        animals.add(new Cat("Барсик",9,"Травма уха",initPersonal()));
        animals.add(new Fish("Зеля",1,"NULL",initPersonal()));
        return animals;
    }
}
