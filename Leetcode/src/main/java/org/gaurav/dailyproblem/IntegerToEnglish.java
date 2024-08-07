package org.gaurav.dailyproblem;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Date: 07 August 2024
 */
public class IntegerToEnglish {

    private Map<Integer, String> dictionary = Stream.of(new String[][]{
        {"1", "One"},
        {"2", "Two"},
        {"3", "Three"},
        {"4", "Four"},
        {"5", "Five"},
        {"6", "Six"},
        {"7", "Seven"},
        {"8", "Eight"},
        {"9", "Nine"},
        {"10", "Ten"},
        {"11", "Eleven"},
        {"12", "Twelve"},
        {"13", "Thirteen"},
        {"14", "Fourteen"},
        {"15", "Fifteen"},
        {"16", "Sixteen"},
        {"17", "Seventeen"},
        {"18", "Eighteen"},
        {"19", "Nineteen"},
        {"20", "Twenty"},
        {"30", "Thirty"},
        {"40", "Forty"},
        {"50", "Fifty"},
        {"60", "Sixty"},
        {"70", "Seventy"},
        {"80", "Eighty"},
        {"90", "Ninety"},
        {"100", "Hundred"},
        {"1000", "Thousand"},
        {"1000000", "Million"},
        {"1000000000", "Billion"}
    }).collect(Collectors.toMap(data -> Integer.valueOf(data[0]), data -> data[1]));

    public String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }
        if(num >= 100 && dictionary.containsKey(num)) {
            return "One " + dictionary.get(num);
        }
        return numberToWord(num, 1000);
    }

    private String numberToWord(int num, int placeValue) {
        if (num == 0) {
            return "";
        }
        if(num < 1000) {
            return convertToWords(num);
        }

        int n = num % 1000;
        String nInWord = convertToWords(n);
        String word = numberToWord(num / 1000, placeValue * 1000);
        word = word.equals("")? nInWord: word + " " + dictionary.get(placeValue) + " " + nInWord;
        return word.trim();
    }

    public String convertToWords(int num) {
        String word = "";
        int n = num / 100;
        num %= 100;
        if(n > 0) {
            word += this.dictionary.get(n) + " Hundred";
        }
        if(this.dictionary.containsKey(num)) {
            word += " " + this.dictionary.get(num);
        } else {
            n = num - (num % 10);
            if(n != 0) {
                word += " " + this.dictionary.get(n);
            }
            if(num % 10 != 0) {
                word += " " + this.dictionary.get(num % 10);
            }
        }

        return word.trim();
    }
}
