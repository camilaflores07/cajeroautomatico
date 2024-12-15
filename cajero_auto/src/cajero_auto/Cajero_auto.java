/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cajero_auto;

import javax.swing.JOptionPane;

public class Cajero_auto {

   
    public static void main(String[] args) {
        // cajero 
        final int saldo_i=2000;
        int opcion;
        float deposito,saldoactual,retiro;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Favor seleccione una opción:\n"
        +"1. Deposito\n"
        +"2. Retiro\n"
        +"3. Salir"));
    switch (opcion){  
        case 1:
            deposito=Float.parseFloat(JOptionPane.showInputDialog("Favor ingresar el valor a depositar"));
            if(deposito>=1){
                saldoactual=deposito+saldo_i;
                JOptionPane.showMessageDialog(null,"Su saldo actual es: "+saldoactual);
            }
            else{
               JOptionPane.showMessageDialog(null,"No esta permitido ingresar valores negativos");  
            }

             break;
        case 2:
            retiro=Float.parseFloat(JOptionPane.showInputDialog(" Favor ingresr a cantidad que necesita retirar: "));
            if (retiro>saldo_i){
                JOptionPane.showConfirmDialog( null, "Saldo insuficiente");
            //toda condicion lleva llaves
            }
            else{
                if (retiro>=1){
                    saldoactual=saldo_i-retiro;
                    JOptionPane.showMessageDialog(null, "Su saldo actual es: "+saldoactual);    
                }
                else{
                          JOptionPane.showMessageDialog(null, "No estan permitidos valores negativos");  
                        }
            }
            break;
        case 3: break;
        default: JOptionPane.showMessageDialog(null, "Seleccion incorrecta");
        
}
              
      
      }
    
}
