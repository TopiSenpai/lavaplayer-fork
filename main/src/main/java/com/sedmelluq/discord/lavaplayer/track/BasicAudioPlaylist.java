package com.sedmelluq.discord.lavaplayer.track;

import java.util.List;

/**
 * The basic implementation of AudioPlaylist
 */
public class BasicAudioPlaylist implements AudioPlaylist {
  private final String name;
  private final String author;
  private final String type;
  private final String uri;
  private final String artworkUrl;
  private final List<AudioTrack> tracks;
  private final AudioTrack selectedTrack;
  private final boolean isSearchResult;

  /**
   * @param name Name of the playlist
   * @param tracks List of tracks in the playlist
   * @param selectedTrack Track that is explicitly selected
   * @param isSearchResult True if the playlist was created from search results
   */
  public BasicAudioPlaylist(String name, List<AudioTrack> tracks, AudioTrack selectedTrack, boolean isSearchResult) {
    this(name, null, "playlist", null, null, tracks, selectedTrack, isSearchResult);
  }

  public BasicAudioPlaylist(String name, String author, String type, String uri, String artworkUrl, List<AudioTrack> tracks, AudioTrack selectedTrack, boolean isSearchResult) {
    this.name = name;
    this.author = author;
    this.type = type;
    this.uri = uri;
    this.artworkUrl = artworkUrl;
    this.tracks = tracks;
    this.selectedTrack = selectedTrack;
    this.isSearchResult = isSearchResult;
  }

  @Override
  public String getName() {
    return name;
  }

  @Override
  public String getAuthor() {
    return author;
  }

  @Override
  public String getType() {
    return type;
  }

  @Override
  public String getUrl() {
    return uri;
  }

  @Override
  public String getArtworkUrl() {
      return artworkUrl;
  }

  @Override
  public List<AudioTrack> getTracks() {
    return tracks;
  }

  @Override
  public AudioTrack getSelectedTrack() {
    return selectedTrack;
  }

  @Override
  public boolean isSearchResult() {
    return isSearchResult;
  }
}
