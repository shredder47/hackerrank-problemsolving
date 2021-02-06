package com.shredder.array;

import java.util.HashMap;
import java.util.Map;

public class SalesByMatch {

    public static void main(String[] args) {

        int[] arr = new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20};
        stockMerchant(arr.length, arr);
    }


    public static int stockMerchant(int n, int[] ar) {

        Map<Integer, Integer> colorCounter = new HashMap<>();

        for (int color : ar) {
            colorCounter.put(color, colorCounter.getOrDefault(color, 0) + 1);
        }

        int pairs = 0;
        for (Integer color : colorCounter.keySet()) {
            pairs = pairs + (colorCounter.get(color) / 2);
        }

        return pairs;
    }
}
