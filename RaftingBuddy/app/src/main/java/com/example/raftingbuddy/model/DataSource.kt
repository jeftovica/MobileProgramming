package com.example.raftingbuddy.model

import com.example.raftingbuddy.R

object DataSource {
    private val topics: List<Topic> = listOf(
        Topic(
            userName = R.string.user1_name,
            riverName = R.string.neretva_river,
            numberOfBuddies = 5,
            date = R.string.date1,
            comment = "We can move date for couple of weeks if no one can go on this period.",

        ),
        Topic(
            userName = R.string.user2_name,
            riverName = R.string.neretva_river,
            numberOfBuddies = 3,
            date = R.string.date2,
            comment = "",

        ),
        Topic(
            userName = R.string.user3_name,
            riverName = R.string.neretva_river,
            numberOfBuddies = 1,
            date = R.string.date3,
            comment = "We would prefer person to be male so we can have same number of males and females in team. ",

        ),
        Topic(
            userName = R.string.user4_name,
            riverName = R.string.tara_river,
            numberOfBuddies = 2,
            date = R.string.date4,
            comment = "",

        ),
        Topic(
            userName = R.string.user5_name,
            riverName = R.string.tara_river,
            numberOfBuddies = 4,
            date = R.string.date5,
            comment = "Cant wait to meet you all!",

        ),
        Topic(
            userName = R.string.user6_name,
            riverName = R.string.tara_river,
            numberOfBuddies = 5,
            date = R.string.date6,
            comment = "This is my number if it is easier for you to reach me: 075324890",

        ),
        Topic(
            userName = R.string.user7_name,
            riverName = R.string.vrbas_river,
            numberOfBuddies = 2,
            date = R.string.date7,
            comment = "We would like to have someone who already was on rafting.",

        ),
        Topic(
            userName = R.string.user8_name,
            riverName = R.string.vrbas_river,
            numberOfBuddies = 3,
            date = R.string.date8,
            comment = "Hi buddies, I am so excited to meet you!",

        ),
        Topic(
            userName = R.string.user9_name,
            riverName = R.string.vrbas_river,
            numberOfBuddies = 1,
            date = R.string.date9,
            comment = "I created team trough this app, but one of buddies canceled so now we need one more male or female does not matter  ",

        ),

    )
    fun getNeretvaTopics(): List<Topic> {
        return topics.filter { it.riverName == R.string.neretva_river }
    }

    fun getTaraTopics(): List<Topic> {
        return topics.filter { it.riverName == R.string.tara_river }
    }

    fun getVrbasTopics(): List<Topic> {
        return topics.filter { it.riverName == R.string.vrbas_river }
    }
}