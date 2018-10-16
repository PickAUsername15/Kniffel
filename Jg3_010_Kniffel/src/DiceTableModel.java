
import java.net.MalformedURLException;
import java.util.ArrayList;
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

    private ArrayList<Icon> pics = new ArrayList<>();
    private ArrayList<Integer> numbers = new ArrayList<>();

    public void addPics() throws MalformedURLException {
        for (int i = 0; i < 6; i++) {
            String url = this.getClass().getResource("pics/" + (i + 1) + "er.png").getFile().substring(1);
            pics.add(new ImageIcon(url));
        }
    }

    public void initNumbers() {
        Random r = new Random();
        for (int i = 0; i < 5; i++) {
            numbers.add(r.nextInt(5) + 1);
        }

    }

    @Override
    public int getRowCount() {
        return 1;
    }

    @Override
    public int getColumnCount() {
        return numbers.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object b = null;
        switch (columnIndex) {
            case 0:
                b = pics.get(numbers.get(columnIndex));
                break;
            case 1:
                b = pics.get(numbers.get(columnIndex));
                break;
            case 2:
                b = pics.get(numbers.get(columnIndex));
                break;
            case 3:
                b = pics.get(numbers.get(columnIndex));
                break;
            case 4:
                b = pics.get(numbers.get(columnIndex));
                break;
        }
        return b;
    }

}
