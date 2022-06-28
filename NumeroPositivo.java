import java.util.Scanner;

    public class NumeroPositivo {
    public static void main(String [] args) {

    Scanner input = new Scanner (System.in);
System.out.println("Digite  10 valores positivos para calcular");
int soma= 0;
    for(int i = 0; i < 10; i++) {
System.out.println("Informe o valor");
int valor = input.nextInt();
if(valor > -1) {
soma=soma+valor;
}
}
System.out.println(soma);

}
}
