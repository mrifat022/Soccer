/**
 * Created by DELL on 07/07/2015.
 */
import java.util.ArrayList;

public class League {
    private String namaLiga;

    ArrayList<Division> daftarDivisi = new ArrayList<Division>();

    //Constructor
    public League(String namaLiga) {

        this.namaLiga = namaLiga;
    }

    //Setter and Getter

    public void setNamaLiga(String namaLiga) {

        this.namaLiga = namaLiga;
    }

    public String getNamaLiga() {

        return namaLiga;
    }

    public void setDaftarDivisi(Division divisi)
    {

        this.daftarDivisi.add(divisi);
    }

    public ArrayList<Division> getDaftarDivisi() {

        return daftarDivisi;
    }

    //test nomer 1
    public void getDaftarDivisi(String liga)
    {
        if (liga == getNamaLiga())
        {
            for (int a = 0; a <daftarDivisi.size() ; a++)
            {
                System.out.println(daftarDivisi.get(a));
            }
        }
        else
        {
            System.out.println("Tidak Terdapat Divisi");
        }

    }

    //toString
    @Override
    public String toString() {
        return "Nama Liga = " + namaLiga +
                "\nDaftar Divisi = " + daftarDivisi ;
    }

}
