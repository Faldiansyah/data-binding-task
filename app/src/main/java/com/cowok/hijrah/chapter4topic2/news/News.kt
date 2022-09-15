package com.cowok.hijrah.chapter4topic2.news

import java.io.Serializable

data class News(
    var title: String,
    var date: String,
    var image: Int,
    var content: String,
    var writer: String
)
