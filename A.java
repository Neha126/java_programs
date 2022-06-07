
import java.lang.*;
import java.util.Scanner;

import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.LabelUI;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;
import javax.swing.text.LabelView;

import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class A extends Applet implements ActionListener {
    Button b;
    TextField t;
    TextField t2;
    Label l;

    public void init() {

        l = new Label("enter the no.");
        add(l);
        t = new TextField(10);
        add(t);

        t2 = new TextField(10);
        add(t2);
        b = new Button("fact");
        b.addActionListener(this);
        add(b);
    }

    // public void actionPerformed(ActionEvent e) {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // // setBackground(Color.red);

    // int i, fact = 1;
    // for (i = 1; i <= n; i++) {
    // fact = fact * i;
    // }

    // t2.setText("" + fact);
    // }
    public void actionPerformed(ActionEvent e) {
        int fact = fact(Integer.parseInt(t.getText()));
        t2.setText("" + fact);

    }

    int fact(int f) {
        if (f != 0)
            return f * fact(f - 1);
        else
            return 1;

    }

}

// <applet code="A.class" width="300" height="300">
// </applet>
