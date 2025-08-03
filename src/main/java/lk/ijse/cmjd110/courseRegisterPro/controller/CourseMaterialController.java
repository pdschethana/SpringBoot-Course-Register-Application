package lk.ijse.cmjd110.courseRegisterPro.controller;

import lk.ijse.cmjd110.courseRegisterPro.dto.CourseMaterialDTO;
import org.springframework.cglib.core.Local;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Base64;

@RestController
@RequestMapping("api/v1/material")
public class CourseMaterialController {

    @PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<CourseMaterialDTO> saveMaterial(
            @RequestParam ("materialIdentity") String materialId,
            @RequestParam String fileName,
            @RequestParam String materialType,
            @RequestParam MultipartFile material,

            @RequestParam (required = false) String uploadAt, // if you want , y can prevent from entering data.so  required=false is used

            @RequestParam String courseId
            ){

        // You should implement the logic here to save the material

        // Placeholder return
        //step 1- create an object from incoming multipart data
        var courseMaterial = new CourseMaterialDTO();
try {
    // step 2- Build a multipartFile as a String
    // step 2.1- create a Byte collection from the multipartFile

    byte[] materialBytes=material.getBytes();

    // step 2.2- Develop a base64 String based on the byte collection
    String base64Material=Base64.getEncoder().encodeToString(materialBytes);

    // step 3- Handle upload time
    String uploadTime=uploadAt != null ? uploadAt : LocalDate.now().format(DateTimeFormatter.ISO_DATE);

    // step 4- Build the entire object
    courseMaterial.setMaterialId(materialId);
    courseMaterial.setFileName(fileName);
    courseMaterial.setMaterialType(materialType);
    courseMaterial.setMaterial(base64Material);
    courseMaterial.setUploadAt(uploadTime);
    courseMaterial.setCourseId(courseId);



}catch (Exception ex){
    ex.printStackTrace();
}

        return ResponseEntity.ok(courseMaterial);
    }
}
