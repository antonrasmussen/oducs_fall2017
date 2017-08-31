import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class RunAnywhere extends JPanel 
{

	protected JButton button;

	public RunAnywhere() {

		add (new JLabel("Write once, "));
		button = new JButton("run");
		add (button, BorderLayout.CENTER);
		add (new JLabel(" anywhere."));

		button.addActionListener(
				new ActionListener() {
					
					public void actionPerformed(ActionEvent e) {
						Color newColor = JColorChooser.showDialog(
			                     RunAnywhere.this,
			                     "Choose a Color",
			                     button.getBackground());
						if (newColor != null)
							button.setBackground(newColor);
					}
				}
		);

	}


	/**
	 * Create the GUI and show it.  For thread safety,
	 * this method should be invoked from the
	 * event-dispatching thread.
	 */
	private static void createAndShowGUI() {
		//Create and set up the window.
		JFrame frame = new JFrame("RunAnywhere");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		//Create and set up the content pane.
		JComponent newContentPane = new RunAnywhere();
		newContentPane.setOpaque(true); //content panes must be opaque
		frame.setContentPane(newContentPane);

		//Display the window.
		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		//Schedule a job for the event-dispatching thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}	

