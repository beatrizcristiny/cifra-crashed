import java.util.Scanner;
public class Main{
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        String frase;
        System.out.println("Digite uma frase de até 47 letras");
        frase = scanner.nextLine().toUpperCase();
        String novafrase = "";
        char [] acentos = {'Ã','Á','À','Â','É','Ê','Í','Ó','Ô','Õ','Ú','Ç'};
        char [] normais = {'A','A','A','A','E','E','I','O','O','O','U','C'};

        for (int i = 0; i < frase.length(); i++){
             char letra = frase.charAt(i);
             
             
             for (int b = 0; b < acentos.length; b++){
             if (letra == acentos[b]) {
                letra = normais[b];
             }    
             
        }
        if (letra >= 'A' && letra <= 'Z') {
            novafrase = novafrase + letra;
        }
     }
   
    System.out.println(novafrase);
    }

   
}