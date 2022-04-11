package manager;


/**
 * A Hotel containing many {@link Room} instances.
 * 
 * @author mdixon
 *
 */
public class Hotel extends Property {

	/**
	 * The number of rooms contained within the hotel.
	 */
	private Room[] rooms;
	
	//////////////////////////////////
	
	/**
	 * 
	 * @return the number of rooms within the hotel.
	 */
	public int getRooms() {

		return rooms.length;
	}
	
	/**
	 * Set the specified room to be occupied by the given guest.
	 * 
	 * @param roomNo  the room number
	 * @param guest the guest
	 */
	public void occupyRoom(int roomNo, Guest guest) {
		rooms[roomNo].setOccupant(guest);
		
		
	}
	
	/**
	 * Ensures the specified room is unoccupied.
	 * 
	 * @param roomNo the room number
	 */
	public void freeRoom(int roomNo) {
		rooms[roomNo].removeOccupant();
		
	}
	
	/**
	 * Gets the count of number of occupied rooms
	 * 
	 * @return the occupied room count
	 */
	public int getOccupiedRoomCount() {
		
		int count = 0;
		for (int c = 0; c < rooms.length; c++) {
			if(rooms[c].hasOccupant()) {
				count++;
			}
		}
		
		return count;
	}
	
	//////////////////////////////////////////////
	
	/**
	 * Constructor
	 * 
	 * @param addr the address of the hotel
	 * @param roomCount the number of rooms in the hotel
	 */
	public Hotel(String addr, int roomCount) {
		
		super(addr);
		
		// create an array of the appropriate size
		rooms = new Room[roomCount];
		
		// create a store a Room within each array slot
		for(int i=0; i < roomCount; i++)
			rooms[i] = new Room(i);
	}
}
