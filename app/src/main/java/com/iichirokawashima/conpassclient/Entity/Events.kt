package com.iichirokawashima.conpassclient.Entity

data class Events (
    val renderedBody: String,
    val body: String,
    val coediting: Boolean,
    val commentsCount: Long,
    val createdAt: String,
    val group: Any? = null,
    val id: String,
    val likesCount: Long,
    val private: Boolean,
    val reactionsCount: Long,
    val tags: List<Tag>,
    val title: String,
    val updatedAt: String,
    val url: String,
    val user: User,
    val pageViewsCount: Any? = null
)

data class Tag (
    val name: String,
    val versions: List<Any?>
)

data class User (
    val description: String,
    val facebookID: String,
    val followeesCount: Long,
    val followersCount: Long,
    val githubLoginName: String,
    val id: String,
    val itemsCount: Long,
    val linkedinID: String,
    val location: String,
    val name: String,
    val organization: String,
    val permanentID: Long,
    val profileImageURL: String,
    val teamOnly: Boolean,
    val twitterScreenName: String,
    val websiteURL: String
)