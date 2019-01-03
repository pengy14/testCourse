package raw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField; 
public class Input {
	static int year;
	static int month;
	static int day;
	
	public Input() {
		JFrame frame = new JFrame("dateCount");
        frame.setSize(700, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();    
        frame.add(panel);
        placeComponents(panel);
        frame.setVisible(true);
	}
	
    
    public static void main(String[] args) {    
        // ���� JFrame ʵ��
//        JFrame frame = new JFrame("dateCount");
//        // Setting the width and height of frame
//        frame.setSize(700, 400);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        /* ������壬��������� HTML �� div ��ǩ
//         * ���ǿ��Դ��������岢�� JFrame ��ָ��λ��
//         * ��������ǿ�������ı��ֶΣ���ť�����������
//         */
//        JPanel panel = new JPanel();    
//        // ������
//        frame.add(panel);
//        /* 
//         * �����û�����ķ����������������
//         */
//        placeComponents(panel);
//
//        // ���ý���ɼ�
//        frame.setVisible(true);
       
    }

    private static void placeComponents(JPanel panel) {

        /* ���ֲ���������߲���������
         * ������ò���Ϊ null
         */
        panel.setLayout(null);

        // ���� JLabel
        JLabel userLabel = new JLabel("Year:");
        /* ������������������λ�á�
         * setBounds(x, y, width, height)
         * x �� y ָ�����Ͻǵ���λ�ã��� width �� height ָ���µĴ�С��
         */
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        /* 
         * �����ı��������û�����
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        // ����������ı���
        JLabel passwordLabel = new JLabel("Month:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        /* 
         *�����������������ı���
         * �����������Ϣ���Ե�Ŵ��棬���ڰ�������İ�ȫ��
         */
        JTextField passwordText = new JTextField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        
        
        JLabel dayLabel = new JLabel("Day:");
        dayLabel.setBounds(10,80,80,25);
        panel.add(dayLabel);

        /* 
         *�����������������ı���
         * �����������Ϣ���Ե�Ŵ��棬���ڰ�������İ�ȫ��
         */
        JTextField dayText = new JTextField(20);
        dayText.setBounds(100,80,165,25);
        panel.add(dayText);
        
        // ������¼��ť
        JButton loginButton = new JButton("judge");
        loginButton.setBounds(30, 120, 80, 25);
        panel.add(loginButton);
//        loginButton.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                // �����߼�������
//                System.out.println("�������¼�");
//            }
//        });
        loginButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				year=Integer.parseInt(userText.getText());
				month=Integer.parseInt(passwordText.getText());
				day=Integer.parseInt(dayText.getText());
				
				DateCount dateCount = new DateCount();
				
				String msg = "天数："+dateCount.calculate(year, month, day)+" 星期: "+dateCount.judge(year, month, day);
				if(dateCount.judge(year, month, day).equals("invalid")) {
					JOptionPane.showMessageDialog(null, "invalid date");
				}else {
				JOptionPane.showMessageDialog(null, msg);
				}
			}
        });
    }

}