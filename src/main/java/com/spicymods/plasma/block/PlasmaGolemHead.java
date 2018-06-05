package com.spicymods.plasma.block;

import com.spicymods.plasma.entity.EntityPlasmaGolem;
import com.spicymods.plasma.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockHorizontal;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockStateContainer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import static com.spicymods.plasma.ModMain.MODID;
import static com.spicymods.plasma.tab.SpicyPlasmaTab.plasmaTab;

public class PlasmaGolemHead extends BlockHorizontal {

    //Class guided by the Extra Golems mod, credit goes to them

    public PlasmaGolemHead() {
        super(Material.GOURD);
        this.setRegistryName("plasma_golem_head");
        this.setUnlocalizedName(MODID+".plasma_golem_head");
        this.setCreativeTab(plasmaTab);
        this.setDefaultState(this.blockState.getBaseState().withProperty(FACING, EnumFacing.NORTH));
    }

    @Override
    public IBlockState getStateForPlacement(World worldIn, BlockPos pos, EnumFacing facing, float hitX, float hitY, float hitZ, int meta, EntityLivingBase placer) {
        return this.getDefaultState().withProperty(FACING, placer.getHorizontalFacing().getOpposite());
    }

    /**
     * Convert the given metadata into a BlockState for this Block
     */
    @Override
    public IBlockState getStateFromMeta(int meta) {
        return this.getDefaultState().withProperty(FACING, EnumFacing.getHorizontal(meta));
    }

    /**
     * Convert the BlockState into the correct metadata value
     */
    @Override
    public int getMetaFromState(IBlockState state) {
        return state.getValue(FACING).getHorizontalIndex();
    }

    @Override
    protected BlockStateContainer createBlockState() {
        return new BlockStateContainer(this, new IProperty[] {FACING});
    }

    @Override
    public IBlockState withRotation(IBlockState state, Rotation rot) {
        return state.withProperty(FACING, rot.rotate(state.getValue(FACING)));
    }

    @Override
    public IBlockState withMirror(IBlockState state, Mirror mirrorIn) {
        return state.withRotation(mirrorIn.toRotation(state.getValue(FACING)));
    }

    /**
     * Called whenever the block is added into the world. Args: world, x, y, z
     */
    @Override
    public void onBlockAdded(World world, BlockPos pos, IBlockState state) {
        super.onBlockAdded(world, pos, state);
        Block blockBelow1 = world.getBlockState(pos.down(1)).getBlock();
        Block blockBelow2 = world.getBlockState(pos.down(2)).getBlock();
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();

        if(blockBelow1 == blockBelow2) {
            boolean flagX = isGolemXAligned(world, pos);
            boolean flagZ = isGolemZAligned(world, pos);
            IBlockState meta = world.getBlockState(pos.down(1));

            if(flagX || flagZ) {
                if(!world.isRemote) {

                    if (blockBelow1 == ModBlocks.plasmaticBlock) {
                        // clear the area where the golem blocks were
                        removeAllGolemBlocks(world, pos, flagX);

                        // spawn the golem
                        EntityPlasmaGolem golem = new EntityPlasmaGolem(world);
                        golem.setPlayerCreated(true);
                        golem.setLocationAndAngles((double) x + 0.5D, (double) y - 1.95D, (double) z + 0.5D, 0.0F, 0.0F);
                        world.spawnEntity(golem);
                    }
                }
            }
        }
    }

    /** @return {@code true} if the blocks at x-1 and x+1 match the block at x **/
    public static boolean isGolemXAligned(World world, BlockPos headPos) {
        BlockPos[] armsX = {headPos.down(1).west(1), headPos.down(1).east(1)};
        Block below = world.getBlockState(headPos.down(1)).getBlock();
        return world.getBlockState(armsX[0]).getBlock() == below && world.getBlockState(armsX[1]).getBlock() == below;
    }

    /** @return {@code true} if the blocks at z-1 and z+1 match the block at z **/
    public static boolean isGolemZAligned(World world, BlockPos headPos) {
        BlockPos[] armsZ = {headPos.down(1).north(1), headPos.down(1).south(1)};
        Block below = world.getBlockState(headPos.down(1)).getBlock();
        return world.getBlockState(armsZ[0]).getBlock() == below && world.getBlockState(armsZ[1]).getBlock() == below;
    }

    /** Replaces this block and the four construction blocks with air **/
    public static void removeAllGolemBlocks(World world, BlockPos pos, boolean isXAligned) {
        removeGolemBody(world, pos);
        removeGolemArms(world, pos, isXAligned);
    }

    /** Replaces this block and the two below it with air **/
    public static void removeGolemBody(World world, BlockPos head) {
        world.setBlockToAir(head);
        world.setBlockToAir(head.down(1));
        world.setBlockToAir(head.down(2));
    }

    /** Replaces blocks at arm positions with air **/
    public static void removeGolemArms(World world, BlockPos pos, boolean isXAligned) {
        if(isXAligned) {
            world.setBlockToAir(pos.down(1).west(1));
            world.setBlockToAir(pos.down(1).east(1));
        }
        else {
            world.setBlockToAir(pos.down(1).north(1));
            world.setBlockToAir(pos.down(1).south(1));
        }
    }
}
