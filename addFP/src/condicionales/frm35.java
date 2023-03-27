package condicionales;

import java.awt.EventQueue;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


public class frm35 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtCodigo,txtEmpleado;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm35 frame = new frm35();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm35() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblcodigo= new JLabel("Codigo:");
	    lblcodigo.setBounds(30,30,100,25);
	    getContentPane().add(lblcodigo);
	    
	    JLabel lblempleado = new JLabel("Empleado:");
	    lblempleado.setBounds(30,60,100,25);
	    getContentPane().add(lblempleado);
	    
	    txtCodigo = new JTextField();
	    txtCodigo.setBounds(120,30,100,25);
	    txtCodigo.setMargin(new Insets(2,5,2,5));
	    txtCodigo.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtCodigo);
	    
	    txtEmpleado = new JTextField();
	    txtEmpleado.setBounds(120,60,180,25);
	    txtEmpleado.setFocusable(false);
	    txtEmpleado.setMargin(new Insets(2,5,2,5));
	    txtEmpleado.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtEmpleado);
	    
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,90,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int codigo = Integer.parseInt( txtCodigo.getText() );
		
		String d = "";
		if (codigo % 2 ==0 && codigo % 3 ==0 && codigo % 5 ==0)d ="Tipo administrativo";
		else if (codigo % 3 ==0 && codigo % 5 ==0 && codigo % 2 !=0)d="Tipo directivo";
		else if (codigo % 2 ==0 && codigo % 3 !=0 && codigo % 5 !=0)d ="Tipo vendedor";
		else if (codigo % 2!=0 && codigo % 3 !=0 && codigo % 5 !=0)d="Tipo seguridad";
		else d= "ERROR";
		  
		txtEmpleado.setText(d);
		}

}