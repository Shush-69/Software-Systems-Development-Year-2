package manager;

/**
 * An abstract class that represents all types of properties.
 * 
 * @author mdixon
 *
 */
abstract class Property {

	/**
	 * The property address.
	 */
	private String address;
	
	/**
	 * The tenant of the property, null if the property has no tenant.
	 */
	private Tenant tenant;
	
	////////////////////////////////////
	
	/**
	 * 
	 * @return the property address.
	 */
	public String getAddress() {

		return address;
	}
	
	/**
	 * Sets the tenant of the property.
	 * 
	 * @param tenant the tenant of the property
	 */
	public void setTenant(Tenant tenant) {

		this.tenant = tenant;
		
	}
	
	/**
	 * Removes any tenant from the property.
	 */
	public void removeTenant() {
		
		tenant = null;
		
	}
	
	/**
	 * 
	 * @return true if the property has a tenant
	 */
	public boolean hasTenant() {
		if (tenant ==  null) {
			return false;
		}
		
		return true;
	}
	
	/**
	 * Constructor
	 * 
	 * @param address the property address.
	 */
	Property(String address) {
		
		this.address = address;
	}
	
}
