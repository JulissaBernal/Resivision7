package revision7;

/*
* Se solicita al usuario escribir el pais y devuelve su capital, si no tiene pais, le enseñas la capital y te da
* las gracias por enseñar;
*
*
*  */

// Importamos los metodos HashMap y Scanner

import java.util.HashMap;
import java.util.Scanner;

public class Codigo7 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        HashMap<String, String> ca = new HashMap<>(); //son datos String

        ca.put("Canadá", "Otawwa");
        ca.put("Estados Unidos", "Washington DC");
        ca.put("México", "México DF");
        ca.put("Belice", "Belmopán");
        ca.put("Costa rica", "San José");
        ca.put("El Salvador", "San Salvador"); // Le faltaba la capital
        ca.put("Guatemala", "Ciudad de Guatemala");
        ca.put("Honduras", "Tegucigalpa");
        ca.put("Nicaragua", "Managua");
        ca.put("Panamá", "Panamá");

        String c; //sintaxis String

        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: "); //Le faltaba el "out" al System.print
            c = s.nextLine(); // Estaba como double en una variable String

            if (!c.equals("salir")) {
                if (ca.containsKey(c)) { //metodo por containsKey
                    System.out.print("La capital de " + c);
                    System.out.println(" es " + ca.get(c)); // Cambiamos el metodo put por el metodo get
                } else {
                    System.out.print("No conozco la respuesta ");
                    System.out.print("¿cuál es la capital de " + c + "?: ");
                    String capi = s.nextLine(); 
                    ca.put(c, capi);
                    System.out.println("Gracias por enseñarme nuevas capitales ;D");
                }
            }
        } while(!c.equals("salir")); // sintaxis while
        s.close();//cerramos scanner
    }

}


