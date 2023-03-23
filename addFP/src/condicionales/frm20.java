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


public class frm20 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtNumeroa,txtNumerob,txtNumeroc,txtCondicion;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm20 frame = new frm20();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm20() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblnumeroa= new JLabel("Numero a:");
	    lblnumeroa.setBounds(30,30,120,25);
	    getContentPane().add(lblnumeroa);
	    
	    JLabel lblnumerob = new JLabel("Numero b:");
	    lblnumerob.setBounds(30,60,120,25);
	    getContentPane().add(lblnumerob);
	    
	    JLabel lblnumeroc = new JLabel("Numero c:");
	    lblnumeroc.setBounds(30,90,120,25);
	    getContentPane().add(lblnumeroc);
	    
	    JLabel lblcondicion = new JLabel("Condicion:");
	    lblcondicion.setBounds(30,180,120,25);
	    getContentPane().add(lblcondicion);
	    
	    txtNumeroa = new JTextField();
	    txtNumeroa.setBounds(100,30,100,25);
	    txtNumeroa.setMargin(new Insets(2,5,2,5));
	    txtNumeroa.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumeroa);
	    
	    txtNumerob = new JTextField();
	    txtNumerob.setBounds(100,60,100,25);
	    txtNumerob.setMargin(new Insets(2,5,2,5));
	    txtNumerob.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumerob);
	    
	    txtNumeroc = new JTextField();
	    txtNumeroc.setBounds(100,90,100,25);
	    txtNumeroc.setMargin(new Insets(2,5,2,5));
	    txtNumeroc.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumeroc);
	    
	    txtCondicion = new JTextField();
	    txtCondicion.setBounds(100,180,180,25);
	    txtCondicion.setMargin(new Insets(2,5,2,5));
	    txtCondicion.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCondicion);
	   
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,120,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int numero1 = Integer.parseInt( txtNumeroa.getText() );
		int numero2 = Integer.parseInt( txtNumerob.getText() );
		int numero3 = Integer.parseInt( txtNumeroc.getText() );
		
	    String c = "";
		if (numero1 > numero2 && numero1 > numero3 && numero2 > numero3)c = "Numeros descendentes";
		else if (numero3 > numero2 && numero3 > numero1 && numero2 > numero1)c = "Numeros ascendentes";
	    else c = "Numeros en desorden";
		
		txtCondicion.setText(c);
		    
		}

}