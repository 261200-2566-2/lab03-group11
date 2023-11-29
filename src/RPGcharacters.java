public class RPGcharacters   {
    double speed;
    String name;
    int level = 1;
    double maxHP;
    double hp;
    double maxMana;
    double mana;
    double baseRunSpeed;
    double maxRunSpeed;
    double money;
    double def;
    double atk;

    RPGcharacters (String[] Hero){
        this.name = Hero[0];
        this.maxHP = Double.parseDouble(Hero[1]);
        this.maxMana = Double.parseDouble(Hero[2]);
        this.baseRunSpeed = Double.parseDouble(Hero[3]);
    }


    void status() {
        update();
        System.out.println("///////////////////////////////////////////");
        System.out.println("your Name is: " + name );
        System.out.println("your HP is: " + hp );
        System.out.println("your defense is: " + def );
        System.out.println("your Damage is: " + atk );
        System.out.println("your Mana is: " + mana );
        System.out.println("your move speed is: " + speed);
        System.out.println("your level: " + level);
        System.out.println("///////////////////////////////////////////");

    }
    public void setAtk(double atkEquip ){
        atk = atkEquip;

    }
    public void setDef(double defEquip){
        def= defEquip;
    }
    public void setSpeed(double speedEquip){
        speed = (baseRunSpeed*(0.9+0.03*level))+speedEquip;
    }


    public void update() {
        hp = maxHP;
        mana = maxMana;
    }
}