package L4Q1;

public class MyStudent {
    //variables
    private String firstName;
    private double score;

    public MyStudent() {//constructor with no parameters
        firstName = "Yakesh";
        score = 100;
    }

    public MyStudent(String fN, double s) {//constructor with parameters
        firstName = fN;
        score = s;
    }

    //toString method
    public String toString() {
        return String.format("%s: %.2f", firstName, score);
    }
}
