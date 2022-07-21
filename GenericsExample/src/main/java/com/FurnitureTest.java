package com;

import java.util.List;

public class FurnitureTest {
	public void buyFurniture(List<? extends Furniture> list)
	{
		for (Furniture f:list)
		{
			f.buy();
		}
	}

}
