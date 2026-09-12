//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

void main() {

        Scanner myObj = new Scanner(System.in);

        /*
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
        */

        Guardian[] roster = new Guardian[4];
        roster[0] = new Guardian();
        roster[1] = new Guardian();
        roster[2] = new Guardian();
        roster[3] = new Guardian();

        System.out.println("Name your guardians");
        System.out.println("Guardian 1");
        roster[0].newName(myObj.next());
        while (roster[0].showRating() == 0) {
                System.out.println("And his power rating?");
                roster[0].newRating(myObj.nextInt());
        }
        System.out.println("Guardian 2");
        roster[1].newName(myObj.next());
        while (roster[1].showRating() == 0) {
                System.out.println("And his power rating?");
                roster[1].newRating(myObj.nextInt());
        }
        System.out.println("Guardian 3");
        roster[2].newName(myObj.next());
        while (roster[2].showRating() == 0) {
                System.out.println("And his power rating?");
                roster[2].newRating(myObj.nextInt());
        }
        System.out.println("Guardian 4");
        roster[3].newName(myObj.next());
        while (roster[3].showRating() == 0) {
                System.out.println("And his power rating?");
                roster[3].newRating(myObj.nextInt());
        }


        System.out.println(" ");
        System.out.println(roster[0].showName() + " and " + roster[1].showName() + " will battle!");
        roster[0].clash(roster[1]);
/*
        System.out.println("Your Guardians for battle");

        for(int x = 0; x < 4;){
                if (roster[x].showRating() > 100) {
                        System.out.println((x+1) + ". The Legendary " + roster[x].showName());
                        x ++;
                }
                else {
                        System.out.println((x+1) + ". " + roster[x].showName());
                        x ++;
                }
                }
        System.out.println("First Guardian:");
        String guard1 = myObj.next();
        System.out.println("Second Guardian:");
        String guard2 = myObj.next();
        //System.out.println(guard1);
        //System.out.println(guard2);

        int opp = 0;

        if (guard2.equals("1")) {
                opp = roster[0].showRating();
        }
        else if (guard2.equals("2")) {
                opp = roster[1].showRating();
        }
        else if (guard2.equals("3")) {
                opp = roster[2].showRating();
        }
        else if (guard2.equals("4")) {
                opp = roster[3].showRating();
        }
        System.out.println(opp);

        /* String fighter1;
        String fighter2;
        fighter1 = myObj.next();
        System.out.println("Second Guardian:");
        fighter2 = myObj.next();


         */
        //switch ()

        //for (boolean legend : roster[])

        /*
        System.out.println("Your Guardians");
        if (roster[0].isLegendary()) {
                System.out.println("The Legendary " + roster[0].showName() + " with a power rating of " + roster[0].showRating());
        }
        else {
                System.out.println(roster[0].showName() + " with a power rating of " + roster[0].showRating());
        }
        if (roster[1].isLegendary()) {
                System.out.println("The Legendary " + roster[1].showName() + " with a power rating of " + roster[1].showRating());
        }
        else {
                System.out.println(roster[1].showName() + " with a power rating of " + roster[1].showRating());
        }
        if (roster[2].isLegendary()) {
                System.out.println("The Legendary " + roster[2].showName() + " with a power rating of " + roster[2].showRating());
        }
        else {
                System.out.println(roster[2].showName() + " with a power rating of " + roster[2].showRating());
        }
        if (roster[3].isLegendary()) {
                System.out.println("The Legendary " + roster[3].showName() + " with a power rating of " + roster[3].showRating());
        }
        else {
                System.out.println(roster[3].showName() + " with a power rating of " + roster[3].showRating());
        }
        */
}