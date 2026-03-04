package saboresCafes;

public class Cafes {

    public enum TiposCafes {
        ESPRESSO,
        CAFECOMLEITE,
        MOCHA,
        CAPPUCINO;

        @Override
        public String toString() {
            return name().toLowerCase();
        }

        public static void aguarde() {
            for (int p = 0; p <= 2; p++) {
                System.out.print("." + " ");
            }
        }

        public static void pularlinha() {
            System.out.println();
        }

        public void prepararBase(TiposCafes tipo) {
            System.out.println("Preparando seu" + tipo);aguarde();pularlinha();
            System.out.print("Moendo grãos de café");aguarde();pularlinha();
            System.out.print("Fervendo a água");aguarde();pularlinha();
            System.out.print("Misturando a água quente com o café moído");aguarde();pularlinha();
            System.out.print("Servindo o café no copo");aguarde();pularlinha();
        }

        public void adicionarLeite() {
            System.out.println("Colocando leite no seu café.");
        }

        public void adicionarEspuma() {
            System.out.println("Adicionando um pouco de espuma.");
        }

        public void adicionarChocolate() {
            System.out.println("Colocando um pouco de chocolate cremoso.");
        }

        public void prepararCafe(TiposCafes tipo) {
            prepararBase(tipo);
            switch (tipo) {

                case ESPRESSO:
                    break;

                case CAFECOMLEITE:
                    adicionarLeite();
                    break;

                case MOCHA:
                    adicionarLeite();
                    adicionarChocolate();
                    break;

                case CAPPUCINO:
                    adicionarLeite();
                    adicionarEspuma();
                    break;
            }
            System.out.println("Seu" + tipo + "Está pronto");

        }
    }
}
