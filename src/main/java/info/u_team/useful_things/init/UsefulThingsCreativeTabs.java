package info.u_team.useful_things.init;

import info.u_team.u_team_core.creativetab.UCreativeTab;
import info.u_team.useful_things.UsefulThingsConstants;

public class UsefulThingsCreativeTabs {
	
	public static final UCreativeTab tab = new UCreativeTab(UsefulThingsConstants.MODID, "tab");
	
	public static void init() {
		tab.setIcon(UsefulThingsItems.teleporter);
	}
}
