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


public class frm08 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtEx1,txtEx2,txtEx3,txtPropina;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm08 frame = new frm08();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm08() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblEx1= new JLabel("Examen 1:");
	    lblEx1.setBounds(30,30,100,25);
	    getContentPane().add(lblEx1);
	    
	    JLabel lblEx2 = new JLabel("Examen 2:");
	    lblEx2.setBounds(30,60,100,25);
	    getContentPane().add(lblEx2);
	   
	    JLabel lblEx3 = new JLabel("Examen 3:");
	    lblEx3.setBounds(30,90,100,25);
	    getContentPane().add(lblEx3);
	    
	    JLabel lblPROPINA = new JLabel("Propina:");
	    lblPROPINA.setBounds(30,180,100,25);
	    getContentPane().add(lblPROPINA);
	    
	    txtEx1 = new JTextField();
	    txtEx1.setBounds(100,30,100,25);
	    txtEx1.setMargin(new Insets(2,5,2,5));
	    txtEx1.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtEx1);
	    
	    txtEx2 = new JTextField();
	    txtEx2.setBounds(100,60,100,25);
	    txtEx2.setMargin(new Insets(2,5,2,5));
	    txtEx2.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtEx2);
	    
	    txtEx3 = new JTextField();
	    txtEx3.setBounds(100,90,100,25);
	    txtEx3.setMargin(new Insets(2,5,2,5));
	    txtEx3.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtEx3);
	    
	    txtPropina = new JTextField();
	    txtPropina.setBounds(100,180,100,25);
	    txtPropina.setMargin(new Insets(2,5,2,5));
	    txtPropina.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPropina);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,120,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int edad1 = Integer.parseInt( txtEx1.getText() );
		int edad2 = Integer.parseInt( txtEx2.getText() );
		int edad3 =Integer.parseInt( txtEx3.getText() );
		
		int propina = 20;
		if (edad1 > 10)propina += 5;
		if (edad2 > 10)propina += 5;
		if (edad3 >10)propina += 5;
		
		DecimalFormat df = new DecimalFormat("##.00 ");
		txtPropina.setText( df.format(propina) );
		
		
		}

}