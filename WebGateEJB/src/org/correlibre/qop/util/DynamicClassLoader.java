/*****************************************************************************
Copyright (C) 2012  
diarmuid julian.rolon@gmail.com
Gloria Patricia Meneses gpmeneses@gmail.com
OScar Puentes oskarj84@gmail.com

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU Affero General Public License as
    published by the Free Software Foundation, either version 3 of the
    License, or (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU Affero General Public License for more details.

    You should have received a copy of the GNU Affero General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
*************************************************************************/
package org.correlibre.qop.util;

import org.correlibre.qop.services.QopException;

public class DynamicClassLoader {
	public static  <T> T loadClass(String className) throws QopException{
		try {
			return (T)Class.forName(className).newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			throw new QopException("Imposible instanciar clase "+className,e);
		}
	}
	
	
	
}
