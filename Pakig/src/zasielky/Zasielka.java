package zasielky;

/**
 * Rozhranie Zasielka sluzi ako Component
 * navrhnoveho vzoru Composite.
 * @author Stanislav Jakubek
 *
 */
public interface Zasielka {
	public void nastavCiel(String ciel);
	public String zistiCiel();
	public void nastavHmotnost(double hmotnost);
	public double zistiHmotnost();
	public String getNazovTriedy();
}
