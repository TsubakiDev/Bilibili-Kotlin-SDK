package cn.spacexc.bilibilisdk.sdk.user.profile.remote.info.space


import com.google.gson.annotations.SerializedName

data class Data(
    val mid: Int,
    val name: String,
    val sex: String,
    val face: String,
    @SerializedName("face_nft") val faceNft: Int,
    @SerializedName("face_nft_type") val faceNftType: Int,
    val sign: String,
    val rank: Int,
    val level: Int,
    val jointime: Int,
    val moral: Int,
    val silence: Int,
    val coins: Int,
    @SerializedName("fans_badge") val fansBadge: Boolean,
    @SerializedName("fans_medal") val fansMedal: FansMedal,
    val official: Official,
    val vip: Vip,
    val pendant: Pendant,
    val nameplate: Nameplate,
    @SerializedName("user_honour_info") val userHonourInfo: UserHonourInfo,
    @SerializedName("is_followed") val isFollowed: Boolean,
    @SerializedName("top_photo") val topPhoto: String,
    val theme: Theme,
    @SerializedName("sys_notice") val sysNotice: SysNotice,
    @SerializedName("live_room") val liveRoom: LiveRoom,
    val birthday: String,
    val school: School,
    val profession: Profession,
    val tags: List<String>,
    val series: Series,
    @SerializedName("is_senior_member") val isSeniorMember: Int,
    @SerializedName("mcn_info") val mcnInfo: Any?,
    @SerializedName("gaia_res_type") val gaiaResType: Int,
    @SerializedName("gaia_data") val gaiaData: Any?,
    @SerializedName("is_risk") val isRisk: Boolean,
    val elec: Elec,
    val contract: Contract,
    @SerializedName("certificate_show") val certificateShow: Boolean
)