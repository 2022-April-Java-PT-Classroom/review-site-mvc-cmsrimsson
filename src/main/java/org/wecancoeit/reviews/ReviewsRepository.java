package org.wecancoeit.reviews;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewsRepository {


    Map<Long, Reviews> reviewLists = new HashMap<>();


    public ReviewsRepository(){
        Reviews book = new Reviews(1l, "The Tempest", " Romantic Drama ","images/Tempest.jpg", "Reader Favorite","Tragedy and Love" );
        Reviews music = new Reviews(2l,"Tare Namm", "Sentimental song", "images/tarenamm.jpg", "Old is Gold","90's Hit Movies");
        Reviews movie = new Reviews(3l,"Titanic", "Epic, Romantic, Tragedy and Disaster", "images/titanic.jpg", " Old and famous Movie","Tragedy and History");

        reviewLists.put(book.getId(), book);
        reviewLists.put(music.getId(), music);
        reviewLists.put(movie.getId(), movie);

    }

    public ReviewsRepository(Reviews...reviewsToAdd) {
        for(Reviews review: reviewsToAdd){
            reviewLists.put(review.getId(), review);
        }
    }

    public Reviews findOne(long id) {
        return reviewLists.get(id);
    }


    public Collection<Reviews> findAll() {
        return reviewLists.values();
    }

}
