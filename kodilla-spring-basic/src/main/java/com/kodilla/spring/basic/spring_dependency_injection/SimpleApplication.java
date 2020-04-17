package com.kodilla.spring.basic.spring_dependency_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class SimpleApplication {

    //utworzylismy interfejs i teraz konstruktor klasy SA go przejmuje
    // jednak w ten sposób powstały 4 beany typu MessageService i Spring nie wie którego uzyć
    //dlatego wracamy do wstrzykiwania zależności przez pole
//    private MessageService messageService;
//
//    public SimpleApplication(MessageService messageService) {
//        this.messageService = messageService;
//    }

    //wstrzykiwanie przez pole
    //musimy wskazac dokładnie jaki obiekt wstrzykujemy
    @Autowired
    @Qualifier(value = "skypeMessageService")
    //@Resource(name = "skypeMessageService")
    private SkypeMessageService messageService;


//      wstrzykiwanie przez konstruktor
//    public SimpleApplication(SkypeMessageService messageService) {
//        this.messageService = messageService;
//    }

    // wstrzykiwanie przez setter
//    @Autowired
//    public void setMessageService(SkypeMessageService messageService) {
//        this.messageService = messageService;
//    }

    public String processMessage(String message, String receiver) {
        if (checkReceiver(receiver)) {
            return this.messageService.send(message, receiver);
        }
        return null;
    }

    private boolean checkReceiver(String receiver) {
        return receiver != null && !receiver.isEmpty();
    }
}
