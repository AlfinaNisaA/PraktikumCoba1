class Main {
    public static void main(String[] args) {

        Kendaraan mobil = new Kendaraan();

        mobil.setWarna("Silver");
        mobil.setMerk("Toyota");
        mobil.setModel("Avanza");
        mobil.setTahunPembuatan(2020);

        System.out.println("Warna Mobil:  " + mobil.warna);
        System.out.println("Merk Mobil:  " + mobil.merk);
        System.out.println("Model Mobil:  " + mobil.model);
        System.out.println("Tahun Pembuatan Mobil:  " + mobil.tahun_pembuatan);

    }
}