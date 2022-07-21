package org;

import java.util.List;

public class ShapeTest {
	public void drawShapes(List<? extends Shape> list)
	{
		for (Shape s:list)
		{
			s.draw();
		}
	}

}
