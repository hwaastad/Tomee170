/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.waastad.tomee170.ejb.config;

import org.apache.deltaspike.core.api.config.PropertyFileConfig;

/**
 *
 * @author helge
 */
public class SystemConfigurationFile implements PropertyFileConfig {

    private static final long serialVersionUID = -5395912160557697357L;

    @Override
    public String getPropertyFileName() {
        return "test.properties";
    }

}
