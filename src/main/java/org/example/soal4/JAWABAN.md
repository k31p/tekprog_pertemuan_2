# Jawaban soal no 4

## 1. Jelaskan output nilai dari variable b.

Jawaban:

Hasil akhir adalah 10\
Penjelasan:\

1. d adalah bilangan desimal dengan value 10.25 dan bertipe double
2. f adalah bilangan desimal bertipe float yang diisi dengan variabel d yang dikonversikan menjadi float, sehingga hasilnya tetap 10.25
3. b adalah bilangan bulat bertipe byte yang diisi dengan hasil dari fungsi methodOne((long) f). NOTE: f dikonversikan menjadi long
4. pada methodOne() l dikonversi menjadi integer dan disimpan pada variabel i, setelah itu dikembalikan kepada pemanggil setelah variabel i dikonversi menjadi short, yang hasilnya adalah 10;
5. dari methodOne hasil dari b dicetak ke layar dan hasiln