import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual o valor da aula por hora?");
        double valorHora = s.nextDouble();

        System.out.println("Quantas aulas foram lecionadas por mes?");
        int numAulas = s.nextInt();

        System.out.println("Qual o percentual de desconto do INSS");
        int percento = s.nextInt();
        double percentual = valorHora * numAulas * percento/100;

        double salarioFinal = valorHora * numAulas - percentual;

        System.out.println("salario final é igual a " +salarioFinal);
    }
}