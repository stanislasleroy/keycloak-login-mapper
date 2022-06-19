package org.leroy.keycloak.mapper;

import org.jboss.logging.Logger;
import org.keycloak.broker.provider.BrokeredIdentityContext;
import org.keycloak.broker.provider.IdentityProviderMapper;
import org.keycloak.broker.saml.SAMLIdentityProviderFactory;
import org.keycloak.models.*;
import org.keycloak.provider.ProviderConfigProperty;

import java.util.ArrayList;
import java.util.List;

public class EmailToUsernameMapper extends AbstractProviderMapper implements IdentityProviderMapper {

    public static final String[] COMPATIBLE_PROVIDERS = {SAMLIdentityProviderFactory.PROVIDER_ID};
    public static final String PROVIDER_ID = "saml-group-idp-mapper";
    public static final String DISPLAY_CATEGORY = "Attribute importer";
    public static final String DISPLAY_TYPE = "Username mapper";
    private static final Logger logger = Logger.getLogger(EmailToUsernameMapper.class);
    private static final List<ProviderConfigProperty> configProperties = new ArrayList<>();


    @Override
    public List<ProviderConfigProperty> getConfigProperties() {
        return configProperties;
    }

    @Override
    public String getId() {
        return PROVIDER_ID;
    }

    @Override
    public int order() {
        return super.order();
    }

    @Override
    public String[] getCompatibleProviders() {
        return COMPATIBLE_PROVIDERS;
    }

    @Override
    public String getDisplayCategory() {
        return DISPLAY_CATEGORY;
    }

    @Override
    public String getDisplayType() {
        return DISPLAY_TYPE;
    }


    @Override
    public boolean supportsSyncMode(IdentityProviderSyncMode syncMode) {
        return super.supportsSyncMode(syncMode);
    }

    @Override
    public void importNewUser(KeycloakSession session, RealmModel realm, UserModel user, IdentityProviderMapperModel mapperModel, BrokeredIdentityContext context) {
        logger.debug("User email: " + user.getEmail());
        user.setUsername(user.getEmail().replaceAll("[^a-zA-Z0-9]", ""));
        logger.debug("User username: " + user.getUsername());
    }

    @Override
    public void updateBrokeredUserLegacy(KeycloakSession session, RealmModel realm, UserModel user, IdentityProviderMapperModel mapperModel, BrokeredIdentityContext context) {
        logger.debug("User email: " + user.getEmail());
        user.setUsername(user.getEmail().replaceAll("[^a-zA-Z0-9]", ""));
        logger.debug("User username: " + user.getUsername());
    }


    @Override
    public void updateBrokeredUser(KeycloakSession session, RealmModel realm, UserModel user, IdentityProviderMapperModel mapperModel, BrokeredIdentityContext context) {
        logger.debug("User email: " + user.getEmail());
        user.setUsername(user.getEmail().replaceAll("[^a-zA-Z0-9]", ""));
        logger.debug("User username: " + user.getUsername());
    }

    @Override
    public String getHelpText() {
        return "If a claim exists, grant the user the specified realm or application group.";
    }

    @Override
    public EmailToUsernameMapper create(KeycloakSession session) {
        return new EmailToUsernameMapper();
    }
}
