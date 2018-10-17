
import com.sun.prism.j2d.J2DPipeline;
import java.util.ArrayList;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
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
public class KniffelTableModel extends AbstractTableModel {

    private String[] cols = {"Spiel", "Wahl", "Punkte"};

    private ArrayList<KniffelRow> rows = new ArrayList<>();

    public void add(KniffelRow kr){
        rows.add(kr);
        fireTableDataChanged();
    }
    
    @Override
    public int getRowCount() {
        return rows.size();
    }

    @Override
    public int getColumnCount() {
        return cols.length;
    }

    public boolean isAllSelected(){
        int c = 0;
        for (KniffelRow row : rows) {
            if(row.getWahl().isSelected()){
                c++;
            }
        }
        if(c == 12){
            return true;
        }
        return false;
    }
    @Override
    public String getColumnName(int column) {
        return cols[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return rows.get(rowIndex);
    }

    @Override
    public void setValueAt(Object points, int rowIndex, int columnIndex) {
        rows.get(rowIndex).setPoints(Integer.parseInt(points+""));
        fireTableDataChanged();
    }
    
    

}
