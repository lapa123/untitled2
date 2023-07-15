package org.example;

public class Main {
    public static void main(String[] args) {
        int[][] que = {
                {4, 5, 6, },
                {8, 7, 34},
        };
        int sum1  =0;
        int count = 0;

        for (int i = 0; i < que.length; i++) {
            int[] que2 = que[i];
            for (int j = 0; j < que2.length; j++) {
                sum1 += que[i][j];


            }
              count += que2.length;
        }
double middle  =(double) sum1/count;
            System.out.println(middle);

        }
    }
       /* int[] array = {56, 58, 37, 39};
        for (int index = 0; index < array.length; index++) {
            for (int index2 = 1; index2 < array.length; index2++) {
                if (array[index2] < array[index2 - 1]) {
                    int tmp = array[index2];
                    array[index2] = array[index2 - 1];
                    array[index2 - 1] = tmp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
       }*/



