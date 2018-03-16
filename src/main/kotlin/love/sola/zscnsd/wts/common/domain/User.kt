package love.sola.zscnsd.wts.common.domain

import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import org.springframework.security.core.GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails

@JsonIgnoreProperties(
    "username",
    "password",
    "authorities",
    "enabled",
    "accountNonLocked",
    "accountNonExpired",
    "credentialsNonExpired"
)
open class User(
    val id: Long,
    val name: String,
    private val password: String?,
    val phone: String?,
    val address: Address?,
    val account: IspAccount?
) : UserDetails {

    companion object {
        private val ROLE_USER = SimpleGrantedAuthority("ROLE_USER")
    }

    override fun getUsername() = id.toString() //We use id as identity

    override fun getPassword() = password

    override fun getAuthorities(): Collection<GrantedAuthority> = listOf(ROLE_USER)

    override fun isEnabled() = true

    override fun isCredentialsNonExpired() = true

    override fun isAccountNonExpired() = true

    override fun isAccountNonLocked() = true

}

