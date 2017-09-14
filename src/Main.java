import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

@SuppressWarnings("serial")
public class Main extends JFrame {

	private JPanel contentPane;

	// Launches Application
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	// Creates the Frame
	public Main() {
		setTitle("Clever 323");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 250, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		// Button for Cameron
		JButton btnNewButton_1 = new JButton("Cameron Gomke");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});

		// .setbounds (x,y,w,h)
		btnNewButton_1.setBounds(15, 20, 200, 50);
		panel.add(btnNewButton_1);

		// Button for Cheyanne
		JButton btnNewButton = new JButton("Cheyanne Flickinger");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// new JFrame to fill with panel
				JFrame cheyFrame = new JFrame("Cheyanne");
				JPanel cheyPanel = new JPanel();

				// Can be any size- opens second window. (w,h)
				cheyFrame.setSize(250, 400);

				// Labels for information
				// Path must be relative to res folder!
				// src/res/nameoffile.extension
				JLabel cheyPic = new JLabel(new ImageIcon("src/res/cheyCat.png"));
				JLabel cheyName = new JLabel("•Name- Cheyanne Flickinger");
				JLabel cheyEducation = new JLabel("•Education- Media Arts | CSS Certificate");
				JLabel cheyJob = new JLabel("•Job Description- Makes things prettier");

				// adding to frame
				cheyFrame.add(cheyPanel);
				cheyPanel.add(cheyPic);
				cheyPanel.add(cheyName);
				cheyPanel.add(cheyEducation);
				cheyPanel.add(cheyJob);
				cheyFrame.setVisible(true);
			}
		});
		btnNewButton.setBounds(15, 80, 200, 50);
		panel.add(btnNewButton);

		// Button for Hank
		JButton btnNewButton_2 = new JButton("Hank LastName");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_2.setBounds(15, 140, 200, 50);
		panel.add(btnNewButton_2);

		// Button for Chase
		JButton btnNewButton_3 = new JButton("Chase LastName");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_3.setBounds(15, 200, 200, 50);
		panel.add(btnNewButton_3);

	}
}
