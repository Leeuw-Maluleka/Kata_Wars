package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneDir {
    public static  String phone(String strng, String num) {

        String pattern = "^[+](\\d{1}-\\d{3}-\\d{3}-\\d{4}).*$";

        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(strng);

        if (m.find( )) {
            System.out.println("Found value: " + m.group(0) );
            System.out.println("Found value: " + m.group(1) );

        } else {
            System.out.println("NO MATCH");
        }
        return "";
    }
}
