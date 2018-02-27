/**
* class used to represent a buzz card
* @author crose37
* @version 1.23.23.23.3.3.35.67.6
*/
public class BuzzCard {

    private int mealSwipes;
    private double diningDollars;
    private double buzzFunds;
    /**
     * constructor for the BuzzCard class
     * @param mealSwipes represents the number of meal swipes on the buzz card
     * @param diningDollars number of dining dollars on the buzz card
     * @param buzzFunds number of buzzfunds left on the buzzz card
     */
    public BuzzCard(int mealSwipes, double diningDollars, double buzzFunds) {
        setMealSwipes(mealSwipes);
        setDiningDollars(diningDollars);
        setBuzzFunds(buzzFunds);
    }
    /**
    *setMealSwipes setter method used to set the amount of meal swipes
    * @param mealSwipes integer representing a buzz cardss meal swipes
    */
    public void setMealSwipes(int mealSwipes) {
        this.mealSwipes = mealSwipes;
    }
    /**
    *setter method used to set the amount of dining dollars
    * @param diningDollars double representing a buzz cards's dining dollars
    */
    public void setDiningDollars(double diningDollars) {
        this.diningDollars = diningDollars;
    }
    /**
    *setter method used to set the amount of buzz funds
    * @param buzzFunds double representing a buzz cards's buzz funds
    */
    public void setBuzzFunds(double buzzFunds) {
        this.buzzFunds = buzzFunds;
    }
    /**
    *getter method used to retrieve the amount of meal swipes@
    *@return number of meal swipes 
    */
    public int getMealSwipes() {
        return this.mealSwipes;
    }
    /**
    *getter method used to retrieve the amount of dining dollars
    *@return amount of dining dollars
    */
    public double getDiningDollars() {
        return this.diningDollars;
    }
    /**
     * class used to retrieve buzz funds
     * @return buzz card's buzz funds
     */
    public double getBuzzFunds() {
        return this.buzzFunds;
    }
    /**
     * string representation of the BuzzCard class
     * @return a string that explains the contents of the BuzzCard class
     */
    public String toString() {
        return "Buzzcard Balance with Dining Dollars: " + this.diningDollars
                + ", buzzFunds: " + this.buzzFunds + ", Meal Swipes: "
                    + this.mealSwipes;
    }
}