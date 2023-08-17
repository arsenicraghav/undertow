package com.educatereality;

import com.educatereality.handler.ItemHandler;
import com.educatereality.util.JsonSerializationHandler;
import io.undertow.Handlers;
import io.undertow.server.RoutingHandler;
import io.undertow.server.handlers.PathHandler;

public class APIRoutes {

    public PathHandler get() {
        RoutingHandler apiRoutes = Handlers
                .routing()
                .get("/items", ItemHandler::get)
                .get("/items/{id}", ItemHandler::getById)
                .post("/items", ItemHandler::post)
                .delete("/items", ItemHandler::delete);

        return Handlers
                .path()
                .addPrefixPath("/api", new JsonSerializationHandler(apiRoutes));
    }
}
