import java.util.Objects;

public class Carta {
    private int numero;
    private String figura;

    public Carta(int numero, String figura) {
        this.numero = numero;
        this.figura = figura;
    }

    public int getNumero() {
        return numero;
    }

    public String getFigura() {
        return figura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carta carta = (Carta) o;
        return numero == carta.numero && Objects.equals(figura, carta.figura);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String toString() {
        return numero + " " + figura;
    }
}
