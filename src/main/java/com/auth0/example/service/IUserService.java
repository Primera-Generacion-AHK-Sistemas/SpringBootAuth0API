package com.auth0.example.service;

import com.auth0.example.persistence.model.Auth0User;
import com.auth0.example.persistence.model.User;

public interface IUserService {
    Boolean registerNewUserAccount(Auth0User auth0User);

    Auth0User getAuth0UserFromAccessToken(String accessToken);

    User getUserFromAuth0Id(String auth0Id);
}
