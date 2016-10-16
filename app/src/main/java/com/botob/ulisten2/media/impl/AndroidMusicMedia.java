package com.botob.ulisten2.media.impl;

import com.botob.ulisten2.media.AbstractMedia;
import com.botob.ulisten2.notification.NotificationData;

/**
 * Created by boris on 12/9/14.
 */
public class AndroidMusicMedia extends AbstractMedia {

    public AndroidMusicMedia(NotificationData notificationData) {
        super(notificationData);
    }

    @Override
    protected String fetchTitle(NotificationData notificationData) {
        return notificationData.titleText.toString();
    }

    @Override
    protected String fetchAlbum(NotificationData notificationData) {
        String[] splitValues = notificationData.messageText.toString().split("\n");
        return splitValues[0];
    }

    @Override
    protected String fetchArtist(NotificationData notificationData) {
        String[] splitValues = notificationData.messageText.toString().split("\n");
        return splitValues[1];
    }

}