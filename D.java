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
    public void init() {
        b1 = new Button("HAppy");
        b1.addActionListener(this);
        add(b1);
        b2 = new Button("Sad");
        b2.addActionListener(this);
        add(b2);
    }

    public void actionPerformed(ActionEvent e) {
   
        // sum
        if (e.getSource() == b1) {
          😅️😅️;
        }
        // // Diff.
        if (e.getSource() == b2) {
           😕️😕️;
        }

    }
}

// <applet code="B.class" width="300" height="300">
// </applet>


