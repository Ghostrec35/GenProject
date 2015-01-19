package genesis.util;

import genesis.block.EnumCoral;
import genesis.block.EnumFern;
import genesis.block.EnumPlant;
import net.minecraft.block.properties.PropertyEnum;

import java.util.Random;

public final class Constants {
    public static final String MOD_ID = "genesis";
    public static final String MOD_NAME = "Project Genesis";
    public static final String MOD_VERSION = "@VERSION@";

    public static final String PREFIX = MOD_ID + ".";
    public static final String ASSETS = MOD_ID + ":";

    public static final String VERSIONS_URL = "https://raw.githubusercontent.com/GenProject/GenProject/master/versions.json";

    public static final String PROXY_LOCATION = "genesis.common.GenesisProxy";
    public static final String CLIENT_LOCATION = "genesis.client.GenesisClient";

    public static final PropertyEnum PLANT_VARIANT = PropertyEnum.create("variant", EnumPlant.class);
    public static final PropertyEnum FERN_VARIANT = PropertyEnum.create("variant", EnumFern.class);
    public static final PropertyEnum CORAL_VARIANT = PropertyEnum.create("variant", EnumCoral.class);
}
