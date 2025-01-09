package widget;

import java.awt.Color;
import javax.swing.JTable;

/**
 *
 * @author usu
 */
public class Table extends JTable {

    /*
     * Serial version UID
     */
    private static final long serialVersionUID = 1L;

    public Table() {
        super();
//        setBackground(new Color(255,235,255)); //asli
        //setGridColor(new Color(245,170,245));
        //setForeground(new Color(90,90,90));
        setBackground(new Color(255,255,255));
        setGridColor(new Color(226,231,221)); //ganti 
//        setForeground(new Color(50,50,50)); //asli
        setForeground(new Color(40,35,35)); //ganti
        setFont(new java.awt.Font("Inter", 0, 11));
        setRowHeight(30); 
        setSelectionBackground(new Color(255,255,255));
        setSelectionForeground(new Color(255,0,0));
        getTableHeader().setForeground(new Color(50,50,50));
        getTableHeader().setBackground(new Color(255,250,250));
//        getTableHeader().setBorder(javax.swing.BorderFactory.createLineBorder(new Color(255,250,250))); //asli
        getTableHeader().setBorder(javax.swing.BorderFactory.createLineBorder(new Color(226,231,221)));
        getTableHeader().setFont(new java.awt.Font("Inter", 1, 12));
    }
}
