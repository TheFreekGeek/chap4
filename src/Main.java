//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

        Guardian guard1 = new Guardian();
        guard1.name = "Bob";
        guard1.rating = 54;
        Guardian guard2 = new Guardian();
        guard2.name = "Doug";
        guard2.rating = 99;
        Guardian guard3 = new Guardian();
        guard3.name = "Phil";
        guard3.rating = 12;
        Guardian guard4 = new Guardian();
        guard4.name = "Marcel";
        guard4.rating = 80;

        System.out.println(" ");
        System.out.println("Your Guardians");
        System.out.println(guard1.name + " with a power rating of " + guard1.rating);
        System.out.println(guard2.name + " with a power rating of " + guard2.rating);
        System.out.println(guard3.name + " with a power rating of " + guard3.rating);
        System.out.println(guard4.name + " with a power rating of " + guard4.rating);
}
