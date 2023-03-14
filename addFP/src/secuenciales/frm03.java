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


public class frm03 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtKilometros,txtPies,txtMillas,txtMetros,txtYardas;
	JLabel lblKilometros,lblPies,lblMillas,lblMetros,lblYardas;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm03 frame = new frm03();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm03() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblKilometros = new JLabel("kilometros:");
	    lblKilometros.setBounds(30,30,80,25);
	    getContentPane().add(lblKilometros);
	    
	    JLabel lblPies = new JLabel("pies:");
	    lblPies.setBounds(30,60,80,25);
	    getContentPane().add(lblPies);
	    
	    JLabel lblMillas = new JLabel("Millas:");
	    lblMillas.setBounds(30,90,80,25);
	    getContentPane().add(lblMillas);
	    
	    JLabel lblMetros = new JLabel("Metros:");
	    lblMetros.setBounds(180,150,80,25);
	    getContentPane().add(lblMetros);
	    
	    JLabel lblYardas = new JLabel("Yardas:");
	    lblYardas.setBounds(180,180,80,25);
	    getContentPane().add(lblYardas);
	    
	    txtMetros = new JTextField();
	    txtMetros.setBounds(230,150,80,25);
	    txtMetros.setMargin(new Insets(2,5,2,5));
	    txtMetros.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtMetros);
	    
	    txtYardas = new JTextField();
	    txtYardas.setBounds(230,180,80,25);
	    txtYardas.setMargin(new Insets(2,5,2,5));
	    txtYardas.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtYardas);
	    
	    txtKilometros = new JTextField();
	    txtKilometros.setBounds(100,30,50,25);
	    txtKilometros.setMargin(new Insets(2,5,2,5));
	    txtKilometros.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtKilometros);
	    
	    txtPies = new JTextField();
	    txtPies.setBounds(100,60,50,25);
	    txtPies.setMargin(new Insets(2,5,2,5));
	    txtPies.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPies);
	    
	    txtMillas = new JTextField();
	    txtMillas.setBounds(100,90,50,25);
	    txtMillas.setMargin(new Insets(2,5,2,5));
	    txtMillas.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtMillas);
	   
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(60,120,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int Kilometros = Integer.parseInt( txtKilometros.getText() );
		int Pies= Integer.parseInt( txtPies.getText() );
		int Millas = Integer.parseInt( txtMillas.getText() );
		
		
		double metros = Kilometros * 1000;
		double pies = Pies / 3.2808;
		double millas = Millas * 1609;
		
		double MMetros = metros + pies + millas; 
		double Yardas = MMetros * 1.094;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtMetros.setText( df.format(MMetros) );
		txtYardas.setText( df.format(Yardas) );
		
		
		}

}
