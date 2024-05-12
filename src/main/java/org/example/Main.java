package org.example;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void _readFile(List<Integer> nums, String path_name) {
        try {
            File file = new File(path_name);
            Scanner scan = new Scanner(file);

            while (scan.hasNextInt()) {
                int num = scan.nextInt();
                nums.add(num);
            }

            scan.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int _min(List<Integer> nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    public static int _max(List<Integer> nums) {
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static long _sum(List<Integer> nums) {
        long sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

    public static long _mult(List<Integer> nums) {
        long mult = 1;
        for (long num : nums) {
            mult *= num;
        }
        return mult;
    }
}