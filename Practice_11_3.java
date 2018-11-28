import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Practice_11_3 extends JFrame 
{
    int[] mo = {50000, 10000, 1000, 500, 100, 50, 10, 1};
    String[] str = {"금액", "오만원", "만원", "천원", "500원", "100원", "50원", "10원", "1원"};
    JLabel jl = new JLabel();
    JTextField[] jt = new JTextField[str.length];
    JButton jb = new JButton("계산");

    public Practice_11_3() 
    {
        setTitle("Money Changer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        setLayout(null);
        c.setBackground(Color.PINK);
        
        jl = new JLabel(str[0]);
        jl.setSize(50, 20);
        jl.setLocation(20, 20);
        c.add(jl);
        
        jt[0] = new JTextField(30);
        jt[0].setSize(100, 20);
        jt[0].setLocation(100, 20);
        c.add(jt[0]);
        
        jb.setSize(70, 20);
        jb.setLocation(210, 20);
        jb.addActionListener(new MyActionListener());
        c.add(jb);

        for(int i = 1; i < str.length; i++){
            jl = new JLabel(str[i]);
            jl.setHorizontalAlignment(JLabel.RIGHT);
            jl.setSize(50, 20);
            jl.setLocation(50, 50+(i*20));
            
            jt[i] = new JTextField(30);
            jt[i].setHorizontalAlignment(JTextField.CENTER);
            jt[i].setSize(70, 20);
            jt[i].setLocation(120, 50+(i*20));
            c.add(jl);
            c.add(jt[i]);
        }
        setSize(300, 300);
        setVisible(true);
    }
    
    public class MyActionListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e) 
        {
            String mon = jt[0].getText();
            if(mon.length() == 0) return;
            
            int money = Integer.parseInt(mon);
            int m;
            
            for(int i=0; i<mo.length; i++) 
            {
                m = money/mo[i];
                jt[i + 1].setText(Integer.toString(m));
                money-=mo[i]*m;
            }
        }
    }
   

    public static void main(String[] args) {
        new Practice_11_3();
    }
}
