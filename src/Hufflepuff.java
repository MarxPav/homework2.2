public class Hufflepuff extends Hogwarts  {

    public Hufflepuff(java.lang.String name, int spellPower, int transgressionDistance, int hardworking, int loyal, int honest) {
        super(name, spellPower, transgressionDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    private int hardworking;
    private int loyal;
    private int honest;

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }
    public int calculateAbilitiesSum() {
        return hardworking + loyal + honest;
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
        return "Hufflepuff{" +
                "hardworking=" + hardworking +
                ", loyal=" + loyal +
                ", honest=" + honest +
                ", name=" + name +
                ", spellPower=" + spellPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}
