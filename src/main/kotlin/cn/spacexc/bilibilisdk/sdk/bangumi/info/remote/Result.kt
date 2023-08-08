package cn.spacexc.bilibilisdk.sdk.bangumi.info.remote

data class Result(
    val activity: Activity,
    val actors: String,
    val alias: String,
    val areas: List<Area>,
    val bkg_cover: String,
    val cover: String,
    val enable_vt: Boolean,
    val episodes: List<Episode>,
    val evaluate: String,
    val freya: Freya,
    val jp_title: String,
    val link: String,
    val media_id: Long,
    val mode: Int,
    val new_ep: NewEp,
    val payment: Payment,
    val play_strategy: PlayStrategy,
    val positive: Positive,
    val publish: Publish,
    val rating: Rating,
    val record: String,
    val rights: RightsX,
    val season_id: Long,
    val season_title: String,
    val seasons: List<Season>,
    val section: List<Section>,
    val series: Series,
    val share_copy: String,
    val share_sub_title: String,
    val share_url: String,
    val show: Show,
    val show_season_type: Int,
    val square_cover: String,
    val staff: String,
    val stat: StatXX,
    val status: Int,
    val styles: List<String>,
    val subtitle: String,
    val title: String,
    val total: Int,
    val type: Int,
    val up_info: UpInfo,
    val user_status: UserStatus
)