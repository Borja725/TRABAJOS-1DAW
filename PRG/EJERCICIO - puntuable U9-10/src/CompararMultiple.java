import java.util.Comparator;

public class CompararMultiple implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        int resultat;
        resultat = o1.getClass().getName().compareTo(o2.getClass().getName());
        if (resultat == 0) {
            return o1.getCodigo().compareTo(o2.getCodigo());
        }
            return resultat;
    }
}
