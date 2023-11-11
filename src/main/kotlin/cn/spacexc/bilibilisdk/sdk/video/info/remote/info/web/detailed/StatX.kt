package cn.spacexc.bilibilisdk.sdk.video.info.remote.info.web.detailed


import com.google.gson.annotations.SerializedName

data class StatX(
    val aid: Long,
    @SerializedName("argue_msg")
    val argueMsg: String,
    val coin: Int,
    val danmaku: Int,
    val dislike: Int,
    val evaluation: String,
    val favorite: Int,
    @SerializedName("his_rank")
    val hisRank: Int,
    val like: Int,
    @SerializedName("now_rank")
    val nowRank: Int,
    val reply: Int,
    val share: Int,
    val view: Int,
    val vt: Int
)