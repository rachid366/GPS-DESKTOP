/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server.connexion;

import com.server.dao.IPosition;
import com.server.dao.IVehicule;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author hp
 */
public class GPSConnexion {
    
   private String appName="";
   private String moduleName;
   private String beanName;
        
   private String remoteInterface;
   private String name;
   private Context ctx;
   


    public GPSConnexion() {
    }

    public GPSConnexion(String moduleName,String beanName) throws NamingException {
        
        //moduleName="GPS-SERVER";
        //beanName="VEH";
  
        this.moduleName=moduleName;
        this.beanName=beanName;

        this.ctx=new InitialContext();
              
    }

    
    public IVehicule getVehiculeProxyType() throws NamingException {
        IVehicule proxy;
        this.remoteInterface=IVehicule.class.getName();
        this.name="ejb:"+appName+"/"+moduleName+"/"+beanName+"!"+remoteInterface;
        proxy=(IVehicule)ctx.lookup(this.name);
        return proxy;
    }
    
    public IPosition getPositionProxyType() throws NamingException {
        IPosition proxy;
        this.remoteInterface=IPosition.class.getName();
        this.name="ejb:"+appName+"/"+moduleName+"/"+beanName+"!"+remoteInterface;
        proxy=(IPosition)ctx.lookup(this.name);
        return proxy;
    }
    
   
    
    
    
}
