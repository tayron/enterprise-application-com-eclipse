/**
 * 
 */
package br.com.coffeecode.ejb;

import javax.ejb.Stateless;

/**
 *
 */
@Stateless
public class TesteEjb implements TesteEjbLocal {

	/**
	 * @see TesteEjbLocal#addPipe(java.lang.String)
	 */
	@Override
	public String addPipe(String text) {
		return "|"+text+"|";
	}

}
