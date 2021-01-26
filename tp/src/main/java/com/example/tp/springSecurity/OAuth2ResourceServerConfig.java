package com.example.tp.springSecurity;
/*
import org.apache.commons.io.IOUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.jwt.crypto.sign.RsaVerifier;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.DefaultTokenServices;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

@Configuration
@EnableResourceServer

public class OAuth2ResourceServerConfig {
    @Override
    public void configure(ResourceServerSecurityConfigurer config) throws IOException {
        config
                .tokenServices(tokenServices());
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .headers().frameOptions().disable().and()

                .authorizeRequests()
                .antMatchers("/h2-console/**").permitAll()
                .antMatchers("/**").authenticated();
    }

    private JwtAccessTokenConverter accessTokenConverter() throws IOException {
        JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
        Resource resource = new ClassPathResource("public.key");
        try (final Reader reader = new InputStreamReader(resource.getInputStream())) {
            String publicKey = IOUtils.toString(reader);
            converter.setVerifier(new RsaVerifier(publicKey));
            return converter;
        }

    }

    private TokenStore tokenStore() throws IOException {
        return new JwtTokenStore(accessTokenConverter());
    }

    //    @Bean
//    @Primary
    private DefaultTokenServices tokenServices() throws IOException {
        DefaultTokenServices defaultTokenServices = new DefaultTokenServices();
        defaultTokenServices.setTokenStore(tokenStore());
        return defaultTokenServices;
    }

}

}*/
