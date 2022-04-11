package manager;

/**
 * A type of {@link Property} which acts as a place of residence.
 * 
 * @author mdixon
 */
abstract class Domicile extends Property {

	/**
	 * The number of bedrooms
	 */
	private int bedrooms;

	/**
	 * Flag indicating whether the property is furnished.
	 */
	private boolean isFurnished;

	////////////////////////////////
	
	/**
	 * @return the number of bedrooms
	 */
	public int getBedrooms() {
		
		// TODO:Part1
		return bedrooms;
	}
	
	/**
	 * @return true if furnished
	 */
	public boolean isFurnished() {
		
		// TODO:Part1
		return isFurnished;
	}
	
	////////////////////////////////
	
	/**
	 * Constructor
	 * 
	 * @param addr the address of the domicile
	 * @param bedrooms the number of bedrooms
	 */
	Domicile(String addr, int bedrooms) {

		super(addr);
		
		this.bedrooms = bedrooms;
	}

}
