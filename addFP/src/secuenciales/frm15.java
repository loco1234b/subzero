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


public class frm15 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtJuan,txtRosa,txtDaniel,txtDanieldolares,txtCapital,txtAporte;
	JLabel lblJuan,lblRosa,lblDaniel,lblDanieldolares,lblCapital,lblAportejuan,lblAporterosa,lblAportedaniel;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm15 frame = new frm15();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm15() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblJuan = new JLabel("Juan $:");
	    lblJuan.setBounds(30,30,80,25);
	    getContentPane().add(lblJuan);
	    
	    JLabel lblRosa = new JLabel("Rosa $:");
	    lblRosa.setBounds(30,60,80,25);
	    getContentPane().add(lblRosa);
	    
	    JLabel lblDaniel = new JLabel("Daniel S/:");
	    lblDaniel.setBounds(30,90,80,25);
	    getContentPane().add(lblDaniel);
	    
	    JLabel lblDanieldolares = new JLabel("daniel a $:");
	    lblDanieldolares.setBounds(30,150,80,25);
	    getContentPane().add(lblDanieldolares);
	    
	    JLabel lblCapital = new JLabel("capital $:");
	    lblCapital.setBounds(30,180,80,25);
	    getContentPane().add(lblCapital);
	    
	    
	    txtJuan = new JTextField();
	    txtJuan.setBounds(100,30,80,25);
	    txtJuan.setMargin(new Insets(2,5,2,5));
	    txtJuan.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtJuan);
	    
	    txtRosa = new JTextField();
	    txtRosa.setBounds(100,60,80,25);
	    txtRosa.setMargin(new Insets(2,5,2,5));
	    txtRosa.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtRosa);
	    
	    txtDaniel = new JTextField();
	    txtDaniel.setBounds(100,90,80,25);
	    txtDaniel.setMargin(new Insets(2,5,2,5));
	    txtDaniel.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDaniel);
	    
	    txtDanieldolares = new JTextField();
	    txtDanieldolares.setBounds(110,150,80,25);
	    txtDanieldolares.setFocusable(false);
	    txtDanieldolares.setMargin(new Insets(2,5,2,5));
	    txtDanieldolares.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDanieldolares);
	    
	    txtCapital = new JTextField();
	    txtCapital.setBounds(110,180,80,25);
	    txtCapital.setFocusable(false);
	    txtCapital.setMargin(new Insets(2,5,2,5));
	    txtCapital.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCapital);
	    
	    lblAportejuan = new JLabel();
	    lblAportejuan.setBounds(160,30,80,25);
	    lblAportejuan.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(lblAportejuan);
	    
	    lblAporterosa = new JLabel();
	    lblAporterosa.setBounds(160,60,80,25);
	    lblAporterosa.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(lblAporterosa);
	    
	    lblAportedaniel = new JLabel();
	    lblAportedaniel.setBounds(160,90,80,25);
	    lblAportedaniel.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(lblAportedaniel);
	    
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,120,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int juan = Integer.parseInt( txtJuan.getText() );
		int rosa = Integer.parseInt( txtRosa.getText() );
		int daniel = Integer.parseInt( txtDaniel.getText() );
		
		double danieldolares = daniel /3;
		double capital = juan + rosa + danieldolares;
		double aportejuan = (juan * 100)/ capital;
		double aporterosa = (rosa * 100)/ capital;
		double aportedaniel = (danieldolares * 100)/ capital;
		
		DecimalFormat df = new DecimalFormat("##.00");
		txtDanieldolares.setText( df.format(danieldolares)+ "$" );
		txtCapital.setText( df.format(capital)+ "$" );
		lblAportejuan.setText( df.format(aportejuan)+ "%" );
		lblAporterosa.setText( df.format(aporterosa)+ "%" );
		lblAportedaniel.setText( df.format(aportedaniel)+ "%" );
		
		}

}
