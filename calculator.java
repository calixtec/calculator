import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.event.*;
import java.util.ArrayList;
import java.awt.*;

public class calculator extends JFrame {
    TextField text = new TextField(20);
    private ArrayList<Double> calc = new ArrayList<>();
    private ArrayList<String> ope = new ArrayList<>();
    private JPanel panel=new JPanel();
    private JButton addb, subb, multb, divb, b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, sqrb, factb, equb, clr, sqrt,
            recip, log, cos, sin, dec;

    public calculator() {
        int w = 275, h = 425;
        setTitle("Calculator");
        setLocation(900, 200);
        setSize(w, h);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setPreferredSize(new DimensionUIResource(250, 250));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        add(panel);
        panel.setBackground(Color.RED);

        ImageIcon im = new ImageIcon("2.jpg");
        JLabel label2 = new JLabel(im);

        setTitle("Calculator");

        addb = new JButton("+"); subb = new JButton("-"); multb = new JButton("*");
        divb = new JButton("/");b1 = new JButton("1");b2 = new JButton("2");
        b3 = new JButton("3");b4 = new JButton("4");b5 = new JButton("5");
        b6 = new JButton("6");b7 = new JButton("7");b8 = new JButton("8");
        b9 = new JButton("9");b0 = new JButton("0");sqrb = new JButton("x^2");
        factb = new JButton("x!");equb = new JButton("=");clr = new JButton("clear");
        sqrt = new JButton("sqrt");recip = new JButton("1/x");log = new JButton("log");
        cos = new JButton("cos");sin = new JButton("sin");dec = new JButton(".");

        addb.addActionListener(new AddBListener());subb.addActionListener(new SubBListener());
        clr.addActionListener(new ClrBListener());multb.addActionListener(new MultBListener());
        divb.addActionListener(new DivBListener());b1.addActionListener(new B1Listener());
        b2.addActionListener(new B2Listener());b3.addActionListener(new B3Listener());
        b4.addActionListener(new B4Listener());b5.addActionListener(new B5Listener());
        b6.addActionListener(new B6Listener());b7.addActionListener(new B7Listener());
        b8.addActionListener(new B8Listener());b9.addActionListener(new B9Listener());
        b0.addActionListener(new B0Listener());recip.addActionListener(new RecipBListener());
        sqrb.addActionListener(new SqrBListener());factb.addActionListener(new FactBListener());
        equb.addActionListener(new EquActionLister());log.addActionListener(new LogBListener());
        cos.addActionListener(new CosBListener());sin.addActionListener(new SinBListener());
        sqrt.addActionListener(new SqrtBListener());dec.addActionListener(new DecListener());

        panel.add(text);panel.add(clr);panel.add(b1);panel.add(b2);
        panel.add(b3);panel.add(b4);panel.add(b5);panel.add(b6);
        panel.add(b7);panel.add(b8);panel.add(b9);panel.add(b0);
        panel.add(sqrb);panel.add(factb);panel.add(recip);
        panel.add(log);panel.add(sqrt); panel.add(cos);
        panel.add(sin);panel.add(addb);panel.add(subb);
        panel.add(multb);panel.add(divb);panel.add(dec);
        panel.add(equb);panel.add(label2);

        setVisible(true);
        // BUTTONS
    }

    private class B1Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text.setText(text.getText() + "1");
        }
    }

    private class B2Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text.setText(text.getText() + "2");
        }
    }

    private class B3Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text.setText(text.getText() + "3");
        }
    }

    private class B4Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text.setText(text.getText() + "4");
        }
    }

    private class B5Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text.setText(text.getText() + "5");
        }
    }

    private class B6Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text.setText(text.getText() + "6");
        }
    }

    private class B7Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text.setText(text.getText() + "7");
        }
    }

    private class B8Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text.setText(text.getText() + "8");
        }
    }

    private class B9Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text.setText(text.getText() + "9");
        }
    }

    private class B0Listener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text.setText(text.getText() + "0");
        }
    }

    private class DecListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text.setText(text.getText() + ".");
        }
    }

    // EVALUTATIONS AND MORE
    private class AddBListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (ope.isEmpty()) {
                calc.add(Double.parseDouble(text.getText()));
                text.setText(text.getText() + "+");
                ope.add("+");
            }
        }
    }

    private class SubBListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (ope.isEmpty()) {
                calc.add(Double.parseDouble(text.getText()));
                text.setText(text.getText() + "-");
                ope.add("-");
            }
        }
    }

    private class MultBListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (ope.isEmpty()) {
                calc.add(Double.parseDouble(text.getText()));
                text.setText(text.getText() + "*");
                ope.add("*");
            }
        }
    }

    private class DivBListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (ope.isEmpty()) {
                calc.add(Double.parseDouble(text.getText()));
                text.setText(text.getText() + "/");
                ope.add("/");
            }
        }
    }

    private class SqrBListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (ope.isEmpty()) {
                text.setText("x^2");
                ope.add("x^2");
                calc.clear();
            }
        }
    }

    private class SqrtBListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (ope.isEmpty()) {
                text.setText("sqrt");
                ope.add("sqrt");
                calc.clear();
            }
        }
    }

    private class LogBListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (ope.isEmpty()) {
                text.setText("log");
                ope.add("log");
                calc.clear();
            }
        }
    }

    private class CosBListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (ope.isEmpty()) {
                text.setText("cos");
                ope.add("cos");
                calc.clear();
            }
        }
    }

    private class SinBListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (ope.isEmpty()) {
                text.setText("sin");
                ope.add("sin");
                calc.clear();
            }
        }
    }

    private class FactBListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (ope.isEmpty()) {
                calc.add(Double.parseDouble(text.getText()));
                text.setText(text.getText() + "!");
                ope.add("!");
            }
        }
    }

    private class RecipBListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (ope.isEmpty()) {
                text.setText("1/x");
                ope.add("1/x");
                calc.clear();
            }
        }
    }

    // END OF OPERATIONS
    private class ClrBListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text.setText("");
            ope.clear();
            calc.clear();
        }
    }

    private class EquActionLister implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input = text.getText();

            if (ope.contains("+")) {
                String[] a = input.split("\\+");
                text.setText(Double.parseDouble(a[1]) + calc.get(0) + "");
                calc.set(0, Double.parseDouble(a[1]) + calc.get(0));
            }
            if (ope.contains("-")) {
                String[] a = input.split("-");
                text.setText(Double.parseDouble(a[1]) - calc.get(0) + "");
                calc.set(0, Double.parseDouble(a[1]) - calc.get(0));
            }
            if (ope.contains("*")) {
                String[] a = input.split("\\*");
                text.setText(Double.parseDouble(a[1]) * calc.get(0) + "");
                calc.set(0, Double.parseDouble(a[1]) * calc.get(0));
            }
            if (ope.contains("/")) {
                String[] a = input.split("/");
                text.setText(calc.get(0) / Double.parseDouble(a[1]) + "");
                calc.set(0, calc.get(0) / Double.parseDouble(a[1]));
            }
            if (ope.contains("log")) {
                text.setText(Math.log(Double.parseDouble(input.substring(3, input.length()))) + "");
                calc.add(Math.log(Double.parseDouble(input.substring(3, input.length()))));
            }
            if (ope.contains("cos")) {
                text.setText(Math.cos(Double.parseDouble(input.substring(3, input.length())) * 0.0175) + "");
                calc.add(Math.cos(Double.parseDouble(input.substring(3, input.length())) * 0.0175));
            }
            if (ope.contains("sin")) {
                text.setText(Math.sin(Double.parseDouble(input.substring(3, input.length())) * 0.0175) + "");
                calc.add(Math.sin(Double.parseDouble(input.substring(3, input.length())) * 0.0175));
            }
            if (ope.contains("x^2")) {
                text.setText(Double.parseDouble(input.substring(3, input.length())) * Double.parseDouble(input.substring(3, input.length())) + "");
                calc.add(Double.parseDouble(input.substring(3, input.length())) * 2);
            }
            if (ope.contains("1/x")) {
                text.setText(1 / Double.parseDouble(input.substring(3, input.length())) + "");
                calc.add(1 / Double.parseDouble(input.substring(3, input.length())));
            }
            if (ope.contains("!")) {
                Double a = 1.0;
                for (double i = calc.get(0); i > 0; i--)
                    a *= i;
                text.setText(a + "");
                calc.add(a);
            }
            if (ope.contains("sqrt")) {// √
                text.setText(Math.sqrt(Double.parseDouble(input.substring(4, input.length()))) + "");
                calc.add(Math.sqrt(Double.parseDouble(input.substring(4, input.length()))));
            }
            ope.clear();
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {
        calculator gg = new calculator();
    }
}

