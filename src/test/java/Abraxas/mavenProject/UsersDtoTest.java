package Abraxas.mavenProject;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import mavenProject.dto.UsersDto;

class UsersDtoTest {
	public static final String NAME= "Santiago";
	public static final String LASTNAME = "Uría";
	public static final int AGE = 20;
	private UsersDto user;

	@BeforeEach
	void setUp() {
		this.user = new UsersDto(NAME, LASTNAME, AGE);
	}
	@Test
	public void getNameTest() {
		user.setName(NAME);
		assertNotNull(user);
	}

	@Test
	public void setNameTest() {
		user.setName(NAME);
		assertEquals(user.getName(), user);
	}
	@Test
	public void getLastName() {
		user.setLastName(LASTNAME);
		assertNotNull(user);
		}
	@Test
	public void setLastName() {
		user.setLastName(LASTNAME);
		assertEquals(user.getLastName(),LASTNAME);
		}
	@Test
	public void getAge() {
		user.setAge(AGE);
		assertNotNull(user);
		}
	@Test
	public void setAge() {
		user.setAge(AGE);
		assertEquals(user.getAge(),AGE);
		}


}
