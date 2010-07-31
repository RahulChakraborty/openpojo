/**
 * Copyright (C) 2010 Osman Shoukry
 *
 *   This program is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation, either version 3 of the License, or
 *   (at your option) any later version.
 *
 *   This program is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.openpojo.log;

import com.openpojo.log.utils.ActiveLogger;

/**
 * This Factory will create and return a logger based on the current availability of the underlying logger.
 * The system has support currently for SL4J, Log4J, JavaLogger.
 * The factory will detect runtime which logger is available and return the appropriate logger
 * The order of precedence is as follows:
 * 1. SL4J
 * 2. org.apache.log4j.Logger
 * 3. java.util.logging.Logger.
 */
public final class LoggerFactory {

    private LoggerFactory() {
    }

    /**
     * This method returns an instance of Logger class for logging.
     *
     * @param clazz
     *            The Class you are using to log through.
     * @return
     *         returns an instance of the Logger.
     */
    public static Logger getLogger(final Class<?> clazz) {
        return (Logger) ActiveLogger.getInstance(getLoggerCategory(clazz));
    }

    /**
     * This method returns an instance of Logger class for logging.
     *
     * @param category
     *            The category you want your logs to go through.
     * @return
     *         returns and instance of the logger.
     */
    public static Logger getLogger(final String category) {
        return (Logger) ActiveLogger.getInstance(category);
    }



    private static String getLoggerCategory(final Class<?> clazz) {
        return clazz == null ? (String) null : clazz.getName();
    }


}