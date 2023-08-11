package com.furlencoapp.controller;

import java.time.LocalDateTime;
import java.util.List;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// import org.springframework.web.bind.annotation.RequestParam;

import com.furlencoapp.model.FurnitureDTO;
import com.furlencoapp.service.IFurnitureService;

@RestController
@RequestMapping("/api/furniture")
@CrossOrigin(origins = "http://localhost:4200/")
public class FurnitureController {

    private IFurnitureService furnitureService;

    public FurnitureController(IFurnitureService furnitureService) {
        this.furnitureService = furnitureService;
    }

    @PostMapping("/add")
    ResponseEntity<Void> addFurniture(@RequestBody FurnitureDTO furnitureDTO) {
        furnitureService.addFurniture(furnitureDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PutMapping("/update")
    ResponseEntity<FurnitureDTO> updateFurniture(@RequestBody FurnitureDTO furnitureDTO) {
        FurnitureDTO furnitureDto= furnitureService.updateFurniture(furnitureDTO);
        HttpHeaders headers=new HttpHeaders();
	    headers.add("desc","updated one furniture");
	     
	    return ResponseEntity.accepted().headers(headers).body(furnitureDto);
    }

     @DeleteMapping("/delete/{furnitureId}")
     ResponseEntity<Void> deleteFurniture(@PathVariable String furnitureId) {
         furnitureService.deleteFurniture(furnitureId);
         return ResponseEntity.status(HttpStatus.ACCEPTED).build();
     }
    
    @GetMapping("/all")
    ResponseEntity<List<FurnitureDTO>> getAll(){
    	
    	 List<FurnitureDTO> furnitureDTO= furnitureService.getAllFurniture();
         HttpHeaders headers=new HttpHeaders();
         headers.add("desc","Getting the all list of furniture");
         headers.add("time retrieved", LocalDateTime.now().toString());
         ResponseEntity<List<FurnitureDTO>> responseEntity=new ResponseEntity<List<FurnitureDTO>>(furnitureDTO,headers,HttpStatus.OK);
         return responseEntity;
    } 

     @GetMapping("/id/{furnitureId}")
    ResponseEntity<FurnitureDTO> findByID(@PathVariable("furnitureId") String furnitureId) {
    	FurnitureDTO furnitureDtos = furnitureService.getByFurnitureId(furnitureId);
        HttpHeaders headers=new HttpHeaders();
        headers.add("desc","Getting the list of furniture by name");
        return ResponseEntity.ok().headers(headers).body(furnitureDtos);
    }
    
    @GetMapping("/name/{furnitureName}")
    ResponseEntity<FurnitureDTO> findByFurnitureName(@PathVariable("furnitureName") String furnitureName) {
    	FurnitureDTO furnitureDtos = furnitureService.getByFurnitureName(furnitureName);
        HttpHeaders headers=new HttpHeaders();
        headers.add("desc","Getting the list of furniture by name");
        return ResponseEntity.ok().headers(headers).body(furnitureDtos);
    }

    @GetMapping("/price/{price}")
    ResponseEntity<List<FurnitureDTO>> findByPrice(@PathVariable double price) {
    	List<FurnitureDTO> furnitureDTO= furnitureService.getByPrice(price);
        HttpHeaders headers=new HttpHeaders();
        headers.add("desc","Getting the list of furniture by price");
        headers.add("time retrieved", LocalDateTime.now().toString());
        ResponseEntity<List<FurnitureDTO>> responseEntity=new ResponseEntity<List<FurnitureDTO>>(furnitureDTO,headers,HttpStatus.OK);
        return responseEntity;    
     
    }

    @GetMapping("/catagory/{catagory}")
    ResponseEntity<List<FurnitureDTO>> findByType(@PathVariable String catagory) {
    	List<FurnitureDTO> furnitureDTO= furnitureService.getByCatagory(catagory);
        HttpHeaders headers=new HttpHeaders();
        headers.add("desc","Getting the list of furniture by type");
        headers.add("time retrieved", LocalDateTime.now().toString());
        ResponseEntity<List<FurnitureDTO>> responseEntity=new ResponseEntity<List<FurnitureDTO>>(furnitureDTO,headers,HttpStatus.OK);
        return responseEntity;   
    }

    @GetMapping("/review-star/{reviewStar}")
    ResponseEntity<List<FurnitureDTO>>findByReviewStar(@PathVariable String reviewStar) {
    	List<FurnitureDTO> furnitureDTO= furnitureService.getByReviewStar(reviewStar);
        HttpHeaders headers=new HttpHeaders();
        headers.add("desc","Getting the list of furniture by type");
        headers.add("time retrieved", LocalDateTime.now().toString());
        ResponseEntity<List<FurnitureDTO>> responseEntity=new ResponseEntity<List<FurnitureDTO>>(furnitureDTO,headers,HttpStatus.OK);
        return responseEntity;  
    }

//    @GetMapping("/name-price")
//    ResponseEntity<List<FurnitureDTO>>findByFurnitureNameAndPrice(@RequestParam String furnitureName, @RequestParam double price) {
//    	List<FurnitureDTO> furnitureDTO= furnitureService.getByFurnitureNameAndPrice(furnitureName, price);
//        HttpHeaders headers=new HttpHeaders();
//        headers.add("desc","Getting the list of furniture by type");
//        headers.add("time retrieved", LocalDateTime.now().toString());
//        ResponseEntity<List<FurnitureDTO>> responseEntity=new ResponseEntity<List<FurnitureDTO>>(furnitureDTO,headers,HttpStatus.OK);
//        return responseEntity;  
//    }
//
//    @GetMapping("/name-size")
//    ResponseEntity<List<FurnitureDTO>> findByFurnitureNameAndSize(@RequestParam String furnitureName, @RequestParam String size) {
//    	List<FurnitureDTO> furnitureDTO= furnitureService.getByFurnitureNameAndSize(furnitureName, size);
//        HttpHeaders headers=new HttpHeaders();
//        headers.add("desc","Getting the list of furniture by type");
//        headers.add("time retrieved", LocalDateTime.now().toString());
//        ResponseEntity<List<FurnitureDTO>> responseEntity=new ResponseEntity<List<FurnitureDTO>>(furnitureDTO,headers,HttpStatus.OK);
//        return responseEntity;  
//    }
//
//    @GetMapping("/name-review-star")
//    ResponseEntity<List<FurnitureDTO>> findByFurnitureNameAndReviewStar(@RequestParam String furnitureName, @RequestParam String reviewStar) {
//    	List<FurnitureDTO> furnitureDTO= furnitureService.getByFurnitureNameAndReviewStar(furnitureName, reviewStar);
//        HttpHeaders headers=new HttpHeaders();
//        headers.add("desc","Getting the list of furniture by type");
//        headers.add("time retrieved", LocalDateTime.now().toString());
//        ResponseEntity<List<FurnitureDTO>> responseEntity=new ResponseEntity<List<FurnitureDTO>>(furnitureDTO,headers,HttpStatus.OK);
//        return responseEntity;  
//    }
//
//    @GetMapping("/price-size")
//    ResponseEntity<List<FurnitureDTO>> findByPriceAndSize(@RequestParam double price, @RequestParam String size) {
//    	List<FurnitureDTO> furnitureDTO= furnitureService.getByPriceAndSize(price, size);
//        HttpHeaders headers=new HttpHeaders();
//        headers.add("desc","Getting the list of furniture by type");
//        headers.add("time retrieved", LocalDateTime.now().toString());
//        ResponseEntity<List<FurnitureDTO>> responseEntity=new ResponseEntity<List<FurnitureDTO>>(furnitureDTO,headers,HttpStatus.OK);
//        return responseEntity;  
//    }
//
//    @GetMapping("/price-type")
//    ResponseEntity<List<FurnitureDTO>> findByPriceAndType(@RequestParam double price, @RequestParam String type) {
//    	List<FurnitureDTO> furnitureDTO= furnitureService.getByPriceAndType(price, type);
//        HttpHeaders headers=new HttpHeaders();
//        headers.add("desc","Getting the list of furniture by type");
//        headers.add("time retrieved", LocalDateTime.now().toString());
//        ResponseEntity<List<FurnitureDTO>> responseEntity=new ResponseEntity<List<FurnitureDTO>>(furnitureDTO,headers,HttpStatus.OK);
//        return responseEntity;  
//    }
//
//    @GetMapping("/price-review-star")
//    ResponseEntity<List<FurnitureDTO>> findByPriceAndReviewStar(@RequestParam double price, @RequestParam String reviewStar) {
//    	List<FurnitureDTO> furnitureDTO= furnitureService.getByPriceAndReviewStar(price, reviewStar);
//        HttpHeaders headers=new HttpHeaders();
//        headers.add("desc","Getting the list of furniture by type");
//        headers.add("time retrieved", LocalDateTime.now().toString());
//        ResponseEntity<List<FurnitureDTO>> responseEntity=new ResponseEntity<List<FurnitureDTO>>(furnitureDTO,headers,HttpStatus.OK);
//        return responseEntity;  
//    }
}

