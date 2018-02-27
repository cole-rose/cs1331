class Driver {


    //class used to test Buzzcard and Student
    public static void main(String[] args) {
        int passed = 0;
        int swipes = 40;
        double diningDollars = 42.00;
        double buzzFunds = 34.00;
        BuzzCard myCard = new BuzzCard(swipes, diningDollars, buzzFunds);
        System.out.println(myCard.toString());
        Student cole = new Student(myCard, "Cole", 9033);
        System.out.println(cole.toString());
        //test case 1
        System.out.println("Testing Buzzcard variables");
        if (myCard.getMealSwipes() != swipes) {
            System.out.println("Failed test case 1. Buzzcard mealswipes incorrect");
        } else if (myCard.getDiningDollars() != diningDollars) {
            System.out.println("Failed test case 2. Buzzcard diningDollars incorrect");
        } else if (myCard.getBuzzFunds() != buzzFunds) {
            System.out.print("Failed test case 3. Buzzcard buzzFunds incorrect");
        } else{
            passed++; System.out.println("Test case 1 passed" + "\n");
        }
    BrittainItem buffet = BrittainItem.BUFFET;
    while (myCard.getMealSwipes() >= buffet.getMealSwipes()) {
        
        cole.buyBrittainMealSwipes(buffet);
        System.out.println("You have " + myCard.getMealSwipes() + " meal swipes after eating Brittain buffet");
   
    }
    
    cole.buyBrittainMealSwipes(buffet); 
    System.out.println("\n \n \n"); 
    System.out.println("You have " + myCard.getBuzzFunds() + " buzzFunds");
    while (myCard.getBuzzFunds() >= buffet.getBuzzFunds()) {
        cole.buyBrittainBuzzFunds(buffet);
        System.out.println("You have " + myCard.getBuzzFunds() + " buzzFunds after eating Brittain buffet");
    }
    
    cole.buyBrittainBuzzFunds(buffet);
    System.out.println("\n \n \n");


    
    BuzzCard myCard2 = new BuzzCard(swipes, diningDollars, buzzFunds);
    Student bob = new Student(myCard2, "Bob", 33232);

    BurdellsItem hoodie = BurdellsItem.HOODIE;
   System.out.println("Buying hoodies from burdells with buzzfunds for ")
    while(myCard2.getBuzzFunds() >= hoodie.getBuzzFunds())
    {
        System.out.println(myCard2.toString());
        bob.buyBurdellsBuzzFunds(hoodie);
        System.out.println(myCard2.toString());
    
    }
    bob.buyBurdellsBuzzFunds(hoodie);
    System.out.println("\n \n Buying footlongs from subway with buzzfunds. Cost: 10 buzzfunds");
    BuzzCard myCard3 = new BuzzCard(swipes, diningDollars, buzzFunds);
    Student joe = new Student(myCard3, "Joe", 12122);

    SubwayItem footLong = SubwayItem.FOOTLONG;
   
    while(myCard3.getBuzzFunds() >= footLong.getBuzzFunds())
    {
        joe.buySubwayBuzzFunds(footLong);
        System.out.println(myCard3.toString());
    
    }
    joe.buySubwayBuzzFunds(footLong);

    System.out.println("\n \n \n ");
    while(myCard3.getDiningDollars() >= footLong.getDiningDollars())
    {
        joe.buySubwayDiningDollars(footLong);
        System.out.println(myCard3.toString());
    
    }
    joe.buySubwayDiningDollars(footLong);
}
    

}