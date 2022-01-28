package com.codegym;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
        System.out.println(validPhoneNumber("(84)-(0978489648)"));
        System.out.println(validPhoneNumber("(a8)-(22222222)"));
    }
    public static boolean validPhoneNumber(String className){
        String PHONENUMBER_REGEX = "\\(\\d{2}\\)-\\([0]\\d{9}\\)";
        Pattern pattern = Pattern.compile(PHONENUMBER_REGEX);
        Matcher matcher = pattern.matcher(className);
        return matcher.matches();
    }
}
