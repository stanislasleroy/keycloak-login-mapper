# keycloak-login-mapper

This custom mapper allows to map a custom field to username. In our case, the username should represent the email where the special characters have been removed.

## Deployment

Once the jar file built, it has to be copied in `/standalone/deployments/` Keycloak's directory. For instance:

`/opt/jboss/keycloak/standalone/deployments/`

## Usage

This new mapper is available in `<Realm>` / Identity Providers / `<Identity Provider > / Mappers / Create / Username mapper


## Links

This mapper if mostly inspired by:

https://medium.com/@d3l33t/extending-keycloak-spi-with-custom-saml-group-mapper-using-jboss-modules-a6a339641b32
