import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalculadoraGrafica  {
   public static void main (String[]args){
      Calculator calc = new Calculator();
   }
}

class Calculator extends JFrame {
   JTextField txtBlanco, txtMostrar, txtResultado;
   JButton btnDel, btnBorrar, btnPunto, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnMas, btnMenos, btnMul, btnDiv, btnIgual;
   JPanel panel;
   JLabel lblTitulo1, lblTitulo2;
     
   public Calculator() {
      setSize(500,800);
      
      setTitle("Calculadora Grafica");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setResizable(false);
      setVisible(true);
      
      initComponents();
   }
   
   private void initComponents(){
      
      setBounds(750,200,500,700);
      
      txtMostrar = new JTextField("", 25);
      txtMostrar.setEditable(false);
      txtMostrar.setFont(new Font("Arial", Font.BOLD, 15));
      txtResultado = new JTextField("", 25);
      txtResultado.setEditable(false);
      txtResultado.setFont(new Font("Arial", Font.BOLD, 15));
            
      btnDel = new JButton("DEL");
      btnDel.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent evt){
            NumberInteraction(evt);
         }
      });
      btnDel.setFont(new Font("Arial", Font.BOLD, 30));
      
      btnBorrar = new JButton("C");
      btnBorrar.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent evt){
            NumberInteraction(evt);
         }
      });
      btnBorrar.setFont(new Font("Arial", Font.BOLD, 30));
      
      btnPunto = new JButton(".");
      btnPunto.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent evt){
            NumberInteraction(evt);
         }
      });
      btnPunto.setFont(new Font("Arial", Font.BOLD, 30));
      
      btn1 = new JButton("1");      
      btn1.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent evt){
            NumberInteraction(evt);
         }
      });
      btn1.setFont(new Font("Arial", Font.BOLD, 30));
      
      btn2 = new JButton("2");
      btn2.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent evt){
            NumberInteraction(evt);
         }
      });
      btn2.setFont(new Font("Arial", Font.BOLD, 30));
      
      btn3 = new JButton("3");
      btn3.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent evt){
            NumberInteraction(evt);
         }
      });
      btn3.setFont(new Font("Arial", Font.BOLD, 30));
      
      btn4 = new JButton("4");
      btn4.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent evt){
            NumberInteraction(evt);
         }
      });
      btn4.setFont(new Font("Arial", Font.BOLD, 30));
      
      btn5 = new JButton("5");
      btn5.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent evt){
            NumberInteraction(evt);
         }
      });
      btn5.setFont(new Font("Arial", Font.BOLD, 30));
      
      btn6 = new JButton("6");
      btn6.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent evt){
            NumberInteraction(evt);
         }
      });
      btn6.setFont(new Font("Arial", Font.BOLD, 30));
      
      btn7 = new JButton("7");
      btn7.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent evt){
            NumberInteraction(evt);
         }
      });
      btn7.setFont(new Font("Arial", Font.BOLD, 30));
      
      btn8 = new JButton("8");
      btn8.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent evt){
            NumberInteraction(evt);
         }
      });
      btn8.setFont(new Font("Arial", Font.BOLD, 30));
      
      btn9 = new JButton("9");
      btn9.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent evt){
            NumberInteraction(evt);
         }
      });
      btn9.setFont(new Font("Arial", Font.BOLD, 30));
      
      btn0 = new JButton("0");
      btn0.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent evt){
            NumberInteraction(evt);
         }
      });
      btn0.setFont(new Font("Arial", Font.BOLD, 30));
      
      btnMas = new JButton("+");
      btnMas.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent evt){
            NumberInteraction(evt);
         }
      });
      btnMas.setFont(new Font("Arial", Font.BOLD, 30));
      
      btnMenos = new JButton("-");
      btnMenos.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent evt){
            NumberInteraction(evt);
         }
      });
      btnMenos.setFont(new Font("Arial", Font.BOLD, 30));
      
      btnMul = new JButton("*");
      btnMul.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent evt){
            NumberInteraction(evt);
         }
      });
      btnMul.setFont(new Font("Arial", Font.BOLD, 30));
      
      btnDiv = new JButton("/");
      btnDiv.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent evt){
            NumberInteraction(evt);
         }
      });
      btnDiv.setFont(new Font("Arial", Font.BOLD, 30));
      
      btnIgual = new JButton("=");
      btnIgual.addActionListener(new ActionListener(){
         public void actionPerformed(ActionEvent evt){
            NumberInteraction(evt);
         }
      });    
      btnIgual.setFont(new Font("Arial", Font.BOLD, 30));
      
      panel = new JPanel();
      panel.setLayout(new GridLayout(0,4,5,20));

      lblTitulo1 = new JLabel("<html>Expresion<br> original</html>");
      lblTitulo1.setFont(new Font("Arial", Font.BOLD, 18));
      txtBlanco = new JTextField("", 25);
      txtBlanco.setEditable(false);
      lblTitulo2 = new JLabel("<html>Expresion<br> final</html>");
      lblTitulo2.setFont(new Font("Arial", Font.BOLD, 18));
      panel.add(lblTitulo1);
     
      panel.add(txtMostrar);
      panel.add(lblTitulo2);
      
      
      panel.add(txtResultado);
      
      panel.add(btnDel);
      panel.add(btnBorrar);
      panel.add(btnMas);
      panel.add(btnMenos);
      
      panel.add(btn1);
      panel.add(btn2);
      panel.add(btn3);
      panel.add(btnMul);
      
      panel.add(btn4);
      panel.add(btn5);      
      panel.add(btn6);
      panel.add(btnDiv);
      
      panel.add(btn7);      
      panel.add(btn8);
      panel.add(btn9);
      panel.add(txtBlanco);
      
      panel.add(btnPunto);
      panel.add(btn0);      
      
      
      panel.add(btnIgual);
      setContentPane(panel);
      setVisible(true);
 
   }
   
   private void NumberInteraction(ActionEvent evt) {
      if(evt.getSource() == btnDel) {
         if(txtMostrar.getText().length() > 0){
            String aux = txtMostrar.getText();
            aux = aux.substring(0,aux.length()-1);
            txtMostrar.setText(aux);
         }
      }
      if(evt.getSource() == btnBorrar) {
         txtMostrar.setText("");
         txtResultado.setText("");
      }
      if(evt.getSource() == btnPunto) {
         txtMostrar.setText(txtMostrar.getText() + ".");
      }

      if(evt.getSource() == btn1) {
         txtMostrar.setText(txtMostrar.getText() + "1");
      }
      if(evt.getSource() == btn2) {
         txtMostrar.setText(txtMostrar.getText() + "2");
      }
      if(evt.getSource() == btn3) {
         txtMostrar.setText(txtMostrar.getText() + "3");
      }
      if(evt.getSource() == btn4) {
         txtMostrar.setText(txtMostrar.getText() + "4");
      }
      if(evt.getSource() == btn5) {
         txtMostrar.setText(txtMostrar.getText() + "5");
      }
      if(evt.getSource() == btn6) {
         txtMostrar.setText(txtMostrar.getText() + "6");
      }
      if(evt.getSource() == btn7) {
         txtMostrar.setText(txtMostrar.getText() + "7");
      }
      if(evt.getSource() == btn8) {
         txtMostrar.setText(txtMostrar.getText() + "8");
      }
      if(evt.getSource() == btn9) {
         txtMostrar.setText(txtMostrar.getText() + "9");
      }
      if(evt.getSource() == btn0) {
         txtMostrar.setText(txtMostrar.getText() + "0");
      }
      if(evt.getSource() == btnMas) {
         txtMostrar.setText(txtMostrar.getText() + "+");
      }
      if(evt.getSource() == btnMenos) {
         txtMostrar.setText(txtMostrar.getText() + "-");
      }
      if(evt.getSource() == btnMul) {
         txtMostrar.setText(txtMostrar.getText() + "*");
      }
      if(evt.getSource() == btnDiv) {
         txtMostrar.setText(txtMostrar.getText() + "/");
      }
      if(evt.getSource() == btnIgual) {
         boolean mas = false, menos = false, mul = false, div = false, operador = false;
         String resultado = txtMostrar.getText();
         double operacion = 0, auxiliar = 0;
         String cadenaOperacion = "";
         if(txtMostrar.getText().length() == 0){
            
         }  else if(resultado.charAt(resultado.length()-1) == '+' || resultado.charAt(resultado.length()-1) == '-' || resultado.charAt(resultado.length()-1) == '*' || resultado.charAt(resultado.length()-1) == '/' || resultado.charAt(resultado.length()-1) == '.') {
            JOptionPane.showMessageDialog(null, "No puedes terminar asi la expresion", "ERROR",JOptionPane.ERROR_MESSAGE);
            txtMostrar.setText("");
         }  else  {
            for(int x = 0; x < resultado.length(); x++) {
               if(resultado.charAt(x) == '1') {
                  cadenaOperacion = cadenaOperacion + '1';
                  operacion = Double.parseDouble(cadenaOperacion);
                  operador = false;
               
               }  else if (resultado.charAt(x) == '.') {
                  cadenaOperacion = cadenaOperacion + '.';
                  if(operador) {
                     JOptionPane.showMessageDialog(null, "Expresion invalida", "ERROR",JOptionPane.ERROR_MESSAGE);
                        txtMostrar.setText("");
                        txtResultado.setText("");
                        break;
                  }
                  operador = true;
   
               }  else if (resultado.charAt(x) == '2') {
                  cadenaOperacion = cadenaOperacion + '2';
                  operacion = Double.parseDouble(cadenaOperacion);              
                  operador = false;
                             
               }  else if (resultado.charAt(x) == '3') {
                  cadenaOperacion = cadenaOperacion + '3';
                  operacion = Double.parseDouble(cadenaOperacion);
                  operador = false;
               
               }  else if (resultado.charAt(x) == '4') {
                  cadenaOperacion = cadenaOperacion + '4';
                  operacion = Double.parseDouble(cadenaOperacion);
                  operador = false;
               
               }  else if (resultado.charAt(x) == '5') {
                  cadenaOperacion = cadenaOperacion + '5';
                  operacion = Double.parseDouble(cadenaOperacion);
                  operador = false;
               
               }  else if (resultado.charAt(x) == '6') {
                  cadenaOperacion = cadenaOperacion + '6';
                  operacion = Double.parseDouble(cadenaOperacion);
                  operador = false;
                  
               }  else if (resultado.charAt(x) == '7') {
                  cadenaOperacion = cadenaOperacion + '7';
                  operacion = Double.parseDouble(cadenaOperacion);
                  operador = false;
               
               }  else if (resultado.charAt(x) == '8') {
                  cadenaOperacion = cadenaOperacion + '8';
                  operacion = Double.parseDouble(cadenaOperacion);
                  operador = false;
               
               }  else if (resultado.charAt(x) == '9') {
                  cadenaOperacion = cadenaOperacion + '9';
                  operacion = Double.parseDouble(cadenaOperacion);
                  operador = false;
               
               }  else if (resultado.charAt(x) == '0') {
                  cadenaOperacion = cadenaOperacion + '0';
                  operacion = Double.parseDouble(cadenaOperacion);
                  operador = false;
               
               }  else if (resultado.charAt(x) == '+') {
                  if(mas) operacion = auxiliar + operacion;
                  if(menos) operacion = auxiliar - operacion;
                  if(mul) operacion = auxiliar * operacion;
                  if(div) {
                     if(operacion == 0) {
                        JOptionPane.showMessageDialog(null, "Division entre 0", "ERROR",JOptionPane.ERROR_MESSAGE);
                        txtMostrar.setText("");
                        txtResultado.setText("");
                     }  else  {   
                        operacion = auxiliar / operacion;
                     }
                  }
                  if(operador) {
                     JOptionPane.showMessageDialog(null, "Expresion invalida", "ERROR",JOptionPane.ERROR_MESSAGE);
                        txtMostrar.setText("");
                        txtResultado.setText("");
                        break;
                  }
                  mas = true;
                  menos = false;
                  mul = false;
                  div = false;
                  operador = true;              
                  
                  auxiliar = operacion;
                  operacion = 0;
                  cadenaOperacion = "";
               }  else if (resultado.charAt(x) == '-') {
                  if(mas) operacion = auxiliar + operacion;
                  if(menos) operacion = auxiliar - operacion;
                  if(mul) operacion = auxiliar * operacion;
                  if(div) {
                     if(operacion == 0) {
                        JOptionPane.showMessageDialog(null, "Division entre 0", "ERROR",JOptionPane.ERROR_MESSAGE);
                        txtMostrar.setText("");
                        txtResultado.setText("");
                     }  else  {   
                        operacion = auxiliar / operacion;
                     }
                  }
                  if(operador) {
                     JOptionPane.showMessageDialog(null, "Expresion invalida", "ERROR",JOptionPane.ERROR_MESSAGE);
                        txtMostrar.setText("");
                        txtResultado.setText("");
                        break;
                  }

                  
                  mas = false;
                  menos = true;
                  mul = false;
                  div = false;              
                  operador = true;
                  auxiliar = operacion;
                  operacion = 0;
                  cadenaOperacion = "";
               }  else if (resultado.charAt(x) == '*') {
                  if(mas) operacion = auxiliar + operacion;
                  if(menos) operacion = auxiliar - operacion;
                  if(mul) operacion = auxiliar * operacion;
                  if(div) {
                     if(operacion == 0) {
                        JOptionPane.showMessageDialog(null, "Division entre 0", "ERROR",JOptionPane.ERROR_MESSAGE);
                        txtMostrar.setText("");
                        txtResultado.setText("");
                     }  else  {   
                        operacion = auxiliar / operacion;
                     }
                  }
                  if(operador) {
                     JOptionPane.showMessageDialog(null, "Expresion invalida", "ERROR",JOptionPane.ERROR_MESSAGE);
                        txtMostrar.setText("");
                        txtResultado.setText("");
                        break;
                  }

                  operador = true;
                  
                  mas = false;
                  menos = false;
                  mul = true;
                  div = false;              
                  
                  auxiliar = operacion;
                  operacion = 0;
                  cadenaOperacion = "";
               }  else if (resultado.charAt(x) == '/') {
                  if(mas) operacion = auxiliar + operacion;
                  if(menos) operacion = auxiliar - operacion;
                  if(mul) operacion = auxiliar * operacion;
                  if(div) {
                     if(operacion == 0) {
                        JOptionPane.showMessageDialog(null, "Division entre 0", "ERROR",JOptionPane.ERROR_MESSAGE);
                        txtMostrar.setText("");
                        txtResultado.setText("");
                     }  else  {   
                        operacion = auxiliar / operacion;
                     }
                  }
                  if(operador) {
                     JOptionPane.showMessageDialog(null, "Expresion invalida", "ERROR",JOptionPane.ERROR_MESSAGE);
                        txtMostrar.setText("");
                        txtResultado.setText("");
                        break;
                  }

                  operador = true;
                  
                  mas = false;
                  menos = false;
                  mul = false;
                  div = true;              
                  
                  auxiliar = operacion;
                  operacion = 0;
                  cadenaOperacion = "";
               }
            }
            boolean infinito = false;
            if(mas) operacion = auxiliar + operacion;
            if(menos) operacion = auxiliar - operacion;
            if(mul) operacion = auxiliar * operacion;
            if(div) {
               if(operacion == 0) {
                  JOptionPane.showMessageDialog(null, "Division entre 0", "ERROR",JOptionPane.ERROR_MESSAGE);
                  txtMostrar.setText("");
                  txtResultado.setText("");
                  infinito = true;
               }  else  {   
                  operacion = auxiliar / operacion;
               }
            }
            

            
            resultado = String.format("%.2f", operacion);
            txtResultado.setText(resultado);
            if(infinito)txtResultado.setText("");
            
            cadenaOperacion = "";
            if(operador) {
               txtMostrar.setText("");
               txtResultado.setText("");                  
            }                      
         }
      }
   }
   
}