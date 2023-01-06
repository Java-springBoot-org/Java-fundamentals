package Algorithms;

public class SubstringSearch {
    public static boolean containsPattern(String text, String pattern) {
        if (text.length() < pattern.length()) {
            return false;
        }

        for (int i = 0; i < text.length() - pattern.length() + 1; i++) {
            boolean patternIsFound = true;

            for (int j = 0; j < pattern.length(); j++) {
                if (text.charAt(i + j) != pattern.charAt(j)) {
                    patternIsFound = false;
                    break;
                }
            }

            if (patternIsFound) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

    }
}

//in python is much easier
/*# function to check if small string is
        # there in big string
        def check(string, sub_str):
        if (string.find(sub_str) == -1):
        print("NO")
        else:
        print("YES")

        # driver code
        string = "geeks for geeks"
        sub_str ="geek"
        check(string, sub_str) */
