package be.stijnhooft.portal.notifications.model;

import lombok.*;

@ToString @EqualsAndHashCode
@Getter
@AllArgsConstructor @NoArgsConstructor
public class NotificationAction {

  /** url that needs to be opened when the user taps the notification **/
  private String url;

  /** the text that should appear on the action button of the notification **/
  private String text;

}
