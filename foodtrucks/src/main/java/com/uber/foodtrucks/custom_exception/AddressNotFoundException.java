/**
 * 
 */
package com.uber.foodtrucks.custom_exception;

/**
 * @author abiel_m_woldu
 *
 */
public class AddressNotFoundException extends Exception {

	private static final long serialVersionUID = 1L;

	public AddressNotFoundException() {
	}

	public AddressNotFoundException(String arg0) {
		super(arg0);
	}

	public AddressNotFoundException(Throwable arg0) {
		super(arg0);
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public AddressNotFoundException(String arg0, Throwable arg1) {
		super(arg0, arg1);
	}

	/**
	 * @param arg0
	 * @param arg1
	 * @param arg2
	 * @param arg3
	 */
	public AddressNotFoundException(String arg0, Throwable arg1, boolean arg2, boolean arg3) {
		super(arg0, arg1, arg2, arg3);
	}

	public static void main(String[] args) {
	}

}
