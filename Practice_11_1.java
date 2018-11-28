import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Practice_11_1 extends JFrame{
	JCheckBox jb = new JCheckBox("��ư ��Ȱ��ȭ");
	JCheckBox cb = new JCheckBox("��ư �����");
	JButton b = new JButton("test button");

	public Practice_11_1() {
		setTitle("üũ�ڽ� ����");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());

		jb.setBorderPainted(true);
		cb.setBorderPainted(true);
		MyItemListener listener = new MyItemListener();
		jb.addItemListener(listener);
		cb.addItemListener(listener);

		c.add(jb);
		c.add(cb);
		c.add(b);
		setSize(300,400);
		setVisible(true);
	}
	
	class MyItemListener implements ItemListener{
		public void itemStateChanged(ItemEvent e) {
			if(e.getStateChange() == ItemEvent.SELECTED) {
				if(e.getItem() == jb) {
					b.setEnabled(false);
				}
				else {
					b.setVisible(false);
				}
			}
			else {
				if(e.getItem() == jb) {
					b.setEnabled(true);
				}
				else {
					b.setVisible(true);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Practice_11_1();
	}

}

