package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm39 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtHora,txtTdefectuoso,txtTnoproducidos,txtGrado;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm39 frame = new frm39();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm39() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblhora= new JLabel("Hora:");
	    lblhora.setBounds(30,30,100,25);
	    getContentPane().add(lblhora);
	    
	    JLabel lblt1 = new JLabel("Tornillo defectuoso:");
	    lblt1.setBounds(30,60,150,25);
	    getContentPane().add(lblt1);
	    
	    JLabel lblt2 = new JLabel("Tornillo no producido:");
	    lblt2.setBounds(30,90,150,25);
	    getContentPane().add(lblt2);
	    
	    JLabel lblgrado = new JLabel("Grado:");
	    lblgrado.setBounds(30,180,100,25);
	    getContentPane().add(lblgrado);
	    
	    txtHora = new JTextField();
	    txtHora.setBounds(170,30,100,25);
	    txtHora.setMargin(new Insets(2,5,2,5));
	    txtHora.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtHora);
	    
	    txtTdefectuoso = new JTextField();
	    txtTdefectuoso.setBounds(170,60,100,25);
	    txtTdefectuoso.setMargin(new Insets(2,5,2,5));
	    txtTdefectuoso.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtTdefectuoso);
	    
	    txtTnoproducidos = new JTextField();
	    txtTnoproducidos.setBounds(170,90,100,25);
	    txtTnoproducidos.setMargin(new Insets(2,5,2,5));
	    txtTnoproducidos.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtTnoproducidos);
	    
	    txtGrado = new JTextField();
	    txtGrado.setBounds(170,180,100,25);
	    txtGrado.setFocusable(false);
	    txtGrado.setMargin(new Insets(2,5,2,5));
	    txtGrado.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtGrado);
	  
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,120,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int horas = Integer.parseInt( txtHora.getText() );
		int tornillosdefectuosos = Integer.parseInt( txtTdefectuoso.getText() );
		int tornillosnoproducidos = Integer.parseInt( txtTnoproducidos.getText() );
		int grado =0;
		if (horas > 1.5 && tornillosdefectuosos > 300 && tornillosnoproducidos < 10000)grado = 5;
		else if (horas < 1.5 && tornillosdefectuosos > 300 && tornillosnoproducidos <  10000)grado = 7;
		else if (horas > 1.5 && tornillosdefectuosos < 300 && tornillosnoproducidos <  10000)grado = 8;
		else if (horas > 1.5 && tornillosdefectuosos > 300 && tornillosnoproducidos >  10000)grado = 9;
		else if (horas < 1.5 && tornillosdefectuosos < 300 && tornillosnoproducidos <  10000)grado = 12;
		else if (horas < 1.5 && tornillosdefectuosos > 300 && tornillosnoproducidos >  10000)grado = 13;
		else if (horas > 1.5 && tornillosdefectuosos < 300 && tornillosnoproducidos >  10000)grado = 15;
		else if (horas < 1.5 && tornillosdefectuosos < 300 && tornillosnoproducidos >  10000)grado = 20;
	
		DecimalFormat df = new DecimalFormat("##.00 ");
		txtGrado.setText( df.format(grado) );
		}

}
	
