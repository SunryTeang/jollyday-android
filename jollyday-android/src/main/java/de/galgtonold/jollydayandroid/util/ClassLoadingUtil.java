/**
 * Copyright 2012 Sven Diedrichsen 
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
package de.galgtonold.jollydayandroid.util;

import java.util.logging.Logger;

/**
 * <p>
 * ReflectionUtils class.
 * </p>
 * 
 * @author José Pedro Pereira - Linkare TI
 * @version $Id: $
 */
public class ClassLoadingUtil {

	private static final Logger LOG = Logger.getLogger(ClassLoadingUtil.class.getName());

	/**
	 * Loads the class by class name with the current threads context
	 * classloader. If there occurs an exception the class will be loaded by
	 * default classloader.
	 * 
	 * @param className
	 *            a {@link String} object.
	 * @return a {@link Class} object.
	 * @throws ClassNotFoundException
	 *             if any.
	 */
	public final Class<?> loadClass(String className) throws ClassNotFoundException {
		try {
			return Class.forName(className, true, Thread.currentThread().getContextClassLoader());
		} catch (Exception e) {
			LOG.warning("Could not load class with current threads context classloader. Using default. Reason: "
					+ e.getMessage());
			return Class.forName(className);
		}
	}
}
