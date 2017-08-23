//package org.zerhusen.rest;
//
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiParam;
//import io.swagger.annotations.ApiResponse;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.util.ArrayList;
//import java.util.List;
//import org.springframework.web.bind.annotation.RequestHeader;
//
//@RestController
//@RequestMapping("person")
//@Api(value = "person info", description = "get person info")
//public class PersonRestService {
//
//    private static final List<Person> persons;
//
//    static {
//        persons = new ArrayList<>();
//        persons.add(new Person("Hello", "World"));
//        persons.add(new Person("Foo", "Bar"));
//    }
//
//    @ApiOperation(value = "get list person info", response = Void.class, tags = {"person info"})
//    @ApiResponse(code = 200, message = "successful operation", response = Person.class, responseContainer = "List")
//    @RequestMapping(method = RequestMethod.GET)
//    public static List<Person> getPersons(@ApiParam(value = "token for request", required = true) @RequestHeader("Authorization") String token) {
//        return persons;
//    }
//
////    @RequestMapping(path = "/persons/{name}", method = RequestMethod.GET)
////    public static Person getPerson(@PathVariable("name") String name, @RequestHeader("Authorization") String token) {
////        return persons.stream()
////                .filter(person -> name.equalsIgnoreCase(person.getName()))
////                .findAny().orElse(null);
////    }
//}
