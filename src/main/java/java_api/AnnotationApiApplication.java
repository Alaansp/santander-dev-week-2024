package java_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class AnnotationApiApplication {

    private List<String> annotations = new ArrayList<>();

    @PostMapping("/annotations")
    public void saveAnnotation(@RequestBody String annotation) {
        annotations.add(annotation);
    }

    @GetMapping("/annotations")
    public List<String> getAnnotations() {
        return annotations;
    }

    public static void main(String[] args) {
        SpringApplication.run(AnnotationApiApplication.class, args);
    }

}
