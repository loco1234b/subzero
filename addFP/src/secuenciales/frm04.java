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


public class frm04 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtPulgadas,txtPies,txtMetros;
	JLabel lblPulgadas,lblPies,lblMetros;
	
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
		
	    JLabel lblPies = new JLabel("Pies:");
	    lblPies.setBounds(30,30,80,25);
	    getContentPane().add(lblPies);
	    
	    JLabel lblPulgadas = new JLabel("pulgadas:");
	    lblPulgadas.setBounds(30,60,80,25);
	    getContentPane().add(lblPulgadas);
	    
	    JLabel lblMetros = new JLabel("Metros:");
	    lblMetros.setBounds(100,150,80,25);
	    getContentPane().add(lblMetros);
	    
	    
	    txtPies = new JTextField();
	    txtPies.setBounds(100,30,50,25);
	    txtPies.setMargin(new Insets(2,5,2,5));
	    txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPies);
	    
	    txtPulgadas = new JTextField();
	    txtPulgadas.setBounds(100,60,50,25);
	    txtPulgadas.setMargin(new Insets(2,5,2,5));
	    txtPulgadas.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPulgadas);
	    
	    txtMetros = new JTextField();
	    txtMetros.setBounds(150,150,80,25);
	    txtMetros.setMargin(new Insets(2,5,2,5));
	    txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtMetros);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,100,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int Pies= Integer.parseInt( txtPies.getText() );
		int Pulgadas = Integer.parseInt( txtPulgadas.getText() );
		
		
		double centimetros = Pies * 30.48;
		double Centimetro = Pulgadas * 2.54;
		double suma = centimetros + Centimetro;
		
		double Metros = suma / 100;
		
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtMetros.setText( df.format(Metros) );
		
		}

}
