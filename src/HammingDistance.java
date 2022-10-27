//Simple function that takes the Hamming distance between two strings. This could be used for matching typoed user input to one option from a list of options.

import java.util.Scanner;
class HammingDistance {
    public static int hammingDistance(String s1, String s2) {
        int distance = 0;
        distance += Math.abs(s1.length() - s2.length()); //adds distance for the difference in lengths between the two strings. (e.g. "cat" and "cats" have distance 1 from ea/o)
//        shorterString = (s1.length() <= s2.length()? s1: s2);
        int shorterStringLength = Math.min(s1.length(), s2.length());

        char[] ca1 = s1.toCharArray();
        char[] ca2 = s2.toCharArray();
        for (int i = 0; i < shorterStringLength;i++) {
            if (ca1[i] != ca2[i]) {
                distance += 1;
            }
        }

        return distance;
    }

    public static void main(String[] args) {

//        String s1 = "cat";
//        String s2 = "catra";
//        System.out.println(s1 + " " + s2 + " distance: " + hammingDistance(s1,s2));
        String[] options = {"rectangle", "circle", "triangle"};

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            int winningDistance = -1;
            String winningOption = null;
            for (String option : options) {
                if (hammingDistance(input, option) < winningDistance || winningDistance == -1) {
                    winningOption = option;
                    winningDistance = hammingDistance(input, option);
                }
            }

            System.out.println("Input " + input + " was closest to " + winningOption + " with Hamming distance " + winningDistance);
        }

    }

    public static String closestString(String input, String[] options) { //returns the string out of `options` that is closest to `input`
        int winningDistance = -1;
        String winningOption = null;
        for (String option : options) {
            if (hammingDistance(input, option) < winningDistance || winningDistance == -1) {
                winningOption = option;
                winningDistance = hammingDistance(input, option);
            }
        }

        return winningOption;
    }
}