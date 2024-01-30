package L4Q2;

import java.util.Comparator;

public class HelperClassCompareLastNames implements Comparator<Student> {
    //method will be used to compare lastnames
    public int compare(Student one, Student two){
        String first = one.getLastName();
        String second = two.getLastName();
        if(first.charAt(0)<second.charAt(0)){
            return -1;
        }
        else if(first.charAt(0)==second.charAt(0)){
            return 0;
        }
        else{
            return 1;
        }

    }

}
