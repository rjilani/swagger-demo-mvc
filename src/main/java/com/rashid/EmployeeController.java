package com.rashid;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @RequestMapping(method = RequestMethod.GET, value = "/hi")
    public String getHello() {
        return "hello Employee";
    }

    @Operation(summary = "Get a person by its id")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Retuen List of Employees",
                    content = { @Content(mediaType = "application/json") }),
            @ApiResponse(responseCode = "400", description = "Invalid id supplied",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Employees not found",
                    content = @Content) })
    @RequestMapping(method = RequestMethod.GET, value = "/employees", produces = "application/json")
    public List<String> getEmployess() {
        return new ArrayList<>(Arrays.asList("Rashid", "John"));
    }
}
