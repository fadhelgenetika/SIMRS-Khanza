/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fungsi;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author fadhel
 */
public class WarnaTableOperasi extends DefaultTableCellRenderer {
     @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);
//        if (row % 2 == 1){
//            component.setBackground(new Color(255,244,244));
//        }else{
//            component.setBackground(new Color(255,255,255));
//        }
        
        if(table.getValueAt(row,18)=="1"){
            component.setBackground(new Color(147,196,125));
            component.setForeground(new Color(50,50,50));
        } else {
            component.setBackground(new Color(255,255,255));
            component.setForeground(new Color(50,50,50));
        }
        return component;
    }
}
