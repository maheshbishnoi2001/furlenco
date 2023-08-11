package com.furlencoapp.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
// import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.furlencoapp.model.Furniture;

@Repository
public interface FurnitureRepository extends MongoRepository<Furniture, String> {

    // List<Furniture> findAllFurniture();

    Furniture findByFurnitureId(String furnitureId);

    Furniture findByFurnitureName(String furnitureName);

    List<Furniture> findByPrice(double price);

    List<Furniture> findByCatagory(String catagory);
    
    List<Furniture> findBySize(String size);

    List<Furniture> findByReviewStar(String reviewStar);

//    @Query("{$and:[{name:?0,price:{$lte: ?1}}]}")
//    List<Furniture> findByFurnitureNameAndPrice(String furnitureName, double price);
//
//    @Query("{$and:[{name:?0,size:?1}]}")
//    List<Furniture> findByFurnitureNameAndSize(String furnitureName, String size);
//
//    @Query("{$and:[{name:?0,stars:?1}]}")
//    List<Furniture> findByFurnitureNameAndReviewStar(String furnitureName, String reviewStar);
//
//    @Query("{$and:[{price:{$lte: ?0},size:?1}]}")
//    List<Furniture> findByPriceAndSize(double price, String size);
//
//    @Query("{$and:[{price:{$lte: ?0},type:?1}]}")
//    List<Furniture> findByPriceAndType(double price, String type);
//
//    @Query("{$and:[{price:{$lte: ?0},stars:?1}]}")
//    List<Furniture> findByPriceAndReviewStar(double price, String reviewStar);
}
