package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Window().setVisible(true);
            }
        });
    }
    public static ArrayList myPerformance(String[] arr) {
        return MyList.arrayToList(arr).buildFinalStack();
    }

    public static Stack standardPerformance(String[] arr) {
        Stack stack = new Stack();
        for (int i = 0 ; i < arr.length; i++) {
            stack.add(arr[i]);
            stack.add(arr[i]);
        }
        return stack;
    }

}

