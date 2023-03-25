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


public class frm21 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtNumero,txtEstado,txtEdad,txtGenero;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm21 frame = new frm21();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm21() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblnumero= new JLabel("Numero:");
	    lblnumero.setBounds(30,30,120,25);
	    getContentPane().add(lblnumero);
	    
	    JLabel lblestado = new JLabel("Estado civil:");
	    lblestado.setBounds(30,120,120,25);
	    getContentPane().add(lblestado);
	    
	    JLabel lbledad = new JLabel("Edad:");
	    lbledad.setBounds(30,150,120,25);
	    getContentPane().add(lbledad);
	    
	    JLabel lblgenero = new JLabel("Genero:");
	    lblgenero.setBounds(30,180,120,25);
	    getContentPane().add(lblgenero);
	    
	    txtNumero = new JTextField();
	    txtNumero.setBounds(100,30,100,25);
	    txtNumero.setMargin(new Insets(2,5,2,5));
	    txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero);
	    
	    txtEstado = new JTextField();
	    txtEstado.setBounds(100,120,100,25);
	    txtEstado.setMargin(new Insets(2,5,2,5));
	    txtEstado.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtEstado);
	    
	    txtEdad = new JTextField();
	    txtEdad.setBounds(100,150,100,25);
	    txtEdad.setMargin(new Insets(2,5,2,5));
	    txtEdad.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtEdad);
	    
	    txtGenero = new JTextField();
	    txtGenero.setBounds(100,180,100,25);
	    txtGenero.setMargin(new Insets(2,5,2,5));
	    txtGenero.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtGenero);
	   
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt( txtNumero.getText() );
		double estadocivil=(numero % 10000- numero % 1000)/1000;
		String c = "";
		if (estadocivil==1)c= "Soltero";	   
		else if (estadocivil==2)c = "Casado";
		else if (estadocivil==3)c = "Divorciado";	    
		else if (estadocivil==4)c= "Viudo";
		else c = "ERROR";
		txtEstado.setText(c);
		
	
	    double sexo= numero % 10;
	    String d = "";
		if (sexo==1)d=" Femenino";	    
		else if (sexo==2)d=" Masculino";
		else d= "ERROR";
		txtGenero.setText(d);
		
		double edad=(numero % 1000-numero % 10)/10;
		DecimalFormat df = new DecimalFormat("##.##");
		txtEdad.setText(df.format(edad));
				    


				
		    
		}

}