package info.u_team.useful_things;

import org.apache.logging.log4j.*;

public class UsefulThingsConstants {

	public static final String MODID = "usefulthings";
	public static final String NAME = "Useful Things";
	public static final String VERSION = "${version}";
	public static final String MCVERSION = "${mcversion}";
	public static final String DEPENDENCIES = "required:forge@[14.23.4.2745,);required-after:uteamcore@[2.2.4.94,)";
	public static final String UPDATEURL = "https://api.u-team.info/update/usefulthings.json";

	public static final String COMMONPROXY = "info.u_team.useful_things.proxy.CommonProxy";
	public static final String CLIENTPROXY = "info.u_team.useful_things.proxy.ClientProxy";

	public static final Logger LOGGER = LogManager.getLogger(NAME);

}
