package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int change = money - price;
        int[] coins = {10, 5, 2, 1};
        int[] result = new int[100];
        int size = 0;
        int coinIndex = 0;
        while (change > 0) {
            if (change - coins[coinIndex] >= 0) {
                result[size] = coins[coinIndex];
                size++;
                change -= coins[coinIndex];
                } else {
                    coinIndex++;
                }
        }
        return Arrays.copyOf(result, size);
    }
}
