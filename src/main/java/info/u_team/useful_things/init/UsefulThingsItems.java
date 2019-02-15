package info.u_team.useful_things.init;

import info.u_team.u_team_core.registry.ItemRegistry;
import info.u_team.u_team_core.util.RegistryUtil;
import info.u_team.useful_things.UsefulThingsConstants;
import info.u_team.useful_things.item.ItemTeleport;
import net.minecraft.item.Item;

public class UsefulThingsItems {
	public static final ItemTeleport teleporter = new ItemTeleport("teleporter");
	
	public static void preinit() {
		ItemRegistry.register(UsefulThingsConstants.MODID, RegistryUtil.getRegistryEntries(Item.class, UsefulThingsItems.class));
	}
}
