package com.oop.mahadi.d1.Utility;

public class NameValidator {

    // Regular expression for a valid name
    private static final String NAME_PATTERN = "^[A-Za-z]+([ '-][A-Za-z]+)*$";

    public static boolean isValidName(String name) {
        // Check if name is null or empty
        if (name == null || name.trim().isEmpty()) {
            AllertShow.showAlert("", """
                   You entered ---->>>   Invalid name
                   
                   here is some     valid            invalid name example\s
                   
                                    "John",----------->          valid
                                    "O'Connor",    ----------->    valid
                                    "Anne-Marie", ----------->     valid
                                    " Mary ",    ----------->      valid, will be trimmed
                                    "J",         ----------->      invalid, too short
                                    "John123",     ----------->    invalid, contains digits
                                    "John@Smith",  ----------->    invalid, contains special characters not allowed
                                    "  ",         ----------->     invalid, empty after trimming
                                    null        ----------->       invalid, null""");

            return false;
        }

        // Trim the name to remove leading and trailing spaces
        name = name.trim();

        // Check the length of the name
        if (name.length() < 2 || name.length() > 50) {
            AllertShow.showAlert("", """
                   You entered ---->>>   Invalid name
                   
                   here is some     valid            invalid name example\s
                   
                                    "John",----------->          valid
                                    "O'Connor",    ----------->    valid
                                    "Anne-Marie", ----------->     valid
                                    " Mary ",    ----------->      valid, will be trimmed
                                    "J",         ----------->      invalid, too short
                                    "John123",     ----------->    invalid, contains digits
                                    "John@Smith",  ----------->    invalid, contains special characters not allowed
                                    "  ",         ----------->     invalid, empty after trimming
                                    null        ----------->       invalid, null""");

            return false;
        }

        // Check if the name matches the pattern
        if (!name.matches(NAME_PATTERN)) {
            AllertShow.showAlert("", """
                   You entered ---->>>   Invalid name
                   
                   here is some     valid            invalid name example\s
                   
                                    "John",----------->          valid
                                    "O'Connor",    ----------->    valid
                                    "Anne-Marie", ----------->     valid
                                    " Mary ",    ----------->      valid, will be trimmed
                                    "J",         ----------->      invalid, too short
                                    "John123",     ----------->    invalid, contains digits
                                    "John@Smith",  ----------->    invalid, contains special characters not allowed
                                    "  ",         ----------->     invalid, empty after trimming
                                    null        ----------->       invalid, null""");

            return false;
        }

        return true;
    }

//    public static void main(String[] args) {
//        // Test cases
//        String[] testNames = {
//                "John",          // valid
//                "O'Connor",      // valid
//                "Anne-Marie",    // valid
//                " Mary ",        // valid, will be trimmed
//                "J",             // invalid, too short
//                "John123",       // invalid, contains digits
//                "John@Smith",    // invalid, contains special characters not allowed
//                "  ",            // invalid, empty after trimming
//                null             // invalid, null
//        };
//
//        for (String name : testNames) {
//            System.out.println("Is \"" + name + "\" a valid name? " + isValidName(name));
//        }
//    }
}