import javax.swing.*;

public class Ejercicio4While {
    public static void main(String[] args) {
        int numero, contador = 0;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe un número: "));

        while(numero>= 0){ //Mientras número no sea negativo
            contador++; //Aumentamos en 1 el contador

            numero = Integer.parseInt(JOptionPane.showInputDialog("Escribe otro número: "));
        }
        System.out.println("Has introducido " +contador+ " números no negativos");
    }
}
