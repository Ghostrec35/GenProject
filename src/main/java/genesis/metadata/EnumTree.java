package genesis.metadata;

import java.util.ArrayList;
import java.util.Arrays;

import net.minecraft.item.Item;

public enum EnumTree implements IMetaSingle
{
	ARCHAEOPTERIS("archaeopteris"), SIGILLARIA("sigillaria"), LEPIDODENDRON("lepidodendron"),
	CORDAITES("cordaites"), PSARONIUS("psaronius"), ARAUCARIOXYLON("araucarioxylon");
	
	public static final EnumTree[] NO_BILLET;
	
	static
	{
		NO_BILLET = new EnumTree[]{PSARONIUS};
	}

	String name;
	String unlocalizedName;
	
	EnumTree(String name)
	{
		this(name, name);
	}
	
	EnumTree(String name, String unlocalizedName)
	{
		this.name = name;
		this.unlocalizedName = unlocalizedName;
	}
	
	@Override
	public String toString()
	{
		return name;
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public String getUnlocalizedName()
	{
		return unlocalizedName;
	}

	@Override
	public Item getItem()
	{
		return null;
	}
}