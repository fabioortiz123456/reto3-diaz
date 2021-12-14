
package Reto2_web.interfaces;

import Reto2_web.modelo.CleaningProduct;

import org.springframework.data.mongodb.repository.MongoRepository;


public interface InterfaceCleaningProduct extends MongoRepository<CleaningProduct, String> {
    
}

