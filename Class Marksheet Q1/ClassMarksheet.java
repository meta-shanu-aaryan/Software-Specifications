
/**
* This is a Marksheet calculation Class
* 
* @author Shanu Aaryan
*/

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.Math;

class Marksheet {
    private ArrayList<Float> marksArr = new ArrayList<>();

    /**
     * Sets array of marks of students.
     * 
     * @param marksArr array of marks of student
     */
    public void setMarksArr(ArrayList<Float> marksArray) {
        this.marksArr = marksArray;
    }

    /**
     * Gets array of marks of students.
     * 
     * @return marksArr array of marks of student
     */
    public ArrayList<Float> getmarksArr() {
        return marksArr;
    }

    /**
     * Find average marks of students in an array of marks.
     * 
     * @return average marks averageMark such that arr[i] = val
     */
    public float averageMarks() {
        try {
            float sum = 0;

            for (int index = 0; index < this.marksArr.size(); index++) {
                sum += this.marksArr.get(index);
            }
            float averageMark = Math.round((sum / marksArr.size()) * 100) / 100;
            return averageMark;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return -1;
        }

    }

    /**
     * Find minimum marks of student in an array of marks.
     * 
     * @return minimum marks
     */
    public float minimumMarks() {
        float minimumMarks = 101;
        try {
            for (int index = 0; index < this.marksArr.size(); index++) {
                if (this.marksArr.get(index) < minimumMarks) {
                    minimumMarks = this.marksArr.get(index);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return minimumMarks;
    }

    /**
     * Find maximum marks of student in an array of marks.
     * 
     * @return maximum marks
     */
    public float maximumMarks() {
        float maximumMarks = -1;
        try {
            for (int index = 0; index < this.marksArr.size(); index++) {
                if (this.marksArr.get(index) > maximumMarks) {
                    maximumMarks = this.marksArr.get(index);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return maximumMarks;
    }

    /**
     * Find percentage of students passed.
     * 
     * @return percentage of students passed
     */
    public float percentStudentPassed() {
        float passedStudent = 0;
        float passPercent = -1;

        try {
            for (int i = 0; i < this.marksArr.size(); i++) {
                if (this.marksArr.get(i) >= 40) {
                    passedStudent++;
                }
            }
            passPercent = ((passedStudent / this.marksArr.size()) * 100);
            System.out.println(passPercent);
            System.out.println(passedStudent);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return Math.round(passPercent * 100) / 100;
    }

}

public class ClassMarksheet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Marksheet ms = new Marksheet();

        System.out.println("Enter the number of students");
        int studentCount = sc.nextInt();
        ArrayList<Float> marksArr = new ArrayList<>();

        int tempCount = 0;
        while (tempCount != studentCount) {
            System.out.print("Enter the marks for student " + (tempCount + 1) + ":- ");
            float tempmarks = sc.nextFloat();
            if (tempmarks >= 0 && tempmarks <= 100) {
                marksArr.add(tempmarks);
                tempCount++;
            } else {
                System.out.println("Enter marks between 0 - 100");
            }
        }
        ms.setMarksArr(marksArr);

        boolean continuee = true;

        while (continuee) {
            System.out.println("Marksheet Calculator Welcomes you...");
            System.out.println("What do you want to do?");
            System.out.println("To calculate average student marks Press 1\nTo get minimum student marks Press 2");
            System.out.println(
                    "To get maximum marks Press 3\nTo get percentage of students passed Press 4\nTo exit Press 5");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("The average marks of students is:- " + ms.averageMarks());
                    break;
                case 2:
                    System.out.println("The minimum marks of students is:- " + ms.minimumMarks());
                    break;
                case 3:
                    System.out.println("The maximum marks of students is:- " + ms.maximumMarks());
                    break;
                case 4:
                    System.out.println("The percentage of students passed is:- " + ms.percentStudentPassed() + "%");
                    break;

                case 5:
                    continuee = false;
                    break;

                default:
                    break;
            }
        }

        sc.close();
    }

}
