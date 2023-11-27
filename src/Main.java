import java.util.Scanner;

public class Main {
//    String[] nameHero = ["nameHero", "maxHP", "maxMana", "baseRunSpeed"];
    String[] UnjiMan = {"UnjiMan", "100", "60", "5"};
    String[] SpermMan = {"SpermMan", "110", "50", "10"};
    String[] PennisMan = {"PennisMan", "90", "70", "12"};

//    String[] nameEquip = {"NameEquip", "Damage", "Defense", "RunSpeedDecrease"};
    String[] sword = {"sword", "25", "0", "1"};
    String[] dagger = {"dagger", "20", "0", "0.6"};
    String[] knife = {"knife", "15", "0", "0.3"};

    String[] shield = {"sheild", "0", "10", "3"};
    String[] pan = {"pan", "0", "5", "1"};

    public static void main(String[] args) {
        Main main = new Main();
        RPGcharacters hero = null;
        Sword useSword = null;
        Shield useShield = null;
        Scanner scanner = new Scanner(System.in);
        String name;
        do {
            System.out.print("Choose Hero(UnjiMan, SpermMan, PennisMan): ");
            name = scanner.next();
            if (name.equals("UnjiMan")) {
                hero = new RPGcharacters(main.UnjiMan);
            } else if (name.equals("SpermMan")) {
                hero = new RPGcharacters(main.SpermMan);
            } else if (name.equals("PennisMan")) {
                hero = new RPGcharacters(main.PennisMan);
            } else {
                System.out.println("Hero not found");
            }
        } while (!name.equals("UnjiMan") && !name.equals("SpermMan") && !name.equals("PennisMan"));

        String swordName;
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
        } while (!swordName.equals("Sword") && !swordName.equals("Dagger") && !swordName.equals("Knife"));

        String shieldName;
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
        } while (!shieldName.equals("Sheild") && !shieldName.equals("Pan"));
        scanner.close();

        hero.status();
    }
}