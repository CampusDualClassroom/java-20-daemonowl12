package com.campusdual.classroom;

import java.util.ArrayList;
import java.util.List;

public class Exercise20 {

    public static List<Person> getPeopleList() {

        List<Person> peoplelist = new ArrayList<>();

        peoplelist.add(new Person("John", "Smith"));
        peoplelist.add(new Teacher("María", "Montessori", "Educación"));
        peoplelist.add(new PoliceOfficer("Jake", "Peralta", "B-99"));
        peoplelist.add(new Doctor("Gregory", "House", "Nefrología e infectología"));

        return peoplelist;
    }

    public static void showPeopleDetails(List<Person> peopleList) {

        for (Person person : peopleList) {
           person.getDetails();
        }

    }

    public static void main(String[] args) {
        List<Person> peopleList = getPeopleList();
        showPeopleDetails(peopleList);
    }



}
