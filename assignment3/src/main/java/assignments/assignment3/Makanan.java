package assignments.assignment3;

class Makanan {

    private String nama;
    private long harga;

    Makanan(String nama, long harga) {
        this.nama = nama;
        this.harga = harga;
    }

    long getHarga() {
        return harga;
    }

    @Override
    public String toString() {
        return nama;
    }

}