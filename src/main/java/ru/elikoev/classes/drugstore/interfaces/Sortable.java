package ru.elikoev.classes.drugstore.interfaces;

import ru.elikoev.classes.drugstore.pharmacys.Pharmacy;
import ru.elikoev.classes.drugstore.pharmacys.PharmacyComparator;

import java.util.Comparator;
import java.util.List;

public interface Sortable {
    void getPharmaciesSortedByInterPower(List<Pharmacy> pharmacies);

    default void getPharmaciesSortedByTotalPower(List<Pharmacy> pharmacies) {
        pharmacies.sort(Comparator.comparingInt(Pharmacy::getTotalPower));
        System.out.println(pharmacies);
    }

    default void getPharmaciesSortedByTotalWeight(List<Pharmacy> pharmacies) {
        pharmacies.sort(new PharmacyComparator());
        System.out.println(pharmacies);
    }
}

