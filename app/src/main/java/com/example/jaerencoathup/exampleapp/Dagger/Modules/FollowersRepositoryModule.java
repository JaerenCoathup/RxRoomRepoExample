package com.example.jaerencoathup.exampleapp.Dagger.Modules;

import dagger.Module;
import dagger.Provides;

/**
 * Created by jaerencoathup on 03/11/2017.
 */

@Module
public class FollowersRepositoryModule {
    @Provides
    public IFollowerRepository provideUserRepository(FollowerRepository followerRepository) {
        return followerRepository;
    }
}
