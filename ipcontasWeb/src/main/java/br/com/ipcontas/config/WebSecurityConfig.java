package br.com.ipcontas.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import br.com.ipcontas.security.IpcontasUserDetailsService;

@Configuration
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	private IpcontasUserDetailsService userDetailsService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.
			authorizeRequests()
				.antMatchers("/projetos").hasAnyRole("PG_PROJETOS")
				.antMatchers("/relatorio-equipe").hasAnyRole("PG_REL_EQUIPE")
				.antMatchers("/relatorio-custos").hasAnyRole("PG_REL_CUSTOS")
				.antMatchers("/cadastro-usuario").hasAnyRole("PG_REL_CUSTOS")
				.anyRequest()
				.authenticated()
			.and()
			.formLogin()
				.loginPage("/entrar")
				.permitAll()
			.and()
			.logout()
				.logoutSuccessUrl("/entrar?logout")
				.permitAll()
			.and()
			.rememberMe()
				.userDetailsService(userDetailsService);
	}

}
