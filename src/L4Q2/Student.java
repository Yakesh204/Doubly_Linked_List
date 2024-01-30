package L4Q2;

public class Student implements Comparable<Student> {
    //variables
    private Double score;
    private String firstName, lastName;

    public Student() {//constructor with no parameters
firstName = "Yakesh";
lastName = "Umachandran";
score = 100.00;
    }

    public Student(String fN, String lN, Double s) {//constructor with parameters
        score = s;
        firstName = fN;
        lastName = lN;
    }

    public Double getScore() {
        return score;
    }//getter method

    public void setScore(Double s) {
        score = s;
    }//setter method


    public String getFirstName() {
        return firstName;
    }//getter method

    public void setFirstName(String fN) {
        firstName = fN;
    }//setter method

    public String getLastName() {
        return lastName;
    }//getter method

    public void setLastName(String lN) {
        lastName = lN;
    }//setter method

    public int compareTo(Student t) {//method will be used to compare scores
        //list method will use this method to organize
        //will be Comparables compareTo method
        if(this.score > t.score){
            return -1;
        }
        else if(this.score == t.score){
            return 0;
        }
        else{
            return 1;
        }
    }
//will print out student info
    public String toString() {
        return String.format("\t%s %s: %.2f\n",firstName,lastName,score);
    }
}
