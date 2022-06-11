package org.wecancoeit.reviews;

import java.awt.*;

public class Reviews {

    private Long id;
    private String title;
    private String description;
    private String imgUrl;
    private String reviewCategory;
    private String content;

    public Reviews(Long id, String title, String description, String imgUrl, String reviewCategory, String content) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imgUrl = imgUrl;
        this.reviewCategory = reviewCategory;
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getReviewCategory() {
        return reviewCategory;
    }

    public String getContent() {
        return content;
    }
}
