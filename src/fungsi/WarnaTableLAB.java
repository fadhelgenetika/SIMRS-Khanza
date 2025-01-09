/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fungsi;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Owner
 */
public class WarnaTableLAB extends DefaultTableCellRenderer {
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
        
        if (row % 2 == 1){
            if(table.getValueAt(row, 16).toString().equals("Tidak Lengkap") && !table.getValueAt(row,0).toString().isEmpty()){
                component.setBackground(new Color(192,192,192));
            }else {
                if(!table.getValueAt(row,7).toString().isEmpty() && !table.getValueAt(row,0).toString().isEmpty()){
                    //hasil
                    component.setBackground(new Color(147,196,125));
                } else if(!table.getValueAt(row,5).toString().isEmpty() && !table.getValueAt(row,0).toString().isEmpty()){
                    //sampel
                    component.setBackground(new Color(255,217,102));
                } else if (!table.getValueAt(row,3).toString().isEmpty() && !table.getValueAt(row,0).toString().isEmpty()){
                    //baru
                    component.setBackground(new Color(234,153,153));
                } else {
                    component.setBackground(new Color(255,244,244));
                }
            }
        }else{
            if(table.getValueAt(row, 16).toString().equals("Tidak Lengkap") && !table.getValueAt(row,0).toString().isEmpty()){
                component.setBackground(new Color(192,192,192));
            } else {
                if(!table.getValueAt(row,7).toString().isEmpty() && !table.getValueAt(row,0).toString().isEmpty()){
                    //hasil
                    component.setBackground(new Color(147,196,125));
                } else if(!table.getValueAt(row,5).toString().isEmpty() && !table.getValueAt(row,0).toString().isEmpty()){
                    //sampel
                    component.setBackground(new Color(255,217,102));
                } else if (!table.getValueAt(row,3).toString().isEmpty() && !table.getValueAt(row,0).toString().isEmpty()){
                    //baru
                    component.setBackground(new Color(234,153,153));
                } else {
                    component.setBackground(new Color(255,255,255));
                }
            }
        }
        
        return component;
    }

}
