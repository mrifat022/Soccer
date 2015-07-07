/**
 * Created by DELL on 07/07/2015.
 */
public class Club {
    private String namaKlub;
    private Division divisi;
    private League liga;

    //Constructor

    public Club(String namaKlub, Division divisi, League liga) {
        this.namaKlub = namaKlub;
        this.divisi = divisi;
        this.liga = liga;
    }

    //Setter and Getter
    public void setNamaKlub(String namaKlub) {

        this.namaKlub = namaKlub;
    }

    public String getNamaKlub() {

        return namaKlub;
    }

    public void setDivisi(Division divisi) {

        this.divisi = divisi;
    }

    //test nomer 4
    public void getDivisi(String Club){
        for (int d = 0; d < liga.daftarDivisi.size(); d++){
            Division a = liga.daftarDivisi.get(d);
            for (int c = 0; c < divisi.daftarKlub.size(); c++){
                a.daftarKlub.get(c);
                Club i = a.daftarKlub.get(c);
                if (Club == i.getNamaKlub()){
                    System.out.println(a.getNamaDivisi());
                }
            }
        }
    }

    public void setLiga(League liga) {

        this.liga = liga;
    }

    //test nomer 5
    public void getLiga (String club){
        for (int d = 0; d < liga.daftarDivisi.size(); d++){
            Division a = liga.daftarDivisi.get(d);
            for (int c = 0; c < divisi.daftarKlub.size(); c++){
                a.daftarKlub.get(c);
                Club i = a.daftarKlub.get(c);
                if (club == i.getNamaKlub()){
                    System.out.println(liga.getNamaLiga());
                }
            }
        }
    }

    //toString
    @Override
    public String toString() {
        return "Nama Klub = " + namaKlub;
    }
}

