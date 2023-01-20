import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Mazzo {
    private List<Carta> cartaList;

    public Mazzo() {
        this.cartaList = new ArrayList<>();
    }

    public List<Carta> getCartaList() {
        return cartaList;
    }

    public void readMazzoFromFile() throws FileNotFoundException {
        File file = new File("/Users/emanueleruocco/eclipse-workspace/Scopone/resources/listCard.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            String[] tokens = scanner.nextLine().split(" ");
            cartaList.add(new Carta(Integer.parseInt(tokens[0]),tokens[1]));
        }
    }

    public void sortRandomMazzo(){
        Collections.shuffle(cartaList);
    }

    @Override
    public String toString() {
        return cartaList.toString();
    }
}
