package helloworld;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HelloWorld extends JFrame implements ActionListener{
    
    private JLabel mensaje;
    private JButton boton;
    private JTextField caja;
    private JTextField caja2;
    
    public HelloWorld(){
        super();
        configurarVentana();
        crearComponentes();
    }
    
    private void configurarVentana(){
        this.setTitle("Hello World!");
        this.setSize(300,200);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
    }
    
    private void crearComponentes(){
        mensaje = new JLabel();
        mensaje.setText("Hello World!");
        mensaje.setBounds(100, 30, 100, 30);
        mensaje.setForeground(Color.blue);
        this.add(mensaje);
        
        caja = new JTextField();
        caja.setBounds(90, 60, 100, 30);
        this.add(caja);
        
        caja2 = new JTextField();
        caja2.setBounds(90, 90, 100, 30);
        this.add(caja2);
        
        boton = new JButton();
        boton.setText("Clickéame");
        boton.setBounds(90, 120, 100, 20);
        boton.setForeground(Color.blue);
        boton.addActionListener(this);
        this.add(boton);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String resultado1 = caja.getText();
        String resultado2 = caja2.getText();
        int valorA = Integer.parseInt(resultado1);
        int valorB = Integer.parseInt(resultado2);
        int suma = valorA + valorB;
        JOptionPane.showMessageDialog(this, "El valor 1 es:  "+resultado1 +"\n"+"El valor 2 es:  "+resultado2+"\n"+"La suma es:  "+suma);
    }
    public static void main(String[] args){
        HelloWorld ventana = new HelloWorld();
        ventana.setVisible(true);
    }
}