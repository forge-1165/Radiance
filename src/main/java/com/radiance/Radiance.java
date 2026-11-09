package com.radiance;

import net.minecraftforge.fml.common.Mod;

/**
 * Forge 1.12.2 mod entry point. Renderer initialization is intentionally not
 * wired here until the 1.12.2 rendering hooks and native interface are ported.
 */
@Mod(modid = Radiance.MOD_ID, name = "Radiance", version = Radiance.VERSION,
        clientSideOnly = true, acceptedMinecraftVersions = "[1.12.2]")
public final class Radiance {

    public static final String MOD_ID = "radiance";
    public static final String VERSION = "0.1.6-1.12.2-porting";

    public Radiance() {
    }
}
