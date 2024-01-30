package L4Q1;

public class Driver_DoublyLinkedList {
    public static void main(String[] args){
myHeader(3,1);//calling header
        //creating new doublylinkedlist that will take myStudend objects
        DoublyLinkedList<MyStudent> yakeshList = new DoublyLinkedList<MyStudent>();
        //creating MyStudent objects
        MyStudent s0= new MyStudent();
        MyStudent s1= new MyStudent("Harry", 67.35);
        MyStudent s2= new MyStudent("Luna", 87.5);
        MyStudent s3= new MyStudent("Vincent", 60.5);
        MyStudent s4= new MyStudent("Hermione", 89.2);
        //adding the MyStudent objects to arraylist
        yakeshList.addLast(s0);
        yakeshList.addLast(s1);
        yakeshList.addLast(s2);
        yakeshList.addLast(s3);
        //printing array out
        System.out.printf("\nAdding 4 students to the list.\n" +
        "The list Content:\n"+
        "%s\n", yakeshList.toString());
        //declaring reference variable of node type to hold node in front and behind
        DoublyLinkedList.Node<MyStudent> s2Place = yakeshList.findNode(s2);
        DoublyLinkedList.Node<MyStudent> s3Place = yakeshList.findNode(s3);
        //adding student between 2 previously found nodes
        yakeshList.addBetween(s4,s2Place,s3Place);
        //print out info
        System.out.printf("Adding Hermione to the list in between Luna and Vincent.....\n" +
        "The list Content:\n"+
        "%s\n",yakeshList.toString());
        myFooter(3,1);//calling myFooter
    }

    public static void myHeader(int labE_number, int q_number){
        //printing out header info
        System.out.printf("=======================================================\n" +
                "Lab Exercise %d-Q%d\n" +
                "Prepared By: Yakesh Umachandran\n" +
                "Student Number: 251303571\n" +
                "Goal of this Exercise: Use doublyLinkedList to organize data\n" +
                "=======================================================",labE_number, q_number);
    }
    public static void myFooter(int labE_number, int q_number){
        //printing out footer info
        System.out.printf("=======================================================\n" +
                "Completion of Lab Exercise %d-Q%d is successful!\n" +
                "Signing off - Yakesh\n" +
                "=======================================================", labE_number,q_number);
    }


}
