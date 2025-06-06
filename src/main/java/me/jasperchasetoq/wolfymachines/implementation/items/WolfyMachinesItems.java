package me.jasperchasetoq.wolfymachines.implementation.items;

import org.bukkit.Material;

import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;

public class WolfyMachinesItems {


    public static final SlimefunItemStack JC_Glass_Cutter = new SlimefunItemStack("JC_WM_GLASS_CUTTER", Material.STONECUTTER, "&f玻璃切割器", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerPerSecond(50), LoreBuilder.speed(1), LoreBuilder.powerBuffer(500));
    public static final SlimefunItemStack JC_Ender_Infuser = new SlimefunItemStack("JC_ENDER_INFUSER", Material.BREWING_STAND, "&f末影注入机", LoreBuilder.machine(MachineTier.BASIC, MachineType.MACHINE), LoreBuilder.powerPerSecond(50), LoreBuilder.speed(1), LoreBuilder.powerBuffer(500));

}
