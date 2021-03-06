package fr.minemobs.puffermod.init;

import fr.minemobs.puffermod.Main;
import fr.minemobs.puffermod.object.blocks.*;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import static net.minecraft.block.SoundType.*;

public class BlockInit {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            Main.modId);

    public static final RegistryObject<Block> project_block = BLOCKS.register("salut", () -> new Block(
            Block.Properties.create(Material.IRON).hardnessAndResistance(0.5f, 15.0f).sound(METAL)));

    public static final RegistryObject<Block> test_block = BLOCKS.register("test_block", () -> new Block(
            Block.Properties.create(Material.IRON).hardnessAndResistance(0.5f, 15.0f).sound(METAL)));

    public static final RegistryObject<Block> SKY_BLOCK = BLOCKS.register("sky_block", () -> new SkyBlock(
            Block.Properties.create(Material.IRON).hardnessAndResistance(0.5f, 15.0f).sound(METAL)));

    public static final RegistryObject<Block> compressed_cobblestone = BLOCKS.register("compressed_cobblestone", () -> new Block(
            Block.Properties.create(Material.ROCK).hardnessAndResistance(4.0f, 12.0f).sound(STONE)));

    public static final RegistryObject<Block> compressed_cobblestone2 = BLOCKS.register("compressed_cobblestone2", () -> new Block(
            Block.Properties.create(Material.ROCK).hardnessAndResistance(8.0f, 24.0f).sound(STONE)));

    public static final RegistryObject<Block> compressed_cobblestone3 = BLOCKS.register("compressed_cobblestone3", () -> new Block(
            Block.Properties.create(Material.ROCK).hardnessAndResistance(16.0f, 48.0f).sound(STONE)));

    public static final RegistryObject<Block> compressed_cobblestone4 = BLOCKS.register("compressed_cobblestone4", () -> new Block(
            Block.Properties.create(Material.ROCK).hardnessAndResistance(32.0f, 92.0f).sound(STONE)));

    public static final RegistryObject<Block> clear_glass = BLOCKS.register("clear_glass", () -> new ClearGlass(
            Block.Properties.create(Material.GLASS).hardnessAndResistance(0.3F).sound(SoundType.GLASS).notSolid()));

    public static final RegistryObject<Block> example_furnace = BLOCKS.register("saw_block", () -> new SawBlock(
            Block.Properties.from(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> ELECTRIC_FURNACE = BLOCKS.register("electric_furnace", () -> new ElectricFurnaceBlock(
            Block.Properties.create(Material.MISCELLANEOUS)));

    public static final RegistryObject<Block> CREATIVE_ENERGY_CORE = BLOCKS.register("creative_energy_core", () -> new CreativeEnergyCore(
            Block.Properties.create(Material.MISCELLANEOUS)));

    public static final RegistryObject<Block> wooden_frame = BLOCKS.register("wooden_frame", () -> new WoodenFrameBlock(
            Block.Properties.from(Blocks.REDSTONE_BLOCK).lightValue(2).sound(WOOD)));
}
