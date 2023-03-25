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


public class frm28 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtHora,txtFormato;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm28 frame = new frm28();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm28() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblhora= new JLabel("Hora:");
	    lblhora.setBounds(30,30,100,25);
	    getContentPane().add(lblhora);
	    
	    JLabel lblformato = new JLabel("formato de 12 horas:");
	    lblformato.setBounds(30,120,150,25);
	    getContentPane().add(lblformato);
	    
	    txtHora = new JTextField();
	    txtHora.setBounds(100,30,100,25);
	    txtHora.setMargin(new Insets(2,5,2,5));
	    txtHora.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtHora);
	    
	    txtFormato = new JTextField();
	    txtFormato.setBounds(150,120,100,25);
	    txtFormato.setMargin(new Insets(2,5,2,5));
	    txtFormato.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtFormato);
	    
	    
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int hora = Integer.parseInt( txtHora.getText() );
		float d = 0;
		
		if (hora <= 12)d= hora;
		else d=(float) (hora - 12);
		  
		
		DecimalFormat df = new DecimalFormat("##.00 ");
		txtFormato.setText( df.format(d)+ "PM" );
		
		    
		}

}