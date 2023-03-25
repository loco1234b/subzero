package condicionales;

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


public class frm24 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtMonto,txtSueldo;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm24 frame = new frm24();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm24() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblmonto= new JLabel("Monto:");
	    lblmonto.setBounds(30,30,100,25);
	    getContentPane().add(lblmonto);
	    
	    JLabel lblsueldo = new JLabel("Sueldo:");
	    lblsueldo.setBounds(30,120,100,25);
	    getContentPane().add(lblsueldo);
	    
	    txtMonto = new JTextField();
	    txtMonto.setBounds(100,30,100,25);
	    txtMonto.setMargin(new Insets(2,5,2,5));
	    txtMonto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtMonto);
	    
	    txtSueldo = new JTextField();
	    txtSueldo.setBounds(100,120,100,25);
	    txtSueldo.setMargin(new Insets(2,5,2,5));
	    txtSueldo.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtSueldo);
	    
	    
	   
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int monto = Integer.parseInt( txtMonto.getText() );
		float sueldo = 0;
		if (monto >=5000)sueldo = (float)0.10 * monto + 25 * ( monto / 500);
		else sueldo =(float) 0.10 * monto;    
		
		DecimalFormat df = new DecimalFormat("##.00 ");
		txtSueldo.setText( df.format(sueldo) );
		


				
		    
		}

}