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


public class frm31 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtHoras,txtCategoria,txtDescuento,txtSueldobruto,txtSueldoneto;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm31 frame = new frm31();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm31() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblhoras= new JLabel("Horas:");
	    lblhoras.setBounds(30,30,100,25);
	    getContentPane().add(lblhoras);
	    
	    JLabel lblcategoria = new JLabel("Categoria:");
	    lblcategoria.setBounds(30,60,100,25);
	    getContentPane().add(lblcategoria);
	    
	    JLabel lblsueldobruto = new JLabel("Sueldo bruto:");
	    lblsueldobruto.setBounds(30,150,150,25);
	    getContentPane().add(lblsueldobruto);
	    
	    JLabel lbldescuento = new JLabel("Descuento:");
	    lbldescuento.setBounds(30,180,150,25);
	    getContentPane().add(lbldescuento);
	    
	    JLabel lblsueldoneto = new JLabel("Sueldo neto:");
	    lblsueldoneto.setBounds(30,210,150,25);
	    getContentPane().add(lblsueldoneto);
	    
	    txtHoras = new JTextField();
	    txtHoras.setBounds(100,30,100,25);
	    txtHoras.setMargin(new Insets(2,5,2,5));
	    txtHoras.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtHoras);
	    
	    txtCategoria = new JTextField();
	    txtCategoria.setBounds(100,60,100,25);
	    txtCategoria.setMargin(new Insets(2,5,2,5));
	    txtCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCategoria);
	    
	    txtSueldobruto = new JTextField();
	    txtSueldobruto.setBounds(150,150,100,25);
	    txtSueldobruto.setMargin(new Insets(2,5,2,5));
	    txtSueldobruto.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtSueldobruto);
	    
	    txtDescuento = new JTextField();
	    txtDescuento.setBounds(150,180,100,25);
	    txtDescuento.setMargin(new Insets(2,5,2,5));
	    txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDescuento);
	    
	    txtSueldoneto = new JTextField();
	    txtSueldoneto.setBounds(150,210,100,25);
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
		int categoria = Integer.parseInt( txtCategoria.getText() );
		
		float pago = 0;
		if (categoria == 1)pago = 21;
		else if (categoria == 2)pago =(float) 19.50;
		else if (categoria == 3)pago = 17; 
		else if (categoria == 4)pago = (float)15.50;
		else pago = 0;  

		double sueldobruto = horas * pago;
        float descuento = 0;
		if (sueldobruto >= 2500)descuento =(float) (sueldobruto * 0.20);   
		else  descuento = (float)(sueldobruto * 0.15);
		   

		double sueldoneto = sueldobruto - descuento;
		
		DecimalFormat df = new DecimalFormat("##.00 ");
		txtSueldobruto.setText( df.format(sueldobruto) );
		txtDescuento.setText( df.format(descuento) );
		txtSueldoneto.setText( df.format(sueldoneto) );
		
				
		    
		}

}