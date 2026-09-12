public class Guardian {
    private String name;
    private int rating;

    void newName(String inName) {
        name = inName;
    }

    String showName() {
        return name;
    }

    void newRating(int inRating) {
            if (inRating > 0) {
                rating = inRating;
            }
    }


    int showRating() {
        return rating;
    }

    boolean isLegendary() {
        if (rating > 100) {
            return true;
        }
        else {
            return false;
        }
    }

    public void clash(Guardian opponent){
        if (rating > opponent.rating){
            System.out.println(showName() + " Wins!");
        }
        else if (showRating() == opponent.showRating()) {
            System.out.println("The guardians have tied in battle.");
        }
        else {
            System.out.println(showName() + " has been defeated by " + opponent.showName());
        }

    }
}
