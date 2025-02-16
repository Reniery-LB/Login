package login;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ventana extends JFrame{

	public Ventana() {
		this.setTitle("Login");
		this.setVisible(true);
		this.setSize(500,500);
		
		this.setLocationRelativeTo(null);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//this.setResizable(true);
		this.setMaximumSize(new Dimension(800,800));
		this.setMinimumSize(new Dimension(400,400));
		
		this.add(this.login());
		this.repaint();
	}
	
	public JPanel login()
	{
		JPanel mipanel = new JPanel();
		
		mipanel.setBackground(Color.decode("#EFF3EA"));
		mipanel.setOpaque(true);
		mipanel.setSize(500,500);
		mipanel.setLocation(0,0);
		mipanel.setLayout(null); //QUITA EL MOLDE
		
		//TITULO
		JLabel titulo = new JLabel("BIENVENIDO");
		titulo.setSize(200, 30);
		titulo.setOpaque(true);
		titulo.setBackground(Color.decode("#D9DFC6")); 
		titulo.setLocation(150, 30);
		titulo.setHorizontalAlignment(JLabel.CENTER);
		titulo.setFont(new Font("Britannic",Font.BOLD,24));
		
		mipanel.add(titulo);
		//-------------------
		//NOMBRE
		JLabel nombreLabel = new JLabel("Nombre de Usuario");
		nombreLabel.setSize(150, 30);
		nombreLabel.setOpaque(true);
		nombreLabel.setBackground(Color.decode("#F9F6E6")); 
		nombreLabel.setLocation(30, 110);
		nombreLabel.setFont(new Font("Britannic",Font.BOLD,16));
		
		mipanel.add(nombreLabel);
		
		JTextField nombreField = new JTextField();
		nombreField.setSize(300, 30);
		nombreField.setLocation(30, 150);
		nombreField.setFont(new Font("Britannic",Font.BOLD,13));
		
		mipanel.add(nombreField);
		//-----------------------
		//CONTRASEÑA
		JLabel contraLabel = new JLabel("Contraseña");
		contraLabel.setSize(150, 30);
		contraLabel.setOpaque(true);
		contraLabel.setBackground(Color.decode("#F9F6E6")); 
		contraLabel.setLocation(30, 200);
		contraLabel.setFont(new Font("Britannic",Font.BOLD,16));
		
		mipanel.add(contraLabel);
		
		JTextField contraField = new JTextField();
		contraField.setSize(300, 30);
		contraField.setLocation(30, 240);
		contraField.setFont(new Font("Britannic",Font.BOLD,13));
		
		mipanel.add(contraField);
		//--------------------------
		//CHECKBOX
		JCheckBox check = new JCheckBox("Recordarme");
		check.setSize(150, 50);
		check.setLocation(25, 260);
		check.setOpaque(false);
		
		mipanel.add(check);
		//----------------------------
		JLabel olvido = new JLabel("¿Olvidó su contraseña?");
		olvido.setSize(150, 30);
		olvido.setLocation(190, 270);
		olvido.setFont(new Font("Britannic",Font.BOLD,12));
		
		mipanel.add(olvido);
		//-----------------------------
		//BOTON
		JButton acceder = new JButton("ACCEDER");
		acceder.setSize(150, 40);
		acceder.setLocation(100, 350);
		acceder.setFont(new Font("Britannic",Font.BOLD,16));
		
		mipanel.add(acceder);
		return mipanel;
	}

}
