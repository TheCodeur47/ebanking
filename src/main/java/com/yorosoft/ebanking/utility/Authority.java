package com.yorosoft.ebanking.utility;

import org.springframework.security.core.GrantedAuthority;

/**
 * Authority
 */
public class Authority implements GrantedAuthority {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String authority;

    public Authority(String authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority;
    }
}