package com.unrealdinnerbone.tramplestopper;

import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.world.item.enchantment.Enchantment;

import java.util.ArrayList;
import java.util.List;

public class TrampleStopper {

    public static final String MOD_ID = "tramplestopper";
    public static void init() {
        TrampleConfig.CONFIG.get();
    }

}