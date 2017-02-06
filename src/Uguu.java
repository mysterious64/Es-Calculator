import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Choice;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Font;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;

public class Uguu {

	double[] framemults = new double[10];//Pursuit,A,B,C,D,E,F,G,H,I in that order.
	double total;
	String[] CurrentChips = new String[6];
	
	public void calculateshit()
	{
		total = 1;
		for(int i=0;i<framemults.length;i++)
		{
			framemults[i] = 1; //Set everything to redundant multipliers first;
		}
		//Run calculations here, one single function for everything to call.
		
		for(int i=0;i<framemults.length;i++)
		{
			total = total * framemults[i];
		}
	}
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Uguu window = new Uguu();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Uguu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 616, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel SPPanel = new JPanel();
		SPPanel.setBounds(10, 21, 81, 81);
		frame.getContentPane().add(SPPanel);
		
		JPanel SecondPlaceholder = new JPanel();
		SecondPlaceholder.setBounds(120, 21, 81, 81);
		frame.getContentPane().add(SecondPlaceholder);
		
		JPanel ThirdPlaceholder = new JPanel();
		ThirdPlaceholder.setBounds(211, 21, 81, 81);
		frame.getContentPane().add(ThirdPlaceholder);
		
		JPanel FourthPlaceholder = new JPanel();
		FourthPlaceholder.setBounds(302, 21, 81, 81);
		frame.getContentPane().add(FourthPlaceholder);
		
		JPanel FifthPlaceholder = new JPanel();
		FifthPlaceholder.setBounds(393, 21, 81, 81);
		frame.getContentPane().add(FifthPlaceholder);
		
		JPanel FriendPlaceholder = new JPanel();
		FriendPlaceholder.setBounds(509, 21, 81, 81);
		frame.getContentPane().add(FriendPlaceholder);
		
		Choice SPChoice = new Choice();
		SPChoice.addPropertyChangeListener(new PropertyChangeListener() {
			public void propertyChange(PropertyChangeEvent arg0) {
				
			}
		});
		SPChoice.setBounds(10, 108, 81, 20);
		frame.getContentPane().add(SPChoice);
		
		Choice Secondchoice = new Choice();
		Secondchoice.setBounds(120, 108, 81, 20);
		frame.getContentPane().add(Secondchoice);
		
		Choice Thirdchoice = new Choice();
		Thirdchoice.setBounds(211, 108, 81, 20);
		frame.getContentPane().add(Thirdchoice);
		
		Choice Fourthchoice = new Choice();
		Fourthchoice.setBounds(302, 108, 81, 20);
		frame.getContentPane().add(Fourthchoice);
		
		Choice Fifthchoice = new Choice();
		Fifthchoice.setBounds(393, 108, 81, 20);
		frame.getContentPane().add(Fifthchoice);
		
		Choice Friendchoice = new Choice();
		Friendchoice.setBounds(509, 108, 81, 20);
		frame.getContentPane().add(Friendchoice);
		
		TextField textField = new TextField();
		textField.setText("100");
		textField.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField.setEditable(false);
		textField.setBounds(61, 229, 45, 22);
		frame.getContentPane().add(textField);
		
		Label label = new Label("A");
		label.setBounds(75, 201, 22, 22);
		frame.getContentPane().add(label);
		
		TextField textField_1 = new TextField();
		textField_1.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_1.setText("100");
		textField_1.setEditable(false);
		textField_1.setBounds(112, 229, 45, 22);
		frame.getContentPane().add(textField_1);
		
		Label label_1 = new Label("B");
		label_1.setBounds(126, 201, 22, 22);
		frame.getContentPane().add(label_1);
		
		TextField textField_2 = new TextField();
		textField_2.setText("100");
		textField_2.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_2.setEditable(false);
		textField_2.setBounds(163, 229, 45, 22);
		frame.getContentPane().add(textField_2);
		
		Label label_2 = new Label("C");
		label_2.setBounds(177, 201, 22, 22);
		frame.getContentPane().add(label_2);
		
		TextField textField_3 = new TextField();
		textField_3.setText("100");
		textField_3.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_3.setEditable(false);
		textField_3.setBounds(214, 229, 45, 22);
		frame.getContentPane().add(textField_3);
		
		Label label_3 = new Label("D");
		label_3.setBounds(228, 201, 22, 22);
		frame.getContentPane().add(label_3);
		
		TextField textField_4 = new TextField();
		textField_4.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_4.setText("100");
		textField_4.setEditable(false);
		textField_4.setBounds(10, 229, 45, 22);
		frame.getContentPane().add(textField_4);
		
		Label label_4 = new Label("Pursuit");
		label_4.setBounds(10, 201, 37, 22);
		frame.getContentPane().add(label_4);
		
		TextField textField_5 = new TextField();
		textField_5.setText("100");
		textField_5.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_5.setEditable(false);
		textField_5.setBounds(265, 229, 45, 22);
		frame.getContentPane().add(textField_5);
		
		Label label_5 = new Label("E");
		label_5.setBounds(279, 201, 22, 22);
		frame.getContentPane().add(label_5);
		
		TextField textField_6 = new TextField();
		textField_6.setText("100");
		textField_6.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_6.setEditable(false);
		textField_6.setBounds(316, 229, 45, 22);
		frame.getContentPane().add(textField_6);
		
		Label label_6 = new Label("F");
		label_6.setBounds(330, 201, 22, 22);
		frame.getContentPane().add(label_6);
		
		TextField textField_7 = new TextField();
		textField_7.setText("100");
		textField_7.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_7.setEditable(false);
		textField_7.setBounds(367, 229, 45, 22);
		frame.getContentPane().add(textField_7);
		
		Label label_7 = new Label("G");
		label_7.setBounds(381, 201, 22, 22);
		frame.getContentPane().add(label_7);
		
		TextField textField_8 = new TextField();
		textField_8.setFont(new Font("Dialog", Font.PLAIN, 14));
		textField_8.setText("100");
		textField_8.setEditable(false);
		textField_8.setBounds(418, 229, 45, 22);
		frame.getContentPane().add(textField_8);
		
		Label label_8 = new Label("H");
		label_8.setBounds(432, 201, 22, 22);
		frame.getContentPane().add(label_8);
		
		TextField textField_9 = new TextField();
		textField_9.setEditable(false);
		textField_9.setBounds(545, 229, 45, 22);
		frame.getContentPane().add(textField_9);
		
		Label label_9 = new Label("Total");
		label_9.setBounds(545, 201, 36, 22);
		frame.getContentPane().add(label_9);
	}
}
