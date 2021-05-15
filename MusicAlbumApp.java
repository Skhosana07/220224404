

 package com.gmail.linahrose06;
 import com.gmail.linahrose06;
 
//MusicAlbumApp.java
public class MusicAlbumApp
{
	
	public static void main( String[] args)
	{
		MusicAlbum Album1 = new MusicAlbum();
		Album1.setNumberOfTracks(1);
		Album1.setAlbumTitle("Pick Friday");
		Album1.setArtistName("Nicki Minaj");
		Album1.setTrackName("Starships");
		Album1.setTrackLength(3);
	
		MusicAlbum Album2 = new MusicAlbum();
		Album2.setNumberOfTracks(1);
		Album2.setAlbumTitle("The One");
		Album2.setArtistName("Khalid");
		Album2.setTrackName("Better");
		Album2.setTrackLength(6);
		
		MusicAlbum Album3 = new MusicAlbum();
		Album3.setNumberOfTracks(1);
		Album3.setAlbumTitle("Dangerous Love");
		Album3.setArtistName("Beyonce");
		Album3.setTrackName("Savage");
		Album3.setTrackLength(6);
		
		MusicAlbum Album4 = new MusicAlbum();
		Album4.setNumberOfTracks(1);
		Album4.setAlbumTitle("Parties");
		Album4.setArtistName("Cori");
		Album4.setTrackName("No More Parties");
		Album4.setTrackLength(2);
	
		
		MusicAlbum Album5 = new MusicAlbum();
		Album5.Album1.setNumberOfTracks(1);
		Album5.setNumberOfTracks(1);
		Album5.settitleOfAlbum("We Up");
		Album5.setnameOfArtists("Halsey");
		Album5.setTrackName("Bad at love");
		Album5.setTrackLength(4);
		
		Album1.System.out.println( "ALBUM 1\n" + "Album Title: "  + getTitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getNameOfArtists() + "TrackName: " + getNamesOfTracks() + "\nNumber Of Minutes: " + getNumberOfMiutes() + "\n\n\n\n");
		Album2.System.out.println( "ALBUM 2\n" + "Album Title: "  + getTitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getNameOfArtists() + "TrackName: " + getNamesOfTracks() + "\nNumber Of Minutes: " + getNumberOfMiutes() + "\n\n\n\n" );
		Album3.System.out.println( "ALBUM 3\n" + "Album Title: "  + getTitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getNameOfArtists() + "TrackName: " + getNamesOfTracks() + "\nNumber Of Minutes: " + getNumberOfMiutes() + "\n\n\n\n");
	    Album4.System.out.println( "ALBUM 4\n" + "Album Title: "  + getTitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getNameOfArtists() + "TrackName: " + getNamesOfTracks() + "\nNumber Of Minutes: " + getNumberOfMiutes() + "\n\n\n\n");
        Album5.System.out.println( "ALBUM 5\n" + "Album Title: "  + getTitleOfAlbum() + "\nNumber of Tracks: " + getNumberOfTracks() + "\nArtist: " + getNameOfArtists() + "TrackName: " + getNamesOfTracks() + "\nNumber Of Minutes: " + getNumberOfMiutes() + "\n\n\n\n");
        
		System.exit(0);
	}
}