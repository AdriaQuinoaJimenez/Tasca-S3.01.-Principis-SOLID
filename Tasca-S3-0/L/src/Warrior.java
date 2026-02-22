public class Warrior extends Character {

    public Warrior(DamageStrategy damageStrategy) {
        super(damageStrategy);
    }

    @Override
    public void attack() {
        System.out.println("The warrior strikes with a sword.");
    }
}
