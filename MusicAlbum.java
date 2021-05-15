

package com.gmail.linahrose06;

//MusicAlbum class Source Code
public class MusicAlbum
{
	
	
//private members of the class
private String albumTitle;
private int noOfTracks;
private String artist;
private String namesOfTracks;
private double trackLength;


//set methods
public void setNumberOfTracks( int trackNumber)
{
     noOfTracks = trackNumber;
}


public void setAlbumTitle( String AlbumName)
{
     titleOfAlbum = AlbumName;
}


public void setArtistName( String artistName)
{
      artist = artistName;
}


public void setTrackName( String trackName)
{
      namesOfTracks = trackName;
}


public void setTrackLength( double trackTime)
{   
      trackLength = trackTime;
}

//get methods
public int getNumberOfTracks()
{
   return noOfTracks;
}


public String getTitleOfAlbum()
{
    return titleOfAlbum;
}


public String getNameOfArtists()
{
     return artist;
}


public String getNamesOfTracks()
{
     return namesOfTracks;
}


public double getNumberOfMinutes()
{   
     return trackLength;
}

}