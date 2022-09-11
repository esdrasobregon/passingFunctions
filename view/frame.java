/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.LayoutManager;
import javax.swing.Icon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author esdra
 */
public class frame extends JFrame {

    Color color;
    Icon icon;
    String tittle;
    JPanel pnlTop, pnlLeft, pnlCenter, pnlRigth, pnlBotom;

    public frame(int color, String tittle, JPanel pnlTop, JPanel pnlLeft, JPanel pnlCenter, JPanel pnlRigth, JPanel pnlBotom) {

        this.tittle = tittle;
        this.color = new Color(color);
        this.pnlTop = pnlTop;
        this.pnlLeft = pnlLeft;
        this.pnlCenter = pnlCenter;
        this.pnlRigth = pnlRigth;
        this.pnlBotom = pnlBotom;
        this.setTitle(this.tittle);
        BorderLayout layout = new BorderLayout();

        this.setLayout(layout);
        this.add(this.pnlTop, BorderLayout.NORTH);
        this.add(this.pnlLeft, BorderLayout.WEST);
        this.add(this.pnlCenter, BorderLayout.CENTER);
        this.add(this.pnlRigth, BorderLayout.EAST);
        this.add(this.pnlBotom, BorderLayout.SOUTH);
        this.setLocationRelativeTo(null);
        //this.setResizable(false);
        this.setSize(375, 250);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public JPanel getPnlTop() {
        return pnlTop;
    }

    public void setPnlTop(JPanel pnlTop) {
        this.pnlTop = pnlTop;
    }

    public JPanel getPnlLeft() {
        return pnlLeft;
    }

    public void setPnlLeft(JPanel pnlLeft) {
        this.pnlLeft = pnlLeft;
    }

    public JPanel getPnlCenter() {
        return pnlCenter;
    }

    public void setPnlCenter(JPanel pnlCenter) {
        this.pnlCenter = pnlCenter;
    }

    public JPanel getPnlRigth() {
        return pnlRigth;
    }

    public void setPnlRigth(JPanel pnlRigth) {
        this.pnlRigth = pnlRigth;
    }

    public JPanel getPnlBotom() {
        return pnlBotom;
    }

    public void setPnlBotom(JPanel pnlBotom) {
        this.pnlBotom = pnlBotom;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Icon getIcon() {
        return icon;
    }

    public void setIcon(Icon icon) {
        this.icon = icon;
    }

}
