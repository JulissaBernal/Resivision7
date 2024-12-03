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

        HashMap<String, String> capitals = new HashMap<>(); //son datos String

        capitals.put("Canadá", "Otawwa");
        capitals.put("Estados Unidos", "Washington DC");
        capitals.put("México", "México DF");
        capitals.put("Belice", "Belmopán");
        capitals.put("Costa rica", "San José");
        capitals.put("El Salvador", "San Salvador"); // Le faltaba la capital
        capitals.put("Guatemala", "Ciudad de Guatemala");
        capitals.put("Honduras", "Tegucigalpa");
        capitals.put("Nicaragua", "Managua");
        capitals.put("Panamá", "Panamá");

        String c; //sintaxis String

        do {
            System.out.print("Escribe el nombre de un país y te diré su capital: "); //Le faltaba el "out" al System.print
            c = s.nextLine(); // Estaba como double en una variable String

            if (!c.equals("salir")) {
                if (capitals.containsKey(c)) { //metodo por containsKey
                    System.out.print("La capital de " + c);
                    System.out.println(" es " + capitals.get(c)); // Cambiamos el metodo put por el metodo get
                } else {
                    System.out.print("No conozco la respuesta ");
                    System.out.print("¿cuál es la capital de " + c + "?: ");
                    String capi = s.nextLine(); 
                    capitals.put(c, capi);
                    System.out.println("Gracias por enseñarme nuevas capitales ;D");
                }
            }
        } while(!c.equals("salir")); // sintaxis while
        s.close();//cerramos scanner
    }

}


