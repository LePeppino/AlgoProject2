package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PersonalDataManagement {

    public static void main(String[] args) {
        var rbt = new PersonalData();
        int counter = 0;
        String surname;
        String name;
        int age;
        String gender;
        var input = new Scanner(System.in);
        Scanner reader = null;

        System.out.println("Personal Data Management System 1.0 \n Specify absolute path to the data file:");

        String path = input.nextLine();
        input.close();

        try {
            reader = new Scanner(new File(path)).useDelimiter("\\s*,\\s*");
        } catch (FileNotFoundException e) {
            System.out.println("Error: file not found");
            e.printStackTrace();
        }

        assert reader != null;

        while(reader.hasNext()){
            surname = reader.next();
            name= reader.next();
            age = reader.nextInt();
            reader.skip(", ");
            gender = reader.nextLine();
            rbt.insert(counter, new Person(surname, name, age, gender));
            counter++;
        }
        reader.close();
        System.out.println(rbt.CheckRB());
        System.out.println(rbt.height());

    }


}