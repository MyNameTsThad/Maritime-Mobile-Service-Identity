package com.thaddev.maritimemobileserviceidentity;

import com.thaddev.maritimemobileserviceidentity.blocks.BlockInit;
import org.quiltmc.loader.api.ModContainer;
import org.quiltmc.qsl.base.api.entrypoint.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MMSI implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Maritime Mobile Service Identity");
	public static final String MOD_ID = "maritimemobileserviceidentity";
	public static final String LONG_NAME = "MaritimeMobileServiceIdentity";

	@Override
	public void onInitialize(ModContainer mod) {
		LOGGER.info("===== Initializing... =====");
		BlockInit.register();
		LOGGER.info(" ===== Finished initializing. =====");
	}
}
