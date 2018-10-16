
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
                aufeinanderfolgen(4);
                break;
            case 10:
                aufeinanderfolgen(5);
                break;
            case 11:
                kniffle();
                break;
        }
    }

    private void count(int number) {
        for (int n : numbers) {
            if (n == number - 1) {
                points += number;
            }
        }
    }

    public void pasch(int art) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int key : numbers) {
            if (map.containsKey(key)) {
                int c = map.get(key);
                c++;
                map.put(key, c);
            } else {
                map.put(key, 1);
            }
        }
        for (Integer key : map.keySet()) {
            if (map.get(key) >= art) {
                points = (key + 1) * art;
            }
        }
    }

    public void fullHouse() {
        Map<Integer, Integer> map = new HashMap<>();

        for (int key : numbers) {
            if (map.containsKey(key)) {
                int c = map.get(key);
                c++;
                map.put(key, c);
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

    public void aufeinanderfolgen(int art) {

        int[] sort = numbers;

        for (int i = 1; i < sort.length; i++) {
            for (int j = 0; j < sort.length - i; j++) {
                if (sort[j] > sort[j + 1]) {
                    int temp = sort[j];
                    sort[j] = sort[j + 1];
                    sort[j + 1] = temp;
                }
            }
        }
        int c = 0;
        for (int i = 0; i < sort.length - 1; i++) {

            if (sort[i] + 1 == sort[i + 1]) {
                c++;
            }
        }

        if (c == 4 && art == 5) {
            points = 40;
        } else if (c == 3 && art == 4) {
            points = 30;
        }
    }

    public void kniffle() {
        Map<Integer, Integer> map = new HashMap<>();

        for (int key : numbers) {
            if (map.containsKey(key)) {
                int c = map.get(key);
                c++;
                map.put(key, c);
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
