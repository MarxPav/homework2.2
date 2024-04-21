public class Slytherin extends Hogwarts {
    public Slytherin(java.lang.String name, int spellPower, int transgressionDistance, int cunning, int determination, int ambition, int resourcefulness, int thirstForPower) {
        super(name, spellPower, transgressionDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thirstForPower = thirstForPower;
    }

    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thirstForPower;

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }
    public int calculateAbilitiesSum() {
        return cunning + determination + ambition + resourcefulness + thirstForPower;
    }
    public void compare(Gryffindor student) {
        int sum1 = calculateAbilitiesSum();
        int sum2 = student.calculateAbilitiesSum();
        if (sum1 > sum2) {
            System.out.println(name + " > " + student.name);
        } else if (sum1 < sum2) {
            System.out.println(name + " < " + student.name);
        } else {
            System.out.println(name + " == " + student.name);
        }
    }

    @Override
    public java.lang.String toString() {
        return "Slytherin{" +
                "cunning=" + cunning +
                ", determination=" + determination +
                ", ambition=" + ambition +
                ", resourcefulness=" + resourcefulness +
                ", thirstForPower=" + thirstForPower +
                ", name=" + name +
                ", spellPower=" + spellPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
