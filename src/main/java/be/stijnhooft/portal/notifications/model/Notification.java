package be.stijnhooft.portal.notifications.model;

import lombok.*;

import java.time.LocalDateTime;

@ToString
@EqualsAndHashCode
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Notification {

    private Long id;

    /**
     * The module that has pushed the notification
     **/
    @NonNull
    private String origin;

    /**
     * Date and that the notification needs to be shown
     **/
    @NonNull
    private LocalDateTime date;

    @NonNull
    private String title;

    @NonNull
    private String message;

    @NonNull
    private NotificationAction action;

    @NonNull
    private PublishStrategy publishStrategy;
}
