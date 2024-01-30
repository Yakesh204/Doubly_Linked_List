package L4Q2;
import java.util.Comparator;

public class HelperClassCompareFirstNames implements Comparator<Student> {
//will be method used to compare first names
    public int compare(Student one, Student two){
        String first = one.getFirstName();
        String second = two.getFirstName();
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
