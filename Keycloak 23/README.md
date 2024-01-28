# Activité Pratique N°7 : Sécurité Oauth2, OIDC, JWT, Keycloak
# Encadrant : Mohamed YOUSSFI


# Sécuriser les microservices Spring et les applications Angular à l'aide d'Oauth2 OIDC avec Keycloak


run kc + create admin:

![22](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/1399d645-a6b7-4fe4-80de-ab61f874fa6e)

![kc admin login 1](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/5f5bbbb9-024b-4c22-8c00-bfc03c17eae7)


create client:

![296356730-a3de3e4a-fc49-4080-8462-266af93ae6d4](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/3c17c138-ab58-4d42-9bb2-bb2319ceeb01)


create user:

![296356833-1b55d05b-c146-4fc1-a69a-3ce0f0830e90](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/736d3f0e-8d85-4e47-b193-a9c562de7b37)



Users:


![296356870-221cbf78-3378-418c-ba22-de0f1f965131](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/a1a2ef6a-66c7-4c71-b99b-a9b144402360)


role mapping:

![296356932-e396873c-df2a-4b32-8445-fcfb0d9a56d6](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/a297509e-738b-4ee9-b65f-67fa36345795)



test authentification :

(POSTMAN)


![296883031-707c8e35-a7fe-4969-866b-28b4b49cccee](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/6be0a2b0-f1fd-46f3-b27d-b1d367fa50f6)


decodage du token (jwt)


![296883529-6e1388a1-6165-4b07-81fc-5a563e777b20](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/c0c42171-5a5c-4be7-839c-082ed9205375)



public key wallet Realm






authentification avec refresh_token:






enable Client authentication (client id + client secret):





authentification avec (client id + client secret):




desactivation de Client authentication








# Application basée sur les micro-services en utilsant Oauth 2, OIDC, Keycloak :



h2 console + page html Customers:



Keycloack Authentication policies:




interface Login:




Login avec le compte Github :




La liste des clients (localhost:8090/customers):





La liste des produits (localhost:8090/products):




Set require SSL to none:



Configuration du client glsid-bdcc-customer-client




La liste des clients (localhost:4200/customers):





La liste des produits (localhost:4200/products) :




