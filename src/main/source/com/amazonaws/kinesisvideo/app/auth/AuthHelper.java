package com.amazonaws.kinesisvideo.app.auth;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.SystemPropertiesCredentialsProvider;

public final class AuthHelper {
    public static AWSCredentialsProvider getSystemPropertiesCredentialsProvider() {
        return new SystemPropertiesCredentialsProvider();
    }

    private AuthHelper() {
        throw new UnsupportedOperationException();
    }
}
