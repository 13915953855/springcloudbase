package com.xusen.springcloudbase.config;

import org.springframework.cloud.bus.event.RemoteApplicationEvent;

public class UserRemoteApplicationEvent extends RemoteApplicationEvent {

    private UserRemoteApplicationEvent() {
    }

    //自定义User
    public UserRemoteApplicationEvent(User user, String originService,
                                      String destinationService) {
        super(user, originService, destinationService);
    }

}
