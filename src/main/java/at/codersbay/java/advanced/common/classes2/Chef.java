package at.codersbay.java.advanced.common.classes2;

import java.util.LinkedList;
import java.util.List;

public class Chef extends Person{
    List<Coworkers> programmerList = new LinkedList<>();

    public void print(){
        for(Coworkers coworker : programmerList) {
            System.out.println(coworker.firstName + " " + coworker.lastName + " " + coworker.competence);
        }
    }





    public List<Coworkers> getProgrammerList() {
        return programmerList;
    }

    public void setProgrammerList(List<Coworkers> programmerList) {
        this.programmerList = programmerList;
    }
}
