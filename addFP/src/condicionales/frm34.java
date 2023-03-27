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


public class frm34 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtPeso,txtEstatura,txtCondicion,txtImc;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm34 frame = new frm34();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm34() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblestatura= new JLabel("Estatura:");
	    lblestatura.setBounds(30,30,100,25);
	    getContentPane().add(lblestatura);
	    
	    JLabel lblpeso = new JLabel("Peso:");
	    lblpeso.setBounds(30,60,100,25);
	    getContentPane().add(lblpeso);
	    
	    JLabel lblimc = new JLabel("IMC:");
	    lblimc.setBounds(30,150,150,25);
	    getContentPane().add(lblimc);
	    
	    JLabel lblcondicion = new JLabel("Condicion:");
	    lblcondicion.setBounds(30,180,150,25);
	    getContentPane().add(lblcondicion);
	    
	    txtEstatura = new JTextField();
	    txtEstatura.setBounds(120,30,100,25);
	    txtEstatura.setMargin(new Insets(2,5,2,5));
	    txtEstatura.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtEstatura);
	    
	    txtPeso = new JTextField();
	    txtPeso.setBounds(120,60,100,25);
	    txtPeso.setMargin(new Insets(2,5,2,5));
	    txtPeso.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPeso);
	    
	    txtImc = new JTextField();
	    txtImc.setBounds(120,150,100,25);
	    txtImc.setMargin(new Insets(2,5,2,5));
	    txtImc.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtImc);
	    
	    txtCondicion = new JTextField();
	    txtCondicion.setBounds(120,180,100,25);
	    txtCondicion.setMargin(new Insets(2,5,2,5));
	    txtCondicion.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCondicion);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,90,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		float peso = Integer.parseInt( txtPeso.getText() );
		float estatura = Float.parseFloat( txtEstatura.getText() );
		
		double imc =(float) peso / (estatura * estatura);
		
           String grado = "";
           if (imc < 20) grado = "delgado";
		   else if (imc > 20 && imc < 25)grado = "Normal";
		   else if (imc > 25 && imc < 27)grado = "Sobrepeso";
		   else grado = "obesidad";
				    

		   txtCondicion.setText(grado);
		    DecimalFormat df = new DecimalFormat("##.00 ");
		    txtImc.setText( df.format(imc) );
			    
		}

}