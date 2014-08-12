/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.waastad.tomee170.ejb.business;

import javax.ejb.Local;

/**
 *
 * @author Helge Waastad <helge.waastad@datametrix.no>
 */
@Local
public interface AuthBeanLocal {

    String getCustomer(final String id);
    
}
