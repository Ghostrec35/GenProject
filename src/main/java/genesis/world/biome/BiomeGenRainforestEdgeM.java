package genesis.world.biome;

public class BiomeGenRainforestEdgeM extends BiomeGenRainforestEdge
{

	public BiomeGenRainforestEdgeM(int id)
	{
		super(id);
		this.biomeName = "Rainforest Edge M";
		this.minHeight = 0.7F;
		this.maxHeight = 1.5F;
		this.theBiomeDecorator.treesPerChunk = 3;
	}

}
