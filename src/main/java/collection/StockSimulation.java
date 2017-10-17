/**
 * File Name: StockSimulation.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Aprile 10, 2016
 */
package collection;

import java.util.*;

/**
 * StockSimulation A Stock Simulation software. This software shows securities
 * for a stock simulation where securities are trading amongst traders. A
 * Security represents an element which has a value that changes during the
 * simulation.
 * <p>
 * The application contains two String[] fields which should be converted to a
 * valid collection type to satisfy user requirements: > Optimal performance
 * while satisfying requirements > There CAN NOT be more than one Security with
 * the same name > All securities should remain in natural order based on their
 * security name.
 * <p>
 * There are methods you should implement to add, remove, and display collection
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 */
public class StockSimulation {

	/**
	 * A static method to display a StockSimulation's elements
	 *
	 * @param sim
	 *            StockSimulation instance to work with
	 */
	public static void displayElements(StockSimulation sim) {
		// Provide logic to view elements in collection for StockSimilation
		// instance
		// Get a set of the entries
		Set set = sim.tm.entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
	}

	/**
	 * Here is a basic test or application logic that should be performed on the
	 * collection
	 */
	public static void main(String[] gs) {
		// Create Simulation instance
		StockSimulation sim = new StockSimulation();
		// Display Elements
		sim.displayElements();
		// Add and remove few elements to the collection
		sim.addElement("Ore", 30.7);
		sim.removeElement("Ore");
		// Use a staic method version to view elements
		displayElements(sim);
	}

	String[] securityNames = { "Gold", "Silver", "Iron", "Lead", "Copper", "Iron" };

	double[] securityValues = { 89.6, 48.39, 24.9, 12.1, 4.0, 24.9 };

	TreeMap tm = new TreeMap();

	/**
	 * Default Constructor
	 */
	public StockSimulation() {
		// Either overload this class or make this default default constructor
		// interactive.
		for (int i = 0; i < this.securityNames.length; i++) {
			this.tm.put(this.securityNames[i], this.securityValues[i]);
		}
	}

	/**
	 * Method to add an element
	 */
	public void addElement(String name, double val) {
		// provide logic to add an element
		this.tm.put(name, val);
	}

	/**
	 * Method to remove an element
	 */
	public void removeElement(String name) {
		// provide logic to remove an element
		this.tm.remove(name);
	}

	/**
	 * An instance method to display a elements
	 */
	private void displayElements() {
		// Provide logic to view elements for instance
		// Get a set of the entries
		Set set = this.tm.entrySet();
		// Get an iterator
		Iterator i = set.iterator();
		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
	}
}
