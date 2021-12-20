package me;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Myframe extends JFrame implements ActionListener {
    private JPanel Window = new JPanel(new BorderLayout(5, 5));
    private JPanel Buttonwin = new JPanel(new GridLayout(6, 5));
    private JTextArea Textipop = new JTextArea(5, 40);
    private JButton[] Button = new JButton[30];
    private String[] Keys = {"C", "sin", "cos", "tan", "AREA:",
            "+", "1","2", "3","Square",
            "-", "4", "5","6","Rectangle",
            "/", "7", "8","9","Circle",
            "x", "%", "0",".", "Triangle",
            "","x^", "1/x", "sqrt", "="};
    private double n1 = 0, n2 = 0, deg =0, rad=0;
    private int operator = 0;
    Myframe() {
        setTitle("Multipurpose Calculator");
        setSize(500, 500);
        setLocation(100, 100);
        setResizable(false);
        setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(3);
        for (int i = 0; i < Button.length; i++) {
            Button[i] = new JButton(Keys[i]);
            Button[i].setOpaque(true);
            Button[i].setBorderPainted(true);
            Button[i].setBackground(Color.lightGray);
            Button[i].addActionListener(this);
            Buttonwin.add(Button[i]);
        }
        Window.add(Buttonwin, BorderLayout.CENTER);
        Window.add(Textipop, BorderLayout.NORTH);
        Window.setBackground(Color.GRAY);
        add(Window);
        setSize(600, 400);
        setDefaultCloseOperation(3);
        setVisible(true);
        Textipop.setFont(new Font("TimesRoman", Font.BOLD, 14));
        Textipop.setBorder(BorderFactory.createLineBorder(Color.black));
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String Command = e.getActionCommand().toString();
        switch (Command) {
            case ".":
                if (!Textipop.getText().contains(".")) {
                    Textipop.setText(Textipop.getText() + ".");
                }
                break;
            case "0":
                Textipop.setText(Textipop.getText() + "0");
                break;
            case "1":
                Textipop.setText(Textipop.getText() + "1");
                break;
            case "2":
                Textipop.setText(Textipop.getText() + "2");
                break;
            case "3":
                Textipop.setText(Textipop.getText() + "3");
                break;
            case "4":
                Textipop.setText(Textipop.getText() + "4");
                break;
            case "5":
                Textipop.setText(Textipop.getText() + "5");
                break;
            case "6":
                Textipop.setText(Textipop.getText() + "6");
                break;
            case "7":
                Textipop.setText(Textipop.getText() + "7");
                break;
            case "8":
                Textipop.setText(Textipop.getText() + "8");
                break;
            case "9":
                Textipop.setText(Textipop.getText() + "9");
                break;
            case "+":
                if (!Textipop.getText().isEmpty()) {
                    n1 = Double.parseDouble(Textipop.getText().toString());
                    operator = 1;
                    Textipop.setText("");
                }
            case "-":
                if (!Textipop.getText().isEmpty()) {
                    n1 = Double.parseDouble(Textipop.getText().toString());
                    operator = 2;
                    Textipop.setText("");
                }
            case "X":
                if (!Textipop.getText().isEmpty()) {
                    n1 = Double.parseDouble(Textipop.getText().toString());
                    operator = 3;
                    Textipop.setText("");
                }
            case "/":
                if (!Textipop.getText().isEmpty()) {
                    n1 = Double.parseDouble(Textipop.getText().toString());
                    operator = 4;
                    Textipop.setText("");
                }
            case "%":
                if (!Textipop.getText().isEmpty()) {
                    n1 = Double.parseDouble(Textipop.getText().toString());
                    operator = 5;
                    Textipop.setText("");
                }
            case "1/x":
                if (!Textipop.getText().isEmpty()) {
                    n1 = Double.parseDouble(Textipop.getText().toString());
                    operator = 6;
                    Textipop.setText("");
                }
            case "x^":
                if (!Textipop.getText().isEmpty()) {
                    n1 = Double.parseDouble(Textipop.getText().toString());
                    operator = 7;
                    Textipop.setText("");
                }
            case "sin":
                deg = Double.parseDouble(Textipop.getText().toString());
                Textipop.setText(String.valueOf(Math.sin(Math.toRadians(deg))));
                break;
            case "cos":
                deg = Double.parseDouble(Textipop.getText().toString());
                Textipop.setText(String.valueOf(Math.cos(Math.toRadians(deg))));
                break;
            case "tan":
                deg = Double.parseDouble(Textipop.getText().toString());
                Textipop.setText(String.valueOf(Math.tan(Math.toRadians(deg))));
                break;
            case "sqrt":
                n1 = Double.parseDouble(Textipop.getText().toString());
                Textipop.setText(String.valueOf(Math.sqrt(n1)));
                break;
            case "Square":
                n1 = Double.parseDouble(Textipop.getText().toString());
                Textipop.setText(String.valueOf(n1*n1));
                break;
            case "Rectangle":
                if (!Textipop.getText().isEmpty()) {
                    n1 = Double.parseDouble(Textipop.getText().toString());
                    operator = 3;
                    Textipop.setText("");
                }
                break;
            case "Triangle":
                if (!Textipop.getText().isEmpty()) {
                    n1 = Double.parseDouble(Textipop.getText().toString());
                    operator = 8;
                    Textipop.setText("");
                }
            case "Circle":
                n1 = Double.parseDouble(Textipop.getText().toString());
                Textipop.setText(String.valueOf(Math.PI*Math.pow(n1,2)));
                break;
            case "C":
                Textipop.setText("");
        }
        if (Command.equalsIgnoreCase("=")) {
            if (!Textipop.getText().isEmpty()) {
                n2 = Double.parseDouble(Textipop.getText().toString());
                switch (operator) {
                    case 1:
                        Textipop.setText(String.valueOf(n1 + n2));
                        break;
                    case 2:
                        Textipop.setText(String.valueOf(n1 - n2));
                        break;
                    case 3:
                        Textipop.setText(String.valueOf(n1 * n2));
                        break;
                    case 4:
                        Textipop.setText(String.valueOf(n1 / n2));
                        break;
                    case 5:
                        Textipop.setText(String.valueOf((n1/n2)*100));
                        break;
                    case 6:
                        Textipop.setText(String.valueOf(1/n1));
                        break;
                    case 7:
                        Textipop.setText(String.valueOf(Math.pow(n1,n2)));
                        break;
                    case 8:
                        Textipop.setText(String.valueOf(0.5*n1*n2));
                        break;
                    default:
                }
            }
        }
    }
}
public class Scientific_C {
    public static void main(String[] args)
    {
        new Myframe();
    }
}