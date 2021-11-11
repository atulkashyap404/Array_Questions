package com.JavaQuestion;

public class Main {

    public static void main(String[] args) {
	int[][] arr = {{12, 23,24},{34, 45,43}};
    for(int i = 0;i< arr.length;i++)
    {
        for(int j = 0;j<arr[i].length;j++){
            System.out.println(arr[i][j]);
        }
        System.out.println();
    }
    }
}
