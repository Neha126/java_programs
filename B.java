//WAP to make a calculator in an Applet

import java.lang.*;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.LabelUI;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;
import javax.swing.text.LabelView;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class B extends Applet implements ActionListener {
    Button b1;
    Button b2;
    Button b3;
    Button b4;
    TextField t;
    TextField t2;
    TextField t3;
    Label l1;
    Label l2;
    Label l3;
    int x, y, sum, mul, div, diff;

    public void init() {

        l1 = new Label("enter first no.");
        add(l1);
        t = new TextField(10);
        add(t);
        l1 = new Label("enter second no.");
        add(l1);
        t2 = new TextField(10);
        add(t2);
        l3 = new Label("Result");
        add(l3);
        t3 = new TextField(10);
        add(t3);
        b1 = new Button("Add");
        b1.addActionListener(this);
        add(b1);
        b2 = new Button("Diff.");
        b2.addActionListener(this);
        add(b2);
        b3 = new Button("Mul");
        b3.addActionListener(this);
        add(b3);
        b4 = new Button("Div");
        b4.addActionListener(this);
        add(b4);
    }

    public void actionPerformed(ActionEvent e) {
        String s = t.getText();
        String s2 = t2.getText();
        x = Integer.parseInt(s);
        y = Integer.parseInt(s2);

        // sum
        if (e.getSource() == b1) {

            sum = x + y;
            t3.setText("" + sum);
        }
        // // Diff.
        if (e.getSource() == b2) {

            diff = x - y;
            t3.setText("" + diff);
        }
        // mul
        if (e.getSource() == b3) {

            mul = x * y;
            t3.setText("" + mul);
        }
        // div
        if (e.getSource() == b4) {
            div = x / y;
            t3.setText("" + div);
        }

    }
}

// <applet code="B.class" width="300" height="300">
// </applet>
