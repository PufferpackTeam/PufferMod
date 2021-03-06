package fr.minemobs.puffermod.init;

import fr.minemobs.puffermod.Main;
import fr.minemobs.puffermod.object.item.*;
import fr.minemobs.puffermod.utils.enums.ItemTier;
import net.minecraft.item.*;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.awt.*;

public class ItemInit {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.modId);

    public static final RegistryObject<Item> refined_iron_ingot = ITEMS.register("refined_iron_ingot",
            () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)
                    .maxStackSize(63)));

    public static final RegistryObject<Item> puffer_coins = ITEMS.register("puffer_coins",
            () -> new PufferCoin(new Item.Properties().group(Main.ModItemGroup.instance)
                    .rarity(Rarity.EPIC).maxStackSize(4)));

    public static final RegistryObject<Item> golden_coins = ITEMS.register("golden_coins",
            () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)
                    .rarity(Rarity.RARE).maxStackSize(4)));

    public static final RegistryObject<Item> golden_string = ITEMS.register("golden_string",
            () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)
                    .rarity(Rarity.RARE)));

    public static final RegistryObject<Item> mask = ITEMS.register("mask",
            () -> new Item(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> cheese = ITEMS.register("cheese",
            () -> new CheeseItem(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> test_item = ITEMS.register("test_item",
            () -> new GunItem(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> karlson_milk = ITEMS.register("karlson_milk",
            () -> new KarlsonItem(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<Item> empty_brick = ITEMS.register("empty_brick",
            () -> new EmptyBrick(new Item.Properties().group(Main.ModItemGroup.instance)));

    public static final RegistryObject<BucketItem> KARLSON_CARTON = ITEMS.register("karlson_bucket",
            () -> new BucketItem(() -> FluidInit.MILK_FLUID.get(),
            new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(1)));


    //// TODO: 22/08/2020 02h du mat, add some refined iron items
    //// TODO: (fini le 22/08/2020 à 15h)

    //tools
    //sword
    public static final RegistryObject<SwordItem> refined_iron_sword = ITEMS.register("refined_iron_sword",
            () -> new SwordItem(ItemTier.REFINED_IRON, 3, -2.4F,
                    new Item.Properties().group(Main.ModItemGroup.instance)));

    //pickaxe
    public static final RegistryObject<PickaxeItem> refined_iron_pickaxe = ITEMS.register("refined_iron_pickaxe",
            () -> new PickaxeItem(ItemTier.REFINED_IRON, 1, -2.8F,
                    new Item.Properties().group(Main.ModItemGroup.instance).rarity(Rarity.EPIC)));

    //shovel
    public static final RegistryObject<ShovelItem> refined_iron_shovel = ITEMS.register("refined_iron_shovel",
            () -> new ShovelItem(ItemTier.REFINED_IRON, 1.5F, -3.0F,
                    new Item.Properties().group(Main.ModItemGroup.instance).rarity(Rarity.EPIC)));

    //axe
    public static final RegistryObject<AxeItem> refined_iron_axe = ITEMS.register("refined_iron_axe",
            () -> new AxeItem(ItemTier.REFINED_IRON, 6.0F, -3.1F,
                    new Item.Properties().rarity(Rarity.EPIC).group(Main.ModItemGroup.instance)));

    //hoe
    public static final RegistryObject<HoeItem> refined_iron_hoe = ITEMS.register("refined_iron_hoe",
            () -> new HoeItem(ItemTier.REFINED_IRON, -1.0F,
                    new Item.Properties().group(Main.ModItemGroup.instance)));

    //eggs

    public static final RegistryObject<ModSpawnEggItem> TEST_SPAWN_EGG = ITEMS.register("test_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.TEST_ENTITY, Color.CYAN.getRGB(), Color.DARK_GRAY.getRGB(),
                    new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(16)));

    public static final RegistryObject<ModSpawnEggItem> RED_AMONGUS_SPAWN_EGG = ITEMS.register("red_amongus_spawn_egg",
            () -> new ModSpawnEggItem(ModEntityTypes.RED_AMONGUS_ENTITY, Color.RED.getRGB(), Color.WHITE.getRGB(),
                    new Item.Properties().group(Main.ModItemGroup.instance).maxStackSize(16)));


}
