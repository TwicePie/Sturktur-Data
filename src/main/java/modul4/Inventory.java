package Modul4;

import java.util.HashMap;
import java.util.Scanner;

public class Inventory {
    public static void main(String[] args) {
        HashMap<String, Integer> inventori = new HashMap<>();

        inventori.put("Pensil", 50);
        inventori.put("Penghapus", 35);
        inventori.put("Buku", 45);

        System.out.println("Inventori awal : " + inventori);

        inventori.remove("Penghapus");

        System.out.println("Inven update : " + inventori);

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama barang yang ingin dicari : ");
        String barang = input.nextLine();

        cariBarang(inventori, barang);
    }
    public static void cariBarang(HashMap<String, Integer> inventori, String barang){
        if (inventori.containsKey(barang)){
            System.out.println("Stok " + barang + " : " + inventori.get(barang) + " unit");
        }else {
            System.out.println("gaada brok habis");
        }
    }
}
