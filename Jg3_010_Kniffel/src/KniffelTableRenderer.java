
import java.awt.Color;
import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
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
public class KniffelTableRenderer implements TableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        JComponent l = new JLabel();
        if (value instanceof KniffelRow) {
            KniffelRow v = (KniffelRow) value;
            switch (column) {
                case 0:

                    l = new JLabel(v.getSpiel());
                    break;
                case 1:
                    l = (JCheckBox) v.getWahl();
                    break;
                case 2:
                    l = new JLabel(String.valueOf(v.getPoints()));
                    break;
            }
            l.setOpaque(true);
            l.setBackground(table.getBackground());
        }
        return l;
    }

}
