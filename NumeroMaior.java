import java.util.Scanner;

    public class NumeroMaior {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
System.out.println("Digite o primeiro valor a comparar com o segundo");
int primeiroNumero = input.nextInt();
System.out.println("Informe o segundo valor a comparar com o primeiro");
int segundoNumero = input.nextInt();
if(primeiroNumero > segundoNumero)
System.out.println(primeiroNumero);
else
System.out.println(segundoNumero);

}
}
