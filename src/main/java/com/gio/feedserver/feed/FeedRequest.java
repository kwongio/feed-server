package com.gio.feedserver.feed;

import lombok.Builder;
import lombok.Getter;

@Getter
public class FeedRequest {

    private String imageId;
    private int uploaderId;
    private String contents;

    @Builder
    public FeedRequest(String imageId, int uploaderId, String contents) {
        this.imageId = imageId;
        this.uploaderId = uploaderId;
        this.contents = contents;
    }
}
