package org.example;
import java.util.Arrays;

public class cvv {
    public static void main(String[] args) {
        String s1 = "34gh!aaa ";
        int sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a') {
                sum++;
            }
        }
        System.out.print(sum);


       int[] m = {34,23,7,8};
       Arrays.sort(m);
        for (int i = 0; i < m.length; i++) {
            System.out.print(m[i]);
        }
int[] a = {5,7,6,3,2};
        for(int i  = 0; i< a.length; i++){
            for(int i2=1; i2< a.length; i2++){
                if(a[i2]<a[i2-1]){
                    int imp = a[i2];
                    a[i2]= a[i2-1];
                    a[i2-1]=imp;
                }
            }
        }
        for (int i=0; i<a.length; i++){
System.out.println(a[i]);

        }
    }

}
