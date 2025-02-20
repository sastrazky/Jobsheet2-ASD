public class DosenMain20 {
    public static void main(String[] args) {
        Dosen20 dosen1 = new Dosen20();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Budi Santoso";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2010;
        dosen1.bidangKeahlian = "Data Science";

        dosen1.tampilInformasi();

        dosen1.setStatusAktif(false);

        int masaKerja1 = dosen1.hitungMasaKerja(2025);
        System.out.println("Masa kerja: " + masaKerja1 + " tahun");

        dosen1.ubahKeahlian("Machine Learning");

        dosen1.tampilInformasi();

        Dosen20 dosen2 = new Dosen20("D002", "Prof. Siti Rahmawati", true, 2015, "Cyber Security");

        dosen2.tampilInformasi();

        dosen2.setStatusAktif(false);

        int masaKerja2 = dosen2.hitungMasaKerja(2025);
        System.out.println("Masa kerja: " + masaKerja2 + " tahun");

        dosen2.ubahKeahlian("Blockchain Technology");

        dosen2.tampilInformasi();
    }
}
