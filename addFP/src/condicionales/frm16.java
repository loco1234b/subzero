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


public class frm16 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtCosto,txtIngreso,txtCuotai,txtCuotam,txtresto;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm16 frame = new frm16();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm16() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblcosto= new JLabel("Costo:");
	    lblcosto.setBounds(30,30,100,25);
	    getContentPane().add(lblcosto);
	    
	    JLabel lblingresos = new JLabel("Ingresos:");
	    lblingresos.setBounds(30,60,120,25);
	    getContentPane().add(lblingresos);
	    
	    JLabel lblcuotai = new JLabel("Cuota inicial:");
	    lblcuotai.setBounds(30,150,140,25);
	    getContentPane().add(lblcuotai);
	    
	    JLabel lblresto = new JLabel("Resto:");
	    lblresto.setBounds(30,180,140,25);
	    getContentPane().add(lblresto);
	    
	    JLabel lblcuotam = new JLabel("Cuota mensual:");
	    lblcuotam.setBounds(30,210,140,25);
	    getContentPane().add(lblcuotam);
	    
	    txtCosto = new JTextField();
	    txtCosto.setBounds(100,30,100,25);
	    txtCosto.setMargin(new Insets(2,5,2,5));
	    txtCosto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCosto);
	    
	    txtIngreso = new JTextField();
	    txtIngreso.setBounds(100,60,100,25);
	    txtIngreso.setMargin(new Insets(2,5,2,5));
	    txtIngreso.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtIngreso);
	    
	    txtCuotai = new JTextField();
	    txtCuotai.setBounds(160,150,100,25);
	    txtCuotai.setFocusable(false);
	    txtCuotai.setMargin(new Insets(2,5,2,5));
	    txtCuotai.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCuotai);
	    
	    txtresto = new JTextField();
	    txtresto.setBounds(160,180,100,25);
	    txtresto.setFocusable(false);
	    txtresto.setMargin(new Insets(2,5,2,5));
	    txtresto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtresto);
	    
	    txtCuotam = new JTextField();
	    txtCuotam.setBounds(160,210,100,25);
	    txtCuotam.setFocusable(false);
	    txtCuotam.setMargin(new Insets(2,5,2,5));
	    txtCuotam.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCuotam);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,90,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int ingresos = Integer.parseInt( txtIngreso.getText() );
		int costo = Integer.parseInt( txtCosto.getText() );
		
		float cuotainicial=0;
		float cuotamensual=0;
		float resto = 0;
		if (ingresos < 1250)cuotainicial =(float) (costo * 0.15);
		else if (ingresos >= 1250)cuotainicial = (float)(costo * 0.30);
	
		if(ingresos < 1250)resto = costo - cuotainicial;
		else if (ingresos >= 1250)resto = costo - cuotainicial;

		if(ingresos < 1250)cuotamensual = resto / 120;
		else if (ingresos >= 1250)cuotamensual = resto / 75;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtCuotai.setText( df.format(cuotainicial) );
		txtresto.setText(df.format(resto));
		txtCuotam.setText( df.format(cuotamensual) );
		
		}

}