package de.unikoblenz.west.rdf.distributedsail.middleware.transform;

/**
 * general exception for Transformesr
 * 
 * @author lkastler
 */
public class TransformerException extends Exception {

	/**
	 * wraps a given Exception into a TransformerException
	 * @param e - wrapped Exception
	 * @see Exception
	 */
	public TransformerException(Exception e) {
		super(e);
	}

	/**
	 * creates a TransformerException with given message.
	 * @param msg - message of this TransformerException.
	 */
	public TransformerException(String msg) {
		super(msg);
	}

	/** */
	private static final long serialVersionUID = 1L;

}
