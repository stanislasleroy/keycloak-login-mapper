package org.leroy.keycloak.mapper;

import org.keycloak.Config;
import org.keycloak.broker.provider.BrokeredIdentityContext;
import org.keycloak.broker.provider.IdentityProviderMapper;
import org.keycloak.models.*;

public abstract class AbstractProviderMapper implements IdentityProviderMapper {
    public AbstractProviderMapper() {
    }

    public void close() {
    }

    public IdentityProviderMapper create(KeycloakSession session) {
        return null;
    }

    public void init(Config.Scope config) {
    }

    public void postInit(KeycloakSessionFactory factory) {
    }

    public void preprocessFederatedIdentity(KeycloakSession session, RealmModel realm, IdentityProviderMapperModel mapperModel, BrokeredIdentityContext context) {
    }

    public void importNewUser(KeycloakSession session, RealmModel realm, UserModel user, IdentityProviderMapperModel mapperModel, BrokeredIdentityContext context) {
    }
}
