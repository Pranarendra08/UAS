public class Assassin extends Hero{
    String type = "Assassin";
    private int Hp = 3100;
    private int Atk = 180;
    private int Def = 90;

    public Assassin(String charName, int tipeChar, int addHp, int addAtk, int addDef) {
        super(charName, tipeChar, addHp, addAtk, addDef);
    }

    public int FinalHp = Hp + (addHp * 200); //adds 200
    public int FinalAtk = Atk + (addAtk * 15); //adds 15
    public int FinalDef = Def + (addDef * 15); //adds 15

    public void display() {
        System.out.println("HP  : " + FinalHp);
        System.out.println("ATK : " + FinalAtk);
        System.out.println("DEF : " + FinalDef);
    }
}
