package org.yl.auth.spi.verifier;

import org.yl.auth.model.YoungLifeUserModel;

@FunctionalInterface
public interface VerifyYoungLifeUserByEmailSpi {
    YoungLifeUserModel loadByEmail(String email);
}
