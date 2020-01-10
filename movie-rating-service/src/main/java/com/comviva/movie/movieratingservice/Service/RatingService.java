package com.comviva.movie.movieratingservice.Service;

import com.comviva.movie.movieratingservice.model.RatingModel;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class RatingService {
    private List<RatingModel> ratingModels = Arrays.asList(
            new RatingModel("1", "5"),
            new RatingModel("2", "6")
    );

    public RatingModel getRatingById(String movieId) {
        for (RatingModel ratingModel : ratingModels) {
            if (ratingModel.getMovieId().equals(movieId)) {
                return ratingModel;
            }

        }
        return null;
    }

    public List<RatingModel> getAllRatedMovie(){
        return ratingModels;
    }
}
