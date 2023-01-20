import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Player {

    private String name;
    private List<Carta> cartaList;
    private List<Carta> puntiList;
    private int puntiTot;
    private Random random;

    public Player(String name) {
        this.name = name;
        this.cartaList = new ArrayList<>();
        this.puntiList = new ArrayList<>();
        this.puntiTot = 0;
        this.random = new Random();
    }

    public String getName() {
        return name;
    }

    public List<Carta> getCartaList() {
        return cartaList;
    }

    public List<Carta> getPuntiList() {
        return puntiList;
    }

    public int getPuntiTot() {
        return puntiTot;
    }

    public void addCarta(Carta c){
        if(cartaList.size() <= 10)
            cartaList.add(c);
    }

    public void addPuntiCarta(Carta c){
        puntiList.add(c);
    }

    public void addPoint(String type){
        puntiTot++;
        System.out.println(this.getName() + " = " +type);
    }

    public int getCountDenari(){
        int count = 0;
        for(Carta c : this.puntiList){
            if(c.getFigura().equals("DENARO"))
                count++;
        }
        return count;
    }

    public int getCount7(){
        int count = 0;
        for(Carta c : this.puntiList)
            if(c.getNumero() == 7)
                count++;
        return count;
    }

    public void play(ATerra aTerra){
        System.out.println("Carte a terra");
        aTerra.myToString();

        //scelta carta dall'utente
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.println(this.toString());
        System.out.print("Scegli la carta: ");
        int i;
        if(scanner.hasNext()) {
            i = scanner.nextInt();
            Carta c = cartaList.remove(i);

            aTerra.addCartaATerra(c,this);
        }
        */

        //scelta carta random
        int a = random.nextInt(cartaList.size());
        Carta c = cartaList.remove(a);
        aTerra.addCartaATerra(c,this);

    }

    @Override
    public String toString() {
        return "Turno di " +
                name + ":\n" +
                cartaList;
    }
}
