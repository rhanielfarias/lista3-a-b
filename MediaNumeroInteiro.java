import java.util.Scanner;

    public class MediaNumeroInteiro {
    public static void main(String [] args) {

    Scanner input = new Scanner (System.in);
System.out.println("Digite at� 5 valores para descobrir a m�dia dos n�meros inteiros");
int soma= 0;
    for(int i = 0; i < 5; i++) {
System.out.println("Informe o valor");
int valor = input.nextInt();
soma=soma+valor;
}
System.out.println(soma/5);

}
}
