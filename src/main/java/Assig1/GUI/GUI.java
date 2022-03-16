package Assig1.GUI;
import Assig1.Model.Model;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.JButton;

public class GUI {

    public JFrame frame;
    private JTextField txtPolB;
    private JTextField txtPolA;
    private JTextField txtRezultat;
    private JTextField textField_2;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn0;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnPoint;
    private JButton btnDiv;
    private JButton btnMul;
    private JButton btnC;
    private JButton btnAC;
    private JButton btnDerivare;
    private JButton btnIntegrare;
    private JButton btnPow;
    private JButton btnX;
    private JButton btnNice;
    private Model model;


    /**
     * Create the application.
     */
    public GUI(Model model) {
        this.model = model;
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setResizable(false);
        frame.setBounds(100, 100, 577, 530);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Calculator Polinoame by Ionas Alex");

        JPanel panel = new JPanel();
        panel.setBackground(Color.DARK_GRAY);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        panel.setLayout(null);

        JTextArea txtrCalculatorDePolinoame = new JTextArea();
        txtrCalculatorDePolinoame.setEditable(false);
        txtrCalculatorDePolinoame.setFocusable(false);
        txtrCalculatorDePolinoame.setFocusTraversalKeysEnabled(false);
        txtrCalculatorDePolinoame.setForeground(new Color(128, 0, 0));
        txtrCalculatorDePolinoame.setBackground(Color.DARK_GRAY);
        txtrCalculatorDePolinoame.setFont(new Font("Lucida Bright", Font.BOLD | Font.ITALIC, 23));
        txtrCalculatorDePolinoame.setText("Calculator de Polinoame");
        txtrCalculatorDePolinoame.setBounds(15, 18, 350, 31);
        panel.add(txtrCalculatorDePolinoame);

        JTextArea txtrPrimulPolinom = new JTextArea();
        txtrPrimulPolinom.setFocusTraversalKeysEnabled(false);
        txtrPrimulPolinom.setFocusable(false);
        txtrPrimulPolinom.setEditable(false);
        txtrPrimulPolinom.setBackground(Color.DARK_GRAY);
        txtrPrimulPolinom.setForeground(new Color(255, 250, 240));
        txtrPrimulPolinom.setFont(new Font("Lucida Bright", Font.PLAIN, 16));
        txtrPrimulPolinom.setText("Polinom A:");
        txtrPrimulPolinom.setBounds(21, 77, 86, 24);
        panel.add(txtrPrimulPolinom);

        JTextArea txtrPolinomB = new JTextArea();
        txtrPolinomB.setText("Polinom B:");
        txtrPolinomB.setForeground(new Color(255, 250, 240));
        txtrPolinomB.setFont(new Font("Lucida Bright", Font.PLAIN, 16));
        txtrPolinomB.setFocusable(false);
        txtrPolinomB.setFocusTraversalKeysEnabled(false);
        txtrPolinomB.setEditable(false);
        txtrPolinomB.setBackground(Color.DARK_GRAY);
        txtrPolinomB.setBounds(21, 112, 86, 24);
        panel.add(txtrPolinomB);

        txtPolB = new JTextField();
        txtPolB.setBorder(null);
        //txtPolB.setFocusTraversalKeysEnabled(false);
        //txtPolB.setFocusable(false);
        txtPolB.setEditable(true);
        txtPolB.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPolB.setBackground(Color.LIGHT_GRAY);
        txtPolB.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        txtPolB.setForeground(new Color(0, 0, 0));
        txtPolB.setBounds(117, 116, 434, 20);
        panel.add(txtPolB);
        txtPolB.setColumns(10);

        txtPolA = new JTextField();
        txtPolA.setHorizontalAlignment(SwingConstants.RIGHT);
        txtPolA.setForeground(Color.BLACK);
        txtPolA.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        //txtPolA.setFocusable(false);
        txtPolA.setFocusTraversalKeysEnabled(false);
        txtPolA.setEditable(true);
        txtPolA.setColumns(10);
        txtPolA.setBorder(null);
        txtPolA.setBackground(Color.LIGHT_GRAY);
        txtPolA.setBounds(117, 81, 434, 20);
        panel.add(txtPolA);

        JTextArea txtrRezultat = new JTextArea();
        txtrRezultat.setText("Rezultat:");
        txtrRezultat.setForeground(new Color(255, 250, 240));
        txtrRezultat.setFont(new Font("Lucida Bright", Font.PLAIN, 16));
        txtrRezultat.setFocusable(false);
        txtrRezultat.setFocusTraversalKeysEnabled(false);
        txtrRezultat.setEditable(false);
        txtrRezultat.setBackground(Color.DARK_GRAY);
        txtrRezultat.setBounds(21, 147, 86, 24);
        panel.add(txtrRezultat);

        txtRezultat = new JTextField();
        txtRezultat.setHorizontalAlignment(SwingConstants.RIGHT);
        txtRezultat.setForeground(Color.BLACK);
        txtRezultat.setFont(new Font("Times New Roman", Font.PLAIN, 17));
        txtRezultat.setFocusable(true);
        //txtRezultat.setFocusTraversalKeysEnabled(false);
        txtRezultat.setEditable(false);
        txtRezultat.setColumns(10);
        txtRezultat.setBorder(null);
        txtRezultat.setBackground(Color.LIGHT_GRAY);
        txtRezultat.setBounds(117, 151, 434, 20);
        panel.add(txtRezultat);

        btn1 = new JButton("1");
        btn1.setFocusTraversalKeysEnabled(false);
        btn1.setFocusable(false);
        btn1.setFocusPainted(false);
        btn1.setBorder(null);
        btn1.setForeground(new Color(139, 0, 0));
        btn1.setFont(new Font("Arial Black", Font.BOLD, 30));
        btn1.setBackground(new Color(211, 211, 211));
        btn1.setBounds(21, 182, 57, 57);
        panel.add(btn1);

        btn2 = new JButton("2");
        btn2.setFocusable(false);
        btn2.setFocusPainted(false);
        btn2.setFocusTraversalKeysEnabled(false);
        btn2.setBorder(null);
        btn2.setForeground(new Color(139, 0, 0));
        btn2.setFont(new Font("Arial Black", Font.BOLD, 30));
        btn2.setBackground(new Color(211, 211, 211));
        btn2.setBounds(88, 182, 57, 57);
        panel.add(btn2);

        btn3 = new JButton("3");
        btn3.setFocusable(false);
        btn3.setFocusPainted(false);
        btn3.setFocusTraversalKeysEnabled(false);
        btn3.setBorder(null);
        btn3.setForeground(new Color(139, 0, 0));
        btn3.setFont(new Font("Arial Black", Font.BOLD, 30));
        btn3.setBackground(new Color(211, 211, 211));
        btn3.setBounds(155, 182, 57, 57);
        panel.add(btn3);

        btn4 = new JButton("4");
        btn4.setFocusable(false);
        btn4.setFocusPainted(false);
        btn4.setFocusTraversalKeysEnabled(false);
        btn4.setBorder(null);
        btn4.setForeground(new Color(139, 0, 0));
        btn4.setFont(new Font("Arial Black", Font.BOLD, 30));
        btn4.setBackground(new Color(211, 211, 211));
        btn4.setBounds(21, 250, 57, 57);
        panel.add(btn4);

        btn5 = new JButton("5");
        btn5.setFocusable(false);
        btn5.setFocusPainted(false);
        btn5.setFocusTraversalKeysEnabled(false);
        btn5.setBorder(null);
        btn5.setForeground(new Color(139, 0, 0));
        btn5.setFont(new Font("Arial Black", Font.BOLD, 30));
        btn5.setBackground(new Color(211, 211, 211));
        btn5.setBounds(88, 249, 57, 57);
        panel.add(btn5);

        btn6 = new JButton("6");
        btn6.setFocusable(false);
        btn6.setFocusPainted(false);
        btn6.setFocusTraversalKeysEnabled(false);
        btn6.setBorder(null);
        btn6.setForeground(new Color(139, 0, 0));
        btn6.setFont(new Font("Arial Black", Font.BOLD, 30));
        btn6.setBackground(new Color(211, 211, 211));
        btn6.setBounds(155, 249, 57, 57);
        panel.add(btn6);

        btn7 = new JButton("7");
        btn7.setFocusable(false);
        btn7.setFocusPainted(false);
        btn7.setFocusTraversalKeysEnabled(false);
        btn7.setBorder(null);
        btn7.setForeground(new Color(139, 0, 0));
        btn7.setFont(new Font("Arial Black", Font.BOLD, 30));
        btn7.setBackground(new Color(211, 211, 211));
        btn7.setBounds(21, 318, 57, 57);
        panel.add(btn7);

        btn8 = new JButton("8");
        btn8.setFocusable(false);
        btn8.setFocusPainted(false);
        btn8.setFocusTraversalKeysEnabled(false);
        btn8.setBorder(null);
        btn8.setForeground(new Color(139, 0, 0));
        btn8.setFont(new Font("Arial Black", Font.BOLD, 30));
        btn8.setBackground(new Color(211, 211, 211));
        btn8.setBounds(88, 317, 57, 57);
        panel.add(btn8);

        btn9 = new JButton("9");
        btn9.setFocusable(false);
        btn9.setFocusPainted(false);
        btn9.setFocusTraversalKeysEnabled(false);
        btn9.setBorder(null);
        btn9.setForeground(new Color(139, 0, 0));
        btn9.setFont(new Font("Arial Black", Font.BOLD, 30));
        btn9.setBackground(new Color(211, 211, 211));
        btn9.setBounds(155, 317, 57, 57);
        panel.add(btn9);

        btnPlus = new JButton("+");
        btnPlus.setFocusable(false);
        btnPlus.setFocusPainted(false);
        btnPlus.setFocusTraversalKeysEnabled(false);
        btnPlus.setBorder(null);
        btnPlus.setForeground(new Color(139, 0, 0));
        btnPlus.setFont(new Font("Arial Black", Font.BOLD, 30));
        btnPlus.setBackground(new Color(211, 211, 211));
        btnPlus.setBounds(222, 250, 57, 125);
        panel.add(btnPlus);

        btnMinus = new JButton("-");
        btnMinus.setFocusable(false);
        btnMinus.setFocusPainted(false);
        btnMinus.setFocusTraversalKeysEnabled(false);
        btnMinus.setBorder(null);
        btnMinus.setForeground(new Color(139, 0, 0));
        btnMinus.setFont(new Font("Arial Black", Font.BOLD, 30));
        btnMinus.setBackground(new Color(211, 211, 211));
        btnMinus.setBounds(222, 386, 57, 57);
        panel.add(btnMinus);

        btn0 = new JButton("0");
        btn0.setFocusable(false);
        btn0.setFocusPainted(false);
        btn0.setFocusTraversalKeysEnabled(false);
        btn0.setBorder(null);
        btn0.setForeground(new Color(139, 0, 0));
        btn0.setFont(new Font("Arial Black", Font.BOLD, 30));
        btn0.setBackground(new Color(211, 211, 211));
        btn0.setBounds(88, 386, 124, 57);
        panel.add(btn0);

        btnPoint = new JButton(".");
        btnPoint.setFocusable(false);
        btnPoint.setFocusPainted(false);
        btnPoint.setFocusTraversalKeysEnabled(false);
        btnPoint.setBorder(null);
        btnPoint.setForeground(new Color(139, 0, 0));
        btnPoint.setFont(new Font("Arial Black", Font.BOLD, 30));
        btnPoint.setBackground(new Color(211, 211, 211));
        btnPoint.setBounds(21, 386, 57, 57);
        panel.add(btnPoint);

        btnDiv = new JButton("/");
        btnDiv.setFocusPainted(false);
        btnDiv.setFocusTraversalKeysEnabled(false);
        btnDiv.setFocusable(false);
        btnDiv.setBorder(null);
        btnDiv.setForeground(new Color(139, 0, 0));
        btnDiv.setFont(new Font("Arial Black", Font.BOLD, 28));
        btnDiv.setBackground(new Color(211, 211, 211));
        btnDiv.setBounds(360, 317, 57, 57);
        panel.add(btnDiv);

        btnMul = new JButton("*");
        btnMul.setFocusPainted(false);
        btnMul.setFocusTraversalKeysEnabled(false);
        btnMul.setFocusable(false);
        btnMul.setBorder(null);
        btnMul.setForeground(new Color(139, 0, 0));
        btnMul.setFont(new Font("Arial Black", Font.BOLD, 35));
        btnMul.setBackground(new Color(211, 211, 211));
        btnMul.setBounds(360, 250, 57, 57);
        panel.add(btnMul);

        btnC = new JButton("C");
        btnC.setFocusable(false);
        btnC.setFocusPainted(false);
        btnC.setFocusTraversalKeysEnabled(false);
        btnC.setBorder(null);
        btnC.setForeground(new Color(139, 0, 0));
        btnC.setFont(new Font("Arial Black", Font.BOLD, 26));
        btnC.setBackground(new Color(211, 211, 211));
        btnC.setBounds(222, 182, 57, 57);
        panel.add(btnC);

        btnAC = new JButton("AC");
        btnAC.setFocusPainted(false);
        btnAC.setFocusTraversalKeysEnabled(false);
        btnAC.setFocusable(false);
        btnAC.setBorder(null);
        btnAC.setForeground(new Color(139, 0, 0));
        btnAC.setFont(new Font("Arial Black", Font.BOLD, 14));
        btnAC.setBackground(new Color(211, 211, 211));
        btnAC.setBounds(360, 182, 57, 57);
        panel.add(btnAC);

        btnDerivare = new JButton("Derivare");
        btnDerivare.setFocusPainted(false);
        btnDerivare.setFocusTraversalKeysEnabled(false);
        btnDerivare.setFocusable(false);
        btnDerivare.setForeground(new Color(139, 0, 0));
        btnDerivare.setFont(new Font("Arial", Font.BOLD, 23));
        btnDerivare.setBorder(null);
        btnDerivare.setBackground(new Color(211, 211, 211));
        btnDerivare.setBounds(427, 250, 124, 57);
        panel.add(btnDerivare);

        btnIntegrare = new JButton("Integrare");
        btnIntegrare.setFocusPainted(false);
        btnIntegrare.setFocusTraversalKeysEnabled(false);
        btnIntegrare.setFocusable(false);
        btnIntegrare.setForeground(new Color(139, 0, 0));
        btnIntegrare.setFont(new Font("Arial", Font.BOLD, 23));
        btnIntegrare.setBorder(null);
        btnIntegrare.setBackground(new Color(211, 211, 211));
        btnIntegrare.setBounds(427, 318, 124, 57);
        panel.add(btnIntegrare);

        btnPow = new JButton("^");
        btnPow.setFocusPainted(false);
        btnPow.setFocusTraversalKeysEnabled(false);
        btnPow.setFocusable(false);
        btnPow.setForeground(new Color(139, 0, 0));
        btnPow.setFont(new Font("Arial Black", Font.BOLD, 30));
        btnPow.setBorder(null);
        btnPow.setBackground(new Color(211, 211, 211));
        btnPow.setBounds(427, 182, 57, 56);
        panel.add(btnPow);

        btnX = new JButton("X");
        btnX.setFocusPainted(false);
        btnX.setFocusTraversalKeysEnabled(false);
        btnX.setFocusable(false);
        btnX.setForeground(new Color(139, 0, 0));
        btnX.setFont(new Font("Arial", Font.BOLD, 30));
        btnX.setBorder(null);
        btnX.setBackground(new Color(211, 211, 211));
        btnX.setBounds(494, 182, 57, 56);
        panel.add(btnX);

        textField_2 = new JTextField();
        textField_2.setBorder(null);
        textField_2.setForeground(new Color(128, 0, 0));
        textField_2.setFocusTraversalKeysEnabled(false);
        textField_2.setFocusable(false);
        textField_2.setEditable(false);
        textField_2.setBackground(new Color(128, 0, 0));
        textField_2.setBounds(318, 182, 1, 207);
        textField_2.setColumns(10);
        panel.add(textField_2);

        JTextField textField_4 = new JTextField();
        textField_4.setForeground(new Color(128, 0, 0));
        textField_4.setFocusable(false);
        textField_4.setFocusTraversalKeysEnabled(false);
        textField_4.setEditable(false);
        textField_4.setColumns(10);
        textField_4.setBorder(null);
        textField_4.setBackground(new Color(128, 0, 0));
        textField_4.setBounds(10, 60, 541, 1);
        panel.add(textField_4);

        JTextField textField_5 = new JTextField();
        textField_5.setForeground(new Color(128, 0, 0));
        textField_5.setFocusable(false);
        textField_5.setFocusTraversalKeysEnabled(false);
        textField_5.setEditable(false);
        textField_5.setColumns(10);
        textField_5.setBorder(null);
        textField_5.setBackground(new Color(128, 0, 0));
        textField_5.setBounds(550, 388, 1, 92);
        panel.add(textField_5);

        JTextField textField_6 = new JTextField();
        textField_6.setForeground(new Color(128, 0, 0));
        textField_6.setFocusable(false);
        textField_6.setFocusTraversalKeysEnabled(false);
        textField_6.setEditable(false);
        textField_6.setColumns(10);
        textField_6.setBorder(null);
        textField_6.setBackground(new Color(128, 0, 0));
        textField_6.setBounds(318, 388, 233, 1);
        panel.add(textField_6);

        JTextField textField_3 = new JTextField();
        textField_3.setForeground(new Color(128, 0, 0));
        textField_3.setFocusable(false);
        textField_3.setFocusTraversalKeysEnabled(false);
        textField_3.setEditable(false);
        textField_3.setColumns(10);
        textField_3.setBorder(null);
        textField_3.setBackground(new Color(128, 0, 0));
        textField_3.setBounds(15, 479, 536, 1);
        panel.add(textField_3);

        btnNice = new JButton("Nice. Ai aici un cadou!");
        btnNice.setForeground(new Color(139, 0, 0));
        btnNice.setFont(new Font("Arial", Font.PLAIN, 23));
        btnNice.setFocusable(false);
        btnNice.setFocusTraversalKeysEnabled(false);
        btnNice.setFocusPainted(false);
        btnNice.setBorder(null);
        btnNice.setBackground(new Color(211, 211, 211));
        btnNice.setBounds(289, 411, 251, 57);
        btnNice.hide();
        btnNice.setEnabled(false);
        panel.add(btnNice);
    }

    public boolean getFocusA() {
        return txtPolA.hasFocus();
    }

    public boolean getFocusB() {
        return txtPolB.hasFocus();
    }

    public JTextField getTxtPolB() {
        return txtPolB;
    }

    public JTextField getTxtPolA() {
        return txtPolA;
    }
    public JTextField getTxtRezultat() {
        return txtRezultat;
    }
    void setPolB(String s) {
        this.txtPolB.setText(s);
    }

    void setPolA(String s) {
        this.txtPolA.setText(s);
    }

    public String getPolA() {
        return txtPolA.getText();
    }

    public String getPolB() {
        return txtPolB.getText();
    }

    void setRezult(String res) {
        txtRezultat.setText(res);
    }

    public void addZeroListener(ActionListener e) {
        btn0.addActionListener(e);
    }

    public void addOneListener(ActionListener e) {
        btn1.addActionListener(e);
    }

    public void addTwoListener(ActionListener e) {
        btn2.addActionListener(e);
    }

    public void addThreeListener(ActionListener e) {
        btn3.addActionListener(e);
    }

    public void addFourListener(ActionListener e) {
        btn4.addActionListener(e);
    }

    public void addFiveListener(ActionListener e) {
        btn5.addActionListener(e);
    }

    public void addSixListener(ActionListener e) {
        btn6.addActionListener(e);
    }

    public void addSevenListener(ActionListener e) {
        btn7.addActionListener(e);
    }

    public void addEigthListener(ActionListener e) {
        btn8.addActionListener(e);
    }

    public void addNineListener(ActionListener e) {
        btn9.addActionListener(e);
    }

    public void addPlusListener(ActionListener e) {
        btnPlus.addActionListener(e);
    }

    public void addMinusListener(ActionListener e) {
        btnMinus.addActionListener(e);
    }

    public void addPointListener(ActionListener e) {
        btnPoint.addActionListener(e);
    }

    void addDivListener(ActionListener e) {
        btnDiv.addActionListener(e);
    }

    public void addMulListener(ActionListener e) {
        btnMul.addActionListener(e);
    }

    public void addCListener(ActionListener e) {
        btnC.addActionListener(e);
    }

    public void addACListener(ActionListener e) {
        btnAC.addActionListener(e);
    }

    public void addDerivareListener(ActionListener e) {
        btnDerivare.addActionListener(e);
    }

    public void addIntegrareListener(ActionListener e) {
        btnIntegrare.addActionListener(e);
    }

    public void addPowListener(ActionListener e) {
        btnPow.addActionListener(e);
    }

    public void addXListener(ActionListener e) {
        btnX.addActionListener(e);
    }

    void addNiceListener(ActionListener e) {
        btnNice.addActionListener(e);
    }

    public void addFocusareListener(FocusListener e) {
        txtPolA.addFocusListener(e);
    }
    public void addFocusareTxt2Listener(FocusListener e) {
        txtPolB.addFocusListener(e);
    }
    public void addResultListener(FocusListener e)
    {
        txtRezultat.addFocusListener(e);
    }
}
