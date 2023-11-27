import java.util.Scanner;

public class Main {
//    String[] nameHero = ["nameHero", "maxHP", "maxMana", "baseRunSpeed"];
    String[] unjiMan = {"UnjiMan", "100", "60", "10"};
    String[] spermMan = {"SpermMan", "110", "50", "10"};
    String[] pennisMan = {"PennisMan", "90", "70", "12"};

//    String[] nameSword = {"NameEquip", "Damage", "RunSpeedDecrease"};
    String[] sword = {"sword", "25", "-1"};
    String[] dagger = {"dagger", "20", "-0.6"};
    String[] knife = {"knife", "15", "-0.3"};

//    String[] nameShield = {"NameEquip", "Def", "RunSpeedDecrease"};
    String[] shield = {"sheild", "10", "-2"};
    String[] pan = {"pan", "5", "-1"};

    public static void main(String[] args) {
        Main main = new Main();
        RPGcharacters hero = createHero(main);
        Sword useSword = chooseEquipmentLeftHand(main);
        Shield useShield = chooseEquipmentRightHand(main);

        hero.setAtk(useSword.getSwordDamage());
        hero.setDef(useShield.getShieldDef());
        var speedOfEquip = useSword.runSpeedDecreaseSword + useShield.getRunSpeedDecreaseShield();
        hero.setSpeed(speedOfEquip);
        hero.status();
    }

    private static RPGcharacters createHero(Main main) {
        Scanner scanner = new Scanner(System.in);
        String name;
        RPGcharacters hero = null;
        do {
            System.out.print("Choose Hero(UnjiMan, SpermMan, PennisMan): ");
            name = scanner.next();
            if (name.equals("UnjiMan")) {
                hero = new RPGcharacters(main.unjiMan);
            } else if (name.equals("SpermMan")) {
                hero = new RPGcharacters(main.spermMan);
            } else if (name.equals("PennisMan")) {
                hero = new RPGcharacters(main.pennisMan);
            } else {
                System.out.println("Hero not found");
            }
        } while (hero == null);
        return hero;
    }

    private static Sword chooseEquipmentLeftHand(Main main) {
        Scanner scanner = new Scanner(System.in);
        String swordName;
        Sword useSword = null;
        do {
            System.out.print("Choose Equipment LeftHand(Sword, Dagger, Knife): ");
            swordName = scanner.next();
            if (swordName.equals("Sword")) {
                useSword = new Sword(main.sword);
            } else if (swordName.equals("Dagger")) {
                useSword = new Sword(main.dagger);
            } else if (swordName.equals("Knife")) {
                useSword = new Sword(main.knife);
            } else {
                System.out.println("Equipment LeftHand not found");
            }
        } while (useSword == null);
        return useSword;
    }

    private static Shield chooseEquipmentRightHand(Main main) {
        Scanner scanner = new Scanner(System.in);
        String shieldName;
        Shield useShield = null;
        do {
            System.out.print("Choose Equipment RightHand(Shield, Pan): ");
            shieldName = scanner.next();
            if (shieldName.equals("Shield")) {
                useShield = new Shield(main.shield);
            } else if (shieldName.equals("Pan")) {
                useShield = new Shield(main.pan);
            } else {
                System.out.println("Equipment RightHand not found");
            }
        } while (useShield == null);
        return useShield;
    }
}