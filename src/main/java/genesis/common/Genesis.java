package genesis.common;

import genesis.metadata.EnumCoral;
import genesis.metadata.EnumDung;
import genesis.metadata.EnumFern;
import genesis.metadata.EnumNodule;
import genesis.metadata.EnumPebble;
import genesis.metadata.EnumPlant;
import genesis.util.Constants;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import org.apache.logging.log4j.Logger;

@Mod(modid = Constants.MOD_ID, name = Constants.MOD_NAME, version = Constants.MOD_VERSION, dependencies = "required-after:Forge")
public class Genesis
{
	@Mod.Instance(Constants.MOD_ID)
	public static Genesis instance;
	@SidedProxy(clientSide = Constants.CLIENT_LOCATION, serverSide = Constants.PROXY_LOCATION)
	public static GenesisProxy proxy;

	public static Logger logger;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		logger = event.getModLog();

		GenesisVersion.startVersionCheck();
		GenesisConfig.readConfigValues(event.getSuggestedConfigurationFile());

		initEnums();
		GenesisFluids.registerFluids();
		GenesisBlocks.registerBlocks();
		GenesisItems.registerItems();

		registerTileEntities();

		GenesisBiomes.loadBiomes();

		registerEntities();

		proxy.preInit();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event)
	{
		GenesisRecipes.addRecipes();

		registerHandlers();

		proxy.init();
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		proxy.postInit();
	}
	
	private void initEnums()
	{
		EnumPlant.values();
		EnumFern.values();
		EnumCoral.values();
		EnumDung.values();
		EnumPebble.values();
		EnumNodule.values();
	}

	private void registerTileEntities()
	{
	}

	private void registerEntities()
	{
	}

	private void registerHandlers()
	{
	}
}
