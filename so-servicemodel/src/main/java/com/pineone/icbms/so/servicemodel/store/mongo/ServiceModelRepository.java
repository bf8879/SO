package com.pineone.icbms.so.servicemodel.store.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ServiceModelRepository extends MongoRepository<ServiceModelDataObject, String> {
}
