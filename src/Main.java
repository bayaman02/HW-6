public class Main {
    public static void main(String[] args) {
        Weapon weapon=new Weapon();
        weapon.setWeaponName("AK47");
        weapon.setWeaponType(WeaponType.CODLGUN);
        Boss boss = new Boss();
        boss.setHealth(800);
        boss.setDamage(50);
        boss.setWeapon(weapon);
        System.out.println("health: " + boss.getHealth() + " damage " + boss.getDamage() + " weapon: "
                + boss.weapon.getWeaponName()+"weaponType"+boss.weapon.getWeaponType());
}}