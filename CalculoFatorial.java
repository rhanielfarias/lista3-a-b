import java.util.Scanner;
    public class CalculoFatorial {
    public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
System.out.println("Digite o número que deseja calcular o fatorial");
int nFatorial = input.nextInt();
int c = nFatorial;
int f = 1;
do {
f = f*c;
c = c-1;
} while(c >= 1);
System.out.println("O calculo foi de: " + f);
}
}
