/*
 * Copyright 2015 Igor Maznitsa.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.igormaznitsa.nbmindmap.utils;

import java.util.logging.Level;

public class Logger {
  private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger("com.igormaznitsa.nbmindmap"); //NOI18N

  public static void error(final String msg, final Throwable thr){
    logger.log(Level.SEVERE, msg, thr);
  }
  
  public static void info(final String msg){
    logger.log(Level.INFO, msg);
  }
  
  public static void warn(final String msg){
    logger.log(Level.WARNING, msg);
  }
  
}