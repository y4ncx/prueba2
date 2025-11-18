package com.y4ncx.hexa.domain.service;

import com.y4ncx.hexa.domain.model.Credenciales;
import com.y4ncx.hexa.domain.model.Usuario;

public interface IAuthService {

    Usuario login(Credenciales credenciales);
}
