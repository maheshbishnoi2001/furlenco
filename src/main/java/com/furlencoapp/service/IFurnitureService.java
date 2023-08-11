package com.furlencoapp.service;

import java.util.List;

import com.furlencoapp.exception.FurnitureNotFoundException;
import com.furlencoapp.model.FurnitureDTO;

public interface IFurnitureService {
	
    void addFurniture(FurnitureDTO furnitureDTO);
    FurnitureDTO updateFurniture(FurnitureDTO furnitureDTO);
    void deleteFurniture(String furnitureId) throws FurnitureNotFoundException;
    
    List<FurnitureDTO> getAllFurniture();
    FurnitureDTO getByFurnitureId(String furnitureId);
    FurnitureDTO getByFurnitureName(String furnitureName);
    List<FurnitureDTO> getByPrice(double price);
    List<FurnitureDTO> getByCatagory(String catagory);
    List<FurnitureDTO> getByReviewStar(String reviewStar);
    
//    List<FurnitureDTO> getByFurnitureNameAndPrice(String furnitureName, double price);
//    List<FurnitureDTO> getByFurnitureNameAndSize(String furnitureName, String size);
//    List<FurnitureDTO> getByFurnitureNameAndReviewStar(String furnitureName, String reviewStar);
//    List<FurnitureDTO> getByPriceAndSize(double price, String size);
//    List<FurnitureDTO> getByPriceAndType(double price, String type);
//    List<FurnitureDTO> getByPriceAndReviewStar(double price, String reviewStar);
}
