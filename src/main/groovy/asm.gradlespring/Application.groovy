package asm.gradlespring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.scheduling.annotation.EnableScheduling

import static org.springframework.boot.SpringApplication.run

@SpringBootApplication
@EnableScheduling
class Application {

    static void main(String[] args) {
        run Application, args
    }


}