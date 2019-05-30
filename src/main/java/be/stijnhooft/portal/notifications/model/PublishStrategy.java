package be.stijnhooft.portal.notifications.model;

public enum PublishStrategy {
    /**
     * Publish the notification as soon as possible.
     * Do use this only for very urgent and important notifications.
     */
    PUBLISH_IMMEDIATELY,
    /**
     * When using this strategy, we try to to bundle several notifications as much as possible.
     * If another notification is planned within 24 hours, both notifications will trigger simultaneously,
     * disturbing the user as less as possible.
     */
    PUBLISH_WITHIN_24_HOURS,
    /**
     * Use this strategy if it's very important to publish a notification at an exact date and time.
     */
    PUBLISH_AT_SPECIFIC_DATE_TIME
}
