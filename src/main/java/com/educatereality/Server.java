package com.educatereality;

import io.undertow.Undertow;

public class Server {
    private Undertow undertow;

    private Undertow configure() {

        return undertow = Undertow
                .builder()
                .addHttpListener(8080, "0.0.0.0")   // 0.0.0.0 means "listen on ALL available addresses"
                .setHandler(new APIRoutes().get())
                //.setHandler(new StaticHandler())
                .build();
    }

    public void start() {
        configure();
        undertow.start();
    }

    public void stop() {
        if (undertow != null) {
            undertow.stop();
        }
    }
}
