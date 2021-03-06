/**
 * Copyright 2010 Sven Diedrichsen 
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at 
 * 
 * http://www.apache.org/licenses/LICENSE-2.0 
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an 
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either 
 * express or implied. See the License for the specific language 
 * governing permissions and limitations under the License. 
 */
package de.galgtonold.jollydayandroid.parser.impl;

import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;

import java.util.Set;

import de.galgtonold.jollydayandroid.Holiday;
import de.galgtonold.jollydayandroid.HolidayType;
import de.galgtonold.jollydayandroid.config.Holidays;
import de.galgtonold.jollydayandroid.config.IslamicHoliday;
import de.galgtonold.jollydayandroid.parser.AbstractHolidayParser;

/**
 * This parser calculates gregorian dates for the different islamic holidays.
 * 
 * @author Sven Diedrichsen
 * @version $Id: $
 */
public class IslamicHolidayParser extends AbstractHolidayParser {

	/**
	 * Properties prefix for islamic holidays.
	 */
	private static final String PREFIX_PROPERTY_ISLAMIC = "islamic.";

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.galgtonold.jollydayandroid.parser.HolidayParser#parse(int, java.util.Set,
	 * de.galgtonold.jollydayandroid.config.Holidays)
	 */
	/** {@inheritDoc} */
	public void parse(int year, Set<Holiday> holidays, final Holidays config) {
		for (IslamicHoliday i : config.getIslamicHoliday()) {
			if (!isValid(i, year)) {
				continue;
			}
			Set<LocalDate> islamicHolidays = null;
			switch (i.getType()) {
			case NEWYEAR:
				islamicHolidays = calendarUtil.getIslamicHolidaysInGregorianYear(year, DateTimeConstants.JANUARY, 1);
				break;
			case ASCHURA:
				islamicHolidays = calendarUtil.getIslamicHolidaysInGregorianYear(year, DateTimeConstants.JANUARY, 10);
				break;
			case ID_AL_FITR:
				islamicHolidays = calendarUtil.getIslamicHolidaysInGregorianYear(year, DateTimeConstants.OCTOBER, 1);
				break;
			case ID_UL_ADHA:
				islamicHolidays = calendarUtil.getIslamicHolidaysInGregorianYear(year, DateTimeConstants.DECEMBER, 10);
				break;
			case LAILAT_AL_BARAT:
				islamicHolidays = calendarUtil.getIslamicHolidaysInGregorianYear(year, DateTimeConstants.AUGUST, 15);
				break;
			case LAILAT_AL_MIRAJ:
				islamicHolidays = calendarUtil.getIslamicHolidaysInGregorianYear(year, DateTimeConstants.JULY, 27);
				break;
			case LAILAT_AL_QADR:
				islamicHolidays = calendarUtil.getIslamicHolidaysInGregorianYear(year, DateTimeConstants.SEPTEMBER, 27);
				break;
			case MAWLID_AN_NABI:
				islamicHolidays = calendarUtil.getIslamicHolidaysInGregorianYear(year, DateTimeConstants.MARCH, 12);
				break;
			case RAMADAN:
				islamicHolidays = calendarUtil.getIslamicHolidaysInGregorianYear(year, DateTimeConstants.SEPTEMBER, 1);
				break;
			default:
				throw new IllegalArgumentException("Unknown islamic holiday " + i.getType());
			}
			String propertiesKey = PREFIX_PROPERTY_ISLAMIC + i.getType().name();
			HolidayType type = xmlUtil.getType(i.getLocalizedType());
			for (LocalDate d : islamicHolidays) {
				holidays.add(new Holiday(d, propertiesKey, type));
			}
		}
	}

}
