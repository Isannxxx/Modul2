package Unguided2;

import java.util.Scanner;

public class Titik {
    private int x;
    private int y;

    public Titik() {
        this.x = 0;
        this.y = 0;
    }

    public void inisialisasiTitik(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void tampilTitik() {
        System.out.println("Unguided2.Titik: " + "X " + x + " " + "Y " + y);
    }

    public double pencerminanSumbuX() {
        y = -y;
        return y;
    }

    public double pencerminanSumbuY() {
        x = -x;
        return x;
    }

    public double perkalianSkalar(int skalar) {
        x *= skalar;
        y *= skalar;
        return skalar;
    }

    public double hitungJarak() {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan koordinat x1: ");
        double x1 = input.nextDouble();

        System.out.print("Masukkan koordinat y1: ");
        double y1 = input.nextDouble();

        System.out.print("Masukkan koordinat x2: ");
        double x2 = input.nextDouble();

        System.out.print("Masukkan koordinat y2: ");
        double y2 = input.nextDouble();

        double jarak = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("Jarak antara dua titik: " + jarak);

        return jarak;

    }
}
