package com.kazale.api.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class SenhaUtils {

    /***
     * Gera um hash utilizando BCrypt.
     *
     * @param senha
     * @return String
     */
    public static String gerarBCrypty(String senha) {
        if (senha == null) {
            return senha;
        }

        BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
        return bCryptEncoder.encode(senha);
    }

    /***
     * Verifica se a senha é válida.
     *
     * @param senha
     * @param senhaEncoded
     * @return boolean
     */
    public static boolean senhaValida(String senha, String senhaEncoded) {
        BCryptPasswordEncoder bCryptEncoder = new BCryptPasswordEncoder();
        return bCryptEncoder.matches(senha,senhaEncoded);
    }
}
