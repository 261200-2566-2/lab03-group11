public class RPGcharacters extends Sword {
    String name;
    int level = 1;
    double maxHP;
    double hp;
    double maxMana;
    double mana;
    double baseRunSpeed;
    double maxRunSpeed;


    RPGcharacters (String[] Hero){
        super(Hero);
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
        System.out.println("your defense is: " + getShieldDDef() );
        System.out.println("your Attack is: " + getSwordDamage() );
        System.out.println("your Mana is: " + mana );
        System.out.println("your move speed is: " + maxRunSpeed );
        System.out.println("your level: " + level);
        System.out.println("///////////////////////////////////////////");
    }

    public void update() {
        hp = maxHP;
        mana = maxMana;
        maxRunSpeed = baseRunSpeed*(0.9+0.03*level);
    }
}
