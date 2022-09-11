/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import javax.swing.JButton;

/**
 *
 * @author esdra
 */
public class button extends JButton {

    String text;
    int id;

    public button(String text, int id) {
        this.text = text;
        this.id = id;
        this.setText(text);

    }

    public button() {
    }

}
