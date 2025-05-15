package dev.desktop;

import javax.swing.*;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tp {
    public static void main(String args[]) {
        App a = new App();
    }
}

class App {
    private String currentFile;
    private JFrame w;
    private JMenuBar m;
    private JMenu f;
    private JMenuItem save;
    private JTextArea content;

    Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    int width = (int) (screenSize.width * 0.8);
    int height = (int) (screenSize.height * 0.8);

    App() {
        newWindow();
    }

    App(String filepath) {
        currentFile = filepath;
        newWindow();
    }

    private void newWindow() {
        w = new JFrame("Textpro");
        m = new JMenuBar();
        f = new JMenu("File");
        save = new JMenuItem("Save");
        f.add(save);
        m.add(f);
        w.setJMenuBar(m);
        content = new JTextArea();
        JScrollPane scrollPane = new JScrollPane(content);
        content.setBorder(null);
        w.add(scrollPane);
        w.setSize(width, height);
        w.setLocationRelativeTo(null);
        w.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
            }
        });
        w.setVisible(true);
    }
}
