package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm10 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtN1,txtN2,txtN3,txtN4,txtN5,txtMayor,txtMenor,txtPromedio,txtestado;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm10 frame = new frm10();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm10() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,450);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblN1= new JLabel("Nota 1:");
	    lblN1.setBounds(30,30,100,25);
	    getContentPane().add(lblN1);
	    
	    JLabel lblN2 = new JLabel("Nota 2:");
	    lblN2.setBounds(30,60,100,25);
	    getContentPane().add(lblN2);
	   
	    JLabel lblN3 = new JLabel("Nota 3:");
	    lblN3.setBounds(30,90,100,25);
	    getContentPane().add(lblN3);
	    
	    JLabel lblN4 = new JLabel("Nota 4:");
	    lblN4.setBounds(30,120,100,25);
	    getContentPane().add(lblN4);

	    JLabel lblN5 = new JLabel("Nota 5:");
	    lblN5.setBounds(30,150,100,25);
	    getContentPane().add(lblN5);

	    JLabel lblMayor = new JLabel("Numero mayor eliminada:");
	    lblMayor.setBounds(30,210,150,25);
	    getContentPane().add(lblMayor);
	    
	    JLabel lblMenor = new JLabel("Numero menor eliminada:");
	    lblMenor.setBounds(30,240,150,25);
	    getContentPane().add(lblMenor);
	    
	    JLabel lblestado = new JLabel("Condicion:");
	    lblestado.setBounds(30,270,120,25);
	    getContentPane().add(lblestado);
	    
	    JLabel lblpromedio = new JLabel("El promedio es:");
	    lblpromedio.setBounds(30,300,120,25);
	    getContentPane().add(lblpromedio);
	    
	    txtN1 = new JTextField();
	    txtN1.setBounds(100,30,100,25);
	    txtN1.setMargin(new Insets(2,5,2,5));
	    txtN1.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtN1);
	    
	    txtN2 = new JTextField();
	    txtN2.setBounds(100,60,100,25);
	    txtN2.setMargin(new Insets(2,5,2,5));
	    txtN2.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtN2);
	    
	    txtN3 = new JTextField();
	    txtN3.setBounds(100,90,100,25);
	    txtN3.setMargin(new Insets(2,5,2,5));
	    txtN3.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtN3);
	    
	    txtN4 = new JTextField();
	    txtN4.setBounds(100,120,100,25);
	    txtN4.setMargin(new Insets(2,5,2,5));
	    txtN4.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtN4);
	    
	    txtN5 = new JTextField();
	    txtN5.setBounds(100,150,100,25);
	    txtN5.setMargin(new Insets(2,5,2,5));
	    txtN5.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtN5);
	    
	    txtMayor = new JTextField();
	    txtMayor.setBounds(180,210,100,25);
	    txtMayor.setMargin(new Insets(2,5,2,5));
	    txtMayor.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtMayor);
	    
	    txtMenor = new JTextField();
	    txtMenor.setBounds(180,240,100,25);
	    txtMenor.setMargin(new Insets(2,5,2,5));
	    txtMenor.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtMenor);
	    
	    txtestado = new JTextField();
	    txtestado.setBounds(180,270,100,25);
	    txtestado.setMargin(new Insets(2,5,2,5));
	    txtestado.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtestado);
	    
	    txtPromedio = new JTextField();
	    txtPromedio.setBounds(180,300,100,25);
	    txtPromedio.setMargin(new Insets(2,5,2,5));
	    txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPromedio);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,180,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int nota1 = Integer.parseInt( txtN1.getText() );
		int nota2 = Integer.parseInt( txtN2.getText() );
		int nota3 =Integer.parseInt( txtN3.getText() );
		int nota4 =Integer.parseInt( txtN4.getText() );
		int nota5 =Integer.parseInt( txtN5.getText() );
		
		double mayor = Math.max(Math.max(Math.max(Math.max(nota1, nota2),nota3),nota4),nota5);
		double menor = Math.min(Math.min(Math.min(Math.min(nota1, nota2),nota3),nota4),nota5);
		
		ArrayList<Integer>orden = new ArrayList<Integer>();
		 orden.add(nota1);
		 orden.add(nota2);
		 orden.add(nota3);
		 orden.add(nota4);
		 orden.add(nota5);
		 
		 Collections.sort(orden);
		 double promedio = (orden.get(1)+ orden.get(2) + orden.get(3)) / 3;
		 
		 String c = " ";
		 if (promedio >= 11)c = "Aprobo";
		 else c = "Desaprobo";
		 txtestado.setText(c);
		DecimalFormat df = new DecimalFormat("##.00 ");
		txtMayor.setText( df.format(mayor) );
		txtMenor.setText( df.format(menor) );
		txtPromedio.setText( df.format(promedio) );
		}

}