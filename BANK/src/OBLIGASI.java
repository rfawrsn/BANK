public class OBLIGASI {
    private double pembelian;
    private int bulan;


    public void setBulan(int bulan) {
        this.bulan = bulan;
    }

    public void setPembelian(double pembelian) {
        this.pembelian = pembelian;
    }

    public double hitungKenaikanUang(){
        double kenaikan = pembelian;
        for (int i = 0; i < bulan; i++) {
            double bungaPerBulan = kenaikan * (hitungBunga(bulan)/ 100);
            kenaikan += bungaPerBulan;
        }
        return kenaikan;
    }

    private double hitungBunga(int bulan) {
        if (bulan >= 0 && bulan <= 11) {
            return 0.5;
        } else if (bulan <= 23) {
            return 1.0;
        } else if (bulan <= 35) {
            return 1.5;
        } else if (bulan <= 47) {
            return 2.0;
        } else if (bulan <= 60) {
            return 2.5;
        } else {
            throw new IllegalArgumentException("Term should be between 1 to 60 months");
        }
    }


    public int getBulan() {
        return bulan;
    }

}