package com.lasias.review_service.dtos;

import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
@Builder
@Getter
public class ShowReviewResponseDTO {

    private final String comment;
    private final int rating;
    private final String username;
    private final LocalDateTime createdAt;
    private final Long reviewId;
    private final String roomTypeName;

    public ShowReviewResponseDTO(String comment, int rating, String username, LocalDateTime createdAt, Long reviewId, String roomTypeName) {
        this.comment = comment;
        this.rating = rating;
        this.username = username;
        this.createdAt = createdAt;
        this.reviewId = reviewId;
        this.roomTypeName = roomTypeName;
    }
}
