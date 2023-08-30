package Birthday;

public class Runner {

    public static void main(String[] args) {
        Simulation sim = new Simulation();
        System.out.println(sim.test());

        System.out.println(sim.simuliere(20));
        System.out.println(sim.simuliere(100));
        System.out.println(sim.simuliere(500));
        System.out.println(sim.simuliere(7));
        System.out.println(sim.simuliere(13));
    }
}
