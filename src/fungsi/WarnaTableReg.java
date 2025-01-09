package fungsi;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer; 

public class WarnaTableReg extends DefaultTableCellRenderer {

    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//        if (row % 2 == 1){
//            component.setBackground(new Color(255,244,244));
//        }else{
//            component.setBackground(new Color(255,255,255));
//        }
        
        if(table.getValueAt(row,24)=="1"){
            component.setBackground(new Color(193,255,251));
        } else if (table.getValueAt(row,24)=="2"){
//            component.setBackground(new Color(242,202,33));
            component.setBackground(new Color(255,217,102));
        } else if (table.getValueAt(row,24)=="3"){
//            component.setBackground(new Color(204,204,204));
            component.setBackground(new Color(234,153,153));
        } else {
            component.setBackground(new Color(255,255,255));
        }
        return component;
    }

}
