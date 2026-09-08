//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

        Guardian guard1 = new Guardian();
        guard1.newName("Bob");
        guard1.newRating(101);
        Guardian guard2 = new Guardian();
        guard2.newName("Doug");
        guard2.newRating(99);
        Guardian guard3 = new Guardian();
        guard3.newName("Phil");
        guard3.newRating(12);
        Guardian guard4 = new Guardian();
        guard4.newName("Marcel");
        guard4.newRating(120);

        System.out.println(" ");
        System.out.println("Your Guardians");
        if (guard1.isLegendary() == true) {
                System.out.println("The Legendary " + guard1.showName() + " with a power rating of " + guard1.showRating());
        }
        else {
                System.out.println(guard1.showName() + " with a power rating of " + guard1.showRating());
        }
        if (guard2.isLegendary() == true) {
                System.out.println("The Legendary " + guard2.showName() + " with a power rating of " + guard2.showRating());
        }
        else {
                System.out.println(guard2.showName() + " with a power rating of " + guard2.showRating());
        }
        if (guard3.isLegendary() == true) {
                System.out.println("The Legendary " + guard3.showName() + " with a power rating of " + guard3.showRating());
        }
        else {
                System.out.println(guard3.showName() + " with a power rating of " + guard3.showRating());
        }
        if (guard4.isLegendary() == true) {
                System.out.println("The Legendary " + guard4.showName() + " with a power rating of " + guard4.showRating());
        }
        else {
                System.out.println(guard4.showName() + " with a power rating of " + guard4.showRating());
        }
}
