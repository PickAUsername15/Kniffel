
import java.awt.Color;
import java.awt.Component;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.TableCellRenderer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author no
 */
public class DiceTableRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JLabel l = new JLabel();
        l.setOpaque(true);
        
        if (isSelected) {
            l.setBackground(Color.red);
            DiceTableModel.setSelected(column, false);
        }else{
            
            DiceTableModel.setSelected(column, true);
        }
        l.setIcon((ImageIcon) value);
        return l;
    }

}
