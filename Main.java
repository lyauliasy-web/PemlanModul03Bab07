public class Main {
    public static void main(String[] args) {

        Kue[] daftarKue = new Kue[20];

        // Kue Pesanan
        daftarKue[0] = new KuePesanan("Lumpur", 3000, 1.2);
        daftarKue[1] = new KuePesanan("Brownies", 9000, 1.3);
        daftarKue[2] = new KuePesanan("Kukchup", 4000, 1.1);
        daftarKue[3] = new KuePesanan("Klepon", 1500, 1.2);
        daftarKue[4] = new KuePesanan("Bika Ambon", 5500, 1.3);
        daftarKue[5] = new KuePesanan("Serabi", 4000, 2.0);
        daftarKue[6] = new KuePesanan("Mochi", 3500, 1.2);
        daftarKue[7] = new KuePesanan("Lapis Legit", 600000, 3.0);
        daftarKue[8] = new KuePesanan("Putu Ayu", 7200, 2.3);
        daftarKue[9] = new KuePesanan("Cheese Cake", 40000, 2.1);

        // Kue Jadi
        daftarKue[10] = new KueJadi("Donat", 2500, 10);
        daftarKue[11] = new KueJadi("Bolu Kukus", 2000, 8);
        daftarKue[12] = new KueJadi("Nastar", 5000, 8);
        daftarKue[13] = new KueJadi("Putri Salju", 5000, 5);
        daftarKue[14] = new KueJadi("Kue Sus", 3500, 6);
        daftarKue[15] = new KueJadi("Lemper", 2000, 12);
        daftarKue[16] = new KueJadi("Onde-onde", 2500, 11);
        daftarKue[17] = new KueJadi("Roti Bakar", 5500, 4);
        daftarKue[18] = new KueJadi("Pancong", 3000, 10);
        daftarKue[19] = new KueJadi("Pisang Molen", 3700, 7);

        double totalHarga = 0;
        double totalHargaPesanan = 0;
        double totalBerat = 0;
        double totalHargaJadi = 0;
        double totalJumlah = 0;

        Kue maxKue = daftarKue[0];

        System.out.println("===== DAFTAR KUE =====");

        // Kue Pesanan
        System.out.println("\nKUE PESANAN:");
        for (Kue k : daftarKue) {
            if (k instanceof KuePesanan) {
                KuePesanan kp = (KuePesanan) k;
                double hargaTotal = kp.hitungHarga();

                System.out.println("Nama kue: " + kp.nama +
                        ", Harga: Rp " + hargaTotal +
                        ", Harga satuan: Rp " + kp.harga +
                        ", Berat: " + kp.berat + " kg");

                totalHarga += hargaTotal;
                totalHargaPesanan += hargaTotal;
                totalBerat += kp.berat;

                if (hargaTotal > maxKue.hitungHarga()) {
                    maxKue = kp;
                }
            }
        }

        // Kue Jadi
        System.out.println("\nKUE JADI:");
        for (Kue k : daftarKue) {
            if (k instanceof KueJadi) {
                KueJadi kj = (KueJadi) k;
                double hargaTotal = kj.hitungHarga();

                System.out.println("Nama kue: " + kj.nama +
                        ", Harga: Rp " + hargaTotal +
                        ", Harga satuan: Rp " + kj.harga +
                        ", Jumlah: " + kj.jumlah);

                totalHarga += hargaTotal;
                totalHargaJadi += hargaTotal;
                totalJumlah += kj.jumlah;

                if (hargaTotal > maxKue.hitungHarga()) {
                    maxKue = kj;
                }
            }
        }

        System.out.println("\n===== Informasi Semua Kue =====");
        System.out.println("Total Harga Semua Kue: Rp " + totalHarga);
        System.out.println("Total Harga Kue Pesanan: Rp " + totalHargaPesanan);
        System.out.println("Total Berat Kue Pesanan: " + totalBerat + " kg");
        System.out.println("Total Harga Kue Jadi: Rp " + totalHargaJadi);
        System.out.println("Total Jumlah Kue Jadi: " + totalJumlah);

        System.out.println("\nKue dengan Harga Termahal:");
        System.out.println("Nama kue: " + maxKue.nama +
                ", Harga: Rp " + maxKue.hitungHarga());
    }
}