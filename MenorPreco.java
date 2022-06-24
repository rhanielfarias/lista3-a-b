import java.util.Scanner;

    public class MenorPreco {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
System.out.println("Informe o valor do primeiro item");
double item1 = input.nextDouble();
System.out.println("Informe o valor do segundo item");
double item2 = input.nextDouble();
System.out.println("Informe o valor do terceiro item");
double item3 = input.nextDouble();
input.close();
        if(item1 < item2 && item1 < item3)
System.out.println("O primeiro item é o mais barato, custando r$" +item1);
        if(item2 < item1 && item2 < item3)
System.out.println("O segundo item é o mais barato, custando r$" +item2);
        if(item3 < item1 && item3 < item2)
System.out.println("O terceiro item é o mais barato, custando r$" +item3);

}
}
