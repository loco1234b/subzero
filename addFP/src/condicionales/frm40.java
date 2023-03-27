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


public class frm40 extends JFrame {
    private static final long serialVersionUID = 1L;
    
	JTextField txtPromedio,txtPractica1,txtPractica2,txtPractica3,txtExamenparcial,txtExamenfinal,txtEstado;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frm40 frame = new frm40();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public frm40() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0,0,500,350);
		setLayout(null);
		setLocationRelativeTo(null);
		
	    JLabel lblmatematica= new JLabel("Matematica:");
	    lblmatematica.setBounds(30,30,150,25);
	    getContentPane().add(lblmatematica);
	    
	    JLabel lbln1 = new JLabel("Practica 1:");
	    lbln1.setBounds(30,60,150,25);
	    getContentPane().add(lbln1);
	    
	    JLabel lbln2 = new JLabel("Practica 2:");
	    lbln2.setBounds(30,90,150,25);
	    getContentPane().add(lbln2);
	    
	    JLabel lbln3 = new JLabel("Practica 3:");
	    lbln3.setBounds(30,120,150,25);
	    getContentPane().add(lbln3);
	    
	    JLabel lblexamenparcial = new JLabel("Examen parcial:");
	    lblexamenparcial.setBounds(30,150,150,25);
	    getContentPane().add(lblexamenparcial);
	    
	    JLabel lblexamenfinal = new JLabel("Examen final:");
	    lblexamenfinal.setBounds(30,180,150,25);
	    getContentPane().add(lblexamenfinal);
	    
	    JLabel lblestado = new JLabel("Estado:");
	    lblestado.setBounds(30,210,150,25);
	    getContentPane().add(lblestado);
	    
	    JLabel lblpromedio = new JLabel("Promedio:");
	    lblpromedio.setBounds(30,240,150,25);
	    getContentPane().add(lblpromedio);
	    

	    txtPractica1 = new JTextField();
	    txtPractica1.setBounds(130,60,50,25);
	    txtPractica1.setMargin(new Insets(2,5,2,5));
	    txtPractica1.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPractica1);
	    
	    txtPractica2 = new JTextField();
	    txtPractica2.setBounds(130,90,50,25);
	    txtPractica2.setMargin(new Insets(2,5,2,5));
	    txtPractica2.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPractica2);
	    
	    txtPractica3 = new JTextField();
	    txtPractica3.setBounds(130,120,50,25);
	    txtPractica3.setMargin(new Insets(2,5,2,5));
	    txtPractica3.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPractica3);
	    
	    txtExamenparcial = new JTextField();
	    txtExamenparcial.setBounds(130,150,50,25);
	    txtExamenparcial.setMargin(new Insets(2,5,2,5));
	    txtExamenparcial.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtExamenparcial);
	   
	    txtExamenfinal = new JTextField();
	    txtExamenfinal.setBounds(130,180,50,25);
	    txtExamenfinal.setMargin(new Insets(2,5,2,5));
	    txtExamenfinal.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtExamenfinal);
	   
	    txtEstado = new JTextField();
	    txtEstado.setBounds(130,210,100,25);
	    txtEstado.setFocusable(false);
	    txtEstado.setMargin(new Insets(2,5,2,5));
	    txtEstado.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtEstado);
	    
	    txtPromedio = new JTextField();
	    txtPromedio.setBounds(130,240,100,25);
	    txtPromedio.setFocusable(false);
	    txtPromedio.setMargin(new Insets(2,5,2,5));
	    txtPromedio.setHorizontalAlignment(SwingConstants.RIGHT);
	    getContentPane().add(txtPromedio);
	    
	  
	    JButton btnCalcular = new JButton("Calcular");
	    btnCalcular.setBounds(30,270,100,25);
	    btnCalcular.setFocusPainted(false);
	    getContentPane().add(btnCalcular);
	    
	    btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { btnCalcular_actionPerformed();	} });
	}
	
	protected void btnCalcular_actionPerformed() {
		int practica1m = Integer.parseInt( txtPractica1.getText() );
		int practica2m = Integer.parseInt( txtPractica2.getText() );
		int practica3m = Integer.parseInt( txtPractica3.getText() );
		int examenparcialm = Integer.parseInt( txtExamenparcial.getText() );
		int examenfinalm = Integer.parseInt( txtExamenfinal.getText() );
		
	
		double promedio = (practica1m + practica2m + practica3m + examenparcialm + examenfinalm) /5;
        String a = "";
		if (promedio >=13 && promedio <=20)a= "Aprobo";		    
	    else a = "Desaprobo";
		txtEstado.setText(a);

		DecimalFormat df = new DecimalFormat("##.##");
		txtPromedio.setText(df.format(promedio));
			

				
		}

}
	
