import java.util.Random;
public abstract class Character {
    private String name;
    private int level;
    private int strength;
    private int dexterity;
    private int intelligence;
    private int wisdom;
    private int health;
    private boolean isDead = false;
    public static final int initialLevel = 1;
    public static final int initialHealth = 5;

    public Character(String name, int seed) {
        //implement this constructor using constructor delegation
        this.name = name;
        setLevel(initialLevel);
        setHealth(initialHealth);
        Random oneToSix = new Random();
        int randomStrength = oneToSix.nextInt(6) + 1;
        setStrength(randomStrength);
        int randomDexterity = oneToSix.nextInt(6) + 1;
        setDexterity(randomDexterity);
        int randomIntelligence = oneToSix.nextInt(6) + 1;
        setIntelligence(randomIntelligence);
        int randomWisdom = oneToSix.nextInt(6) + 1;
        setWisdom(randomWisdom);
    }

    public Character(String name, int level,
                     int strength, int dexterity,
                     int intelligence, int wisdom) {
        this.name = name;
        setHealth(5 * level);
        setLevel(level);
        setStrength(strength);
        setDexterity(dexterity);
        setIntelligence(intelligence);
        setWisdom(wisdom);
        //implement this constructor
    }

    public String getName() {
        //implement this method
        return this.name;
    }

    public int getLevel() {
        //implement this method
        return this.level;
    }

    public void setLevel(int level) {
        //implement this method
        this.level = level;
    }

    public int getStrength() {
        //implement this method
        return this.strength;
    }

    public void setStrength(int strength) {
        //implement this method
        this.strength = strength;
    }

    public int getDexterity() {
        //implement this method
        return this.dexterity;
    }

    public void setDexterity(int dexterity) {
        //implement this method
        this.dexterity = dexterity;
    }

    public int getIntelligence() {
        //implement this method
        return this.intelligence;
    }

    public void setIntelligence(int intelligence) {
        //implement this method
        this.intelligence = intelligence;
    }

    public int getWisdom() {
        //implement this method
        return this.wisdom;
    }

    public void setWisdom(int wisdom) {
        //implement this method
        this.wisdom = wisdom;
    }

    public int getHealth() {
        //implement this method
        return this.health;
    }

    public void setHealth(int health) {
        //implement this method
        if (health < 0) {
            this.isDead = true;
            this.health = 0;
        }
        else if (health > 5 * this.getLevel()) {
            System.out.println("Health cannot be set above max.");
        } else {
            this.health = health;
        }
    }

    public boolean getIsDead() {
        //implement this method
        return this.isDead;
    }

    public void setIsDead(boolean isDead) {
        //implement this method
        this.isDead = isDead;
    }

    public abstract void levelUp();

    public abstract void attack(Character c);

    public abstract String toString();

}
