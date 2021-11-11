package com.JavaQuestion;

public class Question_2 {
    public static void main(String[] args) {
        int[][][] arr = {{{12,34,23},{45,85,89}},{{87,54,36},{95,35,46}}};
        for (int i = 0;i< arr.length;i++){
            for (int j = 0;j < arr[i].length;j++){
                for (int k = 0;k<arr[i][j].length;k++){
                    System.out.println(arr[i][j][k]);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
