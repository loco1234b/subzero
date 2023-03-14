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


public class frm20 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtD200,txtD100,txtD50,txtD20,txtD10,txtM5,txtM2,txtM1,txtMonto;
	JLabel lblMonto,lblD200,lblD100,lblD50,lblD20,lblD10,lblM5,lblM2,lblM1;
	
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
		setBounds(0,0,500,500);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblMonto = new JLabel("Monto:");
	    lblMonto.setBounds(30,30,100,25);
	    getContentPane().add(lblMonto);
	    
	    JLabel lblD200 = new JLabel("Billetes 200:");
	    lblD200.setBounds(30,120,100,25);
	    getContentPane().add(lblD200);
	    
	    JLabel lblD100 = new JLabel("Billetes 100:");
	    lblD100.setBounds(30,150,100,25);
	    getContentPane().add(lblD100);
	    
	    JLabel lblD50 = new JLabel("Billetes 50:");
	    lblD50.setBounds(30,180,100,25);
	    getContentPane().add(lblD50);
	    
	    JLabel lblD20 = new JLabel("Billetes 20:");
	    lblD20.setBounds(30,210,130,25);
	    getContentPane().add(lblD20);
	    
	    JLabel lblD10 = new JLabel("Billetes 10:");
	    lblD10.setBounds(30,240,130,25);
	    getContentPane().add(lblD10);
	    
	    JLabel lblM5 = new JLabel("Monedas 5:");
	    lblM5.setBounds(30,270,130,25);
	    getContentPane().add(lblM5);
	    
	    JLabel lblM2 = new JLabel("Monedas 2:");
	    lblM2.setBounds(30,300,130,25);
	    getContentPane().add(lblM2);
	    
	    JLabel lblM1 = new JLabel("Monedas 1:");
	    lblM1.setBounds(30,330,130,25);
	    getContentPane().add(lblM1);
	    
	    txtMonto = new JTextField();
	    txtMonto.setBounds(110,30,80,25);
	    txtMonto.setMargin(new Insets(2,5,2,5));
	    txtMonto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtMonto);
	    
	    txtD200 = new JTextField();
	    txtD200.setBounds(140,120,80,25);
	    txtD200.setMargin(new Insets(2,5,2,5));
	    txtD200.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtD200);
	    
	    txtD100 = new JTextField();
	    txtD100.setBounds(140,150,80,25);
	    txtD100.setMargin(new Insets(2,5,2,5));
	    txtD100.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtD100);
	    
	    txtD50 = new JTextField();
	    txtD50.setBounds(140,180,80,25);
	    txtD50.setMargin(new Insets(2,5,2,5));
	    txtD50.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtD50);
	    
	    txtD20 = new JTextField();
	    txtD20.setBounds(140,210,80,25);
	    txtD20.setMargin(new Insets(2,5,2,5));
	    txtD20.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtD20);
	    
	    txtD10 = new JTextField();
	    txtD10.setBounds(140,240,80,25);
	    txtD10.setMargin(new Insets(2,5,2,5));
	    txtD10.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtD10);
	    
	    txtM5 = new JTextField();
	    txtM5.setBounds(140,270,80,25);
	    txtM5.setMargin(new Insets(2,5,2,5));
	    txtM5.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtM5);
	    
	    txtM2 = new JTextField();
	    txtM2.setBounds(140,300,80,25);
	    txtM2.setMargin(new Insets(2,5,2,5));
	    txtM2.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtM2);
	    
	    txtM1 = new JTextField();
	    txtM1.setBounds(140,330,80,25);
	    txtM1.setMargin(new Insets(2,5,2,5));
	    txtM1.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtM1);
	    
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int monto = Integer.parseInt( txtMonto.getText() );
		
		double d200 = monto / 200;
		double d100 =(monto / 100) /1;
		double d50 = (monto / 50) /1;
		double d20 = monto / 20;
		double d10 = monto /10; 
		double d5 =  monto / 5;
		double d2 = monto / 2 ;
		double d1 = monto / 1;
				
		DecimalFormat df = new DecimalFormat("##");
		txtD200.setText( df.format(d200));
		txtD100.setText( df.format(d100) );
		txtD50.setText( df.format(d50) );
		txtD20.setText( df.format(d20) );
		txtD10.setText( df.format(d10) );
		txtM5.setText( df.format(d5) );
		txtM2.setText( df.format(d2) );
		txtM1.setText( df.format(d1) );
		
		}

}

