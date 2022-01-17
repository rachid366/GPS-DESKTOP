package app;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import com.server.dao.IVehicule;
import com.server.models.Vehicule;

public class AppWin {

	public static void main(String[] args) throws NamingException {
		// TODO Auto-generated method stub
		String appName="";
        String moduleName="GPS-SERVER";
        String beanNameVehicule="VEH";
        
        
        String remoteInterface=IVehicule.class.getName();
        String name="ejb:"+appName+"/"+moduleName+"/"+beanNameVehicule+"!"+remoteInterface;
        Context ctx=new InitialContext();
        
        IVehicule proxy=(IVehicule)ctx.lookup(name);
        
        proxy.ajouter(new Vehicule("VA1455","DACIA","2*4"));
        
        
        System.out.println(proxy.findAll().size());
        
        
		
		
	}

}
