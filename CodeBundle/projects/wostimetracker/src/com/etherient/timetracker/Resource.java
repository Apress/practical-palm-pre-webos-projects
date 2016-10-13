/*
    Timer Tracker - From the book "Practical webOS Projects With the Palm Pre"
    Copyright (C) 2009 Frank W. Zammetti
    fzammetti@etherient.com

    Licensed under the terms of the MIT license as follows:

    Permission is hereby granted, free of charge, to any person obtaining a copy
    of this software and associated documentation files (the "Software"), to 
    deal in the Software without restriction, including without limitation the 
    rights to use, copy, modify, merge, publish, distribute, sublicense, and/or 
    sell copies of the Software, and to permit persons to whom the Software is
    furnished to do so, subject to the following conditions:
    
    The above copyright notice and this permission notice shall be included in
    all copies or substantial portions of the Software.
    
    THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
    IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
    FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
    AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
    LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING 
    FROM,OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS 
    IN THE SOFTWARE.
*/


package com.etherient.timetracker;


import javax.jdo.annotations.IdentityType;
import javax.jdo.annotations.PersistenceCapable;
import javax.jdo.annotations.Persistent;
import javax.jdo.annotations.PrimaryKey;


/**
 * This class represents a resource entity.
 * 
 * @author <a href="mailto:fzammetti@etherient.com">Frank W. Zammetti</a>
 *
 */
@PersistenceCapable(identityType = IdentityType.APPLICATION)
public class Resource {

	
  /**
   * The name of the resource.
   */
  @Persistent
  @PrimaryKey
  private String name;

  /**
   * Flag: Is the resource a project manager?
   */
  @Persistent  
  private boolean isProjectManager;

  
  /**
   * The password of the resource.
   */
  @Persistent
  private String password;
  

  /**
   * Set value of name field.
   * 
   * @param inName New value of the field.
   */
  public void setName(final String inName) {
	  
    this.name = inName;
    
  } // End setName().

  
  /**
   * Get value of name field.
   * 
   * @return Value of the field.
   */
  public String getName() {
	  
    return this.name;
    
  } // End getName().
  
  
  /**
   * Set value of isProjectManager field.
   * 
   * @param inIsProjectManager New value of the field.
   */
  public void setIsProjectManager(final boolean inIsProjectManager) {
	  
    this.isProjectManager = inIsProjectManager;
    
  } // End setIsProjectManager().

  
  /**
   * Get value of isProjectManager field.
   * 
   * @return Value of the field.
   */
  public boolean getIsProjectManager() {
	  
    return this.isProjectManager;
    
  } // End getIsProjectManager().  
  
  
  /**
   * Set value of password field.
   * 
   * @param inPassword New value of the field.
   */
  public void setPassword(final String inPassword) {
    
    this.password = inPassword;
    
  } // End setPassword().

  
  /**
   * Get value of password field.
   * 
   * @return Value of the field.
   */
  public String getPassword() {
    
    return this.password;
    
  } // End getPassword().
  
  
  /**
   * Overridden toString method.
   *
   * @return A reflexively-built string representation of this bean.
   */
  public String toString() {

    String str = null;
    StringBuffer sb = new StringBuffer(1000);
    sb.append("[").append(super.toString()).append("]={");
    boolean firstPropertyDisplayed = false;
    try {
      java.lang.reflect.Field[] fields = this.getClass().getDeclaredFields();
      for (int i = 0; i < fields.length; i++) {
        if (firstPropertyDisplayed) {
          sb.append(", ");
        } else {
          firstPropertyDisplayed = true;
        }
        sb.append(fields[i].getName()).append("=").append(fields[i].get(this));
      }
      sb.append("}");
      str = sb.toString().trim();
    } catch (IllegalAccessException iae) {
      iae.printStackTrace();
    }
    return str;

  } // End toString().
  
  
} // End class.
