public class AplikasiTodoList {

    //Jika menambahkan todolist lebih dari 10, akan membuat ulang si model nya
    public static String[] model = new String[10];//Mmebuat Array String
    public static java.util.Scanner scan = new java.util.Scanner(System.in);
    public static void main(String[] args) {
        viewShowTodoList();//Memanggil method
    }
//Menentukan Bisnis Logic
    //Ada 3 Bisnis Logic di bawah ini

    public static void showTodoList(){//Menampilkan Todo List
        System.out.println("TODO LIST");
        for (var i = 0; i < model.length; i++){
            var todo = model[i];//Ambil data ke i
            var no = i + 1;//Di tambah 1, jadi mulai dari 1

            if (todo != null){//jika data nya tidak sama dengan null, akan di tampilkan
                System.out.println(no + ". " + todo);
            }
        }
    }
//Test menampilkan Todo List
    public static void testShowTodoList(){
        model[0] = "Belajar Java";//Mencoba Memasukan Data
        model[1] = "Belajar PHP";
        model[2]=  "Belajar JavaScript";
        model[3] = "Belajar HTML";
        showTodoList();//Memanggil method showTodoList
    }
    public static void addTodoList(String todo){//Menambah Todo Ke List
        //Mengecek apakah model sudah penuh atau belum
        var penuh = true;
        for (var i = 0; i < model.length; i++){
            if (model[i] == null){//Kalau model index nya ada yg null, kalau gada yg null penuh nya true
                penuh = false;//Berarti penuh nya false
                break;
            }
        }

        //Jika penuh kita resize ukuran array 2x lipat
        if (penuh){
            var temp = model;
            model = new String[model.length * 2];

            for (var i = 0; i < temp.length; i++){
                model[i] = temp[i];
            }
        }

        //Tambahkan ke posisi yg data array nya kosong atau null
        for (var i = 0; i < model.length; i++){//Cek dari index ke 0 hingga akhir
            if (model[i] == null){//Kalau data nya kosong
                model[i] = todo;//Maka akan menambahkan todo tersebut ke index yang null
                break;
            }
        }
    }

    //Test menambah ke Todo List
    public static void testAddTodoList(){
        for (var i = 0; i < 25; i++){
            addTodoList("Contoh ke. " + i);
        }
        showTodoList();
    }
    public static boolean removeTodoList(Integer number){//Menghapus Todo List
        if ((number -1) >= model.length){//cek kalau number -1 nya lebih dari panjang dri array nya
            return false;//Akan mengembalikan ga falid atau false
        } else if (model[number -1] == null) {//atau cek data di index sudah null apa tidak
            return false;//kalau sudah null akan mengembalikan ga falid atau false
        }else {
            for (var i = (number -1); i < model.length; i++){//literasi dari i sama dengan index yg kita hapus sama panjang dari model nya
                if (i == (model.length -1)){//cek kalau i nya sudah di ujung data model nya
                    model[i] = null;//langsung set model = null
                }else{//kalau bukan data yg di ujung
                    model[i] = model[i + 1];//akan set dari i saat ini geser dari i index selanjutnya
                }
                //jadi contoh:
                //1.satu
                //2.dua
                //3.tiga
                //ketika kita ingin hapus yg 2.(dua), data yg di 3.(tiga) akan ke geser ke atas
                //dan tiga menjadi 2.(tiga)
                //jadi seperti ini
                //1.satu
                //2.tiga
                //3.null
            }
            return true;//akan mengembalikan falid atau true
        }
    }

    //Test Menghapus Todo List
    public static void testRemoveTodoList(){
        addTodoList("Satu");//Menambahkan data
        addTodoList("Dua");
        addTodoList("Tiga");
        addTodoList("Empat");
        addTodoList("Lima");

        var result = removeTodoList(2);
        System.out.println(result);

        showTodoList();
    }
    public static String input(String info){//Input Data
        System.out.print(info + " : ");
        String data = scan.nextLine();//Akan menampilkan apa yg user ketikan, ketika kita enter akan simpan return kan value nya dan akan simpan di variable data
        return data;//lalu kita return kan data nya di method input
    }

    //Test Input Todo List
    public static void testInput(){
        var name = input("Nama");
        System.out.println("Hi " + name);

        var jurusan = input("Jurusan");
        System.out.println("Anda mengambil jurusan " + jurusan + ", Bagus sekali");
    }

    //Menentukan View
    public static void viewShowTodoList(){//Menampilkan view Todo List
        while (true){//Biar di tampilkan terus

            showTodoList();//Menampilkan Todo List

            System.out.println("MENU :");
            System.out.println("1. Tambah");//Untuk menambah
            System.out.println("2. Hapus");//Menghapus
            System.out.println("x. Keluar");//Keluar

            var input = input("Pilih");//Terima Input Dari User
            if (input.equals("1")){//Kalau pilih 1
                viewAddTodoList();//Langsung pindahkan ke sini
            } else if (input.equals("2")) {//Kalau pilih 2
                viewRemoveTodoList();//Langsung pindahkan ke sini
            } else if (input.equals("x")) {//Kalau pilih x
                break;//Akan di break, artinya menghetikan perulangan (while)
            } else {//Kalau user pilih yg tidak ada di menu
                System.out.println("Pilihan Tidak Tersedia");//Akan menampilkan ini
            }
        }
    }

    //Test View Menampilkan Todo list
    public static void testViewShowTodoList(){
        addTodoList("Java");
        addTodoList("PHP");
        addTodoList("HTML5");
        addTodoList("JavaScript");
        addTodoList("Bootsrap");
        viewShowTodoList();
    }
    public static void viewAddTodoList(){//Menampilkan view menambah Todo list
        System.out.println("MENAMBAH TODO LIST");

        var todo = input("x Jika Batal");

        if (todo.equals("x")){

        }else {
            addTodoList(todo);
        }
    }

    public static void testViewAddTodoList(){
        addTodoList("PHP");
        addTodoList("JAVA");
        addTodoList("HTML");
        addTodoList("CSS");

        viewAddTodoList();//Jadi apa yg sudah di inputkan

        showTodoList();//Akan tampil di sini
    }
    public static void viewRemoveTodoList(){//Menampilkan view menghapus Todo List
        System.out.println("MENGHAPUS TODO LIST");

        var number = input("Nomor yg di hapus");//Terima input dari user
            if (number.equals("x")){//cek , jika yg di input x
                //akan membatalkan(Ga jadi menghapus)
            }else {
                boolean success = removeTodoList(Integer.valueOf(number));
                if (!success){
                    System.out.println("Gagal Menghapus Todo List : " + number);
                }
            }
        }

        public static void testViewRemoveTodoList(){
        addTodoList("Ikram");
        addTodoList("Zehan");
        addTodoList("Achmad Yani");
        addTodoList("Uswah");
        addTodoList("Fifi");
        addTodoList("Aab");

        showTodoList();//Menampilkan Todo List sebelumnya

        viewRemoveTodoList();//Kita coba hapus

        showTodoList();//Menampilkan Todo List Setelah di Hapus
        }
    }
