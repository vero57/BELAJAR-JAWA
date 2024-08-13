package www.belajar;

public class Main{
    public static void main(String[] args){
        int angkaInt;
        angkaInt = 129;

        System.out.println("Ini adalah nilai dari INT " + angkaInt);
        System.out.println("besar bit " + Integer.BYTES + " byte");
        System.out.println("besar byte " + Integer.SIZE + " bit");
        System.out.println("Nilai maksimal " + Integer.MAX_VALUE);
        System.out.println("Nilai minimal " + Integer.MIN_VALUE);


        System.out.println("\n");
        long konversi = angkaInt;
        System.out.println("Ini adalah nilai variable angkaInt setelah di konversi menjadi long" + konversi);
        System.out.println("besar byte " + Long.BYTES + " byte");
        System.out.println("besar bit " + Long.SIZE + " bit");
        System.out.println("Nilai maksimal " + Long.MAX_VALUE);
        System.out.println("Nilai minimal " + Long.MIN_VALUE);

        System.out.println("\n");

        // mengkonversi ke rentang data yang lebih kecil
        byte angkaByte = (byte)konversi;
        System.out.println("Ini adalah nilai variable angkaInt setelah di konversi menjadi byte" + angkaByte);
        System.out.println("besar byte " + Byte.BYTES + " byte");
        System.out.println("besar bit " + Byte.SIZE + " bit");
        System.out.println("Nilai maksimal " + Byte.MAX_VALUE);
        System.out.println("Nilai minimal " + Byte.MIN_VALUE);

        // casting pembagian

//        pembagian dengan merubah tipe data hasil
        int a;
        int b;
        int hasil;
        a = 10;
        b = 3;
        hasil = a / b;
        System.out.printf("%d : %d = %d",a,b,hasil);


        // pembagian dengan cara mengubah salah satu tipe data
        float hasilbagi = (float) hasil;
        System.out.println(hasilbagi);
        int c;
        float d;
        c = 20;
        d = 13;
        float hasilkoma = c / d;
        System.out.println("20 : 13 = " + hasilkoma);



    }
}