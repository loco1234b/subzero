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


public class frm01 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtVarones, txtMujeres;
	JLabel lblPVarones, lblPMujeres;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm01 frame = new frm01();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public frm01() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,250,200);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblVarones = new JLabel("Varones:");
	    lblVarones.setBounds(30,30,80,25);
	    getContentPane().add(lblVarones);
	    
	    JLabel lblMujeres = new JLabel("Mujeres:");
	    lblMujeres.setBounds(30,60,80,25);
	    getContentPane().add(lblMujeres);
	    
	    lblPVarones = new JLabel();
	    lblPVarones.setBounds(160,30,80,30);
	    getContentPane().add(lblPVarones);
	    
	    lblPMujeres = new JLabel();
	    lblPMujeres.setBounds(160,60,80,30);
	    getContentPane().add(lblPMujeres);
	    
	    txtVarones = new JTextField();
	    txtVarones.setBounds(100,30,50,25);
	    txtVarones.setMargin(new Insets(2,5,2,5));
	    txtVarones.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtVarones);
	    
	    txtMujeres = new JTextField();
	    txtMujeres.setBounds(100,60,50,25);
	    txtMujeres.setMargin(new Insets(2,5,2,5));
	    txtMujeres.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtMujeres);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(60,110,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int varones = Integer.parseInt( txtVarones.getText() );
		int mujeres = Integer.parseInt( txtMujeres.getText() );
		
		int total = varones + mujeres;
		double pvarones = varones * 100 / total;
		double pmujeres = mujeres * 100 / total;
		
		DecimalFormat df = new DecimalFormat("##.00");
		lblPVarones.setText( df.format(pvarones) + "%" );
		lblPMujeres.setText( df.format(pmujeres) + "%" );
		}

}
