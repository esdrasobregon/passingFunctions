/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicComboBoxRenderer;

/**
 *
 * @author esdra
 */
public class panel extends JPanel {
    
    Color color;
    JLabel lb;
    
    public panel(int color, String lbContent) {
        this.color = new Color(color);
        this.lb = new JLabel(lbContent);
        this.setBackground(new Color(color));
        this.add(this.lb);
    }
    
}
