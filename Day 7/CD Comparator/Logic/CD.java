package Assignment2Work;

import java.util.Objects;

import lombok.*;

@NoArgsConstructor
@ToString
public class CD {

	@Getter
	@Setter
	private String title;
	
	@Getter
	@Setter
	private String singer;
	
	@Getter
	@Setter
	private int yearOfRelease;
	
	public CD(String title, String singer, int yearOfRelease) {
		this.title = title;
		this.singer = singer;
		this.yearOfRelease = yearOfRelease;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CD other = (CD) obj;
		return Objects.equals(singer, other.singer) && title == other.title && yearOfRelease == other.yearOfRelease;
	}
}
 