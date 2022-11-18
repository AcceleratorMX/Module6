package src.d5;

class BfgTest {
    public static void main(String[] args) {
        //ExtraGun, ammo: 10000, damage: 300
        System.out.println(new BFG(10000, 300, "ExtraGun"));

        //BFG, ammo: 5000, damage: 200
        System.out.println(new BFG(5000, 200));

        //BFG, ammo: 2000, damage: 50
        System.out.println(new BFG(2000));

        //BFG, ammo: 1000, damage: 50
        System.out.println(new BFG());

    }
}

class BFG {
    private int amo;
    private int damage;
    private String name;

    public BFG(int amo, int damage, String name) {
        this.amo = amo;
        this.damage = damage;
        this.name = name;
    }

    public BFG(int amo, int damage) {
        this.amo = amo;
        this.damage = damage;
    }

    public BFG() {
        amo = 1000;
        damage = 50;
        name = "BFG";
    }

    @Override
    public String toString() {
        return (""
    }

    public BFG(int amo) {
        this.amo = amo;
    }

    public int getAmo() {
        return amo;
    }
    public int getDamage () {
        return damage;
    }
    public String getName () {
        return name;
    }
}