package love.sola.zscnsd.wts.common.domain

@ForJpaUse
data class IspAccount(val isp: ISP, val account: String)
