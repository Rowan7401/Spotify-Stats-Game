import java.util.*;
import java.text.NumberFormat;

public class RowanfyMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Song> songList = new ArrayList<Song>();
        Song myself = new Song("NAV", "Myself", null, "NAV", "3:46", 240_411_405);
        Song turks = new Song("NAV", "Turks", "Gunna_Travis Scott", "Good Intentions", "2:41", 168_105_744);
        Song recap = new Song("NAV", "Recap", "Don Toliver", "Good Intentions", "2:24", 21_046_092);
        Song callMe = new Song("NAV", "Call Me", null, "Perfect Timing", "3:35", 125_428_128);
        Song wantedYou = new Song("NAV", "Wanted You", "Lil Uzi Vert", "RECKLESS", "3:48", 266_840_485);
        Song vicodin = new Song("NAV", "Vicodin", null, "Bad Habits", "2:11", 16_066_915);
        Song tap = new Song("NAV", "Tap", "Meek Mill", "Bad Habits", "2:28", 182_808_841);
        Song dontNeedFriends = new Song("NAV", "Don't Need Friends", "Lil Baby", "Emergency Tsunami", "3:05",
                30_627_856);
        Song doYaDeed = new Song("NAV", "Do Ya Deed", "SahBabii", "Emergency Tsunami", "2:44", 2_884_285);
        Song nasty = new Song("NAV", "Nasty", null, "Emergency Tsunami", "2:37", 4_207_461);
        Song chirp = new Song("NAV", "Chirp", "Quavo", "Brown Boy 2", "2:51", 6_562_384);
        Song imUp = new Song("NAV", "I'm Up", null, "Brown Boy 2", "2:47", 5_263_061);
        Song champion = new Song("NAV", "Champion", "Travis Scott", "RECKLESS", "3:15", 255_105_982);
        Song someWay = new Song("NAV", "Some Way", "The Weeknd", "NAV", "3:00", 237_895_456);
        Song youngWheezy = new Song("NAV", "Young Wheezy", "Gunna", "Emergency Tsunami", "2:31", 17_071_739);
        Song yosemite = new Song("Travis Scott", "Yosemite", "Gunna_Travis Scott", "ASTROWORLD", "2:30", 420_909_660);
        Song xoTourLlif3 = new Song("Lil Uzi Vert", "XO Tour Llif3", null, "Luv Is Rage 2", "3:03", 1_434_859_775);
        Song twentyMin = new Song("Lil Uzi Vert", "20 Min", null, "Luv Is Rage 2", "3:41", 311_439_441);
        Song sickoMode = new Song("Travis Scott", "Sicko Mode", "Drake", "ASTROWORLD", "5:13", 1_370_962_823);
        Song goosebumps = new Song("Travis Scott", "Goosebumps", "Kendrick Lamar", "Birds In The Trap Sing McKnight",
                "4:04", 1_356_857_523);
        Song noIdea = new Song("Don Toliver", "No Idea", null, "Heaven Or Hell", "2:34", 387_407_815);
        Song wasted = new Song("Dont Toliver", "Wasted", null, "Heaven Or Hell", "2:51", 15_024_270);
        Song lemonade = new Song("Don Toliver", "Lemonade", "NAV_Gunna", "B4 The Storm", "3:15", 629_755_848);
        Song ok4Now = new Song("Lil Skies", "Ok 4 Now", null, "Shelby", "2:45", 19_286_863);
        Song takingAWalk = new Song("Trippie Redd", "Taking a walk", null, "LIFE'S A TRIP", "2:02", 283_684_232);
        Song darkNightDummo = new Song("Trippie Redd", "Dark Knight Dummo", "Travis Scott", "LIFE'S A TRIP", "4:16",
                252_725_921);
        Song emotions = new Song("Iann Dior", "emotions", null, "nothings ever good enough", "2:11", 207_430_701);
        Song eighteen = new Song("Iann Dior", "18", null, "nothings ever good enough", "2:07", 31_823_845);
        Song kamikaze = new Song("Lil Mosey", "Kamikaze", null, "Northsbest", "2:19", 203_282_208);
        Song lilBoat = new Song("88Glam", "Lil Boat", null, "88GLAM2", "3:01", 89_241_496);
        Song itsAFlex = new Song("88Glam", "It's A Flex", "NAV", "88GLAM2", "3:19", 19_326_641);
        Song vintage = new Song("NIKI", "Vintage", null, "Zephyr", "2:57", 35_097_624);
        Song i = new Song("Lil Skies", "I", null, "Shelby", "3:02", 274_739_996);
        Song dancingWithTheDevil = new Song("NIKI", "Dancing With The Devil", null, "Zephyr", "2:42", 12_943_515);
        Song yourMan = new Song("Joji", "Your Man", null, "Nectar", "2:44", 59_117_171);
        Song sevenSevenSeven = new Song("Joji", "777", null, "Nectar", "3:02", 21_298_206);
        Song hundredDegrees = new Song("Rich Brian", "100 Degrees", null, "The Sailor", "2:46", 75_063_203);
        Song driveSafe = new Song("Rich Brian", "Drive Safe", null, "The Sailor", "4:00", 38_331_796);
        Song nowadays = new Song("Lil Skies", "Nowadays", "Landon Cube", "Life of a Dark Rose", "3:24", 400_306_137);
        Song mood = new Song("Iann Dior", "Mood", "24kGoldn", null, "2:21", 887_285_716);
        Song blueberryFaygo = new Song("Lil Mosey", "BlueBerry Faygo", null, "Certified Hitmaker", "2:43", 776_076_334);
        Song lowkey = new Song("NIKI", "lowkey", null, "wanna take this downtown?", "2:51", 134_543_002);
        Song slowDancingInTheDark = new Song("Joji", "SLOW DANCING IN THE DARK", null, "BALLADS 1", "3:29",
                574_456_874);
        Song gospel = new Song("Rich Brian", "GOSPEL", "XXXTENTACION_Keith Ape", null, "2:53", 154_498_249);

        songList.add(myself);
        songList.add(turks);
        songList.add(recap);
        songList.add(callMe);
        songList.add(wantedYou);
        songList.add(vicodin);
        songList.add(tap);
        songList.add(dontNeedFriends);
        songList.add(doYaDeed);
        songList.add(nasty);
        songList.add(chirp);
        songList.add(imUp);
        songList.add(champion);
        songList.add(someWay);
        songList.add(youngWheezy);
        songList.add(yosemite);
        songList.add(xoTourLlif3);
        songList.add(twentyMin);
        songList.add(sickoMode);
        songList.add(goosebumps);
        songList.add(noIdea);
        songList.add(wasted);
        songList.add(lemonade);
        songList.add(ok4Now);
        songList.add(i);
        songList.add(takingAWalk);
        songList.add(darkNightDummo);
        songList.add(emotions);
        songList.add(eighteen);
        songList.add(kamikaze);
        songList.add(lilBoat);
        songList.add(itsAFlex);
        songList.add(vintage);
        songList.add(dancingWithTheDevil);
        songList.add(yourMan);
        songList.add(sevenSevenSeven);
        songList.add(hundredDegrees);
        songList.add(driveSafe);
        songList.add(nowadays);
        songList.add(mood);
        songList.add(blueberryFaygo);
        songList.add(lowkey);
        songList.add(slowDancingInTheDark);
        songList.add(gospel);

        ArrayList<Album> albumList = new ArrayList<Album>();
        Album goodIntentions = new Album("Good Intentions", 18, turks, recap, "05/08/2020");
        Album reckless = new Album("RECKLESS", 12, wantedYou, wantedYou, "05/18/2018");
        Album NAVa = new Album("NAV", 11, myself, myself, "02/24/2017");
        Album badHabits = new Album("Bad Habits", 24, tap, vicodin, "03/22/2019");
        Album perfectTiming = new Album("Perfect Timing", 15, callMe, callMe, "07/21/2017");
        Album emergencyTsunami = new Album("Emergency Tsunami", 14, dontNeedFriends, doYaDeed, "11/06/2020");
        Album brownBoy2 = new Album("Brown Boy 2", 14, chirp, imUp, "05/08/2020");
        Album luvIsRage2 = new Album("Luv Is Rage 2", 20, xoTourLlif3, twentyMin, "08/25/2017");
        Album astroworld = new Album("ASTROWORLD", 17, sickoMode, yosemite, "08/03/2018");
        Album heavenOrHell = new Album("Heaven Or Hell", 12, noIdea, wasted, "05/13/2020");
        Album shelby = new Album("Shelby", 14, i, ok4Now, "03/01/2019");
        Album lifesATrip = new Album("LIFE'S A TRIP", 14, takingAWalk, darkNightDummo, "08/10/2018");
        Album nothingsEverGoodEnough = new Album("nothings ever good enough", 8, emotions, eighteen, "04/12/2019");
        Album northsbest = new Album("Northsbest", 12, kamikaze, kamikaze, "10/19/2018");
        Album eETwo = new Album("88GLAM2", 14, lilBoat, itsAFlex, "11/16/2018");
        Album zephyr = new Album("Zephyr", 8, vintage, dancingWithTheDevil, "05/23/2018");
        Album nectar = new Album("Nectar", 18, yourMan, sevenSevenSeven, "09/25/2020");
        Album theSailor = new Album("The Sailor", 12, hundredDegrees, driveSafe, "07/26/2019");

        albumList.add(goodIntentions);
        albumList.add(reckless);
        albumList.add(NAVa);
        albumList.add(badHabits);
        albumList.add(perfectTiming);
        albumList.add(emergencyTsunami);
        albumList.add(brownBoy2);
        albumList.add(astroworld);
        albumList.add(heavenOrHell);
        albumList.add(shelby);
        albumList.add(lifesATrip);
        albumList.add(nothingsEverGoodEnough);
        albumList.add(northsbest);
        albumList.add(eETwo);
        albumList.add(zephyr);
        albumList.add(nectar);
        albumList.add(theSailor);

        ArrayList<Artist> artistList = new ArrayList<Artist>();
        Artist NAV = new Artist("NAV", "Navraj Goraya", 31, null, myself, goodIntentions);
        Artist uzi = new Artist("Lil Uzi Vert", "Symere Woods", 26, "153", xoTourLlif3, luvIsRage2);
        Artist travis = new Artist("Travis Scott", "Jacques Berman Webster II", 28, "18", sickoMode, astroworld);
        Artist donToliver = new Artist("Don Toliver", "Caleb Zackery Toliver", 26, "126", lemonade, heavenOrHell);
        Artist lilSkies = new Artist("Lil Skies", "Kimetrius Christopher Foose", 22, null, nowadays, shelby);
        Artist trippie = new Artist("Trippie Redd", "Michael Lamar White II", 21, "172", takingAWalk, lifesATrip);
        Artist iannDior = new Artist("Iann Dior", "Michael Olmo", 21, "74", mood, nothingsEverGoodEnough);
        Artist lilMosey = new Artist("Lil Mosey", "Lathan Moses Stanley Echols", 19, "316", blueberryFaygo, northsbest);
        Artist eEGlam = new Artist("88 Glam", "Derek Wise Bissue_Shakqueel Burthwright", 28, null, lilBoat, eETwo);
        Artist niki = new Artist("NIKI", "Nicole Zefanya", 22, null, lowkey, zephyr);
        Artist joji = new Artist("Joji", "George Miller", 28, "297", slowDancingInTheDark, nectar);
        Artist richBrian = new Artist("Rich Brian", "Brian Imanuel", 21, null, gospel, theSailor);

        artistList.add(NAV);
        artistList.add(uzi);
        artistList.add(travis);
        artistList.add(donToliver);
        artistList.add(lilSkies);
        artistList.add(trippie);
        artistList.add(iannDior);
        artistList.add(lilMosey);
        artistList.add(eEGlam);
        artistList.add(niki);
        artistList.add(joji);
        artistList.add(richBrian);

        String userInput = "";
        int numRight = 0;
        int numWrong = 0;
        int[] scoreArray = { numRight, numWrong };
        System.out.println("What are we doing today? (Song trivia, Create Playlist) ");
        userInput = scan.nextLine();
        System.out.println();

        if (userInput.equalsIgnoreCase("Create Playlist")) {
            System.out.print("Hey, how many songs do you want on this playlist: ");
            int playlistSize = scan.nextInt();
            System.out.println(Arrays.toString(createPlaylist(songList, playlistSize)));
        }
        if (userInput.equalsIgnoreCase("test")) {
            higherOrLower(artistList, userInput, scan, scoreArray);
        }

        if (userInput.equalsIgnoreCase("Song Trivia")) {
            System.out.println("What game mode are we playing?");
            System.out.println("Hot Streak or One Question Repeat");
            userInput = scan.nextLine();
            if (userInput.equalsIgnoreCase("Hot Streak")) {
                while (scoreArray[1] == 0) {
                    System.out.println();
                    Random rand = new Random();
                    int question = rand.nextInt(6);
                    if (question == 0) {
                        guessFeatures(songList, userInput, scan, scoreArray);
                    } else if (question == 1) {
                        albumGuesser(songList, userInput, scan, scoreArray);
                    } else if (question == 2) {
                        lessOrMorePlays(songList, userInput, scan, scoreArray);
                    } else if (question == 3) {
                        topAlbumCharter(albumList, userInput, scan, scoreArray);
                    } else if (question == 4) {
                        higherOrLower(artistList, userInput, scan, scoreArray);
                    } else if (question == 5) {
                        playCountMC(songList, userInput, scan, scoreArray);
                    } else {
                        artistRealName(artistList, userInput, scan, scoreArray);
                    }
                }
                System.out.println();
                System.out.println("Thanks for playing hot streak!");
                System.out.println("Final Score: " + scoreArray[0]);
            }
            if (userInput.equalsIgnoreCase("One Question Repeat")) {
                System.out.println();
                System.out.println("What question would you like to keep repeating?");
                System.out.println("1: Feature Guesser");
                System.out.println("2: Album Guesser");
                System.out.println("3: Less or More Plays");
                System.out.println("4: Artist Real Name");
                System.out.println("5: Top Album Charter");
                System.out.println("6: Higher or Lower");
                System.out.println("7: Number of Plays");
                userInput = scan.nextLine();

                System.out.println();
                if (userInput.equalsIgnoreCase("1")) {
                    while (!userInput.equalsIgnoreCase("quit")) {
                        guessFeatures(songList, userInput, scan, scoreArray);
                        System.out.println();
                        System.out.println("Type \"quit\" to stop playing or any hit enter to continue");
                        userInput = scan.nextLine();

                    }
                    System.out.println();
                    System.out.println("Thanks for playing!");
                    System.out.println("Final Score: " + scoreArray[0] + "/" + (scoreArray[1] + scoreArray[0]));
                } else if (userInput.equalsIgnoreCase("2")) {
                    while (!userInput.equalsIgnoreCase("quit")) {
                        albumGuesser(songList, userInput, scan, scoreArray);
                        System.out.println();
                        System.out.println("Type \"quit\" to stop playing or any hit enter to continue");
                        userInput = scan.nextLine();

                    }
                    System.out.println();
                    System.out.println("Thanks for playing!");
                    System.out.println("Final Score: " + scoreArray[0] + "/" + (scoreArray[1] + scoreArray[0]));
                } else if (userInput.equalsIgnoreCase("3")) {
                    while (!userInput.equalsIgnoreCase("quit")) {
                        lessOrMorePlays(songList, userInput, scan, scoreArray);
                        System.out.println();
                        System.out.println("Type \"quit\" to stop playing or any hit enter to continue");
                        userInput = scan.nextLine();

                    }
                    System.out.println();
                    System.out.println("Thanks for playing!");
                    System.out.println("Final Score: " + scoreArray[0] + "/" + (scoreArray[1] + scoreArray[0]));
                } else if (userInput.equalsIgnoreCase("4")) {
                    while (!userInput.equalsIgnoreCase("quit")) {
                        artistRealName(artistList, userInput, scan, scoreArray);
                        System.out.println();
                        System.out.println("Type \"quit\" to stop playing or any hit enter to continue");
                        userInput = scan.nextLine();

                    }
                    System.out.println();
                    System.out.println("Thanks for playing!");
                    System.out.println("Final Score: " + scoreArray[0] + "/" + (scoreArray[1] + scoreArray[0]));
                } else if (userInput.equalsIgnoreCase("5")) {
                    while (!userInput.equalsIgnoreCase("quit")) {
                        topAlbumCharter(albumList, userInput, scan, scoreArray);
                        System.out.println();
                        System.out.println("Type \"quit\" to stop playing or any hit enter to continue");
                        userInput = scan.nextLine();

                    }
                    System.out.println();
                    System.out.println("Thanks for playing!");
                    System.out.println("Final Score: " + scoreArray[0] + "/" + (scoreArray[1] + scoreArray[0]));
                } else if (userInput.equalsIgnoreCase("6")) {
                    while (!userInput.equalsIgnoreCase("quit")) {
                        higherOrLower(artistList, userInput, scan, scoreArray);
                        System.out.println();
                        System.out.println("Type \"quit\" to stop playing or any hit enter to continue");
                        userInput = scan.nextLine();
                        

                    }
                    System.out.println();
                    System.out.println("Thanks for playing!");
                    System.out.println("Final Score: " + scoreArray[0] + "/" + (scoreArray[1] + scoreArray[0]));
                } else {
                    while (!userInput.equalsIgnoreCase("quit")) {
                        playCountMC(songList, userInput, scan, scoreArray);
                        System.out.println();
                        System.out.println("Type \"quit\" to stop playing or any hit enter to continue");
                        userInput = scan.nextLine();

                    }
                    System.out.println();
                    System.out.println("Thanks for playing!");
                    System.out.println("Final Score: " + scoreArray[0] + "/" + (scoreArray[1] + scoreArray[0]));
                }

            }

        }

    }

    public static String[] createPlaylist(ArrayList<Song> songList, int playlistSize) {
        String[] playlist = new String[playlistSize];
        ArrayList<Song> songPicker = new ArrayList<Song>();
        songPicker = songList;
        Random rand = new Random();
        int randNum;

        for (int i = 0; i < playlistSize; i++) {
            randNum = rand.nextInt(songPicker.size());
            playlist[i] = songPicker.get(randNum).getSongName();
            songPicker.remove(randNum);
        }

        return playlist;
    }

    public static int[] guessFeatures(ArrayList<Song> songList, String userInput, Scanner scan, int[] scoreArray) {

        Random rand = new Random();
        int randNum = rand.nextInt(songList.size());
        System.out.println();
        System.out.println("Who is featured on the song " + songList.get(randNum).getSongName() + " by "
                + songList.get(randNum).getSongOwner() + " ?");
        System.out.println("If there is no feature, type \"no feature\"");
        System.out.println("For multiple features, type artist names separated by commas and a space");

        userInput = scan.nextLine();

        if (songList.get(randNum).getFeatures() == null) {
            if (userInput.equalsIgnoreCase("no feature")) {
                System.out.println("That is correct!");
                System.out.println();
                scoreArray[0]++;
            } else {
                System.out.println("That's wrong bro...");
                System.out.println();
                scoreArray[1]++;
            }
        }

        else if (songList.get(randNum).getFeatures().contains("_")) {
            String[] features = new String[2];
            features = songList.get(randNum).getFeatures().split("_");

            if (userInput.equalsIgnoreCase(features[0] + ", " + features[1])
                    || userInput.equalsIgnoreCase(features[1] + ", " + features[0])) {
                System.out.println("That is correct!");
                System.out.println();
                scoreArray[0]++;
            } else {
                System.out.println("That's wrong bro...");
                System.out.println();
                scoreArray[1]++;
            }
        }

        else {
            if (userInput.equalsIgnoreCase(songList.get(randNum).getFeatures())) {
                System.out.println("That is correct!");
                System.out.println();
                scoreArray[0]++;
            } else {
                System.out.println("That's wrong bro...");
                System.out.println();
                scoreArray[1]++;
            }
        }

        return scoreArray;
    }

    public static int[] albumGuesser(ArrayList<Song> songList, String userInput, Scanner scan, int[] scoreArray) {

        Random rand = new Random();
        int randNum = rand.nextInt(songList.size());

        System.out.println("What album does the song " + songList.get(randNum).getSongName() + " appear on? ");
        System.out.println("(Type \"single\" if song has no album)");
        userInput = scan.nextLine();

        if (songList.get(randNum).getAlbumAppearsOn() == null) {
            if (userInput.equalsIgnoreCase("single")) {
                System.out.println("That is correct!");
                scoreArray[0]++;
                System.out.println();
            } else {
                System.out.println("That's wrong bro...");
                scoreArray[1]++;
                System.out.println();
            }
        }

        else {
            if (userInput.equalsIgnoreCase(songList.get(randNum).getAlbumAppearsOn())) {
                System.out.println("That is correct!");
                scoreArray[0]++;
                System.out.println();
            } else {
                System.out.println("That's wrong bro...");
                System.out.println();
                scoreArray[1]++;
            }
        }

        return scoreArray;
    }

    public static int[] lessOrMorePlays(ArrayList<Song> songList, String userInput, Scanner scan, int[] scoreArray) {

        Random rand = new Random();
        int randNum = rand.nextInt(songList.size());
        int randNum2 = rand.nextInt(songList.size());
        System.out.println();
        System.out.println("What song has more plays?");
        System.out.println(songList.get(randNum).getSongName() + " or " + songList.get(randNum2).getSongName());
        System.out.println();
        userInput = scan.nextLine();

        String plays1 = NumberFormat.getNumberInstance(Locale.US).format(songList.get(randNum).getNumPlays());
        String plays2 = NumberFormat.getNumberInstance(Locale.US).format(songList.get(randNum2).getNumPlays());

        if (songList.get(randNum).getNumPlays() > songList.get(randNum2).getNumPlays()) {
            if (userInput.equalsIgnoreCase(songList.get(randNum).getSongName())) {
                System.out.println("That is correct!");
                System.out.println(plays1 + " vs " + plays2);
                scoreArray[0]++;
            } else {
                System.out.println("That's wrong bro...");
                System.out.println(plays1 + " vs " + plays2);
                scoreArray[1]++;
            }

        } else {
            if (userInput.equalsIgnoreCase(songList.get(randNum2).getSongName())) {
                System.out.println("That is correct!");
                System.out.println(plays2 + " vs " + plays1);
                scoreArray[0]++;
            } else {
                System.out.println("That's wrong bro...");
                System.out.println(plays2 + " vs " + plays1);
                scoreArray[1]++;
            }
        }
        return scoreArray;
    }

    public static int[] artistRealName(ArrayList<Artist> artistList, String userInput, Scanner scan, int[] scoreArray) {
        Random rand = new Random();
        int randNum1 = rand.nextInt(artistList.size());
        int randNum2 = rand.nextInt(artistList.size());
        int randNum3 = rand.nextInt(artistList.size());
        int randNum4 = rand.nextInt(artistList.size());

        boolean first = false;
        boolean second = false;
        boolean third = false;
        while (first != true && second != true && third != true) {
            if (randNum1 != randNum2 && randNum1 != randNum3 && randNum1 != randNum4) {
                first = true;
            } else {
                randNum1 = rand.nextInt(artistList.size());
            }
            if (randNum2 != randNum3 && randNum2 != randNum4) {
                second = true;
            } else {
                randNum2 = rand.nextInt(artistList.size());
            }
            if (randNum3 != randNum4) {
                third = true;
            } else {
                randNum3 = rand.nextInt(artistList.size());
            }
        }

        int[] numArray = { randNum1, randNum2, randNum3, randNum4 };
        int artistChosenIndex = rand.nextInt(3);
        String correctLetter = "";
        if (artistChosenIndex == 0) {
            correctLetter += "A";
        } else if (artistChosenIndex == 1) {
            correctLetter += "B";
        } else if (artistChosenIndex == 2) {
            correctLetter += "C";
        } else {
            correctLetter += "D";
        }

        System.out.println();
        System.out.println("What is " + artistList.get(numArray[artistChosenIndex]).getStageName() + "'s real name?");
        System.out.println("A: " + artistList.get(numArray[0]).getRealName());
        System.out.println("B: " + artistList.get(numArray[1]).getRealName());
        System.out.println("C: " + artistList.get(numArray[2]).getRealName());
        System.out.println("D: " + artistList.get(numArray[3]).getRealName());
        System.out.println();
        userInput = scan.nextLine();

        if (userInput.equalsIgnoreCase(correctLetter)) {
            System.out.println("That is correct!");
            scoreArray[0]++;
        } else {
            System.out.println("That's wrong bro...");
            scoreArray[1]++;
        }

        return scoreArray;

    }

    public static int[] topAlbumCharter(ArrayList<Album> albumList, String userInput, Scanner scan, int[] scoreArray) {

        Random rand = new Random();
        int randNum = rand.nextInt(albumList.size());

        System.out.println("What is " + albumList.get(randNum).getAlbumName() + "'s most played song?");
        userInput = scan.nextLine();
        System.out.println();

        if (albumList.get(randNum).getMostPlayedSong().getSongName().equalsIgnoreCase(userInput)) {
            System.out.println("That is correct!");
            scoreArray[0]++;
        } else {
            System.out.println("That's wrong bro...");
            System.out.println("It is actually " + albumList.get(randNum).getMostPlayedSong().getSongName());
            scoreArray[1]++;
        }
        return scoreArray;
    }

    public static int[] higherOrLower(ArrayList<Artist> artistList, String userInput, Scanner scan, int[] scoreArray) {
        Random rand = new Random();
        int randNum = rand.nextInt(artistList.size());
        int roll2 = rand.nextInt(2);
        int questionCoin = rand.nextInt(2);

        System.out.println("Higher or lower...");
        if (questionCoin == 0) {
            if (roll2 == 0) {
                int supposedAge = artistList.get(randNum).getAge() + (rand.nextInt(3) + 1);
                System.out.println(artistList.get(randNum).getStageName() + "'s age of " + supposedAge);
                userInput = scan.nextLine();
                System.out.println();

                if (userInput.equalsIgnoreCase("higher")) {
                    System.out.println("That's wrong bro...");
                    scoreArray[1]++;
                    System.out.println(artistList.get(randNum).getStageName() + "'s real age is "
                            + artistList.get(randNum).getAge());
                } else {
                    System.out.println("That is correct!");
                    scoreArray[0]++;
                    System.out.println(artistList.get(randNum).getStageName() + "'s real age is "
                            + artistList.get(randNum).getAge());
                }
            } else {
                int supposedAge = artistList.get(randNum).getAge() - (rand.nextInt(3) + 1);
                System.out.println(artistList.get(randNum).getStageName() + "'s age of " + supposedAge);
                userInput = scan.nextLine();
                System.out.println();

                if (userInput.equalsIgnoreCase("lower")) {
                    System.out.println("That's wrong bro...");
                    scoreArray[1]++;
                    System.out.println(artistList.get(randNum).getStageName() + "'s real age is "
                            + artistList.get(randNum).getAge());
                } else {
                    System.out.println("That is correct!");
                    scoreArray[0]++;
                    System.out.println(artistList.get(randNum).getStageName() + "'s real age is "
                            + artistList.get(randNum).getAge());
                }
            }
        } else {
            int artistRankInt;
            int supposedRank;
            if (artistList.get(randNum).getRanking() == null) {
                artistRankInt = 501;
                supposedRank = (rand.nextInt(500) + 1);
            }
            else {
             artistRankInt = Integer.parseInt(artistList.get(randNum).getRanking());
             supposedRank = (rand.nextInt(500) + 1);
            }
            while (artistRankInt == supposedRank) {
                supposedRank = (rand.nextInt(500) + 1);
            }
            if (artistRankInt < supposedRank) {
                System.out.println(artistList.get(randNum).getStageName() + "'s worldwide ranking of " + supposedRank);
                userInput = scan.nextLine();
                System.out.println();

                if (userInput.equalsIgnoreCase("higher")) {
                    System.out.println("That's wrong bro...");
                    scoreArray[1]++;
                    System.out.println(
                            artistList.get(randNum).getStageName() + "'s real worldwide ranking is " + artistRankInt);
                } else {
                    System.out.println("That is correct!");
                    scoreArray[0]++;
                    System.out.println(
                            artistList.get(randNum).getStageName() + "'s real worldwide ranking is " + artistRankInt);
                }
            } else {
                System.out.println(artistList.get(randNum).getStageName() + "'s worldwide ranking of " + supposedRank);
                userInput = scan.nextLine();
                System.out.println();

                if (userInput.equalsIgnoreCase("lower")) {
                    System.out.println("That's wrong bro...");
                    scoreArray[1]++;
                    System.out.println(
                            artistList.get(randNum).getStageName() + "'s real worldwide randking is " + artistRankInt);
                } else {
                    System.out.println("That is correct!");
                    scoreArray[0]++;
                    System.out.println(
                            artistList.get(randNum).getStageName() + "'s real worldwide ranking is " + artistRankInt);
                }
            }
        }
        return scoreArray;
    }

    public static int[] playCountMC(ArrayList<Song> songList, String userInput, Scanner scan, int[] scoreArray) {

        Random rand = new Random();
        int randNum1 = rand.nextInt(songList.size());
        int randNum2 = rand.nextInt(songList.size());
        int randNum3 = rand.nextInt(songList.size());
        int randNum4 = rand.nextInt(songList.size());

        boolean first = false;
        boolean second = false;
        boolean third = false;
        while (first != true && second != true && third != true) {
            if (randNum1 != randNum2 && randNum1 != randNum3 && randNum1 != randNum4) {
                first = true;
            } else {
                randNum1 = rand.nextInt(songList.size());
            }
            if (randNum2 != randNum3 && randNum2 != randNum4) {
                second = true;
            } else {
                randNum2 = rand.nextInt(songList.size());
            }
            if (randNum3 != randNum4) {
                third = true;
            } else {
                randNum3 = rand.nextInt(songList.size());
            }
        }

        int[] numArray = { randNum1, randNum2, randNum3, randNum4 };
        int songChosenIndex = rand.nextInt(3);
        String correctLetter = "";
        if (songChosenIndex == 0) {
            correctLetter += "A";
        } else if (songChosenIndex == 1) {
            correctLetter += "B";
        } else if (songChosenIndex == 2) {
            correctLetter += "C";
        } else {
            correctLetter += "D";
        }

        System.out.println();
        String answerA = NumberFormat.getNumberInstance(Locale.US).format(songList.get(numArray[0]).getNumPlays());
        String answerB = NumberFormat.getNumberInstance(Locale.US).format(songList.get(numArray[1]).getNumPlays());
        String answerC = NumberFormat.getNumberInstance(Locale.US).format(songList.get(numArray[2]).getNumPlays());
        String answerD = NumberFormat.getNumberInstance(Locale.US).format(songList.get(numArray[3]).getNumPlays());
        System.out.println("How many plays does " + songList.get(numArray[songChosenIndex]).getSongName() + " have?");
        System.out.println("A: " + answerA);
        System.out.println("B: " + answerB);
        System.out.println("C: " + answerC);
        System.out.println("D: " + answerD);
        System.out.println();
        userInput = scan.nextLine();

        String correctAnswer = NumberFormat.getNumberInstance(Locale.US)
                .format(songList.get(numArray[songChosenIndex]).getNumPlays());

        if (userInput.equalsIgnoreCase(correctLetter)) {
            System.out.println("That is correct!");
            scoreArray[0]++;
        } else {
            System.out.println("That's wrong bro...");
            System.out.println("It's actually beem played " + correctAnswer + " times.");
            scoreArray[1]++;
        }

        return scoreArray;
    }

}