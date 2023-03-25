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


public class frm25 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtHijos,txtSueldo,txtBonificacion,txtSueldoneto;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm25 frame = new frm25();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm25() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblhijos= new JLabel("Hijos:");
	    lblhijos.setBounds(30,30,100,25);
	    getContentPane().add(lblhijos);
	    
	    JLabel lblsueldo = new JLabel("Sueldo:");
	    lblsueldo.setBounds(30,60,100,25);
	    getContentPane().add(lblsueldo);
	    
	    JLabel lblbonificacion = new JLabel("Bonificacion:");
	    lblbonificacion.setBounds(30,150,100,25);
	    getContentPane().add(lblbonificacion);
	    
	    JLabel lblsueldoneto = new JLabel("Sueldo neto:");
	    lblsueldoneto.setBounds(30,180,100,25);
	    getContentPane().add(lblsueldoneto);
	    
	    txtHijos = new JTextField();
	    txtHijos.setBounds(100,30,100,25);
	    txtHijos.setMargin(new Insets(2,5,2,5));
	    txtHijos.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtHijos);
	    
	    txtSueldo = new JTextField();
	    txtSueldo.setBounds(100,60,100,25);
	    txtSueldo.setMargin(new Insets(2,5,2,5));
	    txtSueldo.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtSueldo);
	    
	    txtBonificacion = new JTextField();
	    txtBonificacion.setBounds(120,150,100,25);
	    txtBonificacion.setMargin(new Insets(2,5,2,5));
	    txtBonificacion.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtBonificacion);
	    
	    txtSueldoneto = new JTextField();
	    txtSueldoneto.setBounds(120,180,100,25);
	    txtSueldoneto.setMargin(new Insets(2,5,2,5));
	    txtSueldoneto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtSueldoneto);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,90,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int hijos = Integer.parseInt( txtHijos.getText() );
		int sueldo = Integer.parseInt( txtSueldo.getText() );
		
		float bonificacion = (float)0.10 * sueldo;;
		float sueldoneto = bonificacion + sueldo;;
		if (hijos >= 1)bonificacion = (float)0.125 * sueldo + (40 * hijos);
		sueldoneto = bonificacion + sueldo;
	
	
		DecimalFormat df = new DecimalFormat("##.00 ");
		txtBonificacion.setText( df.format(bonificacion) );
		txtSueldoneto.setText( df.format(sueldoneto) );
		


				
		    
		}

}