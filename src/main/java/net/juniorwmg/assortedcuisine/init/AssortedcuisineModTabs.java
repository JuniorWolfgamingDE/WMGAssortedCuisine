
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.juniorwmg.assortedcuisine.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.CreativeModeTabEvent;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class AssortedcuisineModTabs {
	@SubscribeEvent
	public static void buildTabContentsModded(CreativeModeTabEvent.Register event) {
		event.registerCreativeModeTab(new ResourceLocation("assortedcuisine", "assorted_cuisine"),
				builder -> builder.title(Component.translatable("item_group.assortedcuisine.assorted_cuisine")).icon(() -> new ItemStack(AssortedcuisineModItems.COCOA_DUST.get())).displayItems((parameters, tabData) -> {
					tabData.accept(AssortedcuisineModItems.DRAGON_FRUIT.get());
					tabData.accept(AssortedcuisineModItems.APPLE_SODA.get());
					tabData.accept(AssortedcuisineModItems.GOLDEN_APPLE_SODA.get());
					tabData.accept(AssortedcuisineModItems.COCOA_SODA.get());
					tabData.accept(AssortedcuisineModItems.ROOT_SODA.get());
					tabData.accept(AssortedcuisineModItems.DIAMOND_SODA.get());
					tabData.accept(AssortedcuisineModItems.SHROOM_SODA.get());
					tabData.accept(AssortedcuisineModItems.PUMPKIN_SODA.get());
					tabData.accept(AssortedcuisineModItems.CREAM_PUMPKIN_SODA.get());
					tabData.accept(AssortedcuisineModItems.SPIKED_PUMPKIN_SODA.get());
					tabData.accept(AssortedcuisineModItems.SLURM_SODA.get());
					tabData.accept(AssortedcuisineModItems.CARBON_DIOXIDE_CYLINDER.get());
					tabData.accept(AssortedcuisineModItems.FILLED_CARBON_DIOXIDE_CYLINDER.get());
					tabData.accept(AssortedcuisineModItems.SPARKLING_WATER_BOTTLE.get());
					tabData.accept(AssortedcuisineModItems.SUPER_SUGAR.get());
					tabData.accept(AssortedcuisineModItems.SUGAR_SWEETS.get());
					tabData.accept(AssortedcuisineModItems.SUPER_SUGAR_SWEETS.get());
					tabData.accept(AssortedcuisineModItems.BANDAGE.get());
					tabData.accept(AssortedcuisineModItems.HEALTH_PACK.get());
					tabData.accept(AssortedcuisineModItems.SUPER_HEALTH_PACK.get());
					tabData.accept(AssortedcuisineModItems.BUTTER.get());
					tabData.accept(AssortedcuisineModBlocks.BUTTER_CHURN.get().asItem());
					tabData.accept(AssortedcuisineModBlocks.CHEESE_MAKER.get().asItem());
					tabData.accept(AssortedcuisineModBlocks.CHEESE_BLOCK.get().asItem());
					tabData.accept(AssortedcuisineModItems.KNIFE.get());
					tabData.accept(AssortedcuisineModItems.CHEESE.get());
					tabData.accept(AssortedcuisineModItems.WHISK.get());
					tabData.accept(AssortedcuisineModItems.UNFINISHED_SCRAMBLED_EGGS.get());
					tabData.accept(AssortedcuisineModItems.RAW_SCRAMBLED_EGGS.get());
					tabData.accept(AssortedcuisineModItems.SCRAMBLED_EGGS.get());
					tabData.accept(AssortedcuisineModItems.BREAD_SLICE.get());
					tabData.accept(AssortedcuisineModItems.HOT_CHEESE_SANDWHICH.get());
					tabData.accept(AssortedcuisineModItems.CHEESE_BURGER.get());
					tabData.accept(AssortedcuisineModItems.PUMPKIN_SLICE.get());
					tabData.accept(AssortedcuisineModItems.DOUGH.get());
					tabData.accept(AssortedcuisineModItems.COCOA_DUST.get());
					tabData.accept(AssortedcuisineModItems.CHOCOLATE_MILK.get());
					tabData.accept(AssortedcuisineModItems.HOT_CHOCOLATE_MILK.get());
					tabData.accept(AssortedcuisineModItems.CHOCOLATE_BALLS.get());
					tabData.accept(AssortedcuisineModItems.PIE_PAN.get());
					tabData.accept(AssortedcuisineModItems.RAW_APPLE_PIE.get());
					tabData.accept(AssortedcuisineModItems.RAW_CHOCOLATE_PIE.get());
					tabData.accept(AssortedcuisineModItems.RAW_EMPTY_PIE.get());
					tabData.accept(AssortedcuisineModItems.RAW_MELON_PIE.get());
					tabData.accept(AssortedcuisineModItems.RAW_PORK_PIE.get());
					tabData.accept(AssortedcuisineModItems.RAW_PUMPKIN_PIE.get());
				})

		);
	}
}
