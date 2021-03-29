package com.sncode.imageupload.datastore;

import com.sncode.imageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    public static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(),"zenet", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "sarina", null));
    }

    public List<UserProfile> getUserProfiles () {
        return  USER_PROFILES;
    }
}
