package com.polar.nextcloudservices.API;

import android.graphics.Bitmap;

import androidx.core.graphics.drawable.IconCompat;

import com.polar.nextcloudservices.NotificationService;

import org.json.JSONObject;

import java.io.IOException;

/*
 * Nextcloud abstract API crates possibility to use different libraries for
 * polling for notifications. This is needed to use Nextcloud SSO library
 * since it does not give per-app key.
 * The inheritors of this interface should be passed to NotificationService.
 */
public interface NextcloudAbstractAPI {
    JSONObject getNotifications(NotificationService service);
    void removeNotification(NotificationService service, int id);
    void sendTalkReply(NotificationService service, String chatroom, String message) throws IOException;
    Bitmap getUserAvatar(NotificationService service, String userId) throws Exception;
}