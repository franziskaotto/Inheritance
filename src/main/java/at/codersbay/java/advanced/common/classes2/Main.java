package at.codersbay.java.advanced.common.classes2;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {


        Person anabelle = new Person();
        anabelle.setFirstName("Annabelle");
        anabelle.setLastName("Anabelleson");
        anabelle.setSalary(2000);

        Person hubert = new Person();
        hubert.setFirstName("Hubert");
        hubert.setLastName("Hubertsson");
        hubert.setSalary(2100);

        Coworkers programmer1 = new Coworkers();
        programmer1.firstName = anabelle.getFirstName();
        programmer1.lastName = anabelle.getLastName();
        programmer1.competence = "Fullstack";

        Coworkers programmer2 = new Coworkers();
        programmer2.firstName = hubert.getFirstName();
        programmer2.lastName = hubert.getLastName();
        programmer2.competence = "frontend-Dev";


        List<Coworkers> programmers = new LinkedList<>();
        programmers.add(programmer1);
        programmers.add(programmer2);

        Chef chef = new Chef();
        chef.salary = 10000;
        chef.programmerList = programmers;

        chef.print();


    }
}


/**
 * personen (Vorname, nachname, gehalt)
 * mitarbeiter (fachkompetenz programmieren
 * chefs (Liste mitarbeiter, für welche die er verhaltworlich ist
 */
