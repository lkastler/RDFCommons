package de.unikoblenz.west.rdf.distributedsail.middleware.services;


/**
 * offeres a service via middleware to others.
 * @author lkastler
 */
public interface ServiceProvider<RequestType extends Request, ResponseType extends Response> {

	/**
	 * connects and starts this MiddlewareServiceProvider
	 */
	public void start();
	
	/**
	 * stops and disconnects this MiddlewareServiceProvider
	 */
	public void stop();
}
