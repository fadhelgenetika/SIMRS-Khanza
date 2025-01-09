package widget;

import java.awt.Color;
import java.awt.Insets;

/**
 *
 * @author usu
 */
public class Button extends usu.widget.ButtonGlass {

    /*
     * Serial version UID
     */
    private static final long serialVersionUID = 1L;

    public Button() {
        super();
        setFont(new java.awt.Font("Inter", 1, 11));
        setForeground(new Color(50,50,50));
        //ini klik button jadi ada effectnya
        setGlassColor(new Color(228,228,228));
        setMargin(new Insets(2, 7, 2, 7));
        setIconTextGap(6);
        setRoundRect(true);
    }

//    public void setBorder(int i, int i0) {
//        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
//    }
}
