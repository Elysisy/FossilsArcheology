package mods.fossil.gens.structure;

import net.minecraft.block.Block;

public class weaponshop
{
    /** Some predefined values for custom hooks that I use in the demo structure */
    public static final int CUSTOM_CHEST = 4097, CUSTOM_DISPENSER = 4098, ITEM_FRAME = 4099, PAINTING = 4100,
                            SPAWN_VILLAGER = 4101, CUSTOM_SKULL = 4102, CUSTOM_SIGNWALL = 4103, CUSTOM_SIGNPOST = 4104, RANDOM_HOLE = 4105;

    /** Start of specific chests; I'll use negative values so as not to conflict with item types and such */
    public static final int CUSTOM_CHEST_1 = -1;

    /** Custom signs */
    public static final int CUSTOM_SIGN_1 = 1;

    public static final int[][][][] blockArrayWeaponShop =
    {
        //This is where all the x, y, z values go (i, j, k). They are broke down by
        //layer. This is how the array works building from x to z and by layer y,
        //then they are finished by removing all the world.setBlock and
        //x, y, z coordinates leaving something like this {Block.stone.blockID},
        {
            // y = 0
            {
                //x = 0
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
            },
            {
                //x = 1
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.cobblestone.blockID},
            },
            {
                //x = 2
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.dirt.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.sandStone.blockID},
                {Block.cobblestone.blockID},
            },
            {
                //x = 3
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.planks.blockID},
                {Block.dirt.blockID},
                {Block.dirt.blockID},
                {Block.dirt.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.sandStone.blockID},
                {Block.cobblestone.blockID},
            },
            {
                //x = 4
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.planks.blockID},
                {Block.dirt.blockID},
                {Block.dirt.blockID},
                {Block.dirt.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.sandStone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 5
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.dirt.blockID},
                {Block.dirt.blockID},
                {Block.dirt.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.sandStone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 6
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.dirt.blockID},
                {Block.dirt.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.sandStone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 7
                {Block.cobblestone.blockID},
                {Block.sandStone.blockID},
                {Block.dirt.blockID},
                {Block.dirt.blockID},
                {Block.planks.blockID},
                {Block.wood.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.sandStone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 8
                {Block.cobblestone.blockID},
                {Block.sandStone.blockID},
                {Block.dirt.blockID},
                {Block.dirt.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.sandStone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 9
                {Block.cobblestone.blockID},
                {Block.sandStone.blockID},
                {Block.dirt.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.sandStone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 10
                {Block.cobblestone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 11
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
            }
        },
        {
            //y = 1
            {
                //x = 0
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.cobblestone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestoneMossy.blockID},
            },
            {
                //x = 1
                {Block.stone.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.stairsWoodOak.blockID, 2},
                {Block.planks.blockID},
                {Block.stairsWoodOak.blockID, 3},
                {0},
                {Block.sandStone.blockID},
                {Block.cobblestone.blockID},
            },
            {
                //x = 2
                {Block.stone.blockID},
                {Block.planks.blockID},
                {Block.chest.blockID, 5},
                {Block.gravel.blockID},
                {Block.gravel.blockID},
                {0},
                {0},
                {0},
                {0},
                {Block.stairsWoodOak.blockID},
                {Block.cobblestone.blockID},
            },
            {
                //x = 3
                {Block.stone.blockID},
                {Block.planks.blockID},
                {Block.gravel.blockID},
                {Block.gravel.blockID},
                {Block.gravel.blockID},
                {0},
                {Block.stoneSingleSlab.blockID, 1},
                {0},
                {Block.netherFence.blockID},
                {Block.stairsWoodOak.blockID, 1},
                {Block.cobblestone.blockID},
            },
            {
                //x = 4
                {Block.stone.blockID},
                {Block.planks.blockID},
                {Block.gravel.blockID},
                {Block.gravel.blockID},
                {0},
                {0},
                {Block.sandStone.blockID},
                {0},
                {0},
                {Block.planks.blockID},
                {Block.cobblestone.blockID},
            },
            {
                //x = 5
                {Block.stone.blockID},
                {Block.stoneSingleSlab.blockID, 2},
                {Block.gravel.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.netherFence.blockID},
                {Block.stairsWoodOak.blockID},
                {Block.cobblestone.blockID},
            },
            {
                //x = 6
                {Block.stone.blockID},
                {Block.planks.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.planks.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 7
                {Block.cobblestone.blockID},
                {Block.planks.blockID},
                {0},
                {0},
                {0},
                {Block.glowStone.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 8
                {Block.cobblestoneMossy.blockID},
                {0},
                {0},
                {0},
                {0},
                {Block.fenceGate.blockID, 2},
                {0},
                {0},
                {Block.chest.blockID, 2},
                {Block.planks.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 9
                {Block.cobblestoneMossy.blockID},
                {0},
                {0},
                {0},
                {0},
                {Block.wood.blockID},
                {Block.stairsWoodOak.blockID},
                {Block.stairsWoodOak.blockID},
                {Block.stairsWoodOak.blockID},
                {Block.planks.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 10
                {Block.cobblestoneMossy.blockID},
                {0},
                {0},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 11
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
            }
        },
        {
            //y = 2
            {
                //x = 0
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestoneMossy.blockID},
            },
            {
                //x = 1
                {Block.stone.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {0},
                {Block.stairsWoodOak.blockID, 2},
                {Block.planks.blockID},
                {Block.stairsWoodOak.blockID, 2},
                {0},
                {0},
                {0},
                {Block.cobblestoneMossy.blockID},
            },
            {
                //x = 2
                {Block.stone.blockID},
                {Block.planks.blockID},
                {Block.gravel.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.cobblestoneMossy.blockID},
            },
            {
                //x = 3
                {Block.stone.blockID},
                {Block.planks.blockID},
                {Block.gravel.blockID},
                {Block.gravel.blockID},
                {0},
                {0},
                {0},
                {0},
                {Block.netherFence.blockID},
                {Block.planks.blockID},
                {Block.cobblestone.blockID},
            },
            {
                //x = 4
                {Block.cobblestone.blockID},
                {Block.stairsWoodOak.blockID},
                {Block.gravel.blockID},
                {Block.gravel.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.planks.blockID},
                {Block.cobblestone.blockID},
            },
            {
                //x = 5
                {Block.cobblestoneMossy.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.netherFence.blockID},
                {Block.planks.blockID},
                {Block.cobblestone.blockID},
            },
            {
                //x = 6
                {Block.cobblestone.blockID},
                {Block.planks.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.planks.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 7
                {Block.cobblestoneMossy.blockID},
                {0},
                {0},
                {0},
                {0},
                {Block.wood.blockID},
                {0},
                {0},
                {0},
                {Block.planks.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 8
                {Block.cobblestone.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.planks.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 9
                {Block.cobblestone.blockID},
                {0},
                {0},
                {0},
                {0},
                {Block.wood.blockID},
                {Block.stairsWoodOak.blockID},
                {Block.stairsWoodOak.blockID},
                {Block.stairsWoodOak.blockID},
                {Block.planks.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 10
                {Block.cobblestone.blockID},
                {0},
                {0},
                {0},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.planks.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 11
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
            }
        },
        {
            //y = 3
            {
                //x = 0
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
            },
            {
                //x = 1
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {0},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {0},
                {0},
                {0},
                {0},
                {Block.cobblestoneMossy.blockID},
            },
            {
                //x = 2
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.gravel.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.stoneSingleSlab.blockID, 1},
                {Block.cobblestoneMossy.blockID},
            },
            {
                //x = 3
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.torchRedstoneActive.blockID, 2},
                {Block.gravel.blockID},
                {0},
                {0},
                {0},
                {0},
                {Block.fenceIron.blockID},
                {Block.stoneSingleSlab.blockID, 1},
                {Block.cobblestone.blockID},
            },
            {
                //x = 4
                {Block.cobblestone.blockID},
                {0},
                {Block.gravel.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.stoneSingleSlab.blockID, 1},
                {Block.cobblestone.blockID},
            },
            {
                //x = 5
                {Block.cobblestoneMossy.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.fenceIron.blockID},
                {Block.stoneSingleSlab.blockID, 1},
                {Block.cobblestone.blockID},
            },
            {
                //x = 6
                {Block.cobblestone.blockID},
                {Block.sandStone.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.sandStone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 7
                {Block.cobblestoneMossy.blockID},
                {0},
                {Block.vine.blockID, 4},
                {0},
                {0},
                {Block.wood.blockID},
                {0},
                {0},
                {0},
                {Block.sandStone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 8
                {Block.cobblestoneMossy.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.sandStone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 9
                {Block.cobblestone.blockID},
                {0},
                {0},
                {0},
                {0},
                {Block.wood.blockID},
                {Block.stairsWoodOak.blockID},
                {Block.stairsWoodOak.blockID},
                {Block.stairsWoodOak.blockID},
                {Block.sandStone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 10
                {Block.cobblestoneMossy.blockID},
                {0},
                {0},
                {0},
                {0},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 11
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
            }
        },
        {
            //y = 4
            {
                //x = 0
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.wood.blockID},
                {Block.cobblestone.blockID},
                {Block.wood.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestoneMossy.blockID},
            },
            {
                //x = 1
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {0},
                {0},
                {0},
                {Block.vine.blockID, 1},
                {Block.cobblestoneMossy.blockID},
            },
            {
                //x = 2
                {Block.wood.blockID},
                {Block.sandStone.blockID},
                {0},
                {Block.sandStone.blockID},
                {Block.vine.blockID, 4},
                {Block.fence.blockID},
                {0},
                {0},
                {0},
                {0},
                {Block.cobblestoneMossy.blockID},
            },
            {
                //x = 3
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.vine.blockID, 4},
                {Block.fence.blockID},
                {0},
                {0},
                {0},
                {0},
                {Block.cobblestoneMossy.blockID},
            },
            {
                //x = 4
                {Block.wood.blockID},
                {Block.sandStone.blockID},
                {0},
                {Block.sandStone.blockID},
                {Block.vine.blockID, 4},
                {Block.fence.blockID},
                {0},
                {0},
                {0},
                {0},
                {Block.cobblestoneMossy.blockID},
            },
            {
                //x = 5
                {Block.cobblestone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {0},
                {Block.fence.blockID},
                {0},
                {0},
                {0},
                {Block.sandStone.blockID},
                {Block.cobblestone.blockID},
            },
            {
                //x = 6
                {Block.wood.blockID},
                {Block.sandStone.blockID},
                {0},
                {0},
                {0},
                {Block.fence.blockID},
                {0},
                {0},
                {0},
                {Block.sandStone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 7
                {Block.cobblestoneMossy.blockID},
                {Block.sandStone.blockID},
                {Block.vine.blockID, 4},
                {Block.fence.blockID},
                {Block.fence.blockID},
                {Block.planks.blockID},
                {Block.fence.blockID},
                {Block.fence.blockID},
                {Block.fence.blockID},
                {Block.sandStone.blockID},
                {Block.wood.blockID},
            },
            {
                //x = 8
                {Block.cobblestoneMossy.blockID},
                {Block.vine.blockID, 2},
                {0},
                {0},
                {0},
                {Block.fence.blockID},
                {0},
                {0},
                {0},
                {Block.sandStone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 9
                {Block.cobblestoneMossy.blockID},
                {Block.vine.blockID, 4},
                {0},
                {Block.vine.blockID, 8},
                {0},
                {Block.planks.blockID},
                {0},
                {0},
                {0},
                {Block.sandStone.blockID},
                {Block.wood.blockID},
            },
            {
                //x = 10
                {Block.cobblestoneMossy.blockID},
                {0},
                {0},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 11
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestone.blockID},
                {Block.wood.blockID},
                {Block.stone.blockID},
                {Block.wood.blockID},
                {Block.cobblestone.blockID},
                {Block.wood.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
            }
        },
        {
            //y = 5
            {
                //x = 0
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
            },
            {
                //x = 1
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.stoneSingleSlab.blockID, 1},
                {Block.vine.blockID, 2},
                {Block.vine.blockID, 2},
                {Block.vine.blockID, 1},
                {Block.cobblestoneMossy.blockID},
            },
            {
                //x = 2
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.tnt.blockID},
                {Block.sandStone.blockID},
                {Block.stoneSingleSlab.blockID, 2},
                {Block.stoneSingleSlab.blockID, 2},
                {0},
                {0},
                {0},
                {0},
                {Block.cobblestone.blockID},
            },
            {
                //x = 3
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.torchRedstoneIdle.blockID, 5},
                {Block.sandStone.blockID},
                {Block.stoneSingleSlab.blockID, 2},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.cobblestone.blockID},
            },
            {
                //x = 4
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.tnt.blockID},
                {Block.sandStone.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.stoneSingleSlab.blockID, 1},
                {Block.cobblestone.blockID},
            },
            {
                //x = 5
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.sandStone.blockID},
                {Block.cobblestone.blockID},
            },
            {
                //x = 6
                {Block.stone.blockID},
                {Block.stoneSingleSlab.blockID, 1},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.stoneSingleSlab.blockID, 1},
                {Block.stone.blockID},
            },
            {
                //x = 7
                {Block.cobblestone.blockID},
                {0},
                {0},
                {0},
                {0},
                {Block.stoneSingleSlab.blockID, 2},
                {Block.stoneSingleSlab.blockID, 2},
                {Block.stoneSingleSlab.blockID, 2},
                {Block.stoneSingleSlab.blockID, 2},
                {Block.sandStone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 8
                {Block.cobblestoneMossy.blockID},
                {0},
                {0},
                {0},
                {0},
                {Block.stoneSingleSlab.blockID, 2},
                {Block.stoneSingleSlab.blockID, 2},
                {Block.stoneSingleSlab.blockID, 2},
                {Block.stoneSingleSlab.blockID, 2},
                {Block.sandStone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 9
                {Block.cobblestone.blockID},
                {0},
                {0},
                {0},
                {0},
                {Block.stoneSingleSlab.blockID, 2},
                {Block.stoneSingleSlab.blockID, 2},
                {Block.stoneSingleSlab.blockID, 2},
                {Block.stoneSingleSlab.blockID, 2},
                {Block.sandStone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 10
                {Block.cobblestoneMossy.blockID},
                {0},
                {0},
                {0},
                {Block.stoneSingleSlab.blockID, 1},
                {Block.stoneSingleSlab.blockID, 1},
                {Block.sandStone.blockID},
                {Block.stoneSingleSlab.blockID, 1},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 11
                {Block.cobblestone.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
            }
        },
        {
            //y = 6
            {
                //x = 0
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
                {Block.cobblestone.blockID},
            },
            {
                //x = 1
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.cobblestone.blockID},
            },
            {
                //x = 2
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.stoneSingleSlab.blockID, 2},
                {Block.sandStone.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.cobblestone.blockID},
            },
            {
                //x = 3
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.stoneSingleSlab.blockID, 2},
                {Block.sandStone.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.cobblestone.blockID},
            },
            {
                //x = 4
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.stoneSingleSlab.blockID, 2},
                {Block.sandStone.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.cobblestone.blockID},
            },
            {
                //x = 5
                {Block.stone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {Block.sandStone.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.stone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 6
                {Block.cobblestone.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.stone.blockID},
            },
            {
                //x = 7
                {Block.cobblestone.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.stone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 8
                {Block.cobblestone.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.stone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 9
                {Block.cobblestoneMossy.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.stone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 10
                {Block.cobblestone.blockID},
                {0},
                {0},
                {0},
                {0},
                {0},
                {Block.stone.blockID},
                {0},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
            },
            {
                //x = 11
                {Block.cobblestone.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.cobblestoneMossy.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
                {Block.stone.blockID},
            }
        }
    };
}