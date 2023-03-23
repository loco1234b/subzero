package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm11 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtNumero,txtSigno;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm11 frame = new frm11();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm11() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblnumero= new JLabel("Numero:");
	    lblnumero.setBounds(30,30,100,25);
	    getContentPane().add(lblnumero);
	    
	    JLabel lblsigno = new JLabel("Respuesta:");
	    lblsigno.setBounds(30,120,100,25);
	    getContentPane().add(lblsigno);
	    
	    txtNumero = new JTextField();
	    txtNumero.setBounds(100,30,100,25);
	    txtNumero.setMargin(new Insets(2,5,2,5));
	    txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero);
	    
	    txtSigno = new JTextField();
	    txtSigno.setBounds(100,120,100,25);
	    txtSigno.setMargin(new Insets(2,5,2,5));
	    txtSigno.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtSigno);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int numero = Integer.parseInt( txtNumero.getText() );
		
		if (numero > 0)txtSigno.setText("Positivo");
		else if (numero == 0)txtSigno.setText("Cero");
		else txtSigno.setText("Negativo");
		
		txtSigno.setText("Positivo");
		if(numero == 0)txtSigno.setText("Cero");
		else if(numero < 0)txtSigno.setText("Negativo");
		
		txtSigno.setText(numero > 0 ? "positivo": numero < 0 ? "negativo":"cero");
		
		
		}

}