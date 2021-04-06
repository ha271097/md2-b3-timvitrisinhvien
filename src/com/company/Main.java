package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String [] student = {"hieuhentai","huybu","tunglogach","congcut"};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name student");
        String name = sc.nextLine();

        for(int i = 0 ; i < student.length ; i++){
            if(student[i].equals(name)){
                System.out.println("position student : " + (i + 1));
                break;
            }
        }
        System.out.println("not find studens");
    }
}
