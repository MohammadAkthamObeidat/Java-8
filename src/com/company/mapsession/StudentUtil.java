package com.company.mapsession;

import com.company.sessionone.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author mohammad.obeidat
 */
public class StudentUtil {

   static List<Student> studentList = new ArrayList<>();

   static List<List<Student>> mainList = new ArrayList<>();
   static List<Student> listOne = new ArrayList<>();
   static List<Student> listTwo = new ArrayList<>();
   static List<Student> listThree = new ArrayList<>();

    public static void fillStudents(){

        studentList.add(new Student("Ali",1223, 99));
        studentList.add(new Student("Ahmad",4552, 30));
        studentList.add(new Student("Sami",5212, 85));
        studentList.add(new Student("Mohammad",5244, 12));
        studentList.add(new Student("Samer",3213,50));
        studentList.add(new Student("Mahmoud",8732, 20));
        studentList.add(new Student("Rami",5468, 53));
        studentList.add(new Student("Moath",6974, 85));
        studentList.add(new Student("Maher",8953, 100));
        studentList.add(new Student("Mahmoud",5621, 3));
        studentList.add(new Student("Ali",2388, 45));
        studentList.add(new Student("Abdulla",5532, 56));
        studentList.add(new Student("Amer",2383, 10));
    }

    public static void fillListOfStudentsList(){



        listOne.add(new Student("Ali",1223, 99));
        listOne.add(new Student("Ahmad",4552, 30));
        listOne.add(new Student("Sami",5212, 85));

        listTwo.add(new Student("Mohammad",5244, 12));
        listTwo.add(new Student("Samer",3213,50));
        listTwo.add(new Student("Mahmoud",8732, 20));

        listThree.add(new Student("Rami",5468, 53));
        listThree.add(new Student("Moath",6974, 85));
        listThree.add(new Student("Maher",8953, 100));

        mainList.add(listOne);
        mainList.add(listTwo);
        mainList.add(listThree);

    }

    public static List<Student> getStudentsList(){
        return studentList;
    }
    public static List<List<Student>> getStudentsListOfLists(){
        return mainList;
    }
}
