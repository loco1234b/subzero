package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.print.DocFlavor.STRING;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm38 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtMes,txtAño,txtEstado,txtNumero,txtDias;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm38 frame = new frm38();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm38() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblnumero= new JLabel("Numero:");
	    lblnumero.setBounds(30,30,100,25);
	    getContentPane().add(lblnumero);
	    
	    JLabel lblaño = new JLabel("Año:");
	    lblaño.setBounds(30,60,100,25);
	    getContentPane().add(lblaño);
	    
	    JLabel lblmes = new JLabel("Mes:");
	    lblmes.setBounds(30,150,100,25);
	    getContentPane().add(lblmes);
	    
	    JLabel lbldias = new JLabel("Dias del mes:");
	    lbldias.setBounds(30,180,100,25);
	    getContentPane().add(lbldias);
	    
	    JLabel lblestado = new JLabel("Estado:");
	    lblestado.setBounds(30,210,100,25);
	    getContentPane().add(lblestado);
	   
	    txtNumero = new JTextField();
	    txtNumero.setBounds(100,30,100,25);
	    txtNumero.setMargin(new Insets(2,5,2,5));
	    txtNumero.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNumero);
	    
	    txtAño = new JTextField();
	    txtAño.setBounds(100,60,100,25);
	    txtAño.setMargin(new Insets(2,5,2,5));
	    txtAño.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtAño);
	    
	    txtMes = new JTextField();
	    txtMes.setBounds(110,150,120,25);
	    txtMes.setFocusable(false);
	    txtMes.setMargin(new Insets(2,5,2,5));
	    txtMes.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtMes);
	    
	    txtDias = new JTextField();
	    txtDias.setBounds(110,180,120,25);
	    txtDias.setFocusable(false);
	    txtDias.setMargin(new Insets(2,5,2,5));
	    txtDias.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDias);
	    
	    txtEstado = new JTextField();
	    txtEstado.setBounds(110,210,120,25);
	    txtEstado.setFocusable(false);
	    txtEstado.setMargin(new Insets(2,5,2,5));
	    txtEstado.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtEstado);
	    
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,90,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int mes = Integer.parseInt( txtNumero.getText() );
		int año = Integer.parseInt( txtAño.getText() );
		
		String d = "";
		if (mes == 1)d = "ENERO";
		else if (mes == 2)d = "FEBRERO";
		else if (mes == 3)d= "MARZO";
		else if (mes == 4)d="ABRIL";
		else if (mes == 5)d ="MAYO";
	    else if (mes == 6)d ="JUNIO";
		else if( mes == 7)d="JULIO";
		else if (mes == 8)d="AGOSTO";
		else if (mes == 9)d="SETIEMBRE";
	    else if (mes == 10)d="OCTUBRE";
		else if (mes == 11)d="NOVIEMBRE";
		else if (mes == 12)d="DICIEMBRE";
		else d="Mes incorrecto";
		   txtMes.setText(d); 
		
		String dias ="";
		if (mes == 1)dias = "31";
		else if (mes == 2)dias = "29";
		else if (mes == 3)dias = "31"; 
		else if (mes == 4)dias = "30" ;
		else if (mes == 5)dias = "31";
	    else if (mes == 6)dias = "30";
		else if( mes == 7)dias = "31";
		else if (mes == 8)dias = "31";
		else if (mes == 9)dias = "30";
	    else if (mes == 10)dias = "31";
		else if (mes == 11)dias = "30";
		else if (mes == 12)dias = "31";
		else d="Mes incorrecto";
        txtDias.setText(dias);
        
        String a ="";
		if (año % 4 ==0 && año % 100!= 0 && año % 400!= 0)a ="AÑO BISIESTO"; 
		else a ="AÑO NO BISIESTO";
		txtEstado.setText(a); 
		
		}

}
	
