package org.jetbrains.assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class InputDataController {

        @Autowired
        private InputDataService inputDataService;
    @PostMapping(path = "/locations")
    public ResponseEntity<String> create(@RequestBody InputData newInputData)
    {
        Coordinates coordinates = new Coordinates(0,0);

        return new ResponseEntity<String>(coordinates.getAsJSON(), HttpStatus.ACCEPTED);
    }

}
