import java.util.Scanner;

    public class CalcularNumerosImpars {
    public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
System.out.println("Digite o intervalo a iniciar o  c�lculo dos n�meros impar");
double inicio = input.nextDouble();
System.out.println("Qual o fim do contador?");
double fim = input.nextDouble();

double soma=0;
    while(inicio < fim) {
if(inicio%2 == 1  ) {
soma=soma+inicio;
}
System.out.println(soma);
inicio++;
}
}
}
