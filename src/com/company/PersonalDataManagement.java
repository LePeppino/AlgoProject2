package com.company;

import java.io.File;
import java.util.Scanner;

public class PersonalDataManagement {

    public static void main(String[] args) {

        var rbt = new PersonalData();
        Scanner input = new Scanner(System.in);

        System.out.println("Personaldata Management System 1.0 \n Specify absolute path to the data file:");

        String path = input.nextLine();
        File file = new File(path);


    }

}