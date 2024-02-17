package at.codersbay.java.advanced.common.inheritance.example_person;

import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String args[]) {

        Person max = new Person();
        max.setFirstName("Max");
        max.setLastName("Mustermann");

        Student maximillia = new Student();
        maximillia.setFirstName("Maximillia");
        maximillia.setLastName("Musterfrau");
        maximillia.setStudentNumber("A2024123456");

        Student maximilian = new Student();
        maximilian.setFirstName("Max");
        maximilian.setLastName("Mustermax");
        maximilian.setStudentNumber("B9876");

        Student fabianne = new Student();
        fabianne.setFirstName("Fabianne");
        fabianne.setLastName("MusterFabianne");
        fabianne.setStudentNumber("C12345");

        //____________________________________________________

        Tutor hans = new Tutor();
        hans.setFirstName("Hans");
        hans.setLastName("Mayer");
        hans.setStudentNumber("A20240987765");
        hans.setCourseToTeach("Mathematik");

        Tutor peter = new Tutor();
        peter.setFirstName("Peter");
        peter.setLastName("Petersson");
        peter.setStudentNumber("G34897934");
        peter.setCourseToTeach("Deutsch");

        //_________________________________________________

        Professor professor = new Professor();
        professor.setFirstName("Martin");
        professor.setLastName("Berger");
        professor.setDegree("PhD");

        Professor professor1 = new Professor();
        professor1.setFirstName("Brigitte");
        professor1.setLastName("Brigittison");
        professor1.setDegree("Phd.Dr.Dr.med.");


        Course mathematik = new Course();
        mathematik.titel = "Mathe for beginners";
        mathematik.tutor = hans;
        mathematik.teacher  = professor;




        List<Student> students = new LinkedList<>();
        students.add(maximillia);
        students.add(maximilian);

        mathematik.students = students;

        List<Student> deutschStudents = new LinkedList<>();
        deutschStudents.add(fabianne);
        //deutschStudents.add();

        mathematik.print();


        //____________________________________________________
        Course deutsch = new Course();
        deutsch.titel = "Deutsch advanced";
        deutsch.tutor = peter;
        deutsch.teacher = professor1;
        deutsch.students = deutschStudents;
        deutsch.print();
    }
}
