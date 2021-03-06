/*
 * Copyright (c) 2010-2016 Osman Shoukry
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied.
 *
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.openpojo.business.exception;

/**
 * This exception is thrown whenever a business exception occurs, i.e. an exception when performing
 * an operation in the business validation, and identity management domains. <br>
 * This is the ONLY exception thrown out of the com.openpojo.business package.
 * It will wrap any other exceptions that may occur to turn them into RuntimeException.
 *
 * @author oshoukry
 */
public class BusinessException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  private BusinessException(final String message) {
    super(message);
  }

  private BusinessException(final String message, final Throwable cause) {
    super(message, cause);
  }

  /**
   * Construct an Exception with message.
   *
   * @param message
   *     The description of the exception.
   * @return An instance of the Exception.
   */
  public static BusinessException getInstance(final String message) {
    return new BusinessException(message);
  }

  /**
   * Construct an Exception with message and cause.
   *
   * @param message
   *     The description of the exception.
   * @param cause
   *     The cause of the exception.
   * @return An instance of the Exception.
   */
  public static BusinessException getInstance(final String message, final Throwable cause) {
    return new BusinessException(message, cause);
  }
}
