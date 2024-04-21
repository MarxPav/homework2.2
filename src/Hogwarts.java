public abstract class Hogwarts {
    protected String name;
    protected int spellPower;
    protected int transgressionDistance;

    public Hogwarts(java.lang.String name, int spellPower, int transgressionDistance) {
        this.name = name;
        this.spellPower = spellPower;
        this.transgressionDistance = transgressionDistance;
    }

    public int getSpellPower() {
        return spellPower;
    }

    public int getTransgressionDistance() {
        return transgressionDistance;
    }
    public int calculateBaseAbilitiesSum() {
        return spellPower + transgressionDistance;
    }

    public void compareProperties(Hogwarts hogwarts) {
        int sum1 = calculateBaseAbilitiesSum();
        int sum2 = hogwarts.calculateBaseAbilitiesSum();
        if (sum1 > sum2) {
            System.out.println(name + " > " + hogwarts.name);
        } else if (sum1 < sum2) {
            System.out.println(name + " < " + hogwarts.name);
        } else {
            System.out.println(name + " == " + hogwarts.name);
        }

    }
}
