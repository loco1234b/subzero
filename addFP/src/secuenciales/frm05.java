package secuenciales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm05 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtGigabytes,txtMegabytes,txtKilobytes,txtBytes;
	JLabel lblGigabytes,lblMegabytes,lblKilobytes,lblBytes;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm05 frame = new frm05();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm05() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblGigabytes = new JLabel("Gigabytes:");
	    lblGigabytes.setBounds(30,30,80,25);
	    getContentPane().add(lblGigabytes);
	    
	    JLabel lblMegabytes = new JLabel("Megabytes:");
	    lblMegabytes.setBounds(30,120,80,25);
	    getContentPane().add(lblMegabytes);
	    
	    JLabel lblKilobytes = new JLabel("Kilobytes:");
	    lblKilobytes.setBounds(30,150,80,25);
	    getContentPane().add(lblKilobytes);
	    
	    JLabel lblBytes = new JLabel("Bytes:");
	    lblBytes.setBounds(30,180,80,25);
	    getContentPane().add(lblBytes);
	    
	    txtGigabytes = new JTextField();
	    txtGigabytes.setBounds(100,30,150,25);
	    txtGigabytes.setMargin(new Insets(2,5,2,5));
	    txtGigabytes.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtGigabytes);
	    
	    txtMegabytes = new JTextField();
	    txtMegabytes.setBounds(100,120,150,25);
	    txtMegabytes.setFocusable(false);
	    txtMegabytes.setMargin(new Insets(2,5,2,5));
	    txtMegabytes.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtMegabytes);
	    
	    txtKilobytes = new JTextField();
	    txtKilobytes.setBounds(100,150,150,25);
	    txtKilobytes.setFocusable(false);
	    txtKilobytes.setMargin(new Insets(2,5,2,5));
	    txtKilobytes.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtKilobytes);
	    
	    txtBytes = new JTextField();
	    txtBytes.setBounds(100,180,150,25);
	    txtBytes.setFocusable(false);
	    txtBytes.setMargin(new Insets(2,5,2,5));
	    txtBytes.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtBytes);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int gigabytes= Integer.parseInt( txtGigabytes.getText() );
		
		
		double megabytes = gigabytes * 1024;
		double kilobytes = megabytes * 1024;
		double bytes = kilobytes * 1024;
		
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtMegabytes.setText( df.format(megabytes) );
		txtKilobytes.setText( df.format(kilobytes) );
		txtBytes.setText( df.format(bytes) );
		}

}
