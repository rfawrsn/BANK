public class Main {
    public static void main(String[] args) {
        OBLIGASI obligasi = new OBLIGASI();
        obligasi.setPembelian(15000);
        obligasi.setBulan(12);
        System.out.println("Total kenaikan: Rp" + obligasi.hitungKenaikanUang());
    }
}