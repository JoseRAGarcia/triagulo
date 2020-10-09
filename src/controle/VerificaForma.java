package controle;
import dominio.Figura;
import java.util.Scanner;

public class VerificaForma {
    public static void main(String[] args) {
        
        Figura figura = new Figura();
        
        Scanner leia = new Scanner(System.in);

        System.out.println("Olá!");
        System.out.print("Quantos lados tem a sua figura? ");
        int qtdLados = leia.nextInt();

        if (figura.isTriangulo(qtdLados)){
            System.out.print("Quantos centímetros tem o primeiro lado? ");
            figura.setLado1(leia.nextDouble());

            System.out.print("Quantos centímetros tem o segundo lado? ");
            figura.setLado2(leia.nextDouble());

            System.out.print("Quantos centímetros tem o terceiro lado? ");
            figura.setLado3(leia.nextDouble());      

            
            System.out.println(figura.tipoTriangulo());

        }
        else{
            System.out.println("A sua figura não é um triângulo!");
        }


        leia.close();
    }
}
