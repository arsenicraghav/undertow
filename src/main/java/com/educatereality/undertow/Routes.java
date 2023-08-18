package com.educatereality.undertow;

import com.educatereality.handler.HttpRequestHandler;
import com.educatereality.handler.ItemHandler;
import com.educatereality.handler.StaticHandler;
import io.undertow.Handlers;
import io.undertow.server.RoutingHandler;
import io.undertow.server.handlers.PathHandler;

public class Routes {

    public PathHandler getAll() {
        RoutingHandler apiRoutes = Handlers
                .routing()
                .get("/items", new ItemHandler()::get)
                .get("/items/{id}", new ItemHandler()::getById)
                .post("/items", new ItemHandler()::post)
                .delete("/items", new ItemHandler()::delete);

        return Handlers
                .path()
                .addPrefixPath("/api", new HttpRequestHandler(apiRoutes))
                .addExactPath("/", new StaticHandler());
    }
}
