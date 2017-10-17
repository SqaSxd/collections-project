/**
 * File Name: MediaManager.java<br>
 * Nepton, Jean-francois<br>
 * Java Boot Camp Exercise<br>
 * Instructor: Jean-francois Nepton<br>
 * Created: Aprile 10, 2016
 */
package collection;

import java.util.*;

/**
 * MediaManager A Media Manger Software. This software collects media for a
 * video rental store.
 * <p>
 * The software contains a String[] array to represent the names of all the
 * items the user wants to rent. This array should be converted to a valid
 * collection type to satisfy user requirements: > Optimal performance while
 * satisfying requirements > The media collection can not have any duplicates as
 * it would not makes sense to rent any of the same two items. All media should
 * be kept in natural order based on the name of the media.
 * <p>
 * There are methods to add, remove, and display collection
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 */
public class MediaManager {

	/**
	 * A static method to display a elements
	 *
	 * @param mediaManager
	 *            MediaManager instance to work with
	 */
	public static void displayElements(MediaManager mediaManager) {
		// Provide logic to view elements in collection for TrendingTags
		// instance
		Iterator itr = mediaManager.tsMedia.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

	/**
	 * Here is a basic test or application logic that should be performed on the
	 * collection
	 */
	public static void main(String[] gs) {
		// Create Simulation instance
		MediaManager mediaManager = new MediaManager();
		// Display Elements
		mediaManager.displayElements();
		// Add and remove few elements to the collection
		mediaManager.addElement("MEDIC2541");
		mediaManager.removeElement("MEDIC2541");
		// Use a staic method version to view elements
		displayElements(mediaManager);
	}

	String[] media = { "LAPTOP0217", "LAMPO3982", "CANDY3984", "JAVA9083", "SQASOL9845", "VACAT9845" };

	TreeSet<String> tsMedia = new TreeSet<String>();

	/**
	 * Default constructor
	 */
	public MediaManager() {
		// Either overload this class or make this default default constructor
		// interactive.
		for (int i = 0; i < this.media.length; i++) {
			this.tsMedia.add(this.media[i]);
		}
	}

	/**
	 * Method to add an element
	 */
	public void addElement(String val) {
		// provide logic to add an element
		this.tsMedia.add(val);
	}

	/**
	 * Method to remove an element
	 */
	public void removeElement(String val) {
		// provide logic to remove an element
		this.tsMedia.remove(val);
	}

	/**
	 * An instance method to display all elements
	 */
	private void displayElements() {
		// Provide logic to view elements for instance
		Iterator itr = this.tsMedia.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
