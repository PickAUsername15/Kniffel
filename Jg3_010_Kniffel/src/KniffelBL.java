
import java.util.HashMap;
import java.util.Map;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author no
 */
public class KniffelBL {

    private int points = 0;
    private int[] numbers = new int[5];

    KniffelBL(int row, int[] numbers) {
        this.numbers = numbers;
        switch (row) {
            case 0:
                count(1);
                break;
            case 1:
                count(2);
                break;
            case 2:
                count(3);
                break;
            case 3:
                count(4);
                break;
            case 4:
                count(5);
                break;
            case 5:
                count(6);
                break;
            case 6:
                pasch(3);
                break;
            case 7:
                pasch(4);
                break;
            case 8:
                fullHouse();
                break;
            case 9:
                strasse(4);
                break;
            case 10:
                strasse(5);
                break;
            case 11:
                kniffle();
                break;
        }
    }

    private void count(int type) {
        for (int number : numbers) {
            if (number == type - 1) {
                points += type;
            }
        }
    }

    public void pasch(int type) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int key : numbers) {
            if (map.containsKey(key)) {
                int counter = map.get(key);
                counter++;
                map.put(key, counter);
            } else {
                map.put(key, 1);
            }
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) >= type) {
                points = (key + 1) * type;
            }
        }
    }

    public void fullHouse() {
        Map<Integer, Integer> map = new HashMap<>();

        for (int key : numbers) {
            if (map.containsKey(key)) {
                int counter = map.get(key);
                counter++;
                map.put(key, counter);
            } else {
                map.put(key, 1);
            }
        }
        if (map.size() == 2) {
            for (Integer key : map.keySet()) {
                if (map.get(key) == 2 || map.get(key) == 3) {
                    points = 25;
                }
            }
        }
    }

    public void strasse(int type) {

        int[] sortedNumbers = numbers;

        for (int i = 1; i < sortedNumbers.length; i++) {
            for (int j = 0; j < sortedNumbers.length - i; j++) {
                if (sortedNumbers[j] > sortedNumbers[j + 1]) {
                    int temp = sortedNumbers[j];
                    sortedNumbers[j] = sortedNumbers[j + 1];
                    sortedNumbers[j + 1] = temp;
                }
            }
        }
        int counter = 0;
        for (int i = 0; i < sortedNumbers.length - 1; i++) {

            if (sortedNumbers[i] + 1 == sortedNumbers[i + 1]) {
                counter++;
            }
        }

        if (counter == 4 && type == 5) {
            points = 40;
        } else if (counter == 3 && type == 4) {
            points = 30;
        }
    }

    public void kniffle() {
        Map<Integer, Integer> map = new HashMap<>();

        for (int key : numbers) {
            if (map.containsKey(key)) {
                int counter = map.get(key);
                counter++;
                map.put(key, counter);
            } else {
                map.put(key, 1);
            }
        }
        if (map.size() == 1) {
            points = 50;
        }
    }

    public int getPoints() {
        return points;
    }

}
