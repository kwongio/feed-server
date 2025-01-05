package com.gio.feedserver.feed;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

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
