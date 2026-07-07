package enums;

public enum TiposCafes {
    ESPRESSO,
    CAFECOMLEITE,
    MOCHA,
    CAPPUCINO,
    LATTE,
    MACCHIATOCARAMELO;


    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
