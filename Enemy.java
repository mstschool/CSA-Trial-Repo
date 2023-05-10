import java.util.Scanner;

public class Enemy {
    private String name;
    private int health;
    private int damage;
    private int defense;

    public Enemy(String name, int health, int damage, int defense) {
        this.name = name;
        this.health = health;
        this.damage = damage;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        int actualDamage = damage - defense;
        if (actualDamage < 0) {
            actualDamage = 0;
        }
        health -= actualDamage;
    }

    public int attack() {
        return damage;
    }

    public boolean isDead() {
        return health <= 0;
    }
    
    public void askUserToAttack() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 'attack' to attack the enemy: ");
        String command = input.nextLine();
        if (command.equals("attack")) {
            int damage = attack();
            System.out.println("You attack the " + name + " for " + damage + " damage!");
        } else {
            System.out.println("Invalid command.");
        }
    }
}
