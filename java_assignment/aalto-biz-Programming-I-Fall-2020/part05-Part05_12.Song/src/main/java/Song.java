
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }
    public boolean equals(Object compared){
        //完全相同return true
        if (this == compared){
            return true;
        }
        //即便是song类型也不一定是true，
        //但是不是song类型，一定是false
        if (!(compared instanceof Song)){
            return false;
        }
        //在确认是song类型的条件下，再object转换为song类，进行参数对比
        Song comparedSong = (Song) compared;
        if (this.artist.equals(comparedSong.artist) &&
            this.name.equals(comparedSong.name) &&
            this.durationInSeconds == comparedSong.durationInSeconds){
            return true;
        }
        return false;
    }

}
