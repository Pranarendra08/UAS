import java.util.Scanner;
// game UAS
public class Main {
    public static void main(String[] args) {
        System.out.println("Selamat datang di SQUIRT GAME");
        Scanner scan = new Scanner(System.in);
        String namaChar1, namaChar2;
        int addHp1, addAtk1, addDef1, addHp2, addAtk2, addDef2, tipeChar1, tipeChar2;

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

        Hero player2 = new Hero(namaChar2, tipeChar1, addHp2, addAtk2, addDef2);

        Hero[] player = new Hero[1];
        switch (tipeChar1) {
            case 1:
                Hero player1T = new Hero(namaChar1, tipeChar1, addHp1, addAtk1, addDef1);
                player[0] = player1T;
                break;
            case 2:
                Hero player1F = new Hero(namaChar1, tipeChar1,addHp1, addAtk1, addDef1);
                player[0] = player1F;
                break;
            case 3:
                Hero player1A = new Hero(namaChar1, tipeChar1, addHp1, addAtk1, addDef1);
                player[0] = player1A;
                break;
            case 4:
                Hero player1W = new Hero(namaChar1, tipeChar1, addHp1, addAtk1, addDef1);
                player[0] = player1W;
                break;
        }

        switch (tipeChar2) {
            case 1:
                Hero player2T = new Hero(namaChar1, tipeChar1, addHp1, addAtk1, addDef1);
                player[1] = player2T;
                break;
            case 2:
                Hero player2F = new Hero(namaChar1, tipeChar1, addHp1, addAtk1, addDef1);
                player[1] = player2F;
                break;
            case 3:
                Hero player2A = new Hero(namaChar1, tipeChar1, addHp1, addAtk1, addDef1);
                player[1] = player2A;
                break;
            case 4:
                Hero player2W = new Hero(namaChar1, tipeChar1, addHp1, addAtk1, addDef1);
                player[1] = player2W;
                break;
        }


    }
}
