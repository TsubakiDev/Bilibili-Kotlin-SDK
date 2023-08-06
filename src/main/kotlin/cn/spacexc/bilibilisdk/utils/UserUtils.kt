package cn.spacexc.bilibilisdk.utils

import cn.spacexc.bilibilisdk.BilibiliSdkManager
import cn.spacexc.bilibilisdk.network.KtorNetworkUtils
import cn.spacexc.bilibilisdk.utils.remote.UserExitResult

/**
 * Created by XC-Qan on 2023/4/5.
 * I'm very cute so please be nice to my code!
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 * 给！爷！写！注！释！
 */

object UserUtils  {
    suspend fun isUserLoggedIn(): Boolean =
        !BilibiliSdkManager.cookiesManager.getCookieByName("SESSDATA")?.value.isNullOrEmpty()
    suspend fun mid(): Long? = BilibiliSdkManager.cookiesManager.getCookieByName("DedeUserID")?.value?.toLong()
    suspend fun csrf(): String? = BilibiliSdkManager.cookiesManager.getCookieByName("bili_jct")?.value
    suspend fun accessKey(): String? = BilibiliSdkManager.dataManager.getString("accessKey", null)
    suspend fun webiSign(): String? = BilibiliSdkManager.dataManager.getString("webi_signature_key", null)

    suspend fun logout(): Boolean {
        val form = mapOf(
            "biliCSRF" to (csrf() ?: "")
        )
        val response = KtorNetworkUtils.post<UserExitResult>(
            url = "https://passport.bilibili.com/login/exit/v2",
            form = form
        )
        return response.code == 0
    }
}