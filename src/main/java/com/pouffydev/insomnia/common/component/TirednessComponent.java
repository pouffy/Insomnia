package com.pouffydev.insomnia.common.component;

import net.minecraft.nbt.NbtCompound;

public class TirednessComponent implements IntComponent{
	private int tiredness;
	@Override
	public int getValue() {return tiredness;}

	@Override
	public void readFromNbt(NbtCompound tag) {tiredness = tag.getInt("tiredness");}

	@Override
	public void writeToNbt(NbtCompound tag) {tag.putInt("tiredness", tiredness);}
}
