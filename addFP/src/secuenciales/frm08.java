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


public class frm08 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtRadio,txtAltura,txtAreabase,txtArealateral,txtAreatotal;
	JLabel lblRadio,lblAltura,lblAreabase,lblArealateral,lblAreatotal;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm08 frame = new frm08();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm08() {
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
	    
	    JLabel lblAreabase = new JLabel("Area base:");
	    lblAreabase.setBounds(30,150,80,25);
	    getContentPane().add(lblAreabase);
	    
	    JLabel lblArealateral = new JLabel("Area lateral:");
	    lblArealateral.setBounds(30,180,80,25);
	    getContentPane().add(lblArealateral);
	    
	    JLabel lblAreatotal = new JLabel("Area total:");
	    lblAreatotal.setBounds(30,210,80,25);
	    getContentPane().add(lblAreatotal);
	    
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
	    
	    txtAreabase = new JTextField();
	    txtAreabase.setBounds(100,150,150,25);
	    txtAreabase.setMargin(new Insets(2,5,2,5));
	    txtAreabase.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtAreabase);
	    
	    txtArealateral = new JTextField();
	    txtArealateral.setBounds(100,180,150,25);
	    txtArealateral.setMargin(new Insets(2,5,2,5));
	    txtArealateral.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtArealateral);
	    
	    txtAreatotal = new JTextField();
	    txtAreatotal.setBounds(100,210,150,25);
	    txtAreatotal.setMargin(new Insets(2,5,2,5));
	    txtAreatotal.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtAreatotal);
	    
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
		
		double areabase = Math.PI * Math.pow(radio,2);
		double arealateral = 2 * Math.PI * radio * altura;
		double areatotal = 2 * areabase * arealateral;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtAreabase.setText( df.format(areabase) );
		txtArealateral.setText( df.format(arealateral) );
		txtAreatotal.setText( df.format(areatotal) );
		}

}
