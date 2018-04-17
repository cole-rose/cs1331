public class Song {
    private String fileName = "";
    private String title = "";
    private String artistName = "";
    private String albumName = "";
    public Song(String file, String title, String artist, String album ) {
     	this.fileName = file;
        this.title = title;
        this.artistName = artist;
        this.albumName = album;
    }
    public Song() {

    }
    public String getFileName() {
     	return this.fileName;
    }
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getTitle() {
        return this.title;
    }
    public void setArtistName(String artist) {
        this.artistName = artist;
    }
    public String getArtistName() {
        return this.artistName;
    }
    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }
    public String getAlbumName() {
        return this.albumName;
    }
}