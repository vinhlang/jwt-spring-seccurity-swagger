package org.zerhusen.security.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("protected")
@Api(value = "protected", description = "", tags = "Protected")
public class MethodProtectedRestController {

    @ApiOperation(value = "The login request", response = Void.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "Admin founded", response = String.class)
        ,
            @ApiResponse(code = 403, message = "Not admin")
    })

    @RequestMapping(value = "admin", method = RequestMethod.GET)
    @PreAuthorize("hasRole('ADMIN')")
    public ResponseEntity<?> getProtectedGreeting(@ApiParam(value = "token for request") @RequestHeader("Authorization") String token) {
        return ResponseEntity.ok("Greetings from admin protected method!");
    }

    @ApiOperation(value = "The login request", response = Void.class)
    @ApiResponses(value = {
        @ApiResponse(code = 200, message = "success", response = String.class)
    })
    @RequestMapping(value = "public", method = RequestMethod.GET)
    public ResponseEntity<?> getGreeting(@ApiParam(value = "token for request") @RequestHeader("Authorization") String token) {
        return ResponseEntity.ok("Greetings from public method!");
    }

}
