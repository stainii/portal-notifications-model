# portal-notifications-model
[![Build Status](https://server.stijnhooft.be/jenkins/buildStatus/icon?job=portal-notifications-model/master)](https://server.stijnhooft.be/jenkins/job/portal-notifications-model/job/master/)

Model for the notifications app and the *notification-plugins*.

Notification-plugins are apps that listen to notifications published by 
the notifications app, and send these notifications to the user.

### Release
#### Maven release
To release a module, this project makes use of the JGitflow plugin.
**Do use the Maven profile `-Pproduction`**.

More information can be found [here](https://gist.github.com/lemiorhan/97b4f827c08aed58a9d8).

At the moment, releases are made on a local machine. No Jenkins job has been made (yet).
