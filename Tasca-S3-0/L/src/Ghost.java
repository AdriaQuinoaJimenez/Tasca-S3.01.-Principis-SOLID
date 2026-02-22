public class Ghost extends Character {

    public Ghost(DamageStrategy damageStrategy) {
        super(damageStrategy);
    }

    @Override
    public void attack() {
        System.out.println("The ghost casts a spooky spell.");
    }
}
