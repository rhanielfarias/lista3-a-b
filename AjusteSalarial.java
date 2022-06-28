import java.util.Scanner;
    public class AjusteSalarial {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
System.out.println("Informe seu salarioário para saber o quanto de reajuste vai ganhar");
double salario = input.nextDouble();

        if(salario <= 280){
System.out.println("O seu salario atual é de: r$" + salario);
System.out.println("Você vai receber 20% de aumento");
double aumento1 = salario*20/100;
System.out.println("Você vai receber o aumento de r$" + aumento1);
System.out.println("Seu novo salario será de:" + (salario+aumento1));
}
        if(salario > 280 && salario < 700){
System.out.println("O seu salario atual é de: r$" + salario);
System.out.println("Você vai receber 15% de aumento");
double aumento2 = salario*15/100;
System.out.println("Você vai receber o aumento de r$" + aumento2);
System.out.println("Seu novo salario será de:" + (salario+aumento2));
}

        if(salario > 700  && salario < 1500){
System.out.println("O seu salario atual é de: r$" + salario);
System.out.println("Você vai receber 10% de aumento");
double aumento3 = salario*10/100;
System.out.println("Você vai receber o aumento de r$" + aumento3);
System.out.println("Seu novo salario será de:" + (salario+aumento3));
}

        if(salario > 1500) {
System.out.println("O seu salario atual é de: r$" + salario);
System.out.println("Você vai receber 5% de aumento");
double aumento4 = salario*5/100;
System.out.println("Você vai receber o aumento de r$" + aumento4);
System.out.println("Seu novo salario será de:" + (salario+aumento4));
}


}
}
