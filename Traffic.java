import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
public class Traffic extends JFrame{
  Traffic() {
    JPanel p1 = new JPanel();
    JPanel p2 = new JPanel();
    JPanel p3 = new JPanel();
    JPanel p4 = new JPanel();
    JPanel p5 = new JPanel();
    ButtonGroup bg = new ButtonGroup();
    JRadioButton b1 = new JRadioButton("START");
    b1.setBackground(Color.WHITE);
    b1.setBounds(20,20,70,30);
    JRadioButton b2 = new JRadioButton("WAIT");
    b2.setBackground(Color.WHITE);
    b2.setBounds(20,60,70,30);
    JRadioButton b3 = new JRadioButton("STOP");
    b3.setBackground(Color.WHITE);
    b3.setBounds(20,100,70,30);
    bg.add(b1); bg.add(b2); bg.add(b3);
    b1.addItemListener(new ItemListener(){
    	@Override
    	public void itemStateChanged(ItemEvent e){
    		if(e.getStateChange() == 1){
    			p3.setBorder(new RoundedBorder(25,Color.GRAY));
    			p4.setBorder(new RoundedBorder(25,Color.GRAY));
    			p5.setBorder(new RoundedBorder(25,Color.GREEN));
    		}
    	}
    });
    b2.addItemListener(new ItemListener(){
    	@Override
    	public void itemStateChanged(ItemEvent e){
    		if(e.getStateChange() == 1){
    			p3.setBorder(new RoundedBorder(25,Color.GRAY));
    			p4.setBorder(new RoundedBorder(25,Color.YELLOW));
    			p5.setBorder(new RoundedBorder(25,Color.GRAY));
    		}
    	}
    });
    b3.addItemListener(new ItemListener(){
    	@Override
    	public void itemStateChanged(ItemEvent e){
    		if(e.getStateChange() == 1){
    			p3.setBorder(new RoundedBorder(25,Color.RED));
    			p4.setBorder(new RoundedBorder(25,Color.GRAY));
    			p5.setBorder(new RoundedBorder(25,Color.GRAY));
    		}
    	}
    });
    p1.setBackground(Color.BLACK);
    p1.setBounds(200,20,70,150);
    p2.setBackground(Color.BLACK);
    p2.setBounds(218,150,35,100);
    p3.setBackground(Color.BLACK);
    p3.setBounds(220,40,30,30);
    p3.setBorder(new RoundedBorder(25,Color.GRAY));
    p4.setBackground(Color.BLACK);
    p4.setBounds(220,80,30,30);
    p4.setBorder(new RoundedBorder(25,Color.GRAY));
    p5.setBackground(Color.BLACK);
    p5.setBounds(220,120,30,30);
    p5.setBorder(new RoundedBorder(25,Color.GRAY));
    add(p3); add(p4); add(p5); add(p1); add(p2); 
    add(b1); add(b2); add(b3);
    setSize(450, 300);
    setLayout(null);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
  }
  private static class RoundedBorder implements Border {
        private int radius;
        private Color cl;
        RoundedBorder(int radius, Color cl) {
            this.radius = radius;
            this.cl = cl;
        }
        @Override
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius, this.radius, this.radius, this.radius);
        }
		@Override
        public boolean isBorderOpaque() {
            return true;
        }
        @Override
        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x,y,width-1,height-1,radius,radius);
            g.setColor(cl);
            g.fillRoundRect(x,y,width-1,height-1,radius,radius);
        }
    }
  public static void main(String[] args) {
    new Traffic();
  }
}
