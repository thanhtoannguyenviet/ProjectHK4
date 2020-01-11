package Server.controller;

import Server.model.DAO.UserDAO;
import Server.model.DB.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
@RestController
public class UserController {
    @Autowired
    private UserDAO account;
    @RequestMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome to RestTemplate Example.";
    }
    @RequestMapping(value = "/Account", //
            method = RequestMethod.GET, //
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public ResponseEntity<Iterable<UserEntity>> getListEmployees() {
        return new ResponseEntity<>(account.getAllAccount(), HttpStatus.OK);
    }
    @RequestMapping(value = "/Account/{accid}",
            method = RequestMethod.GET,
            produces = { MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE })
    @ResponseBody
    public ResponseEntity<UserEntity> getEmployee(@PathVariable("accid") int accid){
        return new ResponseEntity<>(account.GetAccountByID(accid),HttpStatus.OK);
    }
    @RequestMapping(value = "/Account/",
            method = RequestMethod.POST)
    @ResponseBody
    public ResponseEntity<?> postAccount(@RequestBody UserEntity user){
        account.CreateAccount(user);
        HttpHeaders responseHeader=new HttpHeaders();
        URI newAccounUrl= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(user.getId()).toUri();
        responseHeader.setLocation(newAccounUrl);
        return new ResponseEntity<>(null,responseHeader,HttpStatus.CREATED);
    }
    @RequestMapping(value = "/Account/{accid}",
            method = RequestMethod.PUT)
    @ResponseBody
    public  ResponseEntity<?> updateAccount(@RequestBody UserEntity user,@PathVariable Long accid){
        account.CreateAccount(user);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    @RequestMapping(value = "/Account/{accid}",
            method = RequestMethod.DELETE
    )
    @ResponseBody
    public ResponseEntity<?> deleteAccount(@PathVariable("accid") int accid){
        account.DeleteAccount(accid);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
