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
package org.correlibre.qop.fillviewadapters;

import java.util.Map;

import org.correlibre.qop.domain.Question;
import org.correlibre.qop.services.QopException;
import org.correlibre.qop.services.SrvSurveysEngine;

public interface FillViewAdapter {
	
	public Map<Question, String> getAnswer();
	
	public void setAnswer(Map<Question, String> answers);

	public void setQuestion(Question q);
	
	public void setSubFillViewAdapters(Map<Question,FillViewAdapter> fillViewAdapters);
	
	public Map<Question,FillViewAdapter> getSubFillViewAdapters();
	
	public void setSrvSurveysEngine(SrvSurveysEngine srvSurveysEngine);
	
	public void init() throws QopException;
}