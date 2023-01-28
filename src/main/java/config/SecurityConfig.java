package config;


// @Configuration
// @EnableWebFluxSecurity
public class SecurityConfig {
    // @Bean
  /*  public SecurityWebFilterChain springSecurityWebFilterChain(ServerHttpSecurity serverHttpSecurity){
        serverHttpSecurity.csrf()
                .disable()
                .authorizeExchange(exchange -> exchange
                        .pathMatchers("/eureka/**")
                        .permitAll()
                        .anyExchange()
                        .authenticated())
                .oauth2ResourceServer(ServerHttpSecurity.OAuth2ResourceServerSpec::jwt);
        return serverHttpSecurity.build();
    }*/
}
