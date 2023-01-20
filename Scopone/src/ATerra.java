import java.util.ArrayList;
import java.util.List;

public class ATerra {

    private List<Carta> aTerraList;

    public ATerra() {
        this.aTerraList = new ArrayList<>();
    }

    public List<Carta> getATerraList() {
        return aTerraList;
    }

    public void addCartaATerra(Carta c,Player p){
        for(Carta a : aTerraList){
            if(a.getNumero() == c.getNumero()){
                aTerraList.remove(a);
                p.addPuntiCarta(a);
                p.addPuntiCarta(c);
                if(aTerraList.isEmpty())
                    p.addPoint("scopa");
                return;
            }
            else if(aTerraList.size()>1)
                if(sumCard(c,p))
                    return;
        }
        aTerraList.add(c);
    }

    //somma carte a 2
    private boolean sumCard(Carta c,Player p){
        for(int i=0;i<aTerraList.size()-1;i++){
            for(int j=i+1;j< aTerraList.size()-1;j++){
                if((aTerraList.get(i).getNumero() + aTerraList.get(j).getNumero()) == c.getNumero()){
                    p.addPuntiCarta(aTerraList.get(i));
                    p.addPuntiCarta(aTerraList.get(j));
                    p.addPuntiCarta(c);
                    aTerraList.remove(aTerraList.get(i));
                    aTerraList.remove(aTerraList.get(j));
                    return true;
                }
            }
        }
        return false;
    }

    public void myToString() {
        for(Carta c : aTerraList){
            System.out.print(c.toString() + '\t');
        }
        System.out.print('\n');
    }
}
