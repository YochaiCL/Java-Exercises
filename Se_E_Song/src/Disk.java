
public class Disk {

	private final int DEFAULT_SIZE = 10;
	private String diskName;
	// בונה מקום של 10 בו ניתן להוסיף שירים
	private Song[] songs = new Song[DEFAULT_SIZE];
	// מספר השירים במערך
	private int songCount = 0;

	public Disk(String diskName, Song[] songs) {

		this.diskName = diskName;
		setSongs(songs);
	}

	public Disk(String diskName, int songCount) {

		this.diskName = diskName;

		if (songCount > 0)
			// אם נקבע שגודל המערך הוא מספר חיובי אז נקבע גודל המערך
			this.songs = new Song[songCount];
	}

	public String getDiskName() {
		return diskName;
	}

	public void setDiskName(String diskName) {
		this.diskName = diskName;
	}

	public Song[] getSongs() {
		return songs;
	}

	public void setSongs(Song[] songs) {
		if (songs.length > 0)
			this.songs = songs;
		// אם צריך לשמוע את ההקלטה אז דקה 58 חלק ב
		// בודק אם יש null אז הוא רושם את גודל המערך
		for (int i = 0; i < songs.length; i++) {
			if (songs[i] == null)
				songCount = i;
		}
	}

	public boolean addSong(Song s) {
		// true or false
		// אם הוספת השיר הצליחה
		if (songCount < songs.length) {
			songs[songCount++] = s;
			return true;
		}

		return false;
	}

	public int getSongCount() {
		return this.songCount;
	}

	public boolean exist(String nSong, String pSong) {

		for (int i = 0; i < songCount; i++) {

			if (songs[i].getName().equalsIgnoreCase(nSong) && songs[i].getPerformer().equalsIgnoreCase(pSong))
				return true;

		}
		return false;
	}

	public boolean existIn (String nSong, String pSong) {
		
		for(Song s:songs) {
			
			if(s!=null && s.getName().equalsIgnoreCase(nSong) && s.getPerformer().equalsIgnoreCase(pSong))
				
				return true;
		}
		return false;
	}

	// פעולה פנימית זו מטודה
	// main פעולה חיצונית זו פונקציה

}
