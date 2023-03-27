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


public class frm36 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtCuaderno,txtLapicero,txtLapicerolucas,txtLapicerofaber,txtLapiceropilot;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm36 frame = new frm36();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm36() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblcuaderno= new JLabel("Cuaderno:");
	    lblcuaderno.setBounds(30,30,100,25);
	    getContentPane().add(lblcuaderno);
	    
	    JLabel lbllapicero = new JLabel("Nada:");
	    lbllapicero.setBounds(30,120,100,25);
	    getContentPane().add(lbllapicero);
	    
	    JLabel lbllapicerolucas = new JLabel("Lapicero lucas:");
	    lbllapicerolucas.setBounds(30,150,100,25);
	    getContentPane().add(lbllapicerolucas);
	    
	    JLabel lbllapicerofaber = new JLabel("Lapicero faber:");
	    lbllapicerofaber.setBounds(30,180,100,25);
	    getContentPane().add(lbllapicerofaber);
	    
	    JLabel lbllapiceropilot = new JLabel("Lapicero pilot:");
	    lbllapiceropilot.setBounds(30,210,100,25);
	    getContentPane().add(lbllapiceropilot);
	    
	    txtCuaderno = new JTextField();
	    txtCuaderno.setBounds(120,30,100,25);
	    txtCuaderno.setMargin(new Insets(2,5,2,5));
	    txtCuaderno.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCuaderno);
	    
	    txtLapicero = new JTextField();
	    txtLapicero.setBounds(120,120,200,25);
	    txtLapicero.setFocusable(false);
	    txtLapicero.setMargin(new Insets(2,5,2,5));
	    txtLapicero.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtLapicero);
	    
	    txtLapicerolucas = new JTextField();
	    txtLapicerolucas.setBounds(120,150,200,25);
	    txtLapicerolucas.setFocusable(false);
	    txtLapicerolucas.setMargin(new Insets(2,5,2,5));
	    txtLapicerolucas.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtLapicerolucas);
	    
	    txtLapicerofaber = new JTextField();
	    txtLapicerofaber.setBounds(120,180,200,25);
	    txtLapicerofaber.setFocusable(false);
	    txtLapicerofaber.setMargin(new Insets(2,5,2,5));
	    txtLapicerofaber.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtLapicerofaber);
	    
	    txtLapiceropilot = new JTextField();
	    txtLapiceropilot.setBounds(120,210,300,30);
	    txtLapiceropilot.setFocusable(false);
	    txtLapiceropilot.setMargin(new Insets(2,5,2,5));
	    getContentPane().add(txtLapiceropilot);
	    
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,60,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int cuadernos = Integer.parseInt( txtCuaderno.getText() );
		float lapicero = 0;
		float lapicerolucas = 0;
		float lapicerofaber =0;
		float lapiceropilot = 0;
		if (cuadernos <= 12)lapicero = 0; 
		else if (cuadernos >= 12 && cuadernos <= 24)lapicerolucas = 1 * (cuadernos / 4);
		else if (cuadernos >= 24 && cuadernos <= 36)lapicerofaber = 2 * (cuadernos / 4);
		else if (cuadernos >= 36)lapiceropilot = 2 * (cuadernos / 4);
		       
		DecimalFormat df = new DecimalFormat("##.00 ");
	    txtLapicero.setText( df.format(lapicero) );
	    txtLapicerolucas.setText( df.format(lapicerolucas) );
	    txtLapicerofaber.setText( df.format(lapicerofaber) );
	    txtLapiceropilot.setText( df.format(lapiceropilot)+ "y " + 1 * (cuadernos / 6)+ "  Lapicero faber y " +  1 * (cuadernos / 12 )+ " Lapicero lucas" );
		}

}
	
