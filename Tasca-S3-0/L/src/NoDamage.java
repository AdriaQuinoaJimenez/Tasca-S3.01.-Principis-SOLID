public class NoDamage implements DamageStrategy{
    @Override
    public void takeDamage(int points) {
        System.out.println("A ghost cannot take physical damage!");
    }
}
