package com.parquesoft.backendcloneimdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class BackendCloneImdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendCloneImdbApplication.class, args);
	}
	@GetMapping(path="/healt-check")
	public String getStatus(){
		return "OK";
	}

	@GetMapping(path="/")
	public List<String> getNames(){
		return List.of("Juan","Maria","Pedro");
	}

}
