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
        switch (this.tipeChar) {
            case 1:
                tank();
                break;
            case 2:
                fighter();
                break;
            case 3:
                assassin();
                break;
            case 4:
                wizard();
                break;
        }

         */
    }

    public Tank tank() {
        return new Tank(this.charName, this.tipeChar, this.addHp, this.addAtk, this.addDef);
    }

    public Fighter fighter() {
        return new Fighter(this.charName, this.tipeChar, this.addHp, this.addAtk, this.addDef);
    }

    public Assassin assassin() {
        return new Assassin(this.charName, this.tipeChar, this.addHp, this.addAtk, this.addDef);
    }

    public Wizard wizard() {
        return new Wizard(this.charName, this.tipeChar, this.addHp, this.addAtk, this.addDef);
    }



}
