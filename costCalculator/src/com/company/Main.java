package com.company;

public class Main {

    public static float calculator(int time, int timeFactor, float money){
        return time*timeFactor + money;
    }

    public static void main(String[] args) {
        // write your code here

        System.out.println(calculator(2,3,6));
    }

}
