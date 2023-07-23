import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class App {
    
    public static void main(String[] args) throws Exception {
    
        Object[] options = {"Convertir Divisas", "Convertir Temperatura", "Salir"};
        int elige = JOptionPane.showOptionDialog(null, "¿Que quieres hacer?", "Conversor", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options , options[0]);

        if ( elige == 2 ) {
            JOptionPane.showMessageDialog(null , "Programa Cerrado");
            System.exit(0);
        }

        if ( elige == 0 ) {
            DecimalFormat formatearDivisa = new DecimalFormat("#.##");
            boolean continuarPrograma = true;
            
            while (continuarPrograma ) {
                String [] opciones = {"Pesos Colombianos a Euros", "Pesos Colombianos a Dolares", "Pesos Colombianos a Libras Estarlinas", "Pesos Colombianos a Yenes"};
                String cambio = (String) JOptionPane.showInputDialog(null , "Elija una opción:","Conversor de Divisas", JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

                String input = JOptionPane.showInputDialog(null, "Ingrese valor de Pesos a calcular");
                float pesos = 0.00f;

                try {
                    pesos = Float.parseFloat(input);
                } catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Valor invalido");

                }

                if (cambio.equals("Pesos Colombianos a Euros")) {
                    float euros =  pesos * 0.00023f;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos Colombianos son " + formatearDivisa.format(euros) + " Euros"); 
                } else if (cambio.equals("Pesos Colombianos a Dolares")) {
                    float dolares = pesos * 0.00025f;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos Colombianos son " + formatearDivisa.format(dolares) + " Dolares");
                } else if (cambio.equals("Pesos Colombianos a Libras Estarlinas")) {
                    float libras = pesos * 0.00020f;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos Colombianos son " + formatearDivisa.format(libras) + " Libras");
                } else if (cambio.equals("Pesos Colombianos a Libras Estarlinas")) {
                    float yenes = pesos * 0.036f;
                    JOptionPane.showMessageDialog(null, pesos + " Pesos Colombianos son " + formatearDivisa.format(yenes) + " Yenes");
                } 

                int confirma = JOptionPane.showConfirmDialog(null, "¿Continuar usando el Programa?", "confirmar", JOptionPane.YES_NO_OPTION);

                if ( confirma == JOptionPane.NO_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "App Finalizada");

                }
            }
        }

        if ( elige == 1 ) { 
            boolean continuarPrograma = true;

            while (continuarPrograma ) {
                String [] opciones = {"Fahrenheit a Celsius", "Celsius a Fahrenheit"};
                int opcion = JOptionPane.showOptionDialog(null , "Elija una opción:","Conversor de Temperatura", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opciones, opciones[0]);

                String valorNominal = JOptionPane.showInputDialog(null, "Ingrese valor a convertir");
                float valor = 0.00f;

                try {
                    valor = Float.parseFloat(valorNominal);
                } catch (NumberFormatException e){
                    JOptionPane.showMessageDialog(null, "Valor invalido");
                    System.exit(0);
                }

                float resultado = 0.00f;

                if (opcion == 0) {
                    resultado = (valor * 9/5)+32;
                    JOptionPane.showMessageDialog(null,  valor + " Grados Celsius son " + resultado + " Grados Fahrenheit");
                } else if (opcion == 1) {
                    resultado = (valor - 32)*5/9;
                    JOptionPane.showMessageDialog(null,  valor + " Grados Fahrenheit son " + resultado + " Grados Celsius");

                }

                int confirma = JOptionPane.showConfirmDialog(null, "¿Continuar usando el Programa?", "confirmar", JOptionPane.YES_NO_OPTION);

                if ( confirma == JOptionPane.NO_OPTION) {
                    continuarPrograma = false;
                    JOptionPane.showMessageDialog(null, "App Finalizada");

                }

            }
        }
    }
}
