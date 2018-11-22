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
import clases.Ruta;
import clases.Usuario;
import clases.UsuarioTemp;
import clases.iProxy;
import clases.iUsuario;

/**
 * The Echo API which Endpoints will be exposing.
 */
// [START echo_api_annotation]
@Api(
    name = "facade",
    version = "v1",
    namespace =
    @ApiNamespace(
        ownerDomain = "facade.example.com",
        ownerName = "facade.example.com",
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

public class Facade extends Proxy{

  public ArrayList<Ruta> rutas = new ArrayList<>();
  public ArrayList<UsuarioTemp> usuarios = new ArrayList<>();
  public ArrayList<Mensajes> sesiones = new ArrayList<>();
  private Proxy proxy = Proxy.reemplazarConstructora();
  private UsuarioTemp usuarioTemp2 = new UsuarioTemp();
  
@ApiMethod(name="buscarUsuario")
  public Mensajes buscarUsuario(@Named("correo") String correo, @Named("password") String password) {
	boolean existe = false;
	usuarioTemp2 = new UsuarioTemp("yarethpigo@unisabana.edu.co","12345678","Yareth","Conductor");
	usuarios.add(usuarioTemp2);
	
    for(int i=0 ; i<usuarios.size() ; i++){
    	if(usuarios.get(i).getCorreo().equals(correo)&&usuarios.get(i).getPassword().equals(password)){
    		existe = true;
    	}
    }
    
    if(existe){
    	return new Mensajes("Funciona");
    }else{
    	return new Mensajes("No Funciona");
    }
    
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