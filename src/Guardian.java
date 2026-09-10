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
}
