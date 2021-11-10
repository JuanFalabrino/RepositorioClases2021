
package comborelacionado101121;

import javax.swing.JOptionPane;


public class Comborelacionado101121 {


    public static void main(String[] args) {
        
        //carga de vectores
        String [] marcas = {" ","Ford","FIAT","RENAULT"};
        String [] Ford = {"Focus","Fiesta","Falcon","KA"};
        String [] FIAT = {"1500","Palio","Punto","Cubo"};
        String [] RENAULT = {"Clio","Sandero","12","Kwind"};
                  
        //Seleccion de Marcas
        Object opcion = JOptionPane.showInputDialog(null,"Seleccione una Marca","La marca de mi auto es :",JOptionPane.QUESTION_MESSAGE,null,marcas,marcas [0]);
        
        //Seleccion de modelos
        if (opcion == "Ford"){
            Object fordmodelo = JOptionPane.showInputDialog(null,"Los modelos para la marca   " + opcion ,"Modelos ",JOptionPane.QUESTION_MESSAGE,null,Ford,Ford [0]);
              //Imprimir resultados
        System.out.print("Su vehiculo es de la marca  " + opcion + " Modelo " + fordmodelo );
        }
         if (opcion == "FIAT"){
            Object Fiatmodelo = JOptionPane.showInputDialog(null,"Los modelos para la marca   " + opcion ,"Modelos ",JOptionPane.QUESTION_MESSAGE,null,FIAT,FIAT [0]);
              //Imprimir resultados
             System.out.print("Su vehiculo es de la marca  " + opcion + " Modelo " + Fiatmodelo );
        }
           if (opcion == "RENAULT"){
            Object Reanaultmodelo = JOptionPane.showInputDialog(null,"Los modelos para la marca   " + opcion ,"Modelos ",JOptionPane.QUESTION_MESSAGE,null,RENAULT,RENAULT [0]);
              //Imprimir resultados
             System.out.print("Su vehiculo es de la marca  " + opcion + " Modelo " + Reanaultmodelo );
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
