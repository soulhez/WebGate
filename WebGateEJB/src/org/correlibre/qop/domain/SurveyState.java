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
package org.correlibre.qop.domain;


public enum SurveyState{
	DELETED("Eliminada"),
	FILLING ("Pendiente"),
	ENDED("Finalizada"),
	NEW("Nueva"),
	CLOSED("Cerrada");
	
	private String name;
	
	SurveyState(String name) {
        this.name = name;        
    }
    
    public String getName(){ 
    	return name; 
    }
    public String toString() {
    	return name;
    }
    
    public static SurveyState fromString(String name){
    	SurveyState[] sss = SurveyState.values();
		
		for (SurveyState surveyState : sss) {
			if(surveyState.getName().equalsIgnoreCase(name))
				return surveyState;
		}
		return null;
    }

}