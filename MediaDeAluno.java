import java.util.Scanner;

    public class MediaDeAluno {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
System.out.println("Calculador de média de aluno. Informe a primeira nota parcial");
double nota1 = input.nextDouble();
System.out.println("Digite a segunda nota parcial");
double nota2 = input.nextDouble();
input.close();
double media =( nota1+nota2)/2;
        if(media == 10)
System.out.println("Aprovado com distinção");
        else
        if(media >= 7)
System.out.println("Aluno aprovado");
        if(media < 7)
System.out.println("Reprovado");

}
}
