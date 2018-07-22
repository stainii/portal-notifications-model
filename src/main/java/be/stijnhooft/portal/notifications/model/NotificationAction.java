package be.stijnhooft.portal.notifications.model;

import lombok.*;

@ToString
@EqualsAndHashCode
@Getter
@NoArgsConstructor @AllArgsConstructor
public class NotificationAction {


    /**
     * Url that needs to be opened when the user taps the notification.
     * This is a url that point to the notification app. The app will mark the notification as read,
     * and redirect the user to the actual internal url.
     **/
    @NonNull
    private String url;

    /**
     * the text that should appear on the action button of the notification
     **/
    @NonNull
    private String text;

    /**
     * url where the user actually needs to be forwarded to, when he/she taps on the notification.
     **/
    private String internalUrl;

}
