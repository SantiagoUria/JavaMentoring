package mavenProject.serviceImpl;
import mavenProject.dto.UsersDto;

public class UsersMain{

	public static void main(String[] args) {
		UsersDto santi = new UsersDto("Santiago", "Uría", 20);
		System.out.println(santi.getName());
		System.out.println(santi.getLastName());
		System.out.println(santi.getAge());
	}

}
