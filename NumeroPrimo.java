import java.util.Scanner;

    public class NumeroPrimo {
    public static void main(String [] args) {
int c = 1;
int f = 0;

    Scanner input = new Scanner(System.in);
System.out.println("Digite um n�mero para saber se � primo");
int nPrimo = input.nextInt();

do {
if(nPrimo % c == 0) {
f = f+1;
}
c = c+1;
} while(c <= nPrimo);
if(f > 2) {
System.out.println(nPrimo + "N�o � primo");
}
else {
System.out.println(nPrimo + " � primo");
}
}
}
