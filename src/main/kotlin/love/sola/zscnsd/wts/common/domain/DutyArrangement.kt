package love.sola.zscnsd.wts.common.domain

import love.sola.zscnsd.wts.common.domain.enums.Block
import java.time.DayOfWeek

data class DutyArrangement(val week: DayOfWeek, val block: Block)
