package zasielky;

/**
 * Rozhranie Dorucitelny sluzi ako Component
 * navrhnoveho vzoru Composite.
 * @author Stanislav Jakubek <xjakubeks@stuba.sk>
 *
 */
public interface Dorucitelny {
	public void nastavCiel(String ciel);
	public String zistiCiel();
	public void nastavHmotnost(double hmotnost);
	public double zistiHmotnost();
}
