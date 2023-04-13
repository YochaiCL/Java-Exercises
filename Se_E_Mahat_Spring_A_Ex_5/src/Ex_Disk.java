
public class Ex_Disk {
	private String diskName;

	// Defining a finite variable of size 10
	private final int DEFAULT_SIZE = 10;

	// If the size of the array is not defined then the size will be 10
	private Ex_Song[] songs = new Ex_Song[DEFAULT_SIZE];

	// A variable that counts the number of songs in the array
	private int songCount = 0;

	// First option
	// Defining the array according to the internal function "setSongs"
	public Ex_Disk(String tmpDiskName, Ex_Song[] tmpSongs) {

		this.diskName = tmpDiskName;
		setSongs(tmpSongs);
	}

	// second option
	// Defining the size of the array according to the variable songCount
	public Ex_Disk(String tmpDiskName, int tmpSongCount) {

		this.diskName = tmpDiskName;

		if (tmpSongCount > 0)
			this.songs = new Ex_Song[tmpSongCount];
	}

	public String getDiskName() {
		return diskName;
	}

	public void setDiskName(String tmpDiskName) {
		this.diskName = tmpDiskName;
	}

	public Ex_Song[] getSongs() {
		return songs;
	}

	public void setSongs(Ex_Song[] tmpSongs) {

		if (tmpSongs.length > 0)
			this.songs = tmpSongs;

		for (int i = 0; i < tmpSongs.length; i++) {
			if (tmpSongs[i] == null)
				songCount = i;
		}
	}

	// Adding song to array
	public boolean addSong(Ex_Song s) {

		if (songCount < songs.length) {
			songs[songCount++] = s;
			return true;
		}

		return false;
	}

	public int getSongCount() {
		return this.songCount;
	}

	// B
	public boolean exist(String tmpNSong, String tmpPSong) {

		for (int i = 0; i < songCount; i++) {

			if (songs[i].getName().equalsIgnoreCase(tmpNSong) && songs[i].getPerformer().equalsIgnoreCase(tmpPSong))
				return true;

		}
		return false;
	}

	// B
	public boolean existIn(String tmpNSong, String tmpPSong) {

		for (Ex_Song s : songs) {

			if (s != null && s.getName().equalsIgnoreCase(tmpNSong) && s.getPerformer().equalsIgnoreCase(tmpPSong))

				return true;
		}
		return false;
	}
}
