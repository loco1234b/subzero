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


public class frm33 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtPuntualidad,txtRendimiento,txtPuntaje,txtBonificacion,txtPuntaje2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm33 frame = new frm33();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm33() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblpuntualidad= new JLabel("Puntualidad:");
	    lblpuntualidad.setBounds(30,30,100,25);
	    getContentPane().add(lblpuntualidad);
	    
	    JLabel lblrendimiento = new JLabel("Rendimiento:");
	    lblrendimiento.setBounds(30,60,100,25);
	    getContentPane().add(lblrendimiento);
	    
	    JLabel lblpuntaje = new JLabel("Puntaje de puntualidad:");
	    lblpuntaje.setBounds(30,150,150,25);
	    getContentPane().add(lblpuntaje);
	    
	    JLabel lblpuntaje2 = new JLabel("Puntaje de rendimiento:");
	    lblpuntaje2.setBounds(30,180,150,25);
	    getContentPane().add(lblpuntaje2);
	    
	    JLabel lblbonificacion = new JLabel("Bonificacion:");
	    lblbonificacion.setBounds(30,210,150,25);
	    getContentPane().add(lblbonificacion);
	    
	    txtPuntualidad = new JTextField();
	    txtPuntualidad.setBounds(120,30,100,25);
	    txtPuntualidad.setMargin(new Insets(2,5,2,5));
	    txtPuntualidad.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPuntualidad);
	    
	    txtRendimiento = new JTextField();
	    txtRendimiento.setBounds(120,60,100,25);
	    txtRendimiento.setMargin(new Insets(2,5,2,5));
	    txtRendimiento.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtRendimiento);
	    
	    txtPuntaje = new JTextField();
	    txtPuntaje.setBounds(180,150,100,25);
	    txtPuntaje.setMargin(new Insets(2,5,2,5));
	    txtPuntaje.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPuntaje);
	    
	    txtPuntaje2 = new JTextField();
	    txtPuntaje2.setBounds(180,180,100,25);
	    txtPuntaje2.setMargin(new Insets(2,5,2,5));
	    txtPuntaje2.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPuntaje2);
	    
	    txtBonificacion = new JTextField();
	    txtBonificacion.setBounds(180,210,100,25);
	    txtBonificacion.setMargin(new Insets(2,5,2,5));
	    txtBonificacion.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtBonificacion);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,90,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int puntualidad = Integer.parseInt( txtPuntualidad.getText() );
		int rendimiento = Integer.parseInt( txtRendimiento.getText() );
		
		int puntaje = 0;
		if (puntualidad == 0)puntaje = 10;
		else if (puntualidad >=1 && puntualidad <=2)puntaje = 8;  
		else if (puntualidad >=3 && puntualidad <=5)puntaje = 6;
		else if (puntualidad >=6 && puntualidad <=9)puntaje = 4;
		else puntaje = 0;
		    
        int puntaje2 = 0;
		if (rendimiento == 0)puntaje2 = 10;
		else if (rendimiento == 1)puntaje2 = 8;
		else if (rendimiento == 2)puntaje2 = 5;
		else if (rendimiento == 3)puntaje2 = 1;
		else puntaje2 = 0;
		 
		double puntajetotal = puntaje + puntaje2;
        float bonificacion =0;
		if (puntajetotal <= 10)bonificacion = (float)(2.5 * puntajetotal); 
		else if (puntajetotal >= 11 && puntajetotal <= 13)bonificacion =(float) (5 * puntajetotal);
		else if (puntajetotal >= 14 && puntajetotal <= 16)bonificacion =(float) (7.5 * puntajetotal);
		else if (puntajetotal >= 17 && puntajetotal <= 19)bonificacion =(float) (10 * puntajetotal);
		else bonificacion =(float) (12.5 * puntajetotal);
		    
		DecimalFormat df = new DecimalFormat("##.00 ");
		txtPuntaje.setText( df.format(puntaje) );
		txtPuntaje2.setText( df.format(puntaje2) );
		txtBonificacion.setText( df.format(bonificacion) );
		
		    
		}

}