/*
 * Copyright 2016 Google Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.echo;

import java.util.ArrayList;

import com.google.api.server.spi.auth.EspAuthenticator;
import com.google.api.server.spi.auth.common.User;
import com.google.api.server.spi.config.AnnotationBoolean;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiIssuer;
import com.google.api.server.spi.config.ApiIssuerAudience;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Named;
import com.google.api.server.spi.config.Nullable;
import com.google.api.server.spi.response.UnauthorizedException;

import clases.Mensajes;
import clases.Usuario;
import clases.iProxy;
import clases.iUsuario;

/**
 * The Echo API which Endpoints will be exposing.
 */
// [START echo_api_annotation]
@Api(
    name = "proxy",
    version = "v1",
    namespace =
    @ApiNamespace(
        ownerDomain = "proxy.example.com",
        ownerName = "proxy.example.com",
        packagePath = ""
    ),
    // [START_EXCLUDE]
    issuers = {
        @ApiIssuer(
            name = "firebase",
            issuer = "https://securetoken.google.com/YOUR-PROJECT-ID",
            jwksUri =
                "https://www.googleapis.com/service_accounts/v1/metadata/x509/securetoken@system"
                    + ".gserviceaccount.com"
        )
    }
// [END_EXCLUDE]
)
// [END echo_api_annotation]

public class Proxy implements iProxy{

	private static Proxy unicaInstancia = null;
	protected ArrayList<Usuario> usuarios = new ArrayList<>();
	
	public  Proxy(){
	}


	public static Proxy reemplazarConstructora() {

	if (unicaInstancia == null)

	unicaInstancia = new Proxy();

	return unicaInstancia;

	}
	
	public Mensajes asignarRandom(){
		return new Mensajes(String.valueOf(Math.random()));
	}
	
	public Mensajes verificarUsuario(@Named("correo") String correo, @Named("password") String password){
		return new Mensajes("usuario");
	}
	
	
	@Override
	public Mensajes iniciarSesion(@Named("correo") String correo, @Named("password") String password) {
		// TODO Auto-generated method stub
		return new Mensajes("Funciona");
	}
	
	public Mensajes iniciar(@Named("correo") String correo, @Named("password") String password) {
		// TODO Auto-generated method stub
		return new Mensajes("No Funciona");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
  // [START google_id_token_auth]
  @ApiMethod(
      httpMethod = ApiMethod.HttpMethod.GET,
      authenticators = {EspAuthenticator.class},
      audiences = {"YOUR_OAUTH_CLIENT_ID"},
      clientIds = {"YOUR_OAUTH_CLIENT_ID"}
  )
  public Email getUserEmail(User user) throws UnauthorizedException {
    if (user == null) {
      throw new UnauthorizedException("Invalid credentials");
    }

    Email response = new Email();
    response.setEmail(user.getEmail());
    return response;
  }
  // [END google_id_token_auth]


}
