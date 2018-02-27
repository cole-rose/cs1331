/**
 * Represents a student with a Buzzcard class, a name, and a student id
 * @author crose37
 * @version 3004.3
 */
public class Student {

    private BuzzCard card;
    private String name;
    private int id;
    /**
     * constructor for the student class
     * @param card students BuzzCard
     * @param name students name
     * @param id students id number
     */
    public Student(BuzzCard card, String name, int id) {
        this.card = card;
        this.name = name;
        this.id = id;
    }
    /**
    * class used to buy food from Brittain with meal swipes
    * @param item an item of the BrittainItem class
    */
    public void buyBrittainMealSwipes(BrittainItem item) {
        if (card.getMealSwipes() < item.getMealSwipes()) {
            System.out.print("You do not have the amount to buy ");
            System.out.println("this item :(");
        } else {
            card.setMealSwipes(card.getMealSwipes() - item.getMealSwipes());
        }
    }
    /**
    * class used to buy food from Brittain with BuzzFunds
    * @param item an item of the BrittainItem class
    */
    public void buyBrittainBuzzFunds(BrittainItem item) {
        if (card.getBuzzFunds() < item.getBuzzFunds()) {
            System.out.print("You do not have the amount to buy ");
            System.out.println("this item :(");
        } else {
            card.setBuzzFunds(card.getBuzzFunds() - item.getBuzzFunds());
        }
    }
    /**
    * class used to buy items from Burdells with buzz funds
    * @param item an item in the BurdellsItem class
    */
    public void buyBurdellsBuzzFunds(BurdellsItem item) {
        if (card.getBuzzFunds() < item.getBuzzFunds()) {
            System.out.print("You do not have the amount to buy ");
            System.out.println("this item :(");
        } else {
            card.setBuzzFunds(card.getBuzzFunds() - item.getBuzzFunds());
        }
    }
    /**
    * class used to buy subway with dining dollars
    * @param item a food item the SubwayItem class
    */
    public void buySubwayDiningDollars(SubwayItem item) {
        if (card.getDiningDollars() < item.getDiningDollars()) {
            System.out.print("You do not have the amount to buy ");
            System.out.println("this item :(");
        } else {
            card.setDiningDollars(card.getDiningDollars()
                - item.getDiningDollars());
        }
    }
    /**
    * class used to buy subway with buzz funds
    * @param item a food item the SubwayItem class
    */
    public void buySubwayBuzzFunds(SubwayItem item) {
        if (card.getBuzzFunds() < item.getBuzzFunds()) {
            System.out.print("You do not have the amount to buy ");
            System.out.println("this item :(");
        } else {
            card.setBuzzFunds(card.getBuzzFunds() - item.getBuzzFunds());
        }
    }
    /**
    * toString method of the Student class
    * @return returns a String representation of a Student class instance 
    */
    public String toString() {
        return "Student name " + this.name + " with ID: " + this.id;
    }
}