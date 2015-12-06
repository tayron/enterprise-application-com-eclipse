/**
 * 
 */
package br.com.coffeecode.ejb;

import javax.ejb.Local;

/**
 *
 */
@Local
public interface TesteEjbLocal {
	
	/**
	 * 
	 * @param text
	 * @return
	 */
	public String addPipe(String text);
}
