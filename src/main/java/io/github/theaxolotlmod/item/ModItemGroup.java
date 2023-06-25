package io.github.theaxolotlmod.item;


public class ModItemGroup {
    public static ItemGroup ITEMS;

    public static void registerItemGroups() {
        ITEMS = QuiltItemGroup.builder(new Identifier(Theaxolotlmod.MOD_ID, "item"))
            .displayName(Text.translatable("itemgroup.items"))
            .icon(() -> new ItemStack(ModItems.ITEMS)).build();
            
    }
}