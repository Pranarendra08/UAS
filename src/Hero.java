public class Hero {
    // tank, fighter, assasin, mage
    /*
    var name: String
    var HP: Int
    var Atk: Int
    var Def: Int

    fun Hero(name: String, HP: Int)
     */
    public String charName;
    public int tipeChar;
    public int addHp;
    public int addAtk;
    public int addDef;

    public Hero(String charName, int tipeChar, int addHp, int addAtk, int addDef) {
        this.charName = charName;
        this.tipeChar = tipeChar;
        this.addHp = addHp;
        this.addAtk = addAtk;
        this.addDef = addDef;
        /*
        if(this.tipeChar == 1) {
            new Tank(this.charName, this.addHp, this.addAtk, this.addDef);
        } else if(this.tipeChar == 2) {
            new Fighter(this.charName, this.addHp, this.addAtk, this.addDef);
        }

         */
    }
}
