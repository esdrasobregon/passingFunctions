/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author esdra
 */
public class Disenyo {

    /**
     * @param args the command line arguments
     */
    String title;
    communFunctions f;

    public Disenyo() {
        this.f = new communFunctions();
    }

    public static void main(String[] args) {
        // TODO code application logic here
        int color = 300;
        String tittle = "test";

        panel pnlTop = new panel(10, "north");
        button btnNorth = new button("mouse position", 0);
        btnNorth.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                double x = evt.getX();
                double y = evt.getY();
                JOptionPane.showMessageDialog(null, "x: " + x + " y: " + y);
            }
        });
        pnlTop.add(btnNorth);
        panel pnlLeft = new panel(100, "left");
        button btnLeft = new button("rigth click", 1);
        btnLeft.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == 3) { // if right click
                    btnLeft.setText("right click");
                    btnLeft.getModel().setPressed(false);
                    // button.setEnabled(true);
                } else {
                    btnLeft.setText("left click");
                    btnLeft.getModel().setPressed(true);
                    // button.setEnabled(false);
                }
            }
        });
        pnlLeft.add(btnLeft);
        panel pnlCenter = new panel(190, "center");
        button btnCenter = new button("mouse hover", 2);
        btnCenter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCenter.setBackground(Color.GREEN);
                //btnCenter.helloWorld();
                //https://www.youtube.com/watch?v=tj5sLSFjVj4
                Disenyo d = new Disenyo();
                d.usinInterface(() -> d.f.getTitle("tittle"));

            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCenter.setBackground(UIManager.getColor("control"));

            }
        });
        pnlCenter.add(btnCenter);
        panel pnlRigth = new panel(280, "rigth");
        panel pnlBotom = new panel(280, "botton");
        frame f = new frame(color, tittle, pnlTop, pnlLeft, pnlCenter, pnlRigth, pnlBotom);
        f.setVisible(true);

    }

    private void usinInterface(call callable) {
        callable.helloWorld();
    }

}
