import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
	JButton b1, b2, b3, b4, b5, b6, b7, b8, b9, b0, bdiv, bmul, bsub, badd, beq, clear, dot;
	JTextField jtf;
  Calculator() {
	
    JFrame jrm = new JFrame();
    jrm.setSize(350, 450);

    JLabel jbl = new JLabel("Calculator");
    jbl.setBounds(130, 10, 400, 30);
    jrm.add(jbl);
	
	JPanel jp = new JPanel(new GridLayout(5,4),true);
	jp.setBounds(20,100,300,300);
	jrm.add(jp);
	
    jtf = new JTextField();
    jtf.setEditable(false);
    jtf.setBounds(20, 50, 300, 30);
    jrm.add(jtf);

    b1 = new JButton("1");
    b2 = new JButton("2");
    b3 = new JButton("3");
    b4 = new JButton("4");
    b5 = new JButton("5");
    b6 = new JButton("6");
    b7 = new JButton("7");
    b8 = new JButton("8");
    b9 = new JButton("9");
    b0 = new JButton("0");
    bdiv = new JButton("/");
    bmul = new JButton("X");
    bsub = new JButton("-");
    badd = new JButton("+");
    beq = new JButton("=");
    clear = new JButton("Clear");
    dot = new JButton(".");

    jp.add(b7);
    jp.add(b8);
    jp.add(b9);
    jp.add(bdiv);
    jp.add(b4);
    jp.add(b5);
    jp.add(b6);
    jp.add(bmul);
    jp.add(b1);
    jp.add(b2);
    jp.add(b3);
    jp.add(bsub);
    jp.add(b0);
    jp.add(beq);
    jp.add(badd);
    jp.add(clear);
    jp.add(dot);
    

    jrm.setLayout(null);
    jrm.setResizable(false);
    jrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    jrm.setVisible(true);

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    b4.addActionListener(this);
    b5.addActionListener(this);
    b6.addActionListener(this);
    b7.addActionListener(this);
    b8.addActionListener(this);
    b9.addActionListener(this);
    b0.addActionListener(this);
    clear.addActionListener(this);
    dot.addActionListener(this);
    badd.addActionListener(this);
    bsub.addActionListener(this);
    bmul.addActionListener(this);
    bdiv.addActionListener(this);
	beq.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e){
     if(e.getSource() == beq){
  		try {
          String S = jtf.getText();
          int i = 0;
          char b = S.charAt(i);
          while (b != '+' && b != '-' && b != 'X' && b != '/' && b != '%') {
            i++;
            b = S.charAt(i);
          }
          Float x, y, ans = 0f;
          x = Float.parseFloat(S.substring(0, i));
          y = Float.parseFloat(S.substring(i + 1, S.length()));
          if (b == '+') 
            ans = x + y;
          else if (b == '-')
            ans = x - y;
          else if (b == 'X')
            ans = x * y;
          else if (b == '/') 
            ans = x / y;
          if (b == '/' && y == 0)
            jtf.setText("Not defined!");
          else
            jtf.setText(ans + "");
        }catch (Exception ex) {
          jtf.setText("Enter two operands!");
        }
     }else if(e.getSource() == clear){
        jtf.setText("");
     }else{
     	JButton source = (JButton)e.getSource();
     	if (jtf.getText().equals("Enter two operands!") || jtf.getText().equals("Not defined!"))
          jtf.setText("");
        jtf.setText(jtf.getText() + source.getText());
     }
  }
  public static void main(String[] args) {
    new Calculator();
  }
}
