
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
        JComponent component = new JLabel();
        if (value instanceof KniffelRow) {
            KniffelRow v = (KniffelRow) value;
            switch (column) {
                case 0:
                    component = new JLabel(v.getSpiel());
                    break;
                case 1:
                    component = (JCheckBox) v.getWahl();
                    break;
                case 2:
                    component = new JLabel(String.valueOf(v.getPoints()));
                    break;
            }
            component.setOpaque(true);
            if (row % 2 == 0) {
                component.setBackground(Color.LIGHT_GRAY);
            } else {
                component.setBackground(Color.white);
            }
        }
        return component;
    }

}
