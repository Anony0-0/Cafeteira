import java.util.Scanner;

public class Cafeteira {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione seu café preferido: \n1-Café puro\n2-Café com leite\n3-Café gelado \n4-Espresso\n5-Mocha\n6-Cappucino\n7-Latte\n8-Frappucino"); pularlinha();

        int selecaoCafe = sc.nextInt();

        if (selecaoCafe == 1){
            Cafes cafePruo = new Cafes();
            cafePruo.cafePuro();

        } else if (selecaoCafe == 2) {
            Cafes cafeComLeite = new Cafes();
            cafeComLeite.cafeComLeite();
         } else if (selecaoCafe == 3) {
            Cafes cafeGelado = new Cafes();
            cafeGelado.cafeGelado();
        } else if (selecaoCafe == 4) {
            Cafes espresso = new Cafes();
            espresso.espresso();
        } else if (selecaoCafe == 5) {
            Cafes mocha= new Cafes();
            mocha.mocha();
        } else if (selecaoCafe == 6) {
            Cafes capuccino = new Cafes();
            capuccino.capuccino();
        } else if (selecaoCafe == 7) {
            Cafes latte = new Cafes();
            latte.latte();
        } else if (selecaoCafe == 8) {
            Cafes frappucino= new Cafes();
            frappucino.frappucino();
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
