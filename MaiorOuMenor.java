import java.util.Scanner;

    public class MaiorOuMenor {
    public static void main(String [] args) {

    Scanner input = new Scanner (System.in);
System.out.println("Digite at� 10 valores para descobrir o maior e menor n�mero");
int maior = 0;
int menor =500000000;
int soma = 0;
int contador = 0;
while (contador < 10) {
System.out.println("Informe o valor");
int valor = input.nextInt();
    if (valor > maior){
maior = valor;
}

if(valor < menor) {
menor = valor;

}
contador++;
}
System.out.println("O n�mero maior � o: " + maior);
System.out.println("O n�mero menor foi " + menor);
}
}
