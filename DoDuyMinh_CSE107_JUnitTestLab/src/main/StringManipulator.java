package main;

public class StringManipulator {

    // input: ExAmPLE => output: ELPmAxE
    public String reverse(String input) {
        String arrs[] = input.split("");
        String result = "";
        for (int i = arrs.length - 1; i >= 0; i--) {
            result += arrs[i];
        }
        return result;
    }

    // input: example => output: false
    // input: ELpmpLE => output: true
    public boolean isPalindrome(String input) {
        // Your code here
        String str = reverse(input);
        return str.equals(input);
    }

    // input: ExAmPLE, part: Ex => output: true
    // input: ExAmPLE, part: ex => output: false
    public boolean isContained(String input, String part) {
        // Your code here
        return input.contains(part);
    }

    // input: ExAm1PLE2 => output: ExAmPLE
    public String numberRemoved(String input) {
        // Your code here
        StringBuilder result = new StringBuilder();
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                result.append(c);
            }
        }
        return result.toString();
    }

    // input: ExAmPLE => output: EXAMPLE
    public String upperString(String input) {
        // Your code here
        String arrs[] = input.split("");
        String result = "";
        for (int i = 0; i < arrs.length; i++) {
            result += arrs[i].toUpperCase();
        }
        return result;
    }

    // input: ExAmPLE => output: example
    public String lowerString(String input) {
        // Your code here
        String arrs[] = input.split("");
        String result = "";
        for (int i = 0; i < arrs.length; i++) {
            result += arrs[i].toLowerCase();
        }
        return result;
    }

    // input: example string => output: Example String
    public String capitalString(String input) {
        // Your code here
        String arrs[] = input.split("");
        String result = "";
        for (int i = 0; i < arrs.length; i++) {
            if (i == 0 || arrs[i - 1].equals(" ")) {               
                arrs[i] = arrs[i].toUpperCase();           
            } 
            result +=arrs[i];
        }
        return result;
    }

    // input: Example => output: 3
    public int countVowels(String input) {
        // Your code here
        input = lowerString(input);
        int count = 0;
        String arrs[] = input.split("");
        for (int i = 0; i < arrs.length; i++) {
            if (arrs[i].equals("e") || arrs[i].equals("u") || arrs[i].equals("o") || arrs[i].equals("a")
                    || arrs[i].equals("i"))
                count++;
        }
        return count;
    }

    // input: Hello, how are you? => output: 4
    public int countWords(String sentence) {
        // Your code here
        String arrs[] = sentence.split(" ");
        return arrs.length;
    }

    // Input: input = "Java programming", substring = "programming" => Output: 5
    // Input: input = "Java programming", substring = "Programming" => Output: -1
    public int findSubstringIndex(String input, String substring) {
        // Your code here
        return input.indexOf(substring);
    }

    // Input: "Hello World How Are You" => Output: "You Are How World Hello"
    public String reverseWords(String sentence) {
        // Your code here
        String arrs[] = sentence.split(" ");
        String result = "";
        for (int i = arrs.length - 1; i >= 0; i--) {
            result += arrs[i] + " ";
        }
        return result.trim();
    }
}