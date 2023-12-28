package hash_tabel;

public class DirectHash {
   
    private int[] table;

    //   Menginisialisasi array table dengan ukuran yang ditentukan oleh parameter size.
     
    public DirectHash(int size) {
        table = new int[size];
    }

    /**
     * Metode insert
     * @param value Nilai yang akan disisipkan ke dalam hash table
     * Menyisipkan nilai ke dalam hash table pada indeks yang sama dengan nilai itu sendiri.
     */
    public void insert(int value) {
        table[value] = value; // Gunakan nilai sebagai kunci (indeks)
        System.out.println("Data: "+value+" dimasukan ke index: "+ value);
    }

    /**
     * Metode search
     * @param value Nilai yang akan dicari dalam hash table
     * @return Nilai yang dicari jika ditemukan, atau -1 jika tidak ditemukan
     * Mencari nilai dalam hash table dan mengembalikannya jika ditemukan.
     */
    public int search(int value) {
        if (table[value] == value) {
            return table[value]; // Kembalikan nilai jika ditemukan
        }
        return -1; // Tidak ditemukan
    }

    /**
     * Metode main
     * Contoh penggunaan kelas DirectHash.
     */
    public static void main(String[] args) {
        // Inisialisasi Direct Hash dengan ukuran array 200
        DirectHash directHash = new DirectHash(200);

        // Menyisipkan beberapa nilai
        directHash.insert(9);
        directHash.insert(50);
        directHash.insert(100);

        // Mencari nilai
        System.out.println("Hasil pencarian nilai 9 di Index: " + directHash.search(9));  // Harusnya mengembalikan 9
        System.out.println("Hasil pencarian nilai 50 di Index: " + directHash.search(50));  // Harusnya mengembalikan 50
        System.out.println("Hasil pencarian nilai 100 di Index: " + directHash.search(100));  // Harusnya mengembalikan 100

        // Mencari nilai yang tidak ada
        System.out.println("Hasil pencarian nilai 150 di Index: " + directHash.search(150));  // Harusnya mengembalikan -1 (tidak ditemukan)
    }
}