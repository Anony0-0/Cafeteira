import java.util.Scanner;

public class Cafeteira {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Selecione seu café preferido: \n1-Café puro\n2-Café com leite\n3-Café gelado \n3-Espresso\n4-Mocha\n5-Cappucino\n6-Latte\n7-Frappucino"); pularlinha();

        int selecaoCafe = sc.nextInt();

        //arrumar o call da classe      
        if (selecaoCafe == 2){
            Cafes.cafeComLeite();
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
