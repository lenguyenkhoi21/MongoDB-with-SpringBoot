package com.nguyenkhoi.mongoddd.controller;

import com.nguyenkhoi.mongoddd.document.Hello;
import com.nguyenkhoi.mongoddd.service.HelloSerivce;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private final HelloSerivce serivce;

    public HelloController(HelloSerivce serivce) {
        this.serivce = serivce;
    }



    @GetMapping("/hello/{id}")
    @Operation(summary = "Query hello table in database", description = "Info the id")
    @Parameter(description = "id of hello")
    @ApiResponses(
            value = {
                    @ApiResponse(responseCode = "200", description = "Successfully"),
                    @ApiResponse(responseCode = "500", description = "Bug")
            }
    )
    public Hello getHello(@PathVariable("id") int id) {
        return serivce.getHello(id);
    }
}
