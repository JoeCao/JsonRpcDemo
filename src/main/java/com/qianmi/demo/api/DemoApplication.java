package com.qianmi.demo.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@SpringBootApplication
@ComponentScan(basePackages = {"com.qianmi.demo"})
public class DemoApplication {
    private static final Logger log = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) throws UnknownHostException {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        Environment env = app.run(args).getEnvironment();
        int port = Integer.parseInt(env.getProperty("server.port"));
        log.info(
                "Access URLs:\n----------------------------------------------------------\n\t"
                        + "Local:      http://127.0.0.1:{}\n\t"
                        + "External:   http://{}:{}\n----------------------------------------------------------",
                port, port, InetAddress.getLocalHost().getHostAddress(), port
        );

    }
}
