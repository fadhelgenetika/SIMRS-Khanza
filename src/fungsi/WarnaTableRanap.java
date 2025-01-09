package fungsi;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

public class WarnaTableRanap extends DefaultTableCellRenderer{
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        if(table.getValueAt(row,22)=="1"){
            component.setBackground(new Color(193,255,251));
        } else {
            component.setBackground(new Color(255,255,255));
        }
        return component;
    }
}
