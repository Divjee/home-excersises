package io.codelex.typesandvariables.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class Exercise5 {
    public static void main(String[] args) {
        String leftAlignFormat = "| %d | %36s | %15s |%n";


        Map<String, String> classSchedule = new LinkedHashMap<>() {

            {
                put("English  III", "Ms. Lapan");
                put("Precalculus", "Mrs. Gideon");
                put("Music Theory", "Mr. Davis");
                put("Biotechnology", "Ms. Palmer");
                put("Principles of Technology I", "Ms. Garcia");
                put("Latin II", "Mrs. Barnett");
                put("AP US History", "Ms. Johannessen");
                put("Business Computer Infomation Systems", "Mr. James");
            }
        };


        System.out.format("+------------------------------------------------------------+%n");
        int columnNr = 1;
        for (String key : classSchedule.keySet()) {
            System.out.format(leftAlignFormat, columnNr, key, classSchedule.get(key));
            columnNr++;
        }
        System.out.format("+------------------------------------------------------------+%n");
    }
}
