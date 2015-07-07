/**
 * Created by DELL on 07/07/2015.
 */

public class Main {

    public static void main(String[] args) {

        //League
        League indonesia = new League("Indonesia");
        League malaysia = new League("Malaysia");

        //Divisi
        Division qnb = new Division("QNB League",indonesia);
        Division du = new Division("Divisi Utama",indonesia);
        Division groupA = new Division("Malaysian Premiere League Group A",malaysia);
        Division groupB = new Division("Malaysian Premiere League Group B",malaysia);

        //Club
        Club arema = new Club("Arema",qnb,indonesia);
        Club persipura = new Club("Persipura",qnb,indonesia);
        Club persib = new Club("Persib",qnb,indonesia);
        Club persija = new Club("Persija",qnb,indonesia);
        Club persik = new Club("Persik",du,indonesia);
        Club deltras = new Club("Deltras",du,indonesia);
        Club persiwa = new Club("Persiwa",du,indonesia);
        Club persis = new Club("Persis",du,indonesia);
        Club selangor = new Club("Selangor",groupA,malaysia);
        Club kelantan = new Club("Kelantan",groupA,malaysia);
        Club terengganu = new Club("Terengganu",groupA,malaysia);
        Club serawak = new Club("Serawak",groupA,malaysia);
        Club sime = new Club("Sime Darby",groupB,malaysia);
        Club perak = new Club("Perak",groupB,malaysia);
        Club pahang = new Club("Pahang",groupB,malaysia);
        Club pdrm = new Club("PDRM",groupB,malaysia);

        indonesia.setDaftarDivisi(qnb);
        indonesia.setDaftarDivisi(du);
        malaysia.setDaftarDivisi(groupA);
        malaysia.setDaftarDivisi(groupB);

        qnb.setDaftarKlub(arema);
        qnb.setDaftarKlub(persipura);
        qnb.setDaftarKlub(persib);
        qnb.setDaftarKlub(persija);
        du.setDaftarKlub(persik);
        du.setDaftarKlub(deltras);
        du.setDaftarKlub(persiwa);
        du.setDaftarKlub(persis);
        groupA.setDaftarKlub(selangor);
        groupA.setDaftarKlub(kelantan);
        groupA.setDaftarKlub(terengganu);
        groupA.setDaftarKlub(serawak);
        groupB.setDaftarKlub(sime);
        groupB.setDaftarKlub(perak);
        groupB.setDaftarKlub(pahang);
        groupB.setDaftarKlub(pdrm);

        //1. Get daftar divisi by nama liga

        System.out.println("Soal Nomor 1 :");
        System.out.println("Divisi Liga Indonesia : ");
        indonesia.getDaftarDivisi("Indonesia");
        System.out.println();

        //2. Get Daftar Klub by nama liga

        System.out.println("Soal Nomor 2 :");
        System.out.println("Klub Liga Indonesia : ");
        qnb.getDaftarKlubLiga("Indonesia");
        System.out.println("Liga Malaysia : ");
        groupA.getDaftarKlubLiga("Malaysia");
        System.out.println();

        //3. Get Daftar Klub by nama Divisi

        System.out.println("Soal Nomor 3 :");
        System.out.println("QNB League : ");
        qnb.getDaftarKlubDivisi("QNB League");
        System.out.println("Divisi Utama : ");
        du.getDaftarKlubDivisi("Divisi Utama");
        System.out.println();

        //4. Get Klub ini berada di divisi mana by nama Klub

        System.out.println("Soal Nomor 4 :");
        arema.getDivisi("Arema");
        persipura.getDivisi("Persipura");
        persib.getDivisi("Persib");
        persija.getDivisi("Persija");
        System.out.println();

        //5. Get Klub ini berada di liga apa by nama Klub

        System.out.println("Soal Nomor 5 :");
        selangor.getLiga("Selangor");
    }
}

