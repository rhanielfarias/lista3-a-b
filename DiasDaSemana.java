import java.util.Scanner;
    public class DiasDaSemana {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
System.out.println("Digite um n�mero de 1 a 7 para saber o dia da semana, considerando 1 domingo e 7 s�bado");
int opcao = input.nextInt();
            switch(opcao) {
        case 1:
System.out.println("Hoje � domingo");
break;
        case 2:
System.out.println("Hoje � segunda-feira");
break;
        case 3:
System.out.println("Hoje � ter�a-feira");
break;
        case 4:
System.out.println("Hoje � quarta-feira");
break;
        case 5:
System.out.println("Hoje � quinta-feira");
break;
        case 6:
System.out.println("Hoje � sexta-feira");
break;
        case 7:
System.out.println("Hoje � s�bado");
break;
            default:
System.out.println("Op��o inv�lida. Tente novamente, por favor");
}
}
}
