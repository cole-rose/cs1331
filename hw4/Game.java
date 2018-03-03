public class Game{
    public static void main(String[] args) {
        System.out.println("Creating a new fighter class named fighty");
        Fighter fighty = new Fighter("fighty", 1);
        System.out.println( fighty.toString() );
        System.out.println("fighty has " + fighty.getHealth() + " health");
        System.out.println("Creating a new wizard class called wiz");
        Wizard wiz = new Wizard("wiz", 3);
        System.out.println(wiz.toString());
        System.out.println("wiz attacking lil bitch ass fighty");
        wiz.attack(fighty);
        System.out.println("fighty has " + fighty.getHealth() + " health" + "\n");
        wiz.attack(fighty);
        System.out.println("Creating new 2 new rogue classes called r1 and r2");
        Rogue r1 = new Rogue("r1", 2);
        System.out.println(r1.toString());
        Rogue r1 = new Rogue("r1", 6);
        System.out.println(r2.toString());
        System.out.println("creating new wizard class called wiz2");
        Wizard wiz2 = new Wizard("wiz2",1,2,3,4,5);
        System.out.println(wiz2.toString());
        System.out.println("\n wiz2 using mutiattack to attack r1 and r2");
        wiz2.multiAttack(r1,r2);
        System.out.println(r1.toString());
        System.out.println(r2.toString());



    }
}