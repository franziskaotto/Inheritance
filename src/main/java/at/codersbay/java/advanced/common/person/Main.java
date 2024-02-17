package at.codersbay.java.advanced.common.person;

public class Main {

    public static void main(String[] args) {

        Person myPerson = new Person();


        myPerson.firstName = "Person firstname";
        myPerson.lastName = "person lastname";
        myPerson.print();

        Student myStudent = new Student();
        myStudent.firstName = "Name FirstName Student";
        myStudent.lastName = "LastName Student";
        myStudent.mtrklNummer = 123456;
        myStudent.print();

        Professor myProfessor = new Professor();
        myProfessor.firstName = "Firstname Professor";
        myProfessor.lastName = "Lastname Professor";
        myProfessor.titel = "Prof. Dr.";
        myProfessor.print();


    }





}
