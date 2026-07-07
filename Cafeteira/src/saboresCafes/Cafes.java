package saboresCafes;
import enums.TiposCafes;
import java.util.ArrayList;
import java.util.List;

public class Cafes {
    public List<String> prepararBase (TiposCafes tipo) {
        List<String> passos = new ArrayList<>();

        passos.add("Preparando seu " + tipo);
        passos.add("Moendo grãos de café.");
        passos.add("Fervendo a água.");
        passos.add("Misturando a água quente com o café moído.");
        passos.add("Servindo o café no copo.");

        switch (tipo) {
                case ESPRESSO:
                    break;

                case CAFECOMLEITE:
                    passos.add("Adicionando leite ao seu café");
                    break;

                case MOCHA:
                    passos.add("Adicionando leite ao seu café");
                    passos.add("Adicionando chocolate ao seu café");
                    break;

                case CAPPUCINO:
                    passos.add("Adicionando leite ao seu café");
                    passos.add("Fazendo espuma para seu café");
                    break;

                case LATTE:
                    passos.add("Adicionando bastante leite ao seu café");
                    passos.add("Fazendo espuma para seu café");
                    break;

                case MACCHIATOCARAMELO:
                    passos.add("Adicionando caramelo ao seu café");
                    passos.add("Adicionando leite ao seu café");
                    passos.add("Fazendo espuma para seu café");
                    break;

            }
            passos.add("Seu " +tipo + "Está pronto");
            return passos;

        }

    }


