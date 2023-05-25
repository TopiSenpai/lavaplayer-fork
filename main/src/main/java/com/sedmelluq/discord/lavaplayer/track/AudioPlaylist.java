package com.sedmelluq.discord.lavaplayer.track;

import java.util.List;

/**
 * Playlist of audio tracks
 */
public interface AudioPlaylist extends AudioItem {
  /**
   * @return Name of the playlist
   */
  String getName();

  /**
   * @return Name of the playlist author, may be null.
   */
  default String getAuthor() {
    return null;
  }

  /**
   * @return Type of the playlist (e.g. "playlist", "album"), never null.
   */
  default String getType() {
      return "playlist";
  }

  /**
   * @return Playlist URL, may be null.
   */
  default String getUrl() {
    return null;
  }

  /**
   * @return Playlist artwork URL, may be null.
   */
  default String getArtworkUrl() {
    return null;
  }

  /**
   * @return List of tracks in the playlist
   */
  List<AudioTrack> getTracks();

  /**
   * @return Track that is explicitly selected, may be null. This same instance occurs in the track list.
   */
  AudioTrack getSelectedTrack();

  /**
   * @return True if the playlist was created from search results.
   */
  boolean isSearchResult();
}
