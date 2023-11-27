public class Sword {
    String nameSword;
    int levelSword = 1;
    double swordBaseDamage;
    double swordDamage;
    double runSpeedDecreaseSword;

    Sword(String[] sword) {
        this.nameSword = sword[0];
        this.swordBaseDamage = Double.parseDouble(sword[1]);
        this.runSpeedDecreaseSword = Double.parseDouble(sword[2]);
    }

    public double getSwordDamage() {
        swordDamage = swordBaseDamage * (1 * (0.1 + levelSword));
        return swordDamage;
    }
}