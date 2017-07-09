package effectively_final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Evegeny on 09/07/2017.
 */
public class MyFrame extends JFrame {
    public MyFrame() throws HeadlessException {
        final int[] x = new int[1];
        JButton button = new JButton("click me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(x[0]);
                x[0]++;
            }
        });
    }
}
