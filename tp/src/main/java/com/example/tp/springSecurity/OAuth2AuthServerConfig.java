package com.example.tp.springSecurity;
/*import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.JwtAccessTokenConverter;
import org.springframework.security.oauth2.provider.token.store.JwtTokenStore;
import org.springframework.security.oauth2.provider.token.store.KeyStoreKeyFactory;
@Configuration
@EnableAuthorizationServer
public class OAuth2AuthServerConfig {



        @Autowired
        private AuthenticationManager authenticationManager;

        @Autowired
        private AuthService authService;

//    @Autowired
//    private TokenStore tokenStore;


        @Override
        public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
            endpoints.tokenStore(tokenStore())
                    .accessTokenConverter(accessTokenConverter())
                    .authenticationManager(authenticationManager)
                    .userDetailsService(authService);

        }


        @Override
        public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
            clients
                    .inMemory()
                    .withClient("trusted")
                    .secret("$2a$10$UElnU3FjXodaL6yVQHhT.exim78mRtFu4n9rf/4RFUk1Ypcvrnzqu")
                    .authorizedGrantTypes("password", "refresh_token").scopes("read");
        }


        private JwtAccessTokenConverter accessTokenConverter(){
            JwtAccessTokenConverter converter = new JwtAccessTokenConverter();
            KeyStoreKeyFactory keyStoreKeyFactory =
                    new KeyStoreKeyFactory(new ClassPathResource("ioautosms.jks"), "ioautosms$2020!".toCharArray());
            converter.setKeyPair(keyStoreKeyFactory.getKeyPair("ioautosms"));
            return converter;
        }

        private TokenStore tokenStore(){
            return new JwtTokenStore(accessTokenConverter());
        }
    }

}
*/