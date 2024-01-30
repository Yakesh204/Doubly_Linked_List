package L4Q2;

import java.util.ArrayList;
import java.util.Collections;

public class DriverForStudentClass {
    public static void main(String[] args){
        //creating arraylist of Student objects
        ArrayList<Student> studentArray = new ArrayList<Student>();
        //creating student objects
        Student one = new Student();
        Student two = new Student("Harry","Potter",75.5);
        Student three = new Student("Ronald","Weasley",86.0);
        Student four = new Student("Hermione","Granger",91.7);
        Student five = new Student("Parvati","Patil",93.75);
        myHeader(one,3,2);//calling header after creating objects so can set parameter as student objects
        //adding objects to array
        studentArray.add(one);
        studentArray.add(two);
        studentArray.add(three);
        studentArray.add(four);
        studentArray.add(five);
        //Printing list as is
        System.out.printf("\nThe Score Card:\n %s\n",printArray(studentArray));
        //sorting array using Comparable interface
        //then printing
        Collections.sort(studentArray);
        System.out.printf("The sorted list in terms of score in descending order....\n %s\n",printArray(studentArray));
        //Sorting array using Comparator interface using HelperClassCompareLastNames class
        HelperClassCompareLastNames sortLast = new HelperClassCompareLastNames();
        Collections.sort(studentArray, sortLast);
        System.out.printf("The sorted list in terms of Last Names....\n %s\n",printArray(studentArray));
        //Sorting array using Comparator interface using HelperClassCompareFirstNames class
        HelperClassCompareFirstNames sortFirst = new HelperClassCompareFirstNames();
        Collections.sort(studentArray, sortFirst);
        System.out.printf("The sorted list in terms of First Names....\n %s",printArray(studentArray));
        //calling myFooter method
        myFooter(3,2);

    }
    public static void myHeader(Student myInfo, int labE_number, int q_number){//Header method
        System.out.printf("=======================================================\n" +
                "Lab Exercise %d-Q%d\n" +
                "Prepared By: %s %s\n" +
                "Student Number: 251303571\n" +
                "Goal of this Exercise: Implement Comparator and Comparable interfaces\n" +
                "=======================================================",labE_number, q_number,myInfo.getFirstName(),myInfo.getLastName());
    }
    public static void myFooter(int labE_number, int q_number){//Footer Method
        System.out.printf("=======================================================\n" +
                "Completion of Lab Exercise %d-Q%d is successful!\n" +
                "Signing off - Yakesh\n" +
                "=======================================================", labE_number,q_number);
    }
    public static String printArray(ArrayList<Student> array){
        //goes through arraylist and prints student info using toString method.
        String rtrn ="";
        for (Student student: array)
        {
            rtrn += student.toString();
        }
        return rtrn;
    }




}
