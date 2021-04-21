package Abraxas.mavenProject;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import mavenProject.dto.ColorsDto;

@ExtendWith(SpringExtension.class)
public class ColorsDtoTest {
	public static final String RED = "rojo";
	public static final String REDRGB = "255,0,0";
	private ColorsDto color;

	@BeforeEach
	void setUp() {
		this.color = new ColorsDto();
	}

	@Test
	public void getNameTest() {
		color.setName(RED);
		assertNotNull(color);
	}

	@Test
	public void setNameTest() {
		color.setName(RED);
		assertEquals(color.getName(), RED);
	}
	@Test
	public void getRgbCodeTest() {
		color.setRgbCode(REDRGB);
		assertNotNull(color);
		}
	@Test
	public void setRgbCodeTest() {
		color.setRgbCode(REDRGB);
		assertEquals(color.getRgbCode(),REDRGB);
		}

}