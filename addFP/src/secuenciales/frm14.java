package secuenciales;

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


public class frm14 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtNm1,txtNumero2,txtNumero3,txtNumero4,txtNumero5,txtPromedio;
	JLabel lblNumero1,lblNumero2,lblNumero3,lblNumero4,lblNumero5,lblMayor,lblPromedio;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm14 frame = new frm14();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm14() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblNumero1 = new JLabel("Numero 1:");
	    lblNumero1.setBounds(30,30,80,25);
	    getContentPane().add(lblNumero1);
	    
	    JLabel lblNumero2 = new JLabel("Numero 2:");
	    lblNumero2.setBounds(30,60,80,25);
	    getContentPane().add(lblNumero2);
	    
	    JLabel lblNumero3 = new JLabel("Numero 3:");
	    lblNumero3.setBounds(30,90,80,25);
	    getContentPane().add(lblNumero3);
	    
	    JLabel lblNumero4 = new JLabel("Numero 4:");
	    lblNumero4.setBounds(30,120,80,25);
	    getContentPane().add(lblNumero4);
	    
	    JLabel lblNumero5 = new JLabel("Numero 5:");
	    lblNumero5.setBounds(30,150,80,25);
	    getContentPane().add(lblNumero5);
	   
	    JLabel lblPromedio = new JLabel("Promedio de los 3 numeros mayores:");
	    lblPromedio.setBounds(30,240,240,25);
	    getContentPane().add(lblPromedio);
	    
	    txtNm1 = new JTextField();
	    txtNm1.setBounds(100,30,150,25);
	    txtNm1.setMargin(new Insets(2,5,2,5));
	    txtNm1.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNm1);
	    
	    txtNumero2 = new JTextField();
	    txtNumero2.setBounds(100,60,150,25);
	    txtNumero2.setMargin(new Insets(2,5,2,5));
	    txtNumero2.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero2);
	    
	    txtNumero3 = new JTextField();
	    txtNumero3.setBounds(100,90,150,25);
	    txtNumero3.setMargin(new Insets(2,5,2,5));
	    txtNumero3.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero3);
	    
	    txtNumero4 = new JTextField();
	    txtNumero4.setBounds(100,120,150,25);
	    txtNumero4.setMargin(new Insets(2,5,2,5));
	    txtNumero4.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero4);
	    
	    txtNumero5 = new JTextField();
	    txtNumero5.setBounds(100,150,150,25);
	    txtNumero5.setMargin(new Insets(2,5,2,5));
	    txtNumero5.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero5);
	    
	    
	    txtPromedio = new JTextField();
	    txtPromedio.setBounds(250,240,150,25);
	    txtPromedio.setFocusable(false);
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
		int numero1 = Integer.parseInt( txtNm1.getText() );
		int numero2 = Integer.parseInt( txtNumero2.getText() );
		int numero3 = Integer.parseInt( txtNumero3.getText() );
		int numero4 = Integer.parseInt( txtNumero4.getText() );
		int numero5 = Integer.parseInt( txtNumero5.getText() );
		
		 ArrayList<Integer>orden = new ArrayList<Integer>();
		 orden.add(numero1);
		 orden.add(numero2);
		 orden.add(numero3);
		 orden.add(numero4);
		 orden.add(numero5);
		 
		 Collections.sort(orden);
		 double promedio = (orden.get(2)+ orden.get(3) + orden.get(4)) / 3;
		 txtPromedio.setText(new DecimalFormat("##.00").format(promedio));

		}

}

