package com.el;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ParseFile {
    public static String extToDelimiter(String fName) {
        String delimType = "";
        String fileType = fName.substring(fName.indexOf(".") + 1);
        switch(fileType) {
            case "tab":
                delimType = "\\\\t";
                break;
            /*
            case "csv":
                delimType = ",";
                break;
            */
            default:
                System.err.println("Error: File type not valid.");
        }
        return delimType;
    }

    public static List<String> lineToList(String line, String delim) {
        String[] wordArray = line.split(delim);
        List<String> wordList = Arrays.asList(wordArray);
        System.out.println(wordList);
        return wordList;
    }

    public static void main(String[] args) throws Exception {
        try {
            String fileName = args[0];
            File inFile = new File(fileName);
            String delimiter = extToDelimiter(fileName);
            
            if(delimiter != "") {
                Scanner scan = new Scanner(inFile);
                while (scan.hasNextLine()) {
                    String thisLine = scan.nextLine();
                    lineToList(thisLine, delimiter);
                }  
                scan.close(); 
            }
        }
        catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Error: File name missing.");
            //ex.printStackTrace();
        }
        catch (FileNotFoundException ex) {
            System.err.println("Error: File not found."); 
            //ex.printStackTrace();    
        }
    }
}
