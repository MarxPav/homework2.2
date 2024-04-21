public class Gryffindor extends Hogwarts {

    public Gryffindor(java.lang.String name, int spellPower, int transgressionDistance, int nobility, int honor, int courage) {
        super(name, spellPower, transgressionDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.courage = courage;
    }

    private int nobility;
    private int honor;
    private int courage;

    public int getNobility() {
        return nobility;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    @Override
    public java.lang.String toString() {
        return "Gryffindor{" +
                "nobility=" + nobility +
                ", honor=" + honor +
                ", courage=" + courage +
                ", name=" + name +
                ", spellPower=" + spellPower +
                ", transgressionDistance=" + transgressionDistance +
                '}';
    }

    public int calculateAbilitiesSum() {
        return nobility + honor + courage;
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
}
