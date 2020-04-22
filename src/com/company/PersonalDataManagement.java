package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PersonalDataManagement {

    public static void main(String[] args) throws FileNotFoundException {
        var rbt = new PersonalData();
        String surname;
        String name;
        int age;
        String gender;
        Scanner input = new Scanner(System.in);
        Scanner reader = null;

        System.out.println("Personaldata Management System 1.0 \n Specify absolute path to the data file:");

        String path = input.nextLine();

        try {
            reader = new Scanner(new File(path)).useDelimiter(",");
        } catch (FileNotFoundException e) {
            System.out.println("Error: file not found");
            e.printStackTrace();
        }

        while(reader.hasNext()){
            int i = 0;
            surname = reader.next();
            name= reader.next();
            age = reader.nextInt();
            gender = reader.next();
            rbt.insert(i, new Person(surname, name, age, gender));
        }
        reader.close();


    }


}