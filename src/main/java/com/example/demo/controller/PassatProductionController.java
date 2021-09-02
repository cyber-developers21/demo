package com.example.demo.controller;

import com.example.demo.domain.enum_type.ColourPalette;
import com.example.demo.domain.enum_type.DriveType;
import com.example.demo.domain.enum_type.EngineType;
import com.example.demo.domain.enum_type.GearBoxType;
import com.example.demo.domain.enum_type.ModelType;
import com.example.demo.domain.model.Vehicle;
import com.example.demo.domain.model.engine.Engine;
import com.example.demo.domain.model.engine.GearBox;
import com.example.demo.service.impl.PassatProductionServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.SwaggerDefinition;
import io.swagger.annotations.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/passat-production")
@Api(tags = {"Passat Production"})
@SwaggerDefinition(tags = {
        @Tag(name = "Passat Production", description = "Release new Passat")
})
public class PassatProductionController {

    private final PassatProductionServiceImpl passatProductionService;

    public PassatProductionController(PassatProductionServiceImpl passatProductionService) {
        this.passatProductionService = passatProductionService;
    }

    @ApiOperation(value = "Build and get Prototype")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 422, message = "Unprocessable entity")
    })
    @GetMapping("release-passat")
    public Vehicle buildPrototype() {

        Engine engine = new Engine();
        engine.setTork(320);
        engine.setHorsePower(150);
        engine.setVolume(2500);
        engine.setEngineType(EngineType.DIESEL);

        GearBox gearBox = new GearBox();
        gearBox.setGearBoxType(GearBoxType.MANUAL);
        gearBox.setNumberOfGears(5);

        return passatProductionService.releaseNewCar(ColourPalette.BLUE, ModelType.SEDAN, DriveType.AUTONOM,
                engine, gearBox);
    }
}
