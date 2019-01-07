package raw;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField; 
public class Input extends JFrame{
	static int year;
	static int month;
	static int day;
	
	 public Input() {
		setTitle("dateCount");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();    
        add(panel);
        placeComponents(panel);
        setVisible(true);
	}
	
    
    public static void main(String[] args) {    
        // 锟斤拷锟斤拷 JFrame 实锟斤拷
//        JFrame frame = new JFrame("dateCount");
//        // Setting the width and height of frame
//        frame.setSize(700, 400);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        /* 锟斤拷锟斤拷锟斤拷澹拷锟斤拷锟斤拷锟斤拷锟斤拷 HTML 锟斤拷 div 锟斤拷签
//         * 锟斤拷锟角匡拷锟皆达拷锟斤拷锟斤拷锟斤拷锟藉并锟斤拷 JFrame 锟斤拷指锟斤拷位锟斤拷
//         * 锟斤拷锟斤拷锟斤拷锟斤拷强锟斤拷锟斤拷锟斤拷锟侥憋拷锟街段ｏ拷锟斤拷钮锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟�
//         */
//        JPanel panel = new JPanel();    
//        // 锟斤拷锟斤拷锟斤拷
//        frame.add(panel);
//        /* 
//         * 锟斤拷锟斤拷锟矫伙拷锟斤拷锟斤拷姆锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷
//         */
//        placeComponents(panel);
//
//        // 锟斤拷锟矫斤拷锟斤拷杉锟�
//        frame.setVisible(true);
    	new Input();
       
    }

    private static void placeComponents(JPanel panel) {

        /* 锟斤拷锟街诧拷锟斤拷锟斤拷锟斤拷锟斤拷卟锟斤拷锟斤拷锟斤拷锟斤拷锟�
         * 锟斤拷锟斤拷锟斤拷貌锟斤拷锟轿� null
         */
        panel.setLayout(null);

        // 锟斤拷锟斤拷 JLabel
        JLabel userLabel = new JLabel("Year:");
        /* 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷位锟矫★拷
         * setBounds(x, y, width, height)
         * x 锟斤拷 y 指锟斤拷锟斤拷锟较角碉拷锟斤拷位锟矫ｏ拷锟斤拷 width 锟斤拷 height 指锟斤拷锟铰的达拷小锟斤拷
         */
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        /* 
         * 锟斤拷锟斤拷锟侥憋拷锟斤拷锟斤拷锟斤拷锟矫伙拷锟斤拷锟斤拷
         */
        JTextField userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        userText.setName("year");
        panel.add(userText);

        // 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷谋锟斤拷锟�
        JLabel passwordLabel = new JLabel("Month:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        /* 
         *锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟侥憋拷锟斤拷
         * 锟斤拷锟斤拷锟斤拷锟斤拷锟斤拷锟较拷锟斤拷缘锟脚达拷锟芥，锟斤拷锟节帮拷锟斤拷锟斤拷锟斤拷陌锟饺拷锟�
         */
        JTextField passwordText = new JTextField(20);
        passwordText.setBounds(100,50,165,25);
        passwordText.setName("month");
        panel.add(passwordText);

        
        
        JLabel dayLabel = new JLabel("Day:");
        dayLabel.setBounds(10,80,80,25);
        panel.add(dayLabel);


        JTextField dayText = new JTextField(20);
        dayText.setBounds(100,80,165,25);
        dayText.setName("day");
        panel.add(dayText);
        
        // 锟斤拷锟斤拷锟斤拷录锟斤拷钮
        JButton loginButton = new JButton("judge");
        loginButton.setBounds(30, 120, 80, 25);
        loginButton.setName("judge");
        panel.add(loginButton);

        loginButton.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				year=Integer.parseInt(userText.getText());
				month=Integer.parseInt(passwordText.getText());
				day=Integer.parseInt(dayText.getText());
				
				DateCount dateCount = new DateCount();
				
				String msg;
				try {
					msg = "Days: "+dateCount.calculate(year, month, day)+" Week: "+dateCount.judge(year, month, day)+" Daysbetween:"+dateCount.calculateTotalDays(year,month,day);

					if(dateCount.judge(year, month, day).equals("invalid")) {
						JOptionPane.showMessageDialog(null, "invalid date");
					}else {
					JOptionPane.showMessageDialog(null, msg);
					}
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
//				String msg = "Days: "+dateCount.calculate(year, month, day)+" Week: "+dateCount.judge(year, month, day)+" Daysbetween:"+dateCount.calculateTotalDays(year,month,day);
			}
        });
    }

}