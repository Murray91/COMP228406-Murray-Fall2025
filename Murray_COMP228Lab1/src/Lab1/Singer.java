package Lab1;

public class Singer {
    // the instance variables
    private int singerId;
    private String singerName;
    private String singerAddress;
    private String dateOfBirth;
    private int albumsPublished;

    // The no-argument constructor
    public Singer() {
        this.singerId = 0;
        this.singerName = null;
        this.singerAddress = null;
        this.dateOfBirth = null;
        this.albumsPublished = 0;
    }

    // The constructor with all its parameters
    public Singer(int singerId, String singerName, String singerAddress, String dateOfBirth, int albumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.albumsPublished = albumsPublished;
    }

    // The individual setters
    public void setSingerId(int singerId) { this.singerId = singerId; }
    public void setSingerName(String singerName) { this.singerName = singerName; }
    public void setSingerAddress(String singerAddress) { this.singerAddress = singerAddress; }
    public void setDateOfBirth(String dateOfBirth) { this.dateOfBirth = dateOfBirth; }
    public void setAlbumsPublished(int albumsPublished) { this.albumsPublished = albumsPublished; }

    // The setter use to do the update all at once
    public void setAll(int singerId, String singerName, String singerAddress, String dateOfBirth, int albumsPublished) {
        this.singerId = singerId;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.albumsPublished = albumsPublished;
    }

    // The getters
    public int getSingerId() { return singerId; }
    public String getSingerName() { return singerName; }
    public String getSingerAddress() { return singerAddress; }
    public String getDateOfBirth() { return dateOfBirth; }
    public int getAlbumsPublished() { return albumsPublished; }
}

