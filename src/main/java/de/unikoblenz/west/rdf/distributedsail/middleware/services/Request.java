package de.unikoblenz.west.rdf.distributedsail.middleware.services;

import java.io.Serializable;

/**
 * provides a general interface for requests sent via middleware.
 * 
 * @author lkastler
 */
public interface Request extends Serializable {

	public long getId();
}
