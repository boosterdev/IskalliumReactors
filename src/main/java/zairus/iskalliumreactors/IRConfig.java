package zairus.iskalliumreactors;

import java.io.File;

import net.minecraftforge.common.config.Configuration;

public class IRConfig
{
	public static int eachIskalliumBlockPowerValue = 250;

	public static Configuration configuration;

	public static void init(File cFile)
	{
		configuration = new Configuration(cFile);

		configuration.load();

		eachIskalliumBlockPowerValue = configuration.getInt("eachIskalliumBlockPowerValue", "ENERGY_VALUES", eachIskalliumBlockPowerValue, 0, 255, "How much energy each Iskallium Block provides");

		configuration.save();
	}
}
