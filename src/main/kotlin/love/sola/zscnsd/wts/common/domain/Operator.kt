package love.sola.zscnsd.wts.common.domain

import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority

class Operator(
    val stuffId: Int,
    val arrangement: DutyArrangement?,
    val permissions: List<String>,
    id: Long,
    name: String,
    phone: String?,
    address: Address?,
    account: IspAccount?
) : User(id, name, phone, address, account) {

    companion object {
        private val ROLE_OPERATOR = SimpleGrantedAuthority("ROLE_OPERATOR")
    }

    override fun getAuthorities(): Collection<GrantedAuthority> {
        //TODO cache this result if needed.
        return super.getAuthorities() + ROLE_OPERATOR + permissions.map { SimpleGrantedAuthority(it) }
    }

}
