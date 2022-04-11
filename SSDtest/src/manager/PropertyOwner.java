package manager;

import java.util.HashSet;
import java.util.Set;

/**
 * A person that owns {@link Property} instances.
 * 
 * @author mdixon
 *
 */
public class PropertyOwner extends Person {

	/**
	 * The set of owned properties.
	 */
	private Set<Property> ownedProperties = new HashSet<Property>();
	
	//////////////////////////////////////////////////////////////////////
	
	/**
	 * Adds a property to the set of owned properties.
	 * 
	 * @param prop the property to be added
	 * @return true if the property added, false if already owned.
	 */
	public boolean addProperty(Property prop) {
		
			return ownedProperties.add(prop);
		// TODO:Part3
	}
	
	/**
	 * Removes a property from the set of owned properties.
	 * 
	 * @param prop the property to be removed
	 * @return true if the property was removed, false if it was not owned
	 */
	public boolean removeProperty(Property prop) {
		
		// TODO:Part3
		return ownedProperties.remove(prop);
	}
	
	/**
	 * Clears all properties from the set of owned properties.
	 */
	public void clearOwnedProperties() {
		
		ownedProperties.clear();
		// TODO:Part3
	}
	
	/**
	 * Gets the number of owned properties
	 * 
	 * @return the number of owned properties
	 */
	public int getPropertyCount() {
		
		// TODO:Part3
		return ownedProperties.size();
	}
	 
	/////////////////////////////////////////////////////////
	
	/**
	 * Constructor
	 * 
	 * @param name the property owner's name
	 */
	public PropertyOwner(String name) {
		
		super(name);
	}
}
