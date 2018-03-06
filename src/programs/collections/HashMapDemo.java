package programs.collections;

import java.util.HashMap;
import java.util.Map;

class Movie {
	private String name, actor;
	private int releaseYr;

	public int getReleaseYr() {
		return releaseYr;
	}

	public void setReleaseYr(int releaseYr) {
		this.releaseYr = releaseYr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	@Override
	public int hashCode() {

		return 9 * actor.hashCode() + name.hashCode() + releaseYr;
	}

	@Override
	public boolean equals(Object obj) { 
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (obj instanceof Movie) {
			Movie movie = (Movie) obj;
			if (this.name == movie.actor && this.name == movie.name && this.releaseYr == movie.releaseYr) {
				return true;
			}
		}

		return false;
	}

}

public class HashMapDemo {

	public static void main(String[] args) {
		Movie m = new Movie();
		m.setActor("Akshay");
		m.setName("Thank you");
		m.setReleaseYr(2011);

		Movie m1 = new Movie();
		m.setActor("Akshay");
		m.setName("khiladi");
		m.setReleaseYr(1993);

		Movie m2 = new Movie();
		m.setActor("Akshay");
		m.setName("Taskvir");
		m.setReleaseYr(2010);

		Movie m3 = new Movie();
		m.setActor("Akshay");
		m.setName("Taskvir");
		m.setReleaseYr(2010);

		HashMap<Movie, String> map = new HashMap<Movie, String>();
		map.put(m, "ThankYou");
		map.put(m1, "Khiladi");
		map.put(m2, "Taskvir");
		map.put(m3, "Duplicate Taskvir");
		for (Movie ma : map.keySet()) {
			System.out.println(map.get(ma).toString());

		}
		Movie m4 = new Movie();
		m4.setActor("Akshay");
		m4.setName("Taskvir");
		m4.setReleaseYr(2010);
		/*
		 * We are trying to retrieve m2, by creating object m4 with exact values
		 * as of m2, However Hashcode method is not implemented and that why we
		 * are not able to get Object m2
		 */
		if (map.get(m4) == null) {

			System.out.println("----------------");

			System.out.println("Object not found");

			System.out.println("----------------");

		} else {

			System.out.println(map.get(m4).toString());

		}

	}

}
