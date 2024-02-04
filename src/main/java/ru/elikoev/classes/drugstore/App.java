package ru.elikoev.classes.drugstore;

import ru.elikoev.classes.drugstore.components.Penecilium;
import ru.elikoev.classes.drugstore.components.Salt;
import ru.elikoev.classes.drugstore.components.Water;
import ru.elikoev.classes.drugstore.interfaces.SortByTotalWeight;
import ru.elikoev.classes.drugstore.interfaces.Sortable;
import ru.elikoev.classes.drugstore.pharmacys.Pharmacy;
import ru.elikoev.classes.drugstore.pharmacys.PharmacyComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Pharmacy aspirin = new Pharmacy("aspirin");
        Pharmacy epinephrine = new Pharmacy("epinephrine");
        Pharmacy suprastin = new Pharmacy("suprastin");

        aspirin
                .addComponent(new Salt("aspirine", 0.12, 12));

        epinephrine
                .addComponent(new Penecilium("Epinephrine", 22, 32))
                .addComponent(new Water("Water", 10, 17))
                .addComponent(new Salt("Penecilium", 123.2, 1233));
        suprastin
                .addComponent(new Penecilium("Suprastin", 0.1, 100))
                .addComponent(new Water("Hydrohlorid", 0.08, 55))
                .addComponent(new Salt("Chloropyramine", 0.02, 45));

        List<Pharmacy> pharmacies = new ArrayList<>();
        pharmacies.add(aspirin);
        pharmacies.add(epinephrine);
        pharmacies.add(suprastin);

//        SortByTotalWeight sortByTotalWeight = new SortByTotalWeight() {
//            @Override
//            public void getSortByTotalWeight(List<Pharmacy> pharmacies, Comparator<Pharmacy> comparator) {
//                pharmacies.sort(comparator);
//                System.out.println(pharmacies);
//            }
//        };
//            pharmacies.stream().filter(sortByTotalWeight::getSortByTotalWeight <= 1).

     getPharmacyesSortedByInnerPower(pharmacies,new PharmacyComparator());
    delimiter();
     getPharmacyesSortedByTotalPower(pharmacies, new PharmacyComparator());
    delimiter();
     getPharmacyesSortedByTotalWeight(pharmacies, new PharmacyComparator());
delimiter();

        final Sortable sorter = pharmacy -> {
            Collections.sort(pharmacy);
            System.out.println(pharmacy);
        };
delimiter();
       sorter.getPharmaciesSortedByInterPower(pharmacies);
        delimiter();
        sorter.getPharmaciesSortedByTotalPower(pharmacies);
        delimiter();
        sorter.getPharmaciesSortedByTotalWeight(pharmacies);
        delimiter();delimiter();
    }

    private static void delimiter(){
        System.out.println("\n=============" +"\n");
    }
    private static void getPharmacyesSortedByInnerPower(List<Pharmacy> pharmacies, PharmacyComparator pharmacyComparator) {
        pharmacies.stream()
                .sorted(pharmacyComparator)
                .forEach(System.out::println);
    }

    private static void getPharmacyesSortedByTotalPower(List<Pharmacy> pharmacies, Comparator<Pharmacy> comporator) {
        pharmacies.stream()
                .sorted(comporator)
                .forEach(System.out::println);

    }


    private static void getPharmacyesSortedByTotalWeight(List<Pharmacy> pharmacies, Comparator<Pharmacy> comparator) {
        pharmacies.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }

}

