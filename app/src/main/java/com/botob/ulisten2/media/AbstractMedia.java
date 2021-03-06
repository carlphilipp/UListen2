package com.botob.ulisten2.media;

import com.botob.ulisten2.notification.NotificationData;

/**
 * Created by boris on 12/9/14.
 */
public abstract class AbstractMedia implements Media {

    private NotificationData notificationData;
    private CharSequence title;
    private CharSequence album;
    private CharSequence artist;

    public AbstractMedia(NotificationData notificationData) {
        this.notificationData = notificationData;
        this.title = fetchTitle(notificationData);
        this.album = fetchAlbum(notificationData);
        this.artist = fetchArtist(notificationData);
    }

    public boolean isRelevant() {
        return getTitle() != null && getArtist() != null;
    }

    public String getTitle() {
        return title != null ? title.toString() : null;
    }

    public String getAlbum() {
        return album != null ? album.toString() : null;
    }

    public String getArtist() {
        return artist != null ? artist.toString() : null;
    }

    @Override
    public long getBroadcastTime() {
        return notificationData.postTime;
    }

    @Override
    public String getPackageName() {
        return notificationData.packageName;
    }

    protected abstract CharSequence fetchTitle(NotificationData notificationData);

    protected abstract CharSequence fetchAlbum(NotificationData notificationData);

    protected abstract CharSequence fetchArtist(NotificationData notificationData);
}
