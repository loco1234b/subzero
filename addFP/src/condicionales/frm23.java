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


public class frm23 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtMatematica,txtFisica,txtPropina,txtPropina1,txtsuma,txtpromedio,txtReloj;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm23 frame = new frm23();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm23() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblmatematica= new JLabel("Matematica:");
	    lblmatematica.setBounds(30,30,150,25);
	    getContentPane().add(lblmatematica);
	    
	    JLabel lblfisica = new JLabel("Fisica:");
	    lblfisica.setBounds(30,60,150,25);
	    getContentPane().add(lblfisica);
	    
	    JLabel lblpropina = new JLabel("Propina matematica:");
	    lblpropina.setBounds(30,150,150,25);
	    getContentPane().add(lblpropina);
	    
	    JLabel lblpropina1 = new JLabel("Propina fisica:");
	    lblpropina1.setBounds(30,180,150,25);
	    getContentPane().add(lblpropina1);
	    
	    JLabel lbltotal = new JLabel("Propina Total:");
	    lbltotal.setBounds(30,210,150,25);
	    getContentPane().add(lbltotal);
	    
	    JLabel lblpromedio= new JLabel("Promedio:");
	    lblpromedio.setBounds(30,240,150,25);
	    getContentPane().add(lblpromedio);
	    
	    JLabel lblreloj = new JLabel("Reloj:");
	    lblreloj.setBounds(30,270,120,25);
	    getContentPane().add(lblreloj);
	    
	    txtMatematica = new JTextField();
	    txtMatematica.setBounds(150,30,100,25);
	    txtMatematica.setMargin(new Insets(2,5,2,5));
	    txtMatematica.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtMatematica);
	    
	    txtFisica = new JTextField();
	    txtFisica.setBounds(150,60,100,25);
	    txtFisica.setMargin(new Insets(2,5,2,5));
	    txtFisica.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtFisica);
	    
	    txtPropina = new JTextField();
	    txtPropina.setBounds(150,150,100,25);
	    txtPropina.setMargin(new Insets(2,5,2,5));
	    txtPropina.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPropina);
	    
	    txtPropina1 = new JTextField();
	    txtPropina1.setBounds(150,180,100,25);
	    txtPropina1.setMargin(new Insets(2,5,2,5));
	    txtPropina1.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPropina1);
	    
	    txtsuma = new JTextField();
	    txtsuma.setBounds(150,210,100,25);
	    txtsuma.setMargin(new Insets(2,5,2,5));
	    txtsuma.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtsuma);
	    
	    txtpromedio = new JTextField();
	    txtpromedio.setBounds(150,240,100,25);
	    txtpromedio.setMargin(new Insets(2,5,2,5));
	    txtpromedio.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtpromedio);
	    
	    txtReloj = new JTextField();
	    txtReloj.setBounds(150,270,100,25);
	    txtReloj.setMargin(new Insets(2,5,2,5));
	    txtReloj.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtReloj);
	    
	   
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,90,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int matematica = Integer.parseInt( txtMatematica.getText() );
		int fisica = Integer.parseInt( txtFisica.getText() );
		float propina = 0;
		if (matematica >= 17)propina = 3;
		else propina = 1;
		    
        float propina1 = 0;
		if (fisica >= 15)propina1 = 2;
		else propina1 = (float) 0.50;

		double promedio = (matematica + fisica) / 2;
        int reloj = 0;
		if (promedio >= 16)reloj = 1;
		else reloj = 0;
		    
		
		DecimalFormat df = new DecimalFormat("##.00 ");
		txtPropina.setText( df.format(propina) );
		txtPropina1.setText( df.format(propina1) );
		txtsuma.setText( df.format(propina + propina1) );
		txtpromedio.setText( df.format(promedio) );
		txtReloj.setText( df.format(reloj) );


				
		    
		}

}