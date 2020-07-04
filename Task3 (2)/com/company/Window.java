package com.company;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Window extends JFrame {


    private JTextArea inputTextArea;
    private JTextArea outputTextArea;
    private JButton buttonRunStandartPerformance;
    private JButton buttonRunMyPerfomance;
    private JPanel mainPanel;
    private JButton loadFromFile;

    public Window() {
        this.setTitle("FrameMain");
        this.setContentPane(mainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        buttonRunMyPerfomance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] inputStrings = inputTextArea.getText().split(" ");
                outputTextArea.setText(Main.myPerformance(inputStrings).toString());
            }
        });
        buttonRunStandartPerformance.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] inputStrings = inputTextArea.getText().split(" ");
                outputTextArea.setText(Main.standardPerformance(inputStrings).toString());
            }
        });
    }
}
