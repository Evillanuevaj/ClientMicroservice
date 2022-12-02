package com.bootcamp.java.client.web.mapper;

import com.bootcamp.java.client.domain.Client;
import com.bootcamp.java.client.web.model.ClientModel;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-12-02T03:44:14-0500",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.16 (Oracle Corporation)"
)
@Component
public class ClientMapperImpl implements ClientMapper {

    @Override
    public Client modelToEntity(ClientModel model) {
        if ( model == null ) {
            return null;
        }

        Client.ClientBuilder client = Client.builder();

        client.id( model.getId() );
        client.identityNumber( model.getIdentityNumber() );
        client.name( model.getName() );
        client.lastName( model.getLastName() );
        client.businessName( model.getBusinessName() );
        client.email( model.getEmail() );
        client.phoneNumber( model.getPhoneNumber() );
        client.birthday( model.getBirthday() );
        client.type( model.getType() );

        return client.build();
    }

    @Override
    public ClientModel entityToModel(Client event) {
        if ( event == null ) {
            return null;
        }

        ClientModel.ClientModelBuilder clientModel = ClientModel.builder();

        clientModel.id( event.getId() );
        clientModel.identityNumber( event.getIdentityNumber() );
        clientModel.name( event.getName() );
        clientModel.lastName( event.getLastName() );
        clientModel.businessName( event.getBusinessName() );
        clientModel.email( event.getEmail() );
        clientModel.phoneNumber( event.getPhoneNumber() );
        clientModel.birthday( event.getBirthday() );
        clientModel.type( event.getType() );

        return clientModel.build();
    }

    @Override
    public void update(Client entity, Client updateEntity) {
        if ( updateEntity == null ) {
            return;
        }

        entity.setIdentityNumber( updateEntity.getIdentityNumber() );
        entity.setName( updateEntity.getName() );
        entity.setLastName( updateEntity.getLastName() );
        entity.setBusinessName( updateEntity.getBusinessName() );
        entity.setEmail( updateEntity.getEmail() );
        entity.setPhoneNumber( updateEntity.getPhoneNumber() );
        entity.setBirthday( updateEntity.getBirthday() );
        entity.setType( updateEntity.getType() );
    }
}
