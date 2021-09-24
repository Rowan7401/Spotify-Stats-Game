import java.util.*;

public class Artist {
    String stageName;    
    String realName;
    int age;
    String ranking;
    Song bestSong;
    Album bestAlbum;
    

    public Artist(String stageName, String realName, int age, String ranking, Song bestSong, Album bestAlbum) {
        this.stageName = stageName;
        this.realName = realName;
        this.age = age;
        this.ranking = ranking;
        this.bestSong = bestSong;
        this.bestAlbum = bestAlbum;
    }
    public String getStageName() {
        return stageName;
     }

    public String getRealName() {
       return realName;
    }

    public int getAge() {
        return age;
    }

    public String getRanking() {
        return ranking;
    }

    public Song getBestSong() {
        return bestSong;
    } 
    public Album getBestAlbum() {
        return bestAlbum;

    }

    public String toString() {
        String artistInfo = getStageName() + "'s real name is " + getRealName() +
         ". At " + getAge() + " years young, this artist's ranking is " + getRanking();
        return artistInfo;
    }
}