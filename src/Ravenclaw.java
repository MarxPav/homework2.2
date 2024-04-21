public class Ravenclaw extends Hogwarts {

    public Ravenclaw(java.lang.String name, int spellPower, int transgressionDistance, int smart, int wise, int witty, int creativity) {
        super(name, spellPower, transgressionDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }
    public int calculateAbilitiesSum() {
        return smart + wise + witty + creativity;
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
        return "Ravenclaw{" +
                "smart=" + smart +
                ", wise=" + wise +
                ", witty=" + witty +
                ", creativity=" + creativity +
                ", name=" + name +
                ", spellPower=" + spellPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }
}