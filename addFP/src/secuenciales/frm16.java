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


public class frm16 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtSueldobasico,txtSueldobruto,txtSueldoneto,txtHoras,txtTarifa;
	JLabel lblHoras,lblTarifa,lblSueldobasico,lblSueldobruto,lblSueldoneto;
	
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
		
	    JLabel lblHoras = new JLabel("Horas trabajadas :");
	    lblHoras.setBounds(30,30,120,25);
	    getContentPane().add(lblHoras);
	    
	    JLabel lblTarifa = new JLabel("Tarifa horaria:");
	    lblTarifa.setBounds(30,60,100,25);
	    getContentPane().add(lblTarifa);
	    
	    JLabel lblSueldobasico = new JLabel("sueldo basico:");
	    lblSueldobasico.setBounds(30,120,100,25);
	    getContentPane().add(lblSueldobasico);
	    
	    JLabel lblSueldobruto = new JLabel("Sueldo bruto:");
	    lblSueldobruto.setBounds(30,150,100,25);
	    getContentPane().add(lblSueldobruto);
	    
	    JLabel lblSueldoneto = new JLabel("Sueldo neto:");
	    lblSueldoneto.setBounds(30,180,100,25);
	    getContentPane().add(lblSueldoneto);
	    
	    
	    txtHoras = new JTextField();
	    txtHoras.setBounds(140,30,80,25);
	    txtHoras.setMargin(new Insets(2,5,2,5));
	    txtHoras.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtHoras);
	    
	    txtTarifa = new JTextField();
	    txtTarifa.setBounds(130,60,80,25);
	    txtTarifa.setMargin(new Insets(2,5,2,5));
	    txtTarifa.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtTarifa);
	    
	    txtSueldobasico = new JTextField();
	    txtSueldobasico.setBounds(130,120,80,25);
	    txtSueldobasico.setFocusable(false);
	    txtSueldobasico.setMargin(new Insets(2,5,2,5));
	    txtSueldobasico.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtSueldobasico);
	    
	    txtSueldobruto = new JTextField();
	    txtSueldobruto.setBounds(130,150,80,25);
	    txtSueldobruto.setFocusable(false);
	    txtSueldobruto.setMargin(new Insets(2,5,2,5));
	    txtSueldobruto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtSueldobruto);
	    
	    txtSueldoneto = new JTextField();
	    txtSueldoneto.setBounds(130,180,80,25);
	    txtSueldoneto.setFocusable(false);
	    txtSueldoneto.setMargin(new Insets(2,5,2,5));
	    txtSueldoneto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtSueldoneto);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,90,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int horas = Integer.parseInt( txtHoras.getText() );
		int tarifa = Integer.parseInt( txtTarifa.getText() );
		
		double sueldobasico = horas * tarifa;
		double sueldobruto = sueldobasico + (sueldobasico * 0.20);
		double sueldoneto = sueldobruto - (sueldobruto * 0.10 );
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtSueldobasico.setText( df.format(sueldobasico));
		txtSueldobruto.setText( df.format(sueldobruto) );
		txtSueldoneto.setText( df.format(sueldoneto) );
		
		}

}

