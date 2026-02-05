public class Cafeteira {
    static void main() {
      
        System.out.print("Preparando seu café com leite"); aguarde(); pularlinha();
        System.out.print("Moendo grãos de café"); aguarde(); pularlinha();
        System.out.print("Fervendo a água"); aguarde(); pularlinha();
        System.out.print("Misturando a água quente com o café moído");aguarde(); pularlinha();
        System.out.print("Servindo o café no copo");aguarde(); pularlinha();
        System.out.print("Servindo um pouco de leite dentro do copo");aguarde(); pularlinha();
        System.out.print("Seu café com leite está pronto");aguarde(); pularlinha();
    }

    private static void aguarde() {
        for (int p = 0; p <=2 ; p++){
            System.out.print("." +" ");
        }
    }
    private static void pularlinha(){
        System.out.println();
    }
}
