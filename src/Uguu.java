import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Choice;
import java.awt.TextField;
import java.awt.Label;
import java.awt.Font;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeEvent;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class Uguu {

	double[] framemults = new double[10];//Pursuit,A,B,C,D,E,F,G,H,I in that order.
	double total;
	String[] CurrentChips = new String[6];
	public String Logdata = "";
	
	public void calculateshit()
	{
		System.out.println("Hello World");//Shows that the function is properly called, nothing broke.
		
		//Set everything to redundant multipliers first;
		total = 1;
		Logdata = Logdata + "\nTotal reset.";
		for(int i=0;i<framemults.length;i++)
		{
			framemults[i] = 1; 
		}
		Logdata = Logdata + "\nFrame Multipliers reset.";
		
		//Run calculations here, one single function for everything to call.
		Logdata = Logdata + "\nCalculations Block Finished.";
		
		//Multiply all frames together afterwards.
		for(int i=0;i<framemults.length;i++)
		{
			total = total * framemults[i];
		}
		Logdata = Logdata + "\nTotal set.";
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
		
		TextField AMult = new TextField();
		AMult.setText("1.0");
		AMult.setFont(new Font("Dialog", Font.PLAIN, 14));
		AMult.setEditable(false);
		AMult.setBounds(61, 229, 45, 22);
		frame.getContentPane().add(AMult);
		
		Label label = new Label("A");
		label.setBounds(75, 201, 22, 22);
		frame.getContentPane().add(label);
		
		TextField BMult = new TextField();
		BMult.setFont(new Font("Dialog", Font.PLAIN, 14));
		BMult.setText("1.0");
		BMult.setEditable(false);
		BMult.setBounds(112, 229, 45, 22);
		frame.getContentPane().add(BMult);
		
		Label label_1 = new Label("B");
		label_1.setBounds(126, 201, 22, 22);
		frame.getContentPane().add(label_1);
		
		TextField CMult = new TextField();
		CMult.setText("1.0");
		CMult.setFont(new Font("Dialog", Font.PLAIN, 14));
		CMult.setEditable(false);
		CMult.setBounds(163, 229, 45, 22);
		frame.getContentPane().add(CMult);
		
		Label label_2 = new Label("C");
		label_2.setBounds(177, 201, 22, 22);
		frame.getContentPane().add(label_2);
		
		TextField DMult = new TextField();
		DMult.setText("1.0");
		DMult.setFont(new Font("Dialog", Font.PLAIN, 14));
		DMult.setEditable(false);
		DMult.setBounds(214, 229, 45, 22);
		frame.getContentPane().add(DMult);
		
		Label label_3 = new Label("D");
		label_3.setBounds(228, 201, 22, 22);
		frame.getContentPane().add(label_3);
		
		TextField PursuitMult = new TextField();
		PursuitMult.setFont(new Font("Dialog", Font.PLAIN, 14));
		PursuitMult.setText("1.0");
		PursuitMult.setEditable(false);
		PursuitMult.setBounds(10, 229, 45, 22);
		frame.getContentPane().add(PursuitMult);
		
		Label label_4 = new Label("Pursuit");
		label_4.setBounds(10, 201, 37, 22);
		frame.getContentPane().add(label_4);
		
		TextField EMult = new TextField();
		EMult.setText("1.0");
		EMult.setFont(new Font("Dialog", Font.PLAIN, 14));
		EMult.setEditable(false);
		EMult.setBounds(265, 229, 45, 22);
		frame.getContentPane().add(EMult);
		
		Label label_5 = new Label("E");
		label_5.setBounds(279, 201, 22, 22);
		frame.getContentPane().add(label_5);
		
		TextField FMult = new TextField();
		FMult.setText("1.0");
		FMult.setFont(new Font("Dialog", Font.PLAIN, 14));
		FMult.setEditable(false);
		FMult.setBounds(316, 229, 45, 22);
		frame.getContentPane().add(FMult);
		
		Label label_6 = new Label("F");
		label_6.setBounds(330, 201, 22, 22);
		frame.getContentPane().add(label_6);
		
		TextField GMult = new TextField();
		GMult.setText("1.0");
		GMult.setFont(new Font("Dialog", Font.PLAIN, 14));
		GMult.setEditable(false);
		GMult.setBounds(367, 229, 45, 22);
		frame.getContentPane().add(GMult);
		
		Label label_7 = new Label("G");
		label_7.setBounds(381, 201, 22, 22);
		frame.getContentPane().add(label_7);
		
		TextField HMult = new TextField();
		HMult.setFont(new Font("Dialog", Font.PLAIN, 14));
		HMult.setText("1.0");
		HMult.setEditable(false);
		HMult.setBounds(418, 229, 45, 22);
		frame.getContentPane().add(HMult);
		
		Label label_8 = new Label("H");
		label_8.setBounds(432, 201, 22, 22);
		frame.getContentPane().add(label_8);
		
		TextField TotalMult = new TextField();
		TotalMult.setEditable(false);
		TotalMult.setBounds(545, 229, 45, 22);
		frame.getContentPane().add(TotalMult);
		
		
		Label label_9 = new Label("Total");
		label_9.setBounds(545, 201, 36, 22);
		frame.getContentPane().add(label_9);
		
		Choice SPChoice = new Choice();
		SPChoice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
				calculateshit();
				TotalMult.setText(Double.toString(total));
			}
		});
		SPChoice.add("Test1");
		SPChoice.add("Test2");
		SPChoice.setBounds(10, 108, 81, 20);
		frame.getContentPane().add(SPChoice);
		
		Choice Secondchoice = new Choice();
		Secondchoice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				calculateshit();
				TotalMult.setText(Double.toString(total));
			}
		});
		Secondchoice.setBounds(120, 108, 81, 20);
		frame.getContentPane().add(Secondchoice);
		
		Choice Thirdchoice = new Choice();
		Thirdchoice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				calculateshit();
				TotalMult.setText(Double.toString(total));
			}
		});
		Thirdchoice.setBounds(211, 108, 81, 20);
		frame.getContentPane().add(Thirdchoice);
		
		Choice Fourthchoice = new Choice();
		Fourthchoice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				calculateshit();
				TotalMult.setText(Double.toString(total));
			}
		});
		Fourthchoice.setBounds(302, 108, 81, 20);
		frame.getContentPane().add(Fourthchoice);
		
		Choice Fifthchoice = new Choice();
		Fifthchoice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				calculateshit();
				TotalMult.setText(Double.toString(total));
			}
		});
		Fifthchoice.setBounds(393, 108, 81, 20);
		frame.getContentPane().add(Fifthchoice);
		
		Choice Friendchoice = new Choice();
		Friendchoice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				calculateshit();
				TotalMult.setText(Double.toString(total));
			}
		});
		Friendchoice.setBounds(509, 108, 81, 20);
		frame.getContentPane().add(Friendchoice);
		
		
	}
}
