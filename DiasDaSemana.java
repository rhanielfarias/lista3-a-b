import java.util.Scanner;
    public class DiasDaSemana {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
System.out.println("Digite um número de 1 a 7 para saber o dia da semana, considerando 1 domingo e 7 sábado");
int opcao = input.nextInt();
            switch(opcao) {
        case 1:
System.out.println("Hoje é domingo");
break;
        case 2:
System.out.println("Hoje é segunda-feira");
break;
        case 3:
System.out.println("Hoje é terça-feira");
break;
        case 4:
System.out.println("Hoje é quarta-feira");
break;
        case 5:
System.out.println("Hoje é quinta-feira");
break;
        case 6:
System.out.println("Hoje é sexta-feira");
break;
        case 7:
System.out.println("Hoje é sábado");
break;
            default:
System.out.println("Opção inválida. Tente novamente, por favor");
}
}
}
