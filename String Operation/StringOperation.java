import java.util.Scanner;

/**
 * StringOperator class to perform several operations on String like
 * Comparision, reversing, Case switching and finding
 * the lasrgest word from the string.
 * 
 * @author Shanu Aaryan
 */

class StringOperator {

    /**
     * To compare two strings
     * 
     * @param s1 String 1
     * @param s2 string 2 for which comparision is done
     * 
     * @return 1 if both are equal else 0
     */
    public int compareString(String s1, String s2) {
        try {
            if (s1 == s2) {
                return 1;
            } else {
                return 0;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return -1;
    }

    /**
     * Reverses a String
     * 
     * @param str The string on which reversal has to be done
     * @return reverseStr where the Str is in backwards
     */
    public String reverseString(String str) {
        String reverseStr = "";

        try {

            for (int i = str.length() - 1; i >= 0; i--) {
                reverseStr += str.charAt(i);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return reverseStr;
    }

    /**
     * Switching the cases of each letter on the string provided
     * 
     * @param str on which case switching has to be performed
     * @return result that has cases switched for alphabets
     */
    public String caseSwitch(String str) {
        String result = "";
        try {

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                    result += (char) (str.charAt(i) - 32);
                } else if (str.charAt(i) >= 65 && str.charAt(i) <= 90) {
                    result += (char) (str.charAt(i) + 32);
                } else {
                    result += str.charAt(i);
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        return result;
    }

    /**
     * Finds the Largest word in the string
     * 
     * @param str from which longest word has to be found
     * @return largest that is the largest string
     */
    public String largestWord(String str) {
        String largest = "";
        String temp = "";
        try {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    if (temp.length() >= largest.length()) {
                        largest = temp;
                    }
                    temp = "";
                } else {
                    temp += str.charAt(i);
                }
            }

            if (temp.length() >= largest.length()) {
                largest = temp;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return largest;
    }
}

public class StringOperation {
    public static void main(String[] args) {
        StringOperator so = new StringOperator();
        Scanner sc = new Scanner(System.in);

        boolean continuee = true;

        while (continuee) {
            System.out.println("Welcome to string operator");
            System.out.println("What do you want to do?...");
            System.out.println("Choose the Operations");
            System.out.println(
                    "1.\tCompare Strings\n2.\tReverse String\n3.\tCase Switcher\n4\tFind Largest word\n5\tExit...");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter the First String:- ");
                    String str1 = sc.nextLine();
                    System.out.println();
                    System.out.println("Enter the Second String:- ");
                    String str2 = sc.nextLine();
                    int equal = so.compareString(str1, str2);
                    if (equal == 1) {
                        System.out.println("Both are equal");
                    } else if (equal == 0) {
                        System.out.println("Both are not equal");
                    } else {
                        System.out.println("Something went wrong");
                    }
                    break;

                case 2:
                    System.out.println("Enter the string:-");
                    String str = sc.nextLine();
                    System.out.println("Reversal of string " + str + " is " + so.reverseString(str));
                    break;

                case 3:
                    System.out.println("Enter the String:-");
                    str = sc.nextLine();
                    System.out.println("Case Switched Output:- " + so.caseSwitch(str));
                    break;

                case 4:
                    System.out.println("Enter the string to find longest word in it");
                    str = sc.nextLine();
                    System.out.println("The longest word is " + so.largestWord(str));
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
