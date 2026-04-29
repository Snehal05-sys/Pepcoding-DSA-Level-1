/* You are given input marks= 83 of a student.
Display an appropriate message based on the following rule:-
5.1- For marks above 90 print "Excellent".
5.2- For marks above 80 and less than equal to 90, Print "Good".
5.3- For marks above 70 and less than equal to 80, Print "Fair".
5.4- For For marks above 60 and less than equal to 70, Print "Meet Excpectations".
5.5- For marks less than equal to 60 print "Below Par". */

public class MarksofStudent {
    public static void main(String[] args) {
        int marks = 83;
        if (marks > 90) {
            System.out.println("Excellent");
        } else if (marks > 80) {
            System.out.println("Good");
        } else if (marks > 70) {
            System.out.println("Fair");
        } else if (marks > 60) {
            System.out.println("Meet Expectations");
        } else {
            System.out.println("Below Par");
        }
    }
}
