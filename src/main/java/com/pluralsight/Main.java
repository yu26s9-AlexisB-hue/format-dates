package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args){

        //Getting the initial date and time.
        LocalDateTime today = LocalDateTime.now();
        //System.out.println("Today is: " + today);

        //Specify the date and time formats
        DateTimeFormatter num = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter yearly = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter noMonth = DateTimeFormatter.ofPattern("EEE dd, yyyy");
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy HH:mm:ss 'GMT' ");
        DateTimeFormatter chal = DateTimeFormatter.ofPattern("hh:mm 'on' dd-MMM-yyyy");


        String SlashDate = today.format(num);
        String yFirst = today.format(yearly);
        String NM = today.format(noMonth);
        String formattedDate = today.format(fmt);
        String Challenge = today.format(chal);


        System.out.println(SlashDate);
        System.out.println(yFirst);
        System.out.println(NM);
        System.out.println(formattedDate);
        System.out.println(Challenge);
    }
}
