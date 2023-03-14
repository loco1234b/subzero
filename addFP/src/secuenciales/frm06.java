package secuenciales;

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


public class frm06 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtRadio,txtAltura,txtArea,txtVolumen;
	JLabel lblRadio,lblAltura,lblArea,lblVolumen;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm06 frame = new frm06();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm06() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblRadio = new JLabel("Radio:");
	    lblRadio.setBounds(30,30,80,25);
	    getContentPane().add(lblRadio);
	    
	    JLabel lblAltura = new JLabel("Altura:");
	    lblAltura.setBounds(30,60,80,25);
	    getContentPane().add(lblAltura);
	    
	    JLabel lblArea = new JLabel("Area:");
	    lblArea.setBounds(30,150,80,25);
	    getContentPane().add(lblArea);
	    
	    JLabel lblVolumen = new JLabel("Volumen:");
	    lblVolumen.setBounds(30,180,80,25);
	    getContentPane().add(lblVolumen);
	    
	    txtRadio = new JTextField();
	    txtRadio.setBounds(100,30,150,25);
	    txtRadio.setMargin(new Insets(2,5,2,5));
	    txtRadio.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtRadio);
	    
	    txtAltura = new JTextField();
	    txtAltura.setBounds(100,60,150,25);
	    txtAltura.setMargin(new Insets(2,5,2,5));
	    txtAltura.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtAltura);
	    
	    txtArea = new JTextField();
	    txtArea.setBounds(100,150,150,25);
	    txtArea.setMargin(new Insets(2,5,2,5));
	    txtArea.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtArea);
	    
	    txtVolumen = new JTextField();
	    txtVolumen.setBounds(100,180,150,25);
	    txtVolumen.setMargin(new Insets(2,5,2,5));
	    txtVolumen.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtVolumen);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,90,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int radio = Integer.parseInt( txtRadio.getText() );
		int altura = Integer.parseInt( txtAltura.getText() );
		
		
		double area = 2 * Math.PI * radio * (radio + altura);
		double volumen = Math.PI * Math.pow(radio,2)* altura;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtArea.setText( df.format(area) );
		txtVolumen.setText( df.format(volumen) );
		}

}
