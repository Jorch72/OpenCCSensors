package openccsensors.common.sensors.targets;

import java.util.HashMap;
import java.util.Map;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import openccsensors.common.api.ISensorTarget;
import openccsensors.common.helper.SensorHelper;

public class MinecartTarget extends EntityTarget implements ISensorTarget {

	public MinecartTarget(Entity obj, double relativeX, double relativeY,
			double relativeZ) {
		super(obj, relativeX, relativeY, relativeZ);
	}

	@Override
	public HashMap getExtendedDetails(World world) {
		
		EntityMinecart minecart = (EntityMinecart) world.getEntityByID(id);
		HashMap retMap = getBasicDetails(world);
		retMap.put("IsStorageCart", minecart.isStorageCart());
		retMap.put("IsMinecartPowered", minecart.isMinecartPowered());
		
		return retMap;
	}

	@Override
	public String[] getTrackablePropertyNames() {
		return null;
	}



}