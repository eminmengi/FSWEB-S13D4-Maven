package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Point Sınıfı: ");
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point(0,0);
        System.out.println("distance()= " + point.distance());

        System.out.println("********************************");

        Player player = new Player("Emin", 100,Weapon.ARROW);
        System.out.println("health remaining: " + player.healthRemaining());

        Player player2 = new Player("Ahmet", 90,Weapon.AXE);
        System.out.println("health remaining: " + player2.healthRemaining());

        Player player3 = new Player("Mehmet", 80,Weapon.SWORD);
        System.out.println("health remaining: " + player3.healthRemaining());

        player.loseHealth(((int)(player2.getWeapon().getDamage()*player2.getWeapon().getAttackSpeed())));
        System.out.println("health remaining after damage: " + player.healthRemaining());
        player.restoreHealth(70);
        System.out.println("health remaining after restore: " + player.healthRemaining());


    }
}