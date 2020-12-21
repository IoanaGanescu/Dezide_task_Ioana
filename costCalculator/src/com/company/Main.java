package com.company;

import dataAccess.*;

public class Main {

    public static float calculator(int time, int timeFactor, float money){
        return time*timeFactor + money;
    }

    public static void main(String[] args) {
        // write your code here

        System.out.println(calculator(2,3,6));


        //main input:
        //time - minutes
        //money - int
        //modelId - string

        //calculator elements:
        //time - hours
        //timeFactor - global/local_per_id per hour
        //money - int

        //calculator parameters:
        //time - minutes
        //money


    }

}
