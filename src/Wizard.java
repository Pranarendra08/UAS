public class Wizard extends Hero{
    String type = "Wizard";
    private int Hp = 3000;
    private int Atk = 170;
    private int Def = 90;

    public Wizard(String charName, int tipeChar, int addHp, int addAtk, int addDef) {
        super(charName, tipeChar, addHp, addAtk, addDef);
    }

    public int FinalHp = Hp + (addHp * 180); //adds 180
    public int FinalAtk = Atk + (addAtk * 10); //adds 10
    public int FinalDef = Def + (addDef * 15); //adds 15

    public void display() {
        System.out.println("HP  : " + FinalHp);
        System.out.println("ATK : " + FinalAtk);
        System.out.println("DEF : " + FinalDef);
    }
}
