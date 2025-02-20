public class MataKuliahMain20 {
    public static void main(String[] args) {
        MataKuliah20 mk1 = new MataKuliah20();
        mk1.kodeMK = "ASD";
        mk1.nama = "Algortima dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 4;
        
        mk1.tampilInformasi();
        
        mk1.ubahSKS(4);
        
        mk1.tambahJam(2);
        
        mk1.kurangiJam(3);
        
        mk1.tampilInformasi();
        
        MataKuliah20 mk2 = new MataKuliah20("ASD", "Algoritma dan Struktur Data", 3, 5);
        
        mk2.tampilInformasi();
        
        mk2.ubahSKS(4);
        
        mk2.tambahJam(1);
        
        mk2.kurangiJam(2);
        
        mk2.tampilInformasi();
    }
}
