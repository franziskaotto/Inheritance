package at.codersbay.java.advanced.common.inheritance.example_person;

import java.util.List;

public class Course {
    String titel;
    List<Student> students;


    Tutor tutor;
    Professor teacher;

    public void print(){
        // Titel vom Kurs
        System.out.println(titel);


        if(teacher != null) {
            // Titel, Vorname & Nachname vom Professor ausgeben.
            System.out.println("Professor: " + teacher.getDegree() + " " + teacher.getFirstName() +" " + teacher.getLastName());
        }

        if(tutor != null) {
            // Vornamen und Nachnamen und die Matrikelnummer vom Tutor ausgeben
            System.out.println("Tutor: " + tutor.getFirstName() + " " + tutor.getLastName() + " " + tutor.getStudentNumber());
        }


            // Anzahl der StudentInnen
        System.out.println("enlistet people " + students.size());



        // Vorname, Nachname, Matrikel der StudentInnen mittels Schleife ausgeben.
        if(students != null) {
            for (Student student : students) {
                System.out.println(student.getFirstName()+ " " + student.getLastName() + " " + "matrikelnr: " + student.getStudentNumber() );
            }

        }

        System.out.println("\n");



    }

}
