package manager;

public class Office extends Property implements SecuredAccess {

	/**
	 * The stored security code.
	 */
	private String storedCode = "1234";

	/**
	 * The number of incorrect code input attempts.
	 */
	private int incorrectAttempts;

	//////////////////////////////////////////////////////

	@Override
	public void setCode(String code) {

		storedCode = code;
		incorrectAttempts = 0;
	}

	@Override
	public boolean checkCode(String code) {

		if (storedCode.equals(code) && !isLockedOut()) {

			// not locked, and codes match
			incorrectAttempts = 0;
			return true;
		}
		incorrectAttempts++;
		return false;

		}


	@Override
	public void resetToDefault() {

		storedCode = "1234";
		incorrectAttempts = 0;
	}

	@Override
	public boolean isLockedOut() {

		if (incorrectAttempts > 5) {
			return true;
		}

		return false;
	}

	@Override
	public int getIncorrectAttempts() {

		return incorrectAttempts;
	}
	
	//////////////////////////////////////////////////////

	public Office(String address) {

		super(address);
	}

	
}
