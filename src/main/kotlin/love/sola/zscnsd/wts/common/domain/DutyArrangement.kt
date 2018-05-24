package love.sola.zscnsd.wts.common.domain

import java.time.DayOfWeek

@ForJpaUse
data class DutyArrangement(val week: DayOfWeek, val chunk: Chunk)
