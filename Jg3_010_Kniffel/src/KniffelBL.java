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
        }
    }
    private void count(int number) {
        for (int n : numbers) {
            if (n == number-1) {
                points+=number;
            }
        }
    }

    public int getPoints() {
        return points;
    }
    
}
