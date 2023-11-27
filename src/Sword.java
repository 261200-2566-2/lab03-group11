public class Sword extends Shield {
    String nameSword;
    int levelSword = 1;
    double swordBaseDamage;
    double swordDamage;
    double runSpeedDecreaseSword;

    Sword (String[] sword) {
        super(sword);
        this.nameSword = sword[0];
        this.swordBaseDamage = Double.parseDouble(sword[1]);
        this.runSpeedDecreaseSword = Double.parseDouble(sword[3])*(0.1+0.03*levelSword);
    }

    public double getSwordDamage() {
        swordDamage = swordBaseDamage*(1 + 0.1*levelSword);
        return swordDamage;
    }

    public double getShieldDDef() {
        return getShieldDef();
    }

    public double getRunSpeedDecrease() {
        return runSpeedDecreaseSword + getRunSpeedDecreaseShield();
    }
}
