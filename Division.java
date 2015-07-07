/**
 * Created by DELL on 07/07/2015.
 */
import java.util.ArrayList;

public class Division {
    private String namaDivisi;
    private League liga;
    ArrayList<Club> daftarKlub = new ArrayList<Club>();

    //Constructor
    public Division(String namaDivisi, League liga) {
        this.namaDivisi = namaDivisi;
        this.liga = liga;
    }

    //Setter and Getter
    public void setNamaDivisi(String namaDivisi) {

        this.namaDivisi = namaDivisi;
    }

    public String getNamaDivisi() {

        return namaDivisi;
    }

    public void setLiga(League liga) {
        this.liga = liga;
    }

    public League getLiga(){
        return liga;
    }

    public void setDaftarKlub(Club klub) {

        this.daftarKlub.add(klub);
    }

    public ArrayList<Club> getDaftarKlub() {

        return daftarKlub;
    }

    //test nomer 2

    public void getDaftarKlubLiga(String cariLiga)
    {
        if (cariLiga == liga.getNamaLiga())
        {
            for (int i = 0; i < liga.daftarDivisi.size() ; i++)
            {
                Division l = liga.daftarDivisi.get(i);
                System.out.println(l.getNamaDivisi());
                for (int j = 0; j <daftarKlub.size() ; j++)
                {
                    System.out.println(l.daftarKlub.get(j));
                }
            }
        }
        else
        {
            System.out.println("Tidak ada Klub di Liga ini");
        }
    }

    //test nomer 3
    public void getDaftarKlubDivisi(String divisiCari)
    {
        for (int i = 0; i < liga.daftarDivisi.size() ; i++)
        {
            Division l = liga.daftarDivisi.get(i);
            if (divisiCari == l.getNamaDivisi())
            {
                for (int j = 0; j <daftarKlub.size() ; j++)
                {
                    System.out.println(l.daftarKlub.get(j));
                }
            }
        }
        for (int i = 0; i < liga.daftarDivisi.size() ; i++)
        {
            Division l = liga.daftarDivisi.get(0);
            Division k = liga.daftarDivisi.get(1);
            if (divisiCari != k.getNamaDivisi())
            {
                if (divisiCari != l.getNamaDivisi())
                {
                    System.out.println("Tidak ditemukan Klub");
                    break;
                }
            }
        }

    }

    //toString
    @Override
    public String toString() {
        return
                "Nama Divisi = " + namaDivisi;
    }

}
