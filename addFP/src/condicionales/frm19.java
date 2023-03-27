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


public class frm19 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtGenero,txtEdad,txtEstado,txtCategoria;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm19 frame = new frm19();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm19() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblgenero= new JLabel("Genero:");
	    lblgenero.setBounds(30,30,100,25);
	    getContentPane().add(lblgenero);
	    
	    JLabel lbledad = new JLabel("Edad:");
	    lbledad.setBounds(30,60,100,25);
	    getContentPane().add(lbledad);
	    
	    JLabel lblestado = new JLabel("Estado:");
	    lblestado.setBounds(30,150,100,25);
	    getContentPane().add(lblestado);
	    
	    JLabel lblcategoria = new JLabel("Categoria:");
	    lblcategoria.setBounds(30,180,100,25);
	    getContentPane().add(lblcategoria);
	    
	    txtGenero = new JTextField();
	    txtGenero.setBounds(100,30,100,25);
	    txtGenero.setMargin(new Insets(2,5,2,5));
	    txtGenero.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtGenero);
	    
	    txtEdad = new JTextField();
	    txtEdad.setBounds(100,60,100,25);
	    txtEdad.setMargin(new Insets(2,5,2,5));
	    txtEdad.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtEdad);
	    
	    txtEstado = new JTextField();
	    txtEstado.setBounds(100,150,100,25);
	    txtEstado.setMargin(new Insets(2,5,2,5));
	    txtEstado.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtEstado);
	    
	    txtCategoria = new JTextField();
	    txtCategoria.setBounds(100,180,100,25);
	    txtCategoria.setMargin(new Insets(2,5,2,5));
	    txtCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCategoria);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,90,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int genero = Integer.parseInt( txtGenero.getText() );
		int edad = Integer.parseInt( txtEdad.getText() );
		
		String d = "";
		if (genero == 1)d = "Femenino";
		else if (genero == 2) d = "Masculino"; 
		txtEstado.setText(d);
		
		String categoria= "";
		if (genero ==1 &&edad <= 23)categoria = "FA";   
		else if (genero==1 && edad >=24)categoria = "FB";
		    
		
		if (genero==2 && edad <= 25)categoria = "MA";
		else if (genero == 2 && edad>= 26) categoria = "MB";
		     
		txtCategoria.setText(categoria);
		
		}

}