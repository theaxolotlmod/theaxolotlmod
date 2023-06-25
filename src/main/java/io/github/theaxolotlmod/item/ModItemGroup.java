package io.github.theaxolotlmod.item;


import io.github.theaxolotlmod.Theaxolotlmod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.quiltmc.qsl.item.setting.api.QuiltItemSettings;

public class ModItemGroup {
    public static ItemGroup ITEMS;

    public static void registerItemGroups() {
        ITEMS = QuiltItemGroup.builder(new Identifier(Theaxolotlmod.MOD_ID, "item"))
            .displayName(Text.translatable("itemgroup.items"))
            .icon(() -> new ItemStack(ModItems.ITEM)).build();

    }
}
