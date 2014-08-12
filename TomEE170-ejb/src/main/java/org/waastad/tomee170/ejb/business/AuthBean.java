/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.waastad.tomee170.ejb.business;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;
import org.apache.deltaspike.core.api.config.ConfigProperty;

/**
 *
 * @author Helge Waastad <helge.waastad@datametrix.no>
 */
@Stateless
@TransactionAttribute(TransactionAttributeType.REQUIRES_NEW)
public class AuthBean implements AuthBeanLocal {
    
    @Inject
    @ConfigProperty(name = "WHAT_HAVE_U")
    private String authUrl;

    @Override
    public String getCustomer(final String id) {
        return null;
    }

    
}
