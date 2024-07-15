package com.oop.mahadi.d1.Utility;

public class NumberValidator {

    public static boolean containsOnlyNumbers(String input) {

        for (char c : input.toCharArray()) {
            if (!Character.isDigit(c)) {
                AllertShow.showAlert("","opps Your id must Contain Only Number\n ");
                return false;


            }
        }
        return true;
    }

}
