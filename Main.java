package com.dsa.randomquesgenerator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    private static ArrayList<String> ques = new ArrayList<>();

    public static void main(String[] args) {
	// write your code here
        loadFile("questions.txt");
        System.out.println("Length of list "+ques.size() );
        System.out.println("====================");
        System.out.println(generateRandom());
//        System.out.println(generateRandom());
//        System.out.println(generateRandom());
//        System.out.println(generateRandom());
    }

    public static void loadFile(String file){

        try {
            File myObj = new File(file);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                if(data.startsWith("-")){
                    ques.add(data);
                    //System.out.println(data);
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }

    public static String generateRandom(){

        Random rand = new Random();

        // Generate random integers in range 0 to 999
        int r = rand.nextInt(ques.size());

        return ques.get(r);
    }
}
