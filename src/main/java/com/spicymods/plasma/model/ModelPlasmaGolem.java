package com.spicymods.plasma.model;

import com.spicymods.plasma.entity.EntityPlasmaGolem;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;

public class ModelPlasmaGolem extends ModelBase {
    /** The head model for the iron golem. */
    public ModelRenderer plasmaGolemHead;
    /** The body model for the iron golem. */
    public ModelRenderer plasmaGolemBody;
    /** The right arm model for the iron golem. */
    public ModelRenderer plasmaGolemRightArm;
    /** The left arm model for the iron golem. */
    public ModelRenderer plasmaGolemLeftArm;
    /** The left leg model for the Iron Golem. */
    public ModelRenderer plasmaGolemLeftLeg;
    /** The right leg model for the Iron Golem. */
    public ModelRenderer plasmaGolemRightLeg;

    public ModelPlasmaGolem() {
        this(0.0F);
    }

    public ModelPlasmaGolem(float p_i1161_1_) {
        this(p_i1161_1_, -7.0F);
    }

    public ModelPlasmaGolem(float p_i46362_1_, float p_i46362_2_) {
        int i = 128;
        int j = 128;
        this.plasmaGolemHead = (new ModelRenderer(this)).setTextureSize(128, 128);
        this.plasmaGolemHead.setRotationPoint(0.0F, 0.0F + p_i46362_2_, -2.0F);
        this.plasmaGolemHead.setTextureOffset(0, 0).addBox(-4.0F, -12.0F, -5.5F, 8, 10, 8, p_i46362_1_);
        this.plasmaGolemHead.setTextureOffset(24, 0).addBox(-1.0F, -5.0F, -7.5F, 2, 4, 2, p_i46362_1_);
        this.plasmaGolemBody = (new ModelRenderer(this)).setTextureSize(128, 128);
        this.plasmaGolemBody.setRotationPoint(0.0F, 0.0F + p_i46362_2_, 0.0F);
        this.plasmaGolemBody.setTextureOffset(0, 40).addBox(-9.0F, -2.0F, -6.0F, 18, 12, 11, p_i46362_1_);
        this.plasmaGolemBody.setTextureOffset(0, 70).addBox(-4.5F, 10.0F, -3.0F, 9, 5, 6, p_i46362_1_ + 0.5F);
        this.plasmaGolemRightArm = (new ModelRenderer(this)).setTextureSize(128, 128);
        this.plasmaGolemRightArm.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.plasmaGolemRightArm.setTextureOffset(60, 21).addBox(-13.0F, -2.5F, -3.0F, 4, 30, 6, p_i46362_1_);
        this.plasmaGolemLeftArm = (new ModelRenderer(this)).setTextureSize(128, 128);
        this.plasmaGolemLeftArm.setRotationPoint(0.0F, -7.0F, 0.0F);
        this.plasmaGolemLeftArm.setTextureOffset(60, 58).addBox(9.0F, -2.5F, -3.0F, 4, 30, 6, p_i46362_1_);
        this.plasmaGolemLeftLeg = (new ModelRenderer(this, 0, 22)).setTextureSize(128, 128);
        this.plasmaGolemLeftLeg.setRotationPoint(-4.0F, 18.0F + p_i46362_2_, 0.0F);
        this.plasmaGolemLeftLeg.setTextureOffset(37, 0).addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, p_i46362_1_);
        this.plasmaGolemRightLeg = (new ModelRenderer(this, 0, 22)).setTextureSize(128, 128);
        this.plasmaGolemRightLeg.mirror = true;
        this.plasmaGolemRightLeg.setTextureOffset(60, 0).setRotationPoint(5.0F, 18.0F + p_i46362_2_, 0.0F);
        this.plasmaGolemRightLeg.addBox(-3.5F, -3.0F, -3.0F, 6, 16, 5, p_i46362_1_);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity entityIn, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        this.setRotationAngles(limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale, entityIn);
        this.plasmaGolemHead.render(scale);
        this.plasmaGolemBody.render(scale);
        this.plasmaGolemLeftLeg.render(scale);
        this.plasmaGolemRightLeg.render(scale);
        this.plasmaGolemRightArm.render(scale);
        this.plasmaGolemLeftArm.render(scale);
    }

    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entityIn) {
        this.plasmaGolemHead.rotateAngleY = netHeadYaw * 0.017453292F;
        this.plasmaGolemHead.rotateAngleX = headPitch * 0.017453292F;
        this.plasmaGolemLeftLeg.rotateAngleX = -1.5F * this.triangleWave(limbSwing, 13.0F) * limbSwingAmount;
        this.plasmaGolemRightLeg.rotateAngleX = 1.5F * this.triangleWave(limbSwing, 13.0F) * limbSwingAmount;
        this.plasmaGolemLeftLeg.rotateAngleY = 0.0F;
        this.plasmaGolemRightLeg.rotateAngleY = 0.0F;
    }

    /**
     * Used for easily adding entity-dependent animations. The second and third float params here are the same second
     * and third as in the setRotationAngles method.
     */
    public void setLivingAnimations(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTickTime) {
        EntityPlasmaGolem plasmagolem = (EntityPlasmaGolem)entitylivingbaseIn;
        int i = plasmagolem.getAttackTimer();

        if (i > 0) {
            this.plasmaGolemRightArm.rotateAngleX = -2.0F + 1.5F * this.triangleWave((float)i - partialTickTime, 10.0F);
            this.plasmaGolemLeftArm.rotateAngleX = -2.0F + 1.5F * this.triangleWave((float)i - partialTickTime, 10.0F);
        }
        else {
            this.plasmaGolemRightArm.rotateAngleX = (-0.2F + 1.5F * this.triangleWave(limbSwing, 13.0F)) * limbSwingAmount;
            this.plasmaGolemLeftArm.rotateAngleX = (-0.2F - 1.5F * this.triangleWave(limbSwing, 13.0F)) * limbSwingAmount;
        }
    }

    private float triangleWave(float p_78172_1_, float p_78172_2_) {
        return (Math.abs(p_78172_1_ % p_78172_2_ - p_78172_2_ * 0.5F) - p_78172_2_ * 0.25F) / (p_78172_2_ * 0.25F);
    }
}
