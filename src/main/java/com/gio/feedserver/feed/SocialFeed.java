package com.gio.feedserver.feed;

import jakarta.persistence.*;
import lombok.Getter;

import java.time.ZonedDateTime;

@Getter
@Entity
@Table
public class SocialFeed {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int feedId;
    private String imageId;
    private int uploaderId;
    @Temporal(TemporalType.TIMESTAMP)
    private ZonedDateTime uploadDatetime;
    private String contents;

    @PrePersist
    protected void onCreate() {
        uploadDatetime = ZonedDateTime.now();
    }

    public SocialFeed() {
    }

    public SocialFeed(int feedId, String imageId, int uploaderId, ZonedDateTime uploadDatetime, String contents) {
        this.feedId = feedId;
        this.imageId = imageId;
        this.uploaderId = uploaderId;
        this.uploadDatetime = uploadDatetime;
        this.contents = contents;
    }

    public SocialFeed(String imageId, int uploaderId, String contents) {
        this.imageId = imageId;
        this.uploaderId = uploaderId;
        this.contents = contents;
    }

    public SocialFeed(FeedRequest request) {
        this(request.getImageId(), request.getUploaderId(), request.getContents());
    }

}
