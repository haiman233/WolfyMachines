package me.jasperchasetoq.wolfymachines.implementation.setup;

import org.bukkit.Material;
import org.bukkit.NamespacedKey;

import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import me.jasperchasetoq.wolfymachines.WolfyMachines;

public class WolfyMachinesItemGroups {

    public static final NestedItemGroup NestedGeneral = new NestedItemGroup(new NamespacedKey(WolfyMachines.getInstance(), "GENERAL"), new CustomItemStack(Material.FURNACE, "&f狼之机器"));
    public static final SubItemGroup Machines = new SubItemGroup(new NamespacedKey(WolfyMachines.getInstance(), "MACHINES"), NestedGeneral, new CustomItemStack(Material.BLAST_FURNACE, "&f机器"));

}