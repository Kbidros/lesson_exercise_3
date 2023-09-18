package com.kristian.demo;


import com.kristian.demo.models.Student;

public class Main {
        public static void main(String[] args) {

                Student Kristian = new Student ("Kristian", 28);
                Student Nadin    = new Student ("Nadin", 25);

                System.out.println(Kristian.name);
                System.out.println(Kristian.age);
                System.out.println(Kristian.doubleMyAge(Kristian.age));
                System.out.println(Nadin.name);
                System.out.println(Nadin.age);
                System.out.println(Nadin.doubleMyAge(Nadin.age));


                String[] names = {"Mike","Lebron","Jordan","Steph","Kobe"};

                int startingAge = 18;

                for (int i = 0; i < 5; i++) {

                        System.out.println(names[i] + " är " + startingAge + " år gammal ");

                        startingAge ++;

                }





        }





    }







