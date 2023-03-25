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


public class frm32 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtPension,txtCategoria,txtDescuento,txtNuevapension,txtPromedio;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm32 frame = new frm32();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm32() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblpromedio= new JLabel("Promedio:");
	    lblpromedio.setBounds(30,30,100,25);
	    getContentPane().add(lblpromedio);
	    
	    JLabel lblcategoria = new JLabel("Categoria:");
	    lblcategoria.setBounds(30,60,100,25);
	    getContentPane().add(lblcategoria);
	    
	    JLabel lblpension = new JLabel("Pension actual:");
	    lblpension.setBounds(30,150,150,25);
	    getContentPane().add(lblpension);
	    
	    JLabel lbldescuento = new JLabel("Descuento:");
	    lbldescuento.setBounds(30,180,150,25);
	    getContentPane().add(lbldescuento);
	    
	    JLabel lblnuevapension = new JLabel("Nueva pension:");
	    lblnuevapension.setBounds(30,210,150,25);
	    getContentPane().add(lblnuevapension);
	    
	    txtPromedio = new JTextField();
	    txtPromedio.setBounds(100,30,100,25);
	    txtPromedio.setMargin(new Insets(2,5,2,5));
	    txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPromedio);
	    
	    txtCategoria = new JTextField();
	    txtCategoria.setBounds(100,60,100,25);
	    txtCategoria.setMargin(new Insets(2,5,2,5));
	    txtCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCategoria);
	    
	    txtPension = new JTextField();
	    txtPension.setBounds(150,150,100,25);
	    txtPension.setMargin(new Insets(2,5,2,5));
	    txtPension.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPension);
	    
	    txtDescuento = new JTextField();
	    txtDescuento.setBounds(150,180,100,25);
	    txtDescuento.setMargin(new Insets(2,5,2,5));
	    txtDescuento.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtDescuento);
	    
	    txtNuevapension = new JTextField();
	    txtNuevapension.setBounds(150,210,100,25);
	    txtNuevapension.setMargin(new Insets(2,5,2,5));
	    txtNuevapension.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtNuevapension);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,90,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int promedio = Integer.parseInt( txtPromedio.getText() );
		int categoria = Integer.parseInt( txtCategoria.getText() );
		
		float pensionactual = 0;
		if (categoria == 1)pensionactual = 550;
		else if (categoria == 2)pensionactual = 500;
		else if (categoria == 3)pensionactual = 450;
		else if (categoria == 4) pensionactual = 400;
		else pensionactual = 0;  

        float descuento = 0;
        if (promedio <= 13.99) descuento = 0;
        else if (promedio >= 14 && promedio <= 15.99)descuento =(float) (pensionactual * 0.10);
        else if (promedio >= 16 && promedio <= 17.99)descuento =(float) (pensionactual * 0.12);
        else if (promedio >= 18 && promedio <= 20)descuento =(float) (pensionactual * 0.15);
        else descuento = 0;   
        double nuevapension = pensionactual - descuento;
		
		DecimalFormat df = new DecimalFormat("##.00 ");
		txtPension.setText( df.format(pensionactual) );
		txtDescuento.setText( df.format(descuento) );
		txtNuevapension.setText( df.format(nuevapension) );
		
		    
		}

}