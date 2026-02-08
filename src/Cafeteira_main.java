import java.util.Scanner;

public class Cafeteira {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione seu café preferido: \n1-Expresso \n2-Café com leite \n3-Mocha\n4-Cappucino\n5-Latte"); pularlinha();

        int selecaoCafe = sc.nextInt();

        if (selecaoCafe == 1){
            Cafes espresso = new Cafes();
            espresso.espresso();
        } else if (selecaoCafe == 2) {
            Cafes cafeComLeite = new Cafes();
            cafeComLeite.cafeComLeite();
        } else if (selecaoCafe == 3) {
            Cafes mocha= new Cafes();
            mocha.mocha();
        } else if (selecaoCafe == 4) {
            Cafes capuccino = new Cafes();
            capuccino.capuccino();
        } else if (selecaoCafe == 5) {
            Cafes latte = new Cafes();
            latte.latte();
        } else{ //colocar também que se for uma string, a mesma mensagem aparece
            System.out.println("Por favor, selecione uma opção válida");
        }

    }



    public static void aguarde() {
        for (int p = 0; p <=2 ; p++){
            System.out.print("." +" ");
        }
    }
    public static void pularlinha(){
        System.out.println();
    }
}
