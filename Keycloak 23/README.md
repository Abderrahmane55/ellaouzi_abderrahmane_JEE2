# Activité Pratique N°7 : Sécurité Oauth2, OIDC, JWT, Keycloak
# Encadrant : Mohamed YOUSSFI


# Sécuriser les microservices Spring et les applications Angular à l'aide d'Oauth2 OIDC avec Keycloak


Run kc :

![22](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/1399d645-a6b7-4fe4-80de-ab61f874fa6e)

 Create admin kc :

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


![296883676-b8bb4cb5-f0e0-4115-92fe-d194b3b718b6](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/9ddd3e68-ea98-4f92-aef8-09c6bb6b679b)



public key wallet Realm


![296884073-5dd22434-5e88-434d-8f02-588ab556ea26](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/2d493ca3-b7f3-4c36-b9bd-807806468b7e)


authentification avec refresh_token:


![296885535-028217f2-9f1c-411c-b3c3-ea8051da2836](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/ed749af4-0911-4144-ae8e-4b7596b80d7e)



enable Client authentication (client id + client secret):

![296887289-98fa2845-1e99-4523-ad38-bba214babcf3](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/61ac6d39-e497-4775-b190-f7c552366050)


![296887349-a3ee7088-bcb4-4c20-a81d-5171d162efff](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/60f2d396-3ff4-4bd1-a2ea-f7318d7b490a)


authentification avec (client id + client secret):


![296889855-56ffaaa4-3fcc-4ff4-8058-4f80a3cb91bf](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/667b65e3-8358-4fd7-824a-b737b325f436)



Desactivation de Client authentication


![296890871-0e2c5d8c-71ad-4c0b-bcd7-e21657f9c93b](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/37d44a3c-4efa-4ac8-9471-eb32513cdaf5)



# Application basée sur les micro-services en utilsant Oauth 2, OIDC, Keycloak :


h2 console + page html Customers:

![1 h2](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/d8355b83-8c38-41ab-b351-bddf4fd99015)


![2 h2](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/fd181624-9497-4249-8305-04d9544ddb7e)


Keycloack Authentication policies:


![300222377-fcecdc52-2608-47d2-813d-56b96e4f0996](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/a36df568-eaa8-4920-8013-e474ef315b35)


interface Login:

![300222393-6aa94f19-6c43-4928-bd3f-c3c7c830324c](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/bc89155d-90d3-4063-83c1-43ca3bb6d4cb)



La liste des clients (localhost:8090/customers):

![300224782-5d9b4827-693b-4756-8134-39f50d6cf11f](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/b7823f9b-0fe2-4c11-b9bd-6c911f77d2fb)




La liste des produits (localhost:8090/products):


![300224800-87074344-2477-4b57-b505-31c032feb6e9](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/66a4bcda-836b-4a40-80f5-0e9e7762b08f)


Set require SSL set (none):

![300222519-0965b7c1-d3af-40ce-8831-3641b3dcd68e](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/30c79199-ebd5-4f91-951f-6f2fbdc7546b)


Configuration du client glsid-bdcc-customer-client

![300222541-8c30abbc-13a5-421e-a1f1-4c2e02fc3a41](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/98b70075-4721-4e04-bce0-15fef5a51ff0)



La liste des clients (localhost:4200/customers):


![300224800-87074344-2477-4b57-b505-31c032feb6e9](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/bafd15aa-d01e-4328-9724-1df582a8ab97)



La liste des produits (localhost:4200/products) :


![300224800-87074344-2477-4b57-b505-31c032feb6e9](https://github.com/Abderrahmane55/ellaouzi_abderrahmane_JEE2/assets/107000262/d769b2f4-0cdb-4cd6-8192-13602eea54d5)


