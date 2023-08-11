package com.furlencoapp.model;

import org.springframework.stereotype.Component;

@Component
public class FurnitureMapper {
	
	public Furniture convertToDocument(FurnitureDTO furnitureDTO) {
		
		Furniture furniture = new Furniture();
		
		furniture.setFurnitureId(furnitureDTO.getFurnitureId());
		furniture.setFurnitureName(furnitureDTO.getFurnitureName());
		furniture.setPrice(furnitureDTO.getPrice());
		furniture.setQuantity(furnitureDTO.getQuantity());
		furniture.setSize(furnitureDTO.getSize());
		furniture.setCatagory(furnitureDTO.getCatagory());
		furniture.setReviewStar(furnitureDTO.getReviewStar());
		furniture.setImageString(furnitureDTO.getImageString());
		return furniture;
		
	}
	
	public FurnitureDTO convertToDTO(Furniture furniture) {
		FurnitureDTO furnitureDTO = new FurnitureDTO();
		
		furnitureDTO.setFurnitureId(furniture.getFurnitureId());
		furnitureDTO.setFurnitureName(furniture.getFurnitureName());
		furnitureDTO.setPrice(furniture.getPrice());
		furnitureDTO.setQuantity(furniture.getQuantity());
		furnitureDTO.setSize(furniture.getSize());
		furnitureDTO.setCatagory(furniture.getCatagory());
		furnitureDTO.setReviewStar(furniture.getReviewStar());
		furnitureDTO.setImageString(furniture.getImageString());
		return furnitureDTO;
	}
}
