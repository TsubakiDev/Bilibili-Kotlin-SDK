package cn.spacexc.bilibilisdk.sdk.bangumi.info.remote

data class Episode(
    val aid: Long,
    val badge: String?,
    val badge_info: BadgeInfo?,
    val badge_type: Int,
    val bvid: String,
    val cid: Long,
    val cover: String,
    val dimension: Dimension,
    val duration: Int,
    val enable_vt: Boolean,
    val ep_id: Long,
    val from: String,
    val id: Long,
    val is_view_hide: Boolean,
    val link: String,
    val long_title: String,
    val pub_time: Int,
    val pv: Int,
    val release_date: String,
    val rights: Rights,
    val share_copy: String,
    val share_url: String,
    val short_link: String,
    val status: Int,
    val subtitle: String,
    val title: String,
    val vid: String
)