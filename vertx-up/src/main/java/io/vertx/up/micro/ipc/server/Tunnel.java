package io.vertx.up.micro.ipc.server;

import io.grpc.BindableService;
import io.vertx.core.Vertx;
import io.vertx.up.web.ZeroAnno;

import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentMap;

/**
 * Rpc Service
 */
public interface Tunnel {
    /**
     * Create new Rpc Service by type
     *
     * @return
     */
    BindableService init(Vertx vertx);

    ConcurrentMap<String, Method> IPCS
            = ZeroAnno.getIpcs();
}
