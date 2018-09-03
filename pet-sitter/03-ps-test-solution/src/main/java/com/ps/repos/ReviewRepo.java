package com.ps.repos;

import java.util.Set;

import com.ps.ents.Request;
import com.ps.ents.Response;
import com.ps.ents.Review;
import com.ps.ents.User;

public interface ReviewRepo extends AbstractRepo<Review> {

    Set<Review> findAllForUser(User user);

    Set<Review> findAllForRequest(Request request);

    Set<Review> findAllForResponse(Response response);

}