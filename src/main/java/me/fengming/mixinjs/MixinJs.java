package me.fengming.mixinjs;

import me.fengming.mixinjs.config.MixinJsConfig;
import net.neoforged.fml.common.Mod;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Mod(MixinJs.MODID)
public class MixinJs {
    public static final String MODID = "mixinjs";
    public static final Logger LOGGER = LoggerFactory.getLogger("MixinJs");

    public static MixinJsConfig config = null;

    public MixinJs() {

    }
}
