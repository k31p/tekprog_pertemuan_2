# Jawaban Soal 3

## 1. Pada kasus berikut jelaskan nilai nx setelah digunakan Math.round(x)

Jawaban:

Java memiliki fitur untuk melakukan pembulatan. Ketika x dimasukkan ke dalam Math.round(), maka method ini akan mengecek apakah desimal tersebut lebih dekat untuk bulat ke atas atau ke bawah, lalu membulatkan ke yang paling dekat

## 2. Kenapa dibutuhkan cast (int) dalam penggunaan Math.round(x)

Jawaban:

Karena hasil dari method tersebut berupa long, maka diperlukan casting ke integer agar hasil dari Math.round() dapat dimasukkan ke dalam variable bertipe integer