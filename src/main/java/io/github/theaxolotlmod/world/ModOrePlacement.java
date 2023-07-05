package io.github.theaxolotlmod.world;

import net.minecraft.world.gen.decorator.BiomePlacementModifier;
import net.minecraft.world.gen.decorator.CountPlacementModifier;
import net.minecraft.world.gen.decorator.InSquarePlacementModifier;
import net.minecraft.world.gen.feature.PlacementModifier;
import net.minecraft.world.gen.decorator.RarityFilterPlacementModifier;

import java.util.List;

public class ModOrePlacement {




    public static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, InSquarePlacementModifier.getInstance(), heightModifier, BiomePlacementModifier.getInstance());
    }

    public static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifiers(CountPlacementModifier.create(count),  heightModifier);
    }

    public static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifiers(RarityFilterPlacementModifier.create(chance), heightModifier);
    }
}
