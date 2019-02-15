package info.u_team.useful_things.proxy;

import info.u_team.useful_things.init.*;
import net.minecraftforge.fml.common.event.*;

public class CommonProxy {
	
	public void preinit(FMLPreInitializationEvent event) {
		UsefulThingsItems.preinit();
	}
	
	public void init(FMLInitializationEvent event) {
		UsefulThingsCreativeTabs.init();
	}
	
	public void postinit(FMLPostInitializationEvent event) {
	}
	
}
