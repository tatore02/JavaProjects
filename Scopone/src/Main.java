import java.io.FileNotFoundException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Player p1 = new Player("sasa");
        Player p2 = new Player("prisco");
        Player p3 = new Player("manu");
        Player p4 = new Player("lilly");

        //distribuire carte
        Mazzo mazzo = new Mazzo();
        mazzo.readMazzoFromFile();
        mazzo.sortRandomMazzo();

        List<Carta> mazzoList = mazzo.getCartaList();
        int i=0;
        for(Carta c : mazzoList){
            if(i<10)
                p1.addCarta(c);
            else if(i<20)
                p2.addCarta(c);
            else if(i<30)
                p3.addCarta(c);
            else
                p4.addCarta(c);
            i++;
        }

        ATerra aTerra = new ATerra();   //carte a terra

        //organizzazione turni
        for(int j=0;j<10;j++){
            for(i=0;i<4;i++){
                if(i==0)
                    p1.play(aTerra);
                else if(i==1)
                    p2.play(aTerra);
                else if(i==2)
                    p3.play(aTerra);
                else
                    p4.play(aTerra);
            }
        }

        if(p1.getPuntiList().contains(new Carta(7,"DENARO")))
            p1.addPoint("7 pisello");
        else if(p2.getPuntiList().contains(new Carta(7,"DENARO")))
            p2.addPoint("7 pisello");
        else if(p3.getPuntiList().contains(new Carta(7,"DENARO")))
            p3.addPoint("7 pisello");
        else if(p4.getPuntiList().contains(new Carta(7,"DENARO")))
            p4.addPoint("7 pisello");

        Player maxCount = p1;
        boolean flag = true;    //serve per verificare se il numero di carte è uguale, se nel caso così fosse, non assegnare punto
        if(p2.getPuntiList().size() >= maxCount.getPuntiList().size()){
            if(p2.getPuntiList().size() == maxCount.getPuntiList().size())
                flag = false;
            else {
                maxCount = p2;
                flag = true;
            }
        }
        if(p3.getPuntiList().size() >= maxCount.getPuntiList().size()){
            if(p3.getPuntiList().size() == maxCount.getPuntiList().size())
                flag = false;
            else {
                maxCount = p3;
                flag = true;
            }
        }
        if(p4.getPuntiList().size() >= maxCount.getPuntiList().size()){
            if(p4.getPuntiList().size() == maxCount.getPuntiList().size())
                flag = false;
            else {
                maxCount = p4;
                flag = true;
            }
        }
        if (flag)
            maxCount.addPoint("carte a lungo"); //aggiunge un punto per il player che ha più carte

        //conta denari
        Player maxDenari = p1;
        flag = true;
        if(p2.getCountDenari() >= maxDenari.getCountDenari()){
            if(p2.getCountDenari() == maxDenari.getCountDenari())
                flag = false;
            else{
                maxDenari = p2;
                flag = true;
            }
        }
        if(p3.getCountDenari() >= maxDenari.getCountDenari()){
            if(p3.getCountDenari() == maxDenari.getCountDenari())
                flag = false;
            else{
                maxDenari = p3;
                flag = true;
            }
        }
        if(p4.getCountDenari() >= maxDenari.getCountDenari()){
            if(p4.getCountDenari() == maxDenari.getCountDenari())
                flag = false;
            else{
                maxDenari = p4;
                flag = true;
            }
        }
        if(flag)
            maxDenari.addPoint("carte a denari"); //aggiunge un punto per il player che ha più carte denari

        //conta settanta
        Player max7 = p1;
        flag = true;
        if(p2.getCount7() >= max7.getCount7()){
            if(p2.getCount7() == max7.getCount7())
                flag = false;
            else{
                max7 = p2;
                flag = true;
            }
        }
        if(p3.getCount7() >= max7.getCount7()){
            if(p3.getCount7() == max7.getCount7())
                flag = false;
            else{
                max7 = p3;
                flag = true;
            }
        }
        if(p4.getCount7() >= max7.getCount7()){
            if(p4.getCount7() == max7.getCount7())
                flag = false;
            else{
                max7 = p4;
                flag = true;
            }
        }
        if(flag)
            max7.addPoint("settanta");

        /*
        COSE DA AGGIUNGERE:
        1) alla fine, dare le carte rimaste a terra all'ultimo giocatore che ha preso
        2) giocare finchè non si arriva a 11
        3) player intelligenti
        */

        System.out.println("Carte di " + p1.getName() + ": " + p1.getPuntiList() + " punti: " + p1.getPuntiTot());
        System.out.println("Carte di " + p2.getName() + ": " + p2.getPuntiList() + " punti: " + p2.getPuntiTot());
        System.out.println("Carte di " + p3.getName() + ": " + p3.getPuntiList() + " punti: " + p3.getPuntiTot());
        System.out.println("Carte di " + p4.getName() + ": " + p4.getPuntiList() + " punti: " + p4.getPuntiTot());
    }

}
