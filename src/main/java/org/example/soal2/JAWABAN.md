# Jawaban Soal No 2

## 1. Bagaimana output dari masing masing class Constants dan Constants2?

Jawaban: Output dari kedua class menghasilkan nilai yang sama, yaitu "Paper size in centimeters: 21.59 by 27.94"

## 2. Apa perbedaan penggunaan final double dengan public static final double?

Jawaban:

Perbedaannya adalah scope dari tipe tersebut. final double adalah variabel konstan ( tidak bisa dirubah ) yang hanya berlaku dalam suatu method. Sedangkan static public static final double dapat digunakan pada class maupun diluar sekalipun karena access modifier public, walaupun tidak bisa dirubah valuenya karena sudah final.

Perbedaan lainnya adalah public static final double dapat dipanggil langsung tanpa membuat objek dari class, jadi variabel dapat dipanggil dengan menuliskan "Constants2.CM_PER_INCH"