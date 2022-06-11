package org.wecancoeit.reviews;

import org.junit.jupiter.api.Test;

import java.util.Collection;


import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReviewsRepositoryTest {


    private ReviewsRepository underTest;


    private Reviews reviewOne = new Reviews(1L,"title","description","imgUrl", "reviewCategory","content");
    private Reviews reviewTwo = new Reviews(2L,"title","description","imgUrl", "reviewCategory","content");


@Test
    public void shouldBeAbleToFindReviewOne(){
    underTest = new ReviewsRepository(reviewOne);
    Reviews foundReview = underTest.findOne(1L);
    assertEquals(reviewOne, foundReview);
}


@Test

public void shouldBeAbleToFindBOthOneAndTwoReview(){
    underTest = new ReviewsRepository(reviewOne, reviewTwo);
    Collection<Reviews> foundReviews = underTest.findAll();
    assertThat(foundReviews).contains(reviewOne,reviewTwo);
}
}
