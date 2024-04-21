//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Gryffindor harryPotter = new Gryffindor( "Гарри Поттер", 95, 95, 99, 99, 99);
        System.out.println(harryPotter);
        Gryffindor hermioneGranger = new Gryffindor("Гермиона Грейнджер",100,90,75, 80, 75);
        Ravenclaw markusBelby = new Ravenclaw("Маркус Белби", 75, 100, 70, 90, 70, 100);
        harryPotter.compare(hermioneGranger);
        harryPotter.compareProperties(hermioneGranger);
        hermioneGranger.compareProperties(markusBelby);
    }
}