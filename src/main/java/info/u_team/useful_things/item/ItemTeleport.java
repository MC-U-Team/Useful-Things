package info.u_team.useful_things.item;

import info.u_team.u_team_core.item.UItem;
import info.u_team.u_team_core.util.world.WorldUtil;
import info.u_team.useful_things.init.UsefulThingsCreativeTabs;
import net.minecraft.entity.player.*;
import net.minecraft.item.ItemStack;
import net.minecraft.util.*;
import net.minecraft.util.math.*;
import net.minecraft.util.math.RayTraceResult.Type;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemTeleport extends UItem {
	
	public ItemTeleport(String name) {
		super(name, UsefulThingsCreativeTabs.tab);
		setMaxDamage(10);
		setMaxStackSize(1);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World world, EntityPlayer player, EnumHand hand) {
		ItemStack stack = player.getHeldItem(hand);
		
		if (!world.isRemote) {
			
			RayTraceResult raytrace = WorldUtil.rayTraceServerSide(player, 50);
			
			if (raytrace.typeOfHit == Type.MISS) {
				
				player.sendStatusMessage(new TextComponentString("\u00A74Out of range"), true);
				
				return new ActionResult<ItemStack>(EnumActionResult.FAIL, stack);
			}
			
			BlockPos pos = raytrace.getBlockPos();
			
			EntityPlayerMP playermp = (EntityPlayerMP) player;
			playermp.connection.setPlayerLocation(pos.getX(), pos.getY()+1, pos.getZ(), playermp.rotationYaw, playermp.rotationPitch);
			
			stack.damageItem(1, player);
			
		}
		
		return new ActionResult<ItemStack>(EnumActionResult.SUCCESS, stack);
	}
}
