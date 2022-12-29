package id.co.diansetiyadi.firebaseservice.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class FirebaseService {

    public Object sendFirebase(String message) {

        log.info("Send Google FCM with data : {}", message);
        return null;
    }
}
