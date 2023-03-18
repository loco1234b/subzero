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


public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtP1,txtP2,txtP3,txtPromedio;
	JLabel lblimporte,lbldescuento,lbltotal;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm04 frame = new frm04();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm04() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblp1= new JLabel("Practica 1:");
	    lblp1.setBounds(30,30,100,25);
	    getContentPane().add(lblp1);
	    
	    JLabel lblp2 = new JLabel("Practica 2:");
	    lblp2.setBounds(30,60,100,25);
	    getContentPane().add(lblp2);
	   
	    JLabel lblp3 = new JLabel("Practica 3:");
	    lblp3.setBounds(30,90,100,25);
	    getContentPane().add(lblp3);
	    
	    JLabel lblpromedio = new JLabel("Promedio es :");
	    lblpromedio.setBounds(30,180,100,25);
	    getContentPane().add(lblpromedio);
	    
	    txtP1 = new JTextField();
	    txtP1.setBounds(100,30,100,25);
	    txtP1.setMargin(new Insets(2,5,2,5));
	    txtP1.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtP1);
	    
	    txtP2 = new JTextField();
	    txtP2.setBounds(100,60,100,25);
	    txtP2.setMargin(new Insets(2,5,2,5));
	    txtP2.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtP2);
	    
	    txtP3 = new JTextField();
	    txtP3.setBounds(100,90,100,25);
	    txtP3.setMargin(new Insets(2,5,2,5));
	    txtP3.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtP3);
	    
	    txtPromedio = new JTextField();
	    txtPromedio.setBounds(120,180,100,25);
	    txtPromedio.setMargin(new Insets(2,5,2,5));
	    txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPromedio);
	    
	   
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(60,120,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int practica1 = Integer.parseInt( txtP1.getText() );
		int practica2 = Integer.parseInt( txtP2.getText() );
		int practica3 =Integer.parseInt( txtP3.getText() );
		
		if (practica3 >= 10 && practica3 <= 18)practica3 = practica3 + 2;
		else practica3 = 20;
		
        float promedio = 0;
	    promedio =(float) (practica1 + practica2 + practica3) / 3;
		
		DecimalFormat df = new DecimalFormat("##.00 ");
		txtPromedio.setText( df.format(promedio) );
		
		}

}