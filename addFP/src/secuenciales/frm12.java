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


public class frm12 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtValora,txtValorb,txtValorc,txtEcuacion1,txtEcuacion2;
	JLabel lblValora,lblValorb,lblValorc,lblEcuacion1,lblEcuacion2;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm12 frame = new frm12();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm12() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblValora = new JLabel("valor A:");
	    lblValora.setBounds(30,30,80,25);
	    getContentPane().add(lblValora);
	    
	    JLabel lblValorb = new JLabel("Valor B:");
	    lblValorb.setBounds(30,60,80,25);
	    getContentPane().add(lblValorb);
	    
	    JLabel lblValorc = new JLabel("Valor C:");
	    lblValorc.setBounds(30,90,80,25);
	    getContentPane().add(lblValorc);
	    
	    JLabel lblEcuacion1 = new JLabel("Resultado 1:");
	    lblEcuacion1.setBounds(30,150,80,25);
	    getContentPane().add(lblEcuacion1);
	    
	    JLabel lblEcuacion2 = new JLabel("Resultado 2:");
	    lblEcuacion2.setBounds(30,180,80,25);
	    getContentPane().add(lblEcuacion2);
	    
	    
	    txtValora = new JTextField();
	    txtValora.setBounds(100,30,80,25);
	    txtValora.setMargin(new Insets(2,5,2,5));
	    txtValora.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtValora);
	    
	    txtValorb = new JTextField();
	    txtValorb.setBounds(100,60,80,25);
	    txtValorb.setMargin(new Insets(2,5,2,5));
	    txtValorb.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtValorb);
	    
	    txtValorc = new JTextField();
	    txtValorc.setBounds(100,90,80,25);
	    txtValorc.setMargin(new Insets(2,5,2,5));
	    txtValorc.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtValorc);
	    
	    txtEcuacion1 = new JTextField();
	    txtEcuacion1.setBounds(110,150,80,25);
	    txtEcuacion1.setFocusable(false);
	    txtEcuacion1.setMargin(new Insets(2,5,2,5));
	    txtEcuacion1.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtEcuacion1);
	    
	    txtEcuacion2 = new JTextField();
	    txtEcuacion2.setBounds(110,180,80,25);
	    txtEcuacion2.setFocusable(false);
	    txtEcuacion2.setMargin(new Insets(2,5,2,5));
	    txtEcuacion2.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtEcuacion2);
	    
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,120,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int valora = Integer.parseInt( txtValora.getText() );
		int valorb = Integer.parseInt( txtValorb.getText() );
		int valorc = Integer.parseInt( txtValorc.getText() );
		
		double raiz = Math.sqrt(Math.pow(valorb,2)- 4 * valora * valorc);
		double ecuacion1 = (- valorb + raiz) / (2 * valora);
		double ecuacion2 = (- valorb - raiz)/ (2 * valora);
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtEcuacion1.setText( df.format(ecuacion1) );
		txtEcuacion2.setText( df.format(ecuacion2) );
		}

}
