package com.example.ltdung.jetpackcompose.data

import android.content.Context
import com.example.ltdung.jetpackcompose.data.interests.InterestRepository
import com.example.ltdung.jetpackcompose.data.interests.impl.FakeInterestsRepository
import com.example.ltdung.jetpackcompose.data.posts.PostsRepository
import com.example.ltdung.jetpackcompose.data.posts.impl.FakePostsRepository

/**
 * Dependency injection container at the application level.
 */
interface AppContainer {
    val postsRepository: PostsRepository
    val interestsRepository: InterestRepository
}

class AppContainerImpl(private val applicationContext: Context) : AppContainer {

    override val postsRepository: PostsRepository by lazy {
        FakePostsRepository()
    }

    override val interestsRepository: InterestRepository by lazy {
        FakeInterestsRepository()
    }

}