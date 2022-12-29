package id.co.diansetiyadi.firebaseservice.consumer;

import com.google.gson.Gson;
import id.co.diansetiyadi.firebaseservice.service.FirebaseService;
import id.co.diansetiyadi.firebaseservice.util.FirebaseConstants;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class FirebaseConsumer {

    private final FirebaseService firebaseService;
    private final Gson gson;

    @Autowired
    public FirebaseConsumer(FirebaseService firebaseService, Gson gson) {
        this.firebaseService = firebaseService;
        this.gson = gson;
    }

    @KafkaListener(topics = FirebaseConstants.TOPIC_NOTIFICAITON_FIREBASE, groupId = "notification")
    public void consumeMessageFirebase(String message) {
        log.info("Consume Kafka : {}", gson.toJson(message));
        firebaseService.sendFirebase(message);
    }
}
