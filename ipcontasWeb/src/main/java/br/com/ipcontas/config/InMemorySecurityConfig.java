package br.com.ipcontas.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;

//@Configuration
public class InMemorySecurityConfig {
	
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder builder) throws Exception {
		builder
			.inMemoryAuthentication()
			.withUser("gestor").password("123").roles("PG_PROJETOS", "PG_REL_CUSTOS", "PG_REL_EQUIPE")
			.and()
			.withUser("operador").password("123").roles("PG_PROJETOS", "PG_REL_EQUIPE");
	}

}
