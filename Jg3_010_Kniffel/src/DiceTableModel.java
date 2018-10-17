
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author no
 */
public class DiceTableModel extends AbstractTableModel {

    public static ArrayList<Icon> pics = new ArrayList<>();
    private static int[] numbers = new int[5];
    private static boolean[] selected = new boolean[5];

    public void addPics() throws MalformedURLException {
        for (int i = 0; i < 6; i++) {
            URL url = this.getClass().getResource("pics/" + (i + 1) + "er.png");
            pics.add(new ImageIcon(url));
        }
    }

    void setStartNumbers() {
        for (int i = 0; i < 5; i++) {
            numbers[i] = i + 1;
            selected[i] = true;
        }
        fireTableDataChanged();
    }

    public void setRandomNumbers() {
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            if (selected[i]) {
                numbers[i] = r.nextInt(5) + 1;
            }
        }
        fireTableDataChanged();
    }

    public void resetSelection() {
        for (int i = 0; i < selected.length; i++) {
            selected[i] = true;
        }
    }

    public static void setSelected(int idx, boolean b) {
        selected[idx] = b;
    }

    public static boolean getSelected(int idx) {
        return selected[idx];
    }

    public static int[] getSelected() {
        return numbers;
    }

    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public int getColumnCount() {
        return numbers.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object obj = null;
        switch (columnIndex) {
            case 0:
                obj = pics.get(numbers[columnIndex]);
                break;
            case 1:
                obj = pics.get(numbers[columnIndex]);
                break;
            case 2:
                obj = pics.get(numbers[columnIndex]);
                break;
            case 3:
                obj = pics.get(numbers[columnIndex]);
                break;
            case 4:
                obj = pics.get(numbers[columnIndex]);
                break;
        }
        return obj;
    }

}
