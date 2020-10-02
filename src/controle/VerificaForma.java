package controle;
import dominio.Figura;
import java.util.Scanner;

public class VerificaForma {
    public static void main(String[] args) {
        
        Scanner leia = new Scanner(System.in);

        System.out.println("Olá!");
        System.out.print("Quantos lados tem a sua figura? ");
        int qtdLados = leia.nextInt();

        if (qtdLados == 3){
            System.out.print("Quantos centímetros tem o primeiro lado? ");
            double lado1 = leia.nextDouble();

            System.out.print("Quantos centímetros tem o segundo lado? ");
            double lado2 = leia.nextDouble();

            System.out.print("Quantos centímetros tem o terceiro lado? ");
            double lado3 = leia.nextDouble();        

            Figura figura = new Figura(lado1, lado2, lado3);
            System.out.println(figura.tipoTriangulo());

        }
        else{
            System.out.println("A sua figura não é um triângulo!");
        }


        leia.close();
    }
}
