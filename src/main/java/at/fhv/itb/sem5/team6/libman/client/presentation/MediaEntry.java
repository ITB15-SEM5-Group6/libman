package at.fhv.itb.sem5.team6.libman.client.presentation;

import at.fhv.itb.sem5.team6.libman.shared.DTOs.immutable.ImmutableMedia;

/**
 * Created by Christina on 06.11.2017.
 */
public class MediaEntry {
    private String title;
    private String mediaType;
    private String available;
    private ImmutableMedia immutableMedia;

    public MediaEntry(String title, String mediaType, String available, ImmutableMedia immutableMedia) {
        this.title = title;
        this.mediaType = mediaType;
        this.available = available;
        this.immutableMedia = immutableMedia;
    }
}
