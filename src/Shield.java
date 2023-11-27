public class Shield {
    String nameShield;
    int levelShield = 1;
    double shieldBaseDef;
    double shieldDef;
    double runSpeedDecreaseShield;

    Shield (String[] shield){
        this.nameShield = shield[0];
        this.shieldBaseDef = Double.parseDouble(shield[2]);
        this.runSpeedDecreaseShield = Double.parseDouble(shield[3]));
    }

    public double getShieldDef() {
        shieldDef = shieldBaseDef*(1+0.05*levelShield);
        return shieldDef;
    }

    public double getRunSpeedDecreaseShield() {
        return runSpeedDecreaseShield;
    }

}
