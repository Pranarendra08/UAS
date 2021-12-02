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

        Hero player1 = new Hero(namaChar1, tipeChar1, addHp1, addAtk1, addDef1);


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

        Hero player2 = new Hero(namaChar2, tipeChar2, addHp2, addAtk2, addDef2);


        int HP1, ATK1, DEF1, HP2, ATK2, DEF2;
        //percobaan1
        if (tipeChar1 == 1) {
            System.out.println("Stat Player 1");
            player1.tank().display();
            HP1 = player1.tank().FinalHp;
        } else if (tipeChar1 == 2) {
            System.out.println("Stat Player 1");
            player1.fighter().display();
            HP1 = player1.fighter().FinalHp;
        } else if (tipeChar1 == 3) {
            System.out.println("Stat Player 1");
            player1.assassin().display();
            HP1 = player1.assassin().FinalHp;
        } else if (tipeChar1 ==4) {
            System.out.println("Stat Player 1");
            player1.wizard().display();
            HP1 = player1.wizard().FinalHp;
        }


        switch (tipeChar1) {
            case 1:
                System.out.println("Stat Player 1");
                player1.tank().display();
                break;
            case 2:
                System.out.println("Stat Player 1");
                player1.fighter().display();
                break;
            case 3:
                System.out.println("Stat Player 1");
                player1.assassin().display();
                break;
            case 4:
                System.out.println("Stat Player 1");
                player1.wizard().display();
                break;
        }


        switch (tipeChar2) {
            case 1:
                System.out.println("Stat Player 2");
                player2.tank().display();
                break;
            case 2:
                System.out.println("Stat Player 2");
                player2.fighter().display();
                break;
            case 3:
                System.out.println("Stat Player 2");
                player2.assassin().display();
                break;
            case 4:
                System.out.println("Stat Player 2");
                player2.wizard().display();
                break;
        }

    }
}
