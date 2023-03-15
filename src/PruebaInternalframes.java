import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class VentanaInicio extends JFrame{

	JMenuBar menuBar;
	JMenu masters,booking,testPerform,printing,transaction,labReports,settings,utilities,window,help;
	JMenuItem menuItemReg;
	JInternalFrame record;

	public VentanaInicio() {

		getContentPane().setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1080,630);
		setLocationRelativeTo(null);
		setTitle("InternalFrames");
		setVisible(true);

		menuBar = new JMenuBar();

			masters = new JMenu("Master");
				menuItemReg= new JMenuItem("Record");
				masters.add(menuItemReg);
				menuItemReg.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						record.setVisible(true);

					}
				});

			booking = new JMenu("Booking");
			testPerform = new JMenu("Test Perform");
			transaction = new JMenu("Transaction");
			labReports = new JMenu("Lab Reports");
			settings = new JMenu("Settings");
			window = new JMenu("Window");
			help = new JMenu("Help");

		menuBar.add(masters);
		menuBar.add(booking);
		menuBar.add(testPerform);
		menuBar.add(transaction);
		menuBar.add(labReports);
		menuBar.add(settings);
		menuBar.add(window);
		menuBar.add(help);
		setJMenuBar(menuBar);

		JDesktopPane dp = new JDesktopPane();

		record = new JInternalFrame();
		record.getContentPane().setLayout(null);
		record.setDefaultCloseOperation(HIDE_ON_CLOSE);
		record.setSize(1080, 630);
		record.setTitle("Record");


		dp.add(record);
		dp.setBounds(0, 0, 1080, 630);

		add(dp);

	}

}
public class PruebaInternalframes {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new VentanaInicio();
			}
		});
	}
	
}