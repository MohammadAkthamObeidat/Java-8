package com.company.mapsession;

import com.company.mapsession.Student;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author mohammad.obeidat
 */
public class Main {


    public static void main(String[] args) {

        StudentUtil.fillStudents();
        StudentUtil.fillListOfStudentsList();

        List<Student> studentList = StudentUtil.getStudentsList();
        List<List<Student>> mainList = StudentUtil.getStudentsListOfLists();

        System.out.println("Q1: Print first 5 students with score >50");
        studentList.stream().filter(s -> s.getScore() > 50).limit(5).forEach(System.out::println);

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Q2: Print lengths for each student name(use map)");
        studentList.stream().map(s -> s.getName().length()).forEach(System.out::println);

        System.out.println();
        System.out.println();
        System.out.println();

        System.out.println("Q2: Create two Communities (3 lists of students-list of lists) then use flatmap to print 5 different scores with score greater than 35");
        mainList.stream().flatMap(List::stream).filter(s -> s.getScore() > 35).forEach(System.out::println);

    }
}