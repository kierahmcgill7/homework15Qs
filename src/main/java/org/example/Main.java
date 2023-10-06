package org.example;

public class Main {
    //1
    public static int getLastIndex(String[] names) {
        return names.length - 1;
    }
    //2
    public static int getSecondToLastIndex(String[] names) {
        return names.length - 2;
    }
    //3
    public static String getFirstElement(String[] names) {
        return names[0];
    }
    //4
    public static String getLastElement(String[] names) {
        return names[names.length - 1];
    }
    //5
    public static String getSecondToLastElement(String[] names) {
        return names[names.length -2];
    }
    //6
    public static int getSum(int[] ints) {
        int Sum = 0;
        for (int i : ints) {Sum = Sum + i;}
        return Sum;
    }
    //7
    //we're looping through the elements
    public static int getAverage(int[] ints) {
        int Sum = 0;
        for (int i : ints) {Sum = Sum + i;}
        int Average = Sum / ints.length;
        return Average;
    }
    //8
    public static String extractAllOddNumbers(int[] numbers) {
        String oddNumbersExtraction = " ";
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                oddNumbersExtraction += numbers[i];// oddNumbersExtraction = oddNumbersExtraction + numbers[i]
            }
        }
        return oddNumbersExtraction;
    }
    //9
    public static String extractAllEvenNumbers(int[] numbers) {
        String evenNumbersExtraction = " ";
        for (int i = 0; i< numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenNumbersExtraction += numbers[i];
            }
        }
        return evenNumbersExtraction;
    }
    //10
    public static boolean contains(String[] names, String element) { //will return boolean value
        for (String name : names) {
            if (name.equals(element)) {
                return true; //if the element is found it will return true
            }
        }
        return false; //element wasn't found so return false
    }
    //11
    public static int getIndexByElement(String[] names, String element) {
        for (int i = 0; i < names.length; i++) {
            if (names[1].equals(element)) {
                return i;
            }
        }
        return -1;
    }
    //12
    public static void printOddNumbersInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i + " ");
            }
        }

    }
    //13
    public static String printGivenStringTimesNumberGiven(String str, int n) {
        String repeated = "";

        for(int i = 0; i< n; i++){
            repeated += str;
        }
        return repeated;
    }
    //14
    public static String repeatFirstThreeLetters(String str, int n) {
        String firstThreeLetters = str.substring (0,3);
        String repeated = "";

        for (int i = 0; i < n; i++){
            repeated += firstThreeLetters;

        }
        return repeated;

    }
    //15
    public static int WordsInAStringCounter(String str) {
        String [] words = str.split("\\s+");
        return words.length;
    }









    public static void main(String[] args) {
        String[] names = {"Kierah", "Wini", "Blanca", "Naiya", "Abu"};
        int [] ints = {10, 20, 30, 41, 51};
        int [] numbers = {5, 10, 15, 20};


        //Question 1-5
        System.out.println(getLastIndex(names));

        System.out.println(getSecondToLastIndex(names));

        System.out.println(getFirstElement(names));

        System.out.println(getLastElement(names));

        System.out.println(getSecondToLastElement(names));

        //Questions 6-9
        System.out.println(getSum(ints));
        System.out.println(getAverage(ints));
        System.out.println(extractAllOddNumbers(ints));
        System.out.println(extractAllEvenNumbers(ints));

        // Questions 10
        System.out.println(contains(names,"coqui"));
        System.out.println(getIndexByElement(names,"luna"));
        printOddNumbersInRange(0,9);
        System.out.println(printGivenStringTimesNumberGiven("Devon",8));
        System.out.println(repeatFirstThreeLetters("Blanca",3));
        System.out.println(WordsInAStringCounter("How many words?"));
    }
}
