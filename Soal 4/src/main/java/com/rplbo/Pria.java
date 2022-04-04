package com.rplbo;

public class Pria {
    private String nama;
    private int usia;
    private String status;
    private Double jumlahCinta = 0.0;
    private Perempuan jodoh;
    private Perempuan temanKencan;
    public Pria(String nama, int usia){
        this.nama = nama;
        this.usia = usia;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUsia() {
        return usia;
    }

    public void setUsia(int usia) {
        this.usia = usia;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getJumlahCinta() {
        return jumlahCinta;
    }

    public void setJumlahCinta(Double jumlahCinta) {
        this.jumlahCinta = jumlahCinta;
    }

    public Perempuan getJodoh() {
        return jodoh;
    }

    public void setJodoh(Perempuan jodoh) {
        this.jodoh = jodoh;
    }

    public Perempuan getTemanKencan() {
        return temanKencan;
    }

    public void setTemanKencan(Perempuan temanKencan) {
        this.temanKencan = temanKencan;
    }

    public void PDKT(Perempuan calon){
        setTemanKencan(calon);
    }

    public void MengajakKencan(Perempuan perempuan){
        if(temanKencan == null){
            System.out.println("yakali mau kencan :v");
        }
        else if(jodoh == null || perempuan == jodoh){
            jumlahCinta++;
        }
        else{
            System.out.println("JANGAN SELINGKUH MAS HEI TOLONG");
            System.out.println("KAU JANGAN TIDAK SETIIA, JANGAN KAU AJAK CEWEK LAIN JALAN!!");
        }
    }

    public void MenembakKekasih(){
        if(temanKencan == null){
            System.out.println("SIAPA YANG MAU KAU TEMBAK :') | JANGAN NGAYAL DEH " + nama + "!!!");
        }
        else if(jumlahCinta >= temanKencan.getStandarJumlahCinta()){
            System.out.println("SELAMAT KAMU DITERIMA :D | SELAMAT MENJALANI HIDUP BARU " + nama);
            jodoh = temanKencan;
        }
        else if(jumlahCinta < temanKencan.getStandarJumlahCinta()){
            System.out.println("KAMU DITOLAK");
        }
    }
}
