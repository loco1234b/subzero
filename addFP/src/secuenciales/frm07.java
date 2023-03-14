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


public class frm07 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtBase,txtAltura,txtArea,txtPerimetro;
	JLabel lblBase,lblAltura,lblArea,lblPerimetro;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm07 frame = new frm07();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm07() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblBase = new JLabel("Base:");
	    lblBase.setBounds(30,30,80,25);
	    getContentPane().add(lblBase);
	    
	    JLabel lblAltura = new JLabel("Altura:");
	    lblAltura.setBounds(30,60,80,25);
	    getContentPane().add(lblAltura);
	    
	    JLabel lblArea = new JLabel("Area:");
	    lblArea.setBounds(30,150,80,25);
	    getContentPane().add(lblArea);
	    
	    JLabel lblPerimetro = new JLabel("Perimetro:");
	    lblPerimetro.setBounds(30,180,80,25);
	    getContentPane().add(lblPerimetro);
	    
	    txtBase = new JTextField();
	    txtBase.setBounds(100,30,150,25);
	    txtBase.setMargin(new Insets(2,5,2,5));
	    txtBase.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtBase);
	    
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
	    
	    txtPerimetro = new JTextField();
	    txtPerimetro.setBounds(100,180,150,25);
	    txtPerimetro.setMargin(new Insets(2,5,2,5));
	    txtPerimetro.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPerimetro);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,90,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int base = Integer.parseInt( txtBase.getText() );
		int altura = Integer.parseInt( txtAltura.getText() );
		
		
		double area = base * altura;
		double perimetro = 2 * (base + altura);
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtArea.setText( df.format(area) );
		txtPerimetro.setText( df.format(perimetro) );
		}

}
