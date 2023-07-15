import com.sun.tools.javac.util.StringUtils;
import org.apache.commons.math3.util.FastMath;

import java.util.Arrays;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        String[] src = line.toLowerCase().split(" ");
        for (int i = 0; i < src.length; i++) {
            String name = src[i];
            char[] n = name.toCharArray();
            Arrays.sort(n);
            for (int i2 = 0; i2 < n.length; i2++) {
                System.out.println(n[i2]);

                // Arrays.sort(src);
                // for (int i = 0; i < src.length; i++) {
                // System.out.print(src[i]);

                //Arrays.sort(src);


                // System.out.println(src.length);
                // for(int i=0; i<src.length;i++){
                //  System.out.print(src[i]);

                // System.out.println();
       /*String s1 = "34gh!aaa ";
        int sum = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == 'a') {
                sum=sum+1;
            }
        }
        System.out.print(sum);
*/
            }
        }

    }
}