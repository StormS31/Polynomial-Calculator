package Assig1.Controller;

import Assig1.GUI.GUI;
import Assig1.Model.Model;

import javax.swing.*;
import javax.swing.text.BadLocationException;
import java.awt.*;
import java.awt.event.*;

public class Controller {
    private Model model;
    private GUI gui;
    private JTextField txt;

    public Controller(Model model, GUI gui) {
        this.model = model;
        this.gui = gui;

        gui.addOneListener(new OneListener());
        gui.addTwoListener(new TwoListener());
        gui.addThreeListener(new ThreeListener());
        gui.addFourListener(new FourListener());
        gui.addFiveListener(new FiveListener());
        gui.addSixListener(new SixListener());
        gui.addSevenListener(new SevenListener());
        gui.addEigthListener(new EigthListener());
        gui.addNineListener(new NineListener());
        gui.addZeroListener(new ZeroListener());
        gui.addFocusareListener(new AddFocusListener());
        gui.addFocusareTxt2Listener(new AddFocusTxt2Listener());
        gui.addCListener(new AddCListener());
        gui.addACListener(new AddACListener());
        gui.addResultListener(new AddResultListener());
        gui.addPlusListener(new AddPlusListener());
        gui.addMinusListener(new AddMinusListener());
        gui.addPointListener(new AddPointListener());
        gui.addPowListener(new AddPowListener());
        gui.addXListener(new AddXListener());
        gui.addDerivareListener(new AddDeriveazaListener());
        gui.addIntegrareListener(new AddIntegreazaListener());
        gui.addMulListener(new AddMultiplicaListener());
    }

    public JTextField getFocusedTextField() {
        if (gui.getFocusA())
            return gui.getTxtPolA();
        if (gui.getFocusB())
            return gui.getTxtPolB();
        return null;
    }
    public int numberAfterX(JTextField txt)
    {
        String text = txt.getText();
        int length = text.length();
        if(length == 0) return 1;
        if(text.charAt(length-1) == 'X') {
            return 0;
        }
        return 1;
    }
    class OneListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JTextField txt = getFocusedTextField();
            if(numberAfterX(txt) == 1)
                txt.setText(txt.getText() + "1");
        }
    }
    class TwoListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JTextField txt = getFocusedTextField();
            if(numberAfterX(txt) == 1)
                txt.setText(txt.getText() + "2");
        }
    }
    class ThreeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JTextField txt = getFocusedTextField();
            if(numberAfterX(txt) == 1)
                txt.setText(txt.getText() + "3");
        }
    }
    class FourListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JTextField txt = getFocusedTextField();
            if(numberAfterX(txt) == 1)
                txt.setText(txt.getText() + "4");
        }
    }
    class FiveListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JTextField txt = getFocusedTextField();
            if(numberAfterX(txt) == 1)
                 txt.setText(txt.getText() + "5");
        }
    }
    class SixListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JTextField txt = getFocusedTextField();
            if(numberAfterX(txt) == 1)
                txt.setText(txt.getText() + "6");
        }
    }
    class SevenListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JTextField txt = getFocusedTextField();
            if(numberAfterX(txt) == 1)
                txt.setText(txt.getText() + "7");
        }
    }
    class EigthListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JTextField txt = getFocusedTextField();
            if(numberAfterX(txt) == 1)
                txt.setText(txt.getText() + "8");
        }
    }
    class NineListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JTextField txt = getFocusedTextField();
            if(numberAfterX(txt) == 1)
                txt.setText(txt.getText() + "9");
        }
    }
    class ZeroListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JTextField txt = getFocusedTextField();
            if(numberAfterX(txt) == 1)
                txt.setText(txt.getText() + "0");
        }
    }
    class AddCListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JTextField txt = getFocusedTextField();
            txt.setText("");
        }
    }
    class AddACListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JTextField txt = getFocusedTextField();
            if (txt.getText().length() > 0) {
                try {
                    txt.setText(txt.getText(0, txt.getText().length() - 1));
                } catch (BadLocationException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }
    class AddPlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            JTextField txtTest = getFocusedTextField();
            if(txtTest == gui.getTxtPolA() || txtTest == gui.getTxtPolB()) {
                String text = txtTest.getText();
                int length = text.length() - 1;
                if (length >= 0) {
                    if (text.charAt(length) != '+' && text.charAt(length) != '-' && text.charAt(length) != '.'
                            && text.charAt(length) != '^')
                        txtTest.setText(txtTest.getText() + "+");
                    else {
                        if (length > 0) {
                            StringBuilder back = new StringBuilder(txtTest.getText());
                            back.deleteCharAt(length);
                            back.append("+");
                            txtTest.setText(back.toString());
                        }
                    }
                }
            }
            else
            {
                JTextField tr = gui.getTxtRezultat();
                tr.setText("");
                tr.setText(model.addPolinoame(gui.getTxtPolA().getText(), gui.getTxtPolB().getText()));
            }
        }
    }
    class AddMinusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JTextField txtTest = getFocusedTextField();
            if (txtTest == gui.getTxtPolA() || txtTest == gui.getTxtPolB()) {
                String text = txtTest.getText();
                int length = text.length() - 1;
                if (length >= 0) {
                    if (text.charAt(length) != '+' && text.charAt(length) != '-' && text.charAt(length) != '.'
                            && text.charAt(length) != '^')
                        txtTest.setText(txtTest.getText() + "-");
                    else {
                        if (length > 0) {
                            StringBuilder back = new StringBuilder(txtTest.getText());
                            back.deleteCharAt(length);
                            back.append("-");
                            txtTest.setText(back.toString());
                        }
                    }
                }
            }
            else
            {
                JTextField tr = gui.getTxtRezultat();
                tr.setText("");
                tr.setText(model.subPolinoame(gui.getTxtPolA().getText(), gui.getTxtPolB().getText()));
            }
        }
    }
    class AddPointListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JTextField txtTest = getFocusedTextField();
            String text = txtTest.getText();
            int length = text.length() - 1;
            if (length >= 0) {
                if (text.charAt(length) != '+' && text.charAt(length) != '-' && text.charAt(length) != '.' && text.charAt(length) != 'X' && text.charAt(length) != '^') {
                    int ok = 1;
                    for (int i = length - 1; i > 0; i--) {
                        if (text.charAt(i) == '+' || text.charAt(i) == '-' || text.charAt(i) == '^' || text.charAt(i) == 'X')
                            break;
                        if (text.charAt(i) == '.') {
                            ok = 0;
                            break;
                        }
                    }
                    if (ok == 1)
                        txtTest.setText(txtTest.getText() + ".");
                } else {
                        int ok = 1;
                        for (int i = length; i > 0; i--) {
                            if (text.charAt(i) == '+' || text.charAt(i) == '-')
                                break;
                            if (text.charAt(i) == '.' || text.charAt(i) == '^' || text.charAt(i) == 'X') {
                                ok = 0;
                                break;
                            }
                        }
                        if (ok == 1) {
                            StringBuilder back = new StringBuilder(txtTest.getText());
                            back.deleteCharAt(length);
                            back.append(".");
                            txtTest.setText(back.toString());
                    }
                }
            }
        }
    }
    class AddPowListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JTextField txtTest = getFocusedTextField();
            String text = txtTest.getText();
            int length = text.length() - 1;
            if (length >= 0) {
                if (text.charAt(length) == 'X')
                    txtTest.setText(txtTest.getText() + "^");
                else {
                    StringBuilder back = new StringBuilder(txtTest.getText());
                    if((back.charAt(length) == '+' || back.charAt(length) == '-') && back.charAt(length-1)=='X'){
                        back.deleteCharAt(length);
                        back.append("^");
                        txtTest.setText(back.toString());
                    }
                }
            }
        }
    }
    class AddXListener implements ActionListener{
        public void actionPerformed(ActionEvent e)
        {
            JTextField txtTest = getFocusedTextField();
            String text = txtTest.getText();
            int length = text.length() - 1;
            if(length >= 0) {
                if (text.charAt(length) != '.' && text.charAt(length) != '^' && text.charAt(length) != 'X') {
                    int ok = 1;
                    for (int i = length - 1; i > 0; i--) {
                        if (text.charAt(i) == '+' || text.charAt(i) == '-')
                            break;
                        if (text.charAt(i) == 'X') {
                            ok = 0;
                            break;
                        }
                    }
                if (ok == 1)
                    txtTest.setText(txtTest.getText() + "X");
                }
            }
            else txtTest.setText("X");
        }
    }
    class AddDeriveazaListener implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            gui.getTxtRezultat().setText(model.deriveazaPolinoame(gui.getPolA()));
        }
    }
    class AddIntegreazaListener implements ActionListener {
        public void actionPerformed(ActionEvent e)
        {
            gui.getTxtRezultat().setText(model.integreazaPolinoame(gui.getPolA()));
        }
    }
    class AddMultiplicaListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            gui.getTxtRezultat().setText(model.multiplicaPolinoame(gui.getPolA(), gui.getPolB()));
        }
    }


    class AddFocusListener implements FocusListener {
        public void focusGained(FocusEvent e) {
            gui.getTxtPolA().setBackground(Color.WHITE);
        }

        public void focusLost(FocusEvent e) {
            gui.getTxtPolA().setBackground(Color.LIGHT_GRAY);
        }
    }
    class AddResultListener implements FocusListener {
        public void focusGained(FocusEvent e) {
            gui.getTxtRezultat().setBackground(Color.WHITE);
        }

        public void focusLost(FocusEvent e) {
            gui.getTxtRezultat().setBackground(Color.LIGHT_GRAY);
        }
    }
    class AddFocusTxt2Listener implements FocusListener {
        public void focusGained(FocusEvent e) {
            gui.getTxtPolB().setBackground(Color.WHITE);
        }

        public void focusLost(FocusEvent e) {
            gui.getTxtPolB().setBackground(Color.LIGHT_GRAY);
        }
    }
}
