# Judul Proyek: Aplikasi Todo List

## Deskripsi
Aplikasi Todo List adalah sebuah program sederhana yang memungkinkan pengguna untuk mencatat dan mengelola daftar tugas yang harus dilakukan.

## Fungsi-fungsi Utama
1. **Menampilkan Todo List**: Menampilkan daftar tugas yang sudah ditambahkan.
2. **Menambah Todo List**: Menambahkan tugas baru ke dalam daftar.
3. **Menghapus Todo List**: Menghapus tugas dari daftar berdasarkan nomor tugas.

## Cara Kerja
- **Menampilkan Todo List**: Program akan menampilkan daftar tugas yang sudah ditambahkan oleh pengguna.
- **Menambah Todo List**: Pengguna diminta untuk memasukkan nama tugas yang ingin ditambahkan. Jika pengguna memasukkan "x", proses tambah tugas dibatalkan. Jika tidak, tugas akan ditambahkan ke daftar.
- **Menghapus Todo List**: Pengguna diminta untuk memasukkan nomor tugas yang ingin dihapus. Jika pengguna memasukkan "x", proses penghapusan dibatalkan. Jika tidak, tugas dengan nomor tersebut akan dihapus dari daftar.

## Teknologi yang Digunakan
- **Bahasa Pemrograman**: Java
- **Library**: java.util.Scanner

## Logic
- Ketika program pertama kali dijalankan, program akan menampilkan daftar tugas yang sudah ditambahkan.
- Pengguna dapat memilih untuk menambah tugas, menghapus tugas, atau keluar dari program.
- Jika pengguna memilih untuk menambah tugas, program akan meminta pengguna untuk memasukkan nama tugas baru. Tugas baru tersebut akan ditambahkan ke daftar tugas.
- Jika pengguna memilih untuk menghapus tugas, program akan meminta pengguna untuk memasukkan nomor tugas yang ingin dihapus. Tugas dengan nomor tersebut akan dihapus dari daftar tugas.
- Program akan terus berjalan hingga pengguna memilih untuk keluar.

## Cara Menjalankan Program
1. Pastikan Java sudah terinstal di komputer Anda.
2. Buka terminal atau command prompt.
3. Compile file AplikasiTodoList.java dengan perintah `javac AplikasiTodoList.java`.
4. Jalankan program dengan perintah `java AplikasiTodoList`.

## Contoh Penggunaan
**Menambahkan tugas baru**:
TODO LIST
1. Belajar Java
2. Belajar PHP

MENU :
1. Tambah
2. Hapus
x. Keluar

Pilih : 1

MENAMBAH TODO LIST
Nama : Belajar JavaScript

TODO LIST
1. Belajar Java
2. Belajar PHP
3. Belajar JavaScript
TODO LIST
1. Belajar Java
2. Belajar PHP
3. Belajar JavaScript

MENU :
1. Tambah
2. Hapus
x. Keluar

Pilih : 2

MENGHAPUS TODO LIST
Nomor yg di hapus : 2

TODO LIST
1. Belajar Java
2. Belajar JavaScript

TODO LIST
1. Belajar Java
2. Belajar JavaScript

MENU :
1. Tambah
2. Hapus
x. Keluar

Pilih : x
