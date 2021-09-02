package com.example.demo.controller;

import com.example.demo.domain.model.Prototype;
import com.example.demo.service.impl.prototype.PassatPrototypeServiceImpl;
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
@RequestMapping("/api/prototype")
@Api(tags = {"Prototype"})
@SwaggerDefinition(tags = {
        @Tag(name = "Prototype", description = "Build prototype")
})
public class PrototypeController {

    private final PassatPrototypeServiceImpl passatPrototypeService;

    public PrototypeController(PassatPrototypeServiceImpl passatPrototypeService) {
        this.passatPrototypeService = passatPrototypeService;
    }

    @ApiOperation(value = "Build and get Prototype")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "OK"),
            @ApiResponse(code = 201, message = "Created"),
            @ApiResponse(code = 403, message = "Forbidden"),
            @ApiResponse(code = 404, message = "Not Found"),
            @ApiResponse(code = 422, message = "Unprocessable entity")
    })
    @GetMapping("build-and-get-passat-prototype")
    public Prototype buildPrototype() {
        return passatPrototypeService.buildPrototype();
    }
}
