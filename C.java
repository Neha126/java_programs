//WAP to make a calculator in an Applet

import java.lang.*;
import javax.swing.plaf.ButtonUI;
import javax.swing.plaf.LabelUI;
import javax.swing.plaf.metal.MetalBorders.TextFieldBorder;
import javax.swing.text.LabelView;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class C extends Applet implements ActionListener {
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

    public void paint(Graphics g) {

        g.setColor(Color.yellow);
        g.fillOval(20, 20, 150, 150); // For face
        g.setColor(Color.black);
        g.fillOval(50, 60, 15, 25); // Left Eye
        g.fillOval(120, 60, 15, 25); // Right Eye
        int x[] = { 95, 85, 106, 95 };
        int y[] = { 85, 104, 104, 85 };
        g.drawPolygon(x, y, 4); // Nose
        g.drawArc(55, 95, 78, 50, 0, -180); // Smile
        g.drawLine(50, 126, 60, 116); // Smile arc1
        g.drawLine(128, 115, 139, 126);
    }

    public void actionPerformed(ActionEvent e) {

        // sum
        if (e.getSource() == b1) {
            repaint();
        }
        // // Diff.
        if (e.getSource() == b2) {

        }

    }
}

// <applet code="C.class" width="300" height="300">
// </applet>
