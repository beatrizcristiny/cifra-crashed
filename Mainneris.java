import java.util.Scanner;
 public class Main{

public static void main (String[]args){


Scanner scanner = new Scanner (System.in);
 
 System.out.println("Digite uma frase de até 47 carácteres para cifrarmos");
 
 String frase = scanner. nextLine().toUpperCase();

char[] bank = {'Ã','Â','Á','Ä','Ë','É','Ê','Ö','Ô','Õ','Í','Ü','Ú','Ç'};
char[] banko = {'A','A','A','A','E','E','E','O','O','O','I','U','U','C'};

char[] letrasFrase = frase.toCharArray();
String novafrase=" ";
for (int i= 0; i < letrasFrase.length; i++){
    for (int  b=0; b< bank.length; b++){

if(letrasFrase[i]==bank[b]){
    letrasFrase[i]= banko[b];
    break;
}


    }

if(letrasFrase[i]>='A' && letrasFrase[i]<='Z'){
    novafrase= novafrase + letrasFrase[i];
}


    




}
System.out.println(novafrase);


}




 }