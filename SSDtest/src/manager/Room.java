package manager;

/**
 * Represents a Room within a {@link Hotel}.
 * 
 * @author mdixon
 *
 */
public class Room implements SecuredAccess {

	/**
	 * The room number within the hotel.
	 */
	private int roomNum;

	/**
	 * The stored security code.
	 */
	private String storedCode = "9999";
	
	/**
	 * The current occupant of the room, null if the room is not occupied.
	 */
	private Guest occupant;
	
	////////////////////////////////
	
	@Override
	public void setCode(String code) {

		this.storedCode = code;
	}

	@Override
	public boolean checkCode(String code) {

		if (storedCode.equals(code) && !isLockedOut()) {
			return true;
		}

			return false;
		}

	@Override
	public void resetToDefault() {
		storedCode = "9999";

	}

	@Override
	public boolean isLockedOut() {

		return false;
	}

	@Override
	public int getIncorrectAttempts() {

		return 0;
	}
	
	/**
	 * @return the roomNum
	 */
	public int getRoomNum() {

		return roomNum;
	}

	/**
	 * @param roomNum the roomNum to set
	 */
	public void setRoomNum(int roomNum) {

		this.roomNum = roomNum;
	}

	/**
	 * Sets the occupant of the room.
	 * 
	 * @param guest the guest which is to occupy the room
	 */
	public void setOccupant(Guest guest) {
		
		occupant = guest;
	}
	
	/**
	 * Removes any occupant from the room.
	 */
	public void removeOccupant() {
		
		occupant = null;
	}
	
	/**
	 * 
	 * @return true if the room has an occupant
	 */
	public boolean hasOccupant() {
		if (occupant == null) {
			return false;
		}
		
		return true;
	}
	
	////////////////////////////////
	
	/**
	 * Constructor.
	 * 
	 * @param roomNum the room number
	 */
	public Room(int roomNum) {

		this.roomNum = roomNum;
	}


}
