import java.util.Scanner;
// game UAS
public class Main {
    public static void main(String[] args) {
        System.out.println("Selamat datang di SQUIRT GAME");
        Scanner scan = new Scanner(System.in);
        String namaChar1, namaChar2;
        int addHp1, addAtk1, addDef1, addHp2, addAtk2, addDef2, tipeChar1, tipeChar2;
        Tank player1T=null, player2T=null;
        Fighter player1F=null, player2F=null;
        Assassin player1A=null, player2A=null;
        Wizard player1W=null, player2W = null;

        //Mengambil input untuk membuat player 1
        System.out.println("1. Tank \n2. Fighter \n3. Assassin \n4. Wizard");
        System.out.print("Masukkan Nama Karakter Player1 : ");
        namaChar1 = scan.next();

        System.out.print("Masukkan Tipe Karakter : ");
        tipeChar1 = scan.nextInt();

        System.out.println("Anda memiliki 10 additional point untuk mengupgrade Hero anda");
        System.out.println("Masukkan additional point untuk Hp : ");
        addHp1 = scan.nextInt();

        System.out.println("Masukkan additional point untuk Atk : ");
        addAtk1 = scan.nextInt();

        System.out.println("Masukkan additional point untuk Def : ");
        addDef1 = scan.nextInt();

        //Mengambil input untuk membuat player 2
        System.out.print("Masukkan Nama Karakter Player2 : ");
        namaChar2 = scan.next();

        System.out.print("Masukkan Tipe Karakter : ");
        tipeChar2 = scan.nextInt();

        System.out.println("Anda memiliki 10 additional point untuk mengupgrade Hero anda");
        System.out.println("Masukkan additional point untuk Hp : ");
        addHp2 = scan.nextInt();

        System.out.println("Masukkan additional point untuk Atk : ");
        addAtk2 = scan.nextInt();

        System.out.println("Masukkan additional point untuk Def : ");
        addDef2 = scan.nextInt();

        Hero test;
        switch (tipeChar1) {
            case 1 -> {
                player1T = new Tank(namaChar1, tipeChar1, addHp1, addAtk1, addDef1);
            }
            case 2 -> {
                player1F = new Fighter(namaChar1, tipeChar1, addHp1, addAtk1, addDef1);
            }
            case 3 -> {
                player1A = new Assassin(namaChar1, tipeChar1, addHp1, addAtk1, addDef1);
            }
            case 4 -> {
                player1W = new Wizard(namaChar1, tipeChar1, addHp1, addAtk1, addDef1);
            }
        }

        switch (tipeChar2) {
            case 1 -> {
                player2T = new Tank(namaChar2, tipeChar2, addHp2, addAtk2, addDef2);
            }
            case 2 -> {
                player2F = new Fighter(namaChar2, tipeChar2, addHp2, addAtk2, addDef2);
            }
            case 3 -> {
                player2A = new Assassin(namaChar2, tipeChar2, addHp2, addAtk2, addDef2);
            }
            case 4 -> {
                player2W = new Wizard(namaChar2, tipeChar2, addHp2, addAtk2, addDef2);
            }
        }



    }
}
