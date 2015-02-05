package genesis.common;

import genesis.util.Constants;
import net.minecraft.init.Blocks;
import net.minecraftforge.fluids.Fluid;
import net.minecraftforge.fluids.FluidRegistry;

public class GenesisFluids {
	
	public static final Fluid KOMATIITIC_LAVA = new Fluid(Constants.PREFIX+"komatiicLava").setLuminosity(16).setDensity(2000).setViscosity(2000).setTemperature(1800).setUnlocalizedName(Constants.PREFIX+"komatiicLava");

	public static void registerFluids(){
		FluidRegistry.registerFluid(KOMATIITIC_LAVA);
	}
	
}
