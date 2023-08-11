package com.furlencoapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.furlencoapp.exception.FurnitureNotFoundException;
import com.furlencoapp.model.Furniture;
import com.furlencoapp.model.FurnitureDTO;
import com.furlencoapp.model.FurnitureMapper;
import com.furlencoapp.repository.FurnitureRepository;

@Service
public class FurnitureServiceImpl implements IFurnitureService {

	@Autowired
    private FurnitureRepository furnitureRepository;
	@Autowired
    private FurnitureMapper furnitureMapper;

    @Override
    public void addFurniture(FurnitureDTO furnitureDTO) {
        Furniture furniture= furnitureMapper.convertToDocument(furnitureDTO);
        furnitureRepository.insert(furniture);
    }

    @Override
    public FurnitureDTO updateFurniture(FurnitureDTO furnitureDTO) {
    	
    	Furniture furniture= furnitureMapper.convertToDocument(furnitureDTO);
    	Furniture nfurniture = furnitureRepository.save(furniture);
        return furnitureMapper.convertToDTO(nfurniture);
    }

    @Override
    public void deleteFurniture(String furnitureId) {
        furnitureRepository.deleteById(furnitureId);
    }

    
	@Override
	public List<FurnitureDTO> getAllFurniture() {
		
		List<Furniture> furnitures = furnitureRepository.findAll();
		
		if(furnitures.isEmpty())
			throw new FurnitureNotFoundException("Furniture not found");
		
		List<FurnitureDTO> furnitureDtos = furnitures.stream()
				.map(furniture -> furnitureMapper.convertToDTO(furniture)).toList();
		
		return furnitureDtos;
	}

	@Override
	public FurnitureDTO getByFurnitureId(String furnitureId) {
		Furniture furnitures = furnitureRepository.findByFurnitureId(furnitureId);
		
		return furnitureMapper.convertToDTO(furnitures);
	}

	@Override
	public FurnitureDTO getByFurnitureName(String furnitureName) throws FurnitureNotFoundException{
		Furniture furnitures = furnitureRepository.findByFurnitureName(furnitureName);
		
		return furnitureMapper.convertToDTO(furnitures);
	}

	@Override
	public List<FurnitureDTO> getByPrice(double price) {
		List<Furniture> furnitures = furnitureRepository.findByPrice(price);
		
		if(furnitures.isEmpty())
			throw new FurnitureNotFoundException("Furniture not found");
		
		List<FurnitureDTO> furnitureDtos = furnitures.stream()
				.map(furniture -> furnitureMapper.convertToDTO(furniture)).toList();
		
		return furnitureDtos;
	}

	@Override
	public List<FurnitureDTO> getByCatagory(String catagoty) {
		List<Furniture> furnitures = furnitureRepository.findByCatagory(catagoty);
		
		if(furnitures.isEmpty())
			throw new FurnitureNotFoundException("Furniture not found");
		
		List<FurnitureDTO> furnitureDtos = furnitures.stream()
				.map(furniture -> furnitureMapper.convertToDTO(furniture)).toList();
		
		return furnitureDtos;
	}

	

	@Override
	public List<FurnitureDTO> getByReviewStar(String reviewStar) {
		
		List<Furniture> furnitures = furnitureRepository.findByReviewStar(reviewStar);
		
		if(furnitures.isEmpty())
			throw new FurnitureNotFoundException("Furniture not found");
		
		List<FurnitureDTO> furnitureDtos = furnitures.stream()
				.map(furniture -> furnitureMapper.convertToDTO(furniture)).toList();
		
		return furnitureDtos;
	}

//	@Override
//	public List<FurnitureDTO> getByFurnitureNameAndPrice(String furnitureName, double price) {
//		
//		List<Furniture> furnitures = furnitureRepository.findByFurnitureNameAndPrice(furnitureName, price);
//		
//		if(furnitures.isEmpty())
//			throw new FurnitureNotFoundException("Furniture not found");
//		
//		List<FurnitureDTO> furnitureDtos = furnitures.stream()
//				.map(furniture -> furnitureMapper.convertToDTO(furniture)).toList();
//		
//		return furnitureDtos;
//	}
//
//	@Override
//	public List<FurnitureDTO> getByFurnitureNameAndSize(String furnitureName, String size) {
//		
//		List<Furniture> furnitures = furnitureRepository.findByFurnitureNameAndSize(furnitureName, size);
//		
//		if(furnitures.isEmpty())
//			throw new FurnitureNotFoundException("Furniture not found");
//		
//		List<FurnitureDTO> furnitureDtos = furnitures.stream()
//				.map(furniture -> furnitureMapper.convertToDTO(furniture)).toList();
//		
//		return furnitureDtos;
//	}
//
//	@Override
//	public List<FurnitureDTO> getByFurnitureNameAndReviewStar(String furnitureName, String reviewStar) {
//		
//		List<Furniture> furnitures = furnitureRepository.findByFurnitureNameAndReviewStar(furnitureName, reviewStar);
//		
//		if(furnitures.isEmpty())
//			throw new FurnitureNotFoundException("Furniture not found");
//		
//		List<FurnitureDTO> furnitureDtos = furnitures.stream()
//				.map(furniture -> furnitureMapper.convertToDTO(furniture)).toList();
//		
//		return furnitureDtos;
//	}
//
//	@Override
//	public List<FurnitureDTO> getByPriceAndSize(double price, String size) {
//		
//		List<Furniture> furnitures = furnitureRepository.findByPriceAndSize(price, size);
//		
//		if(furnitures.isEmpty())
//			throw new FurnitureNotFoundException("Furniture not found");
//		
//		List<FurnitureDTO> furnitureDtos = furnitures.stream()
//				.map(furniture -> furnitureMapper.convertToDTO(furniture)).toList();
//		
//		return furnitureDtos;
//	}
//
//	@Override
//	public List<FurnitureDTO> getByPriceAndType(double price, String type) {
//		
//		List<Furniture> furnitures = furnitureRepository.findByPriceAndType(price, type);
//		
//		if(furnitures.isEmpty())
//			throw new FurnitureNotFoundException("Furniture not found");
//		
//		List<FurnitureDTO> furnitureDtos = furnitures.stream()
//				.map(furniture -> furnitureMapper.convertToDTO(furniture)).toList();
//		
//		return furnitureDtos;
//	}
//
//	@Override
//	public List<FurnitureDTO> getByPriceAndReviewStar(double price, String reviewStar) {
//		
//		List<Furniture> furnitures = furnitureRepository.findByPriceAndReviewStar(price, reviewStar);
//		
//		if(furnitures.isEmpty())
//			throw new FurnitureNotFoundException("Furniture not found");
//		
//		List<FurnitureDTO> furnitureDtos = furnitures.stream()
//				.map(furniture -> furnitureMapper.convertToDTO(furniture)).toList();
//		
//		return furnitureDtos;
//	}
    
}
