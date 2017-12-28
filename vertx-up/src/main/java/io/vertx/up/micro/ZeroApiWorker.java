package io.vertx.up.micro;

import com.google.gson.JsonObject;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.impl.ConcurrentHashSet;
import io.vertx.servicediscovery.ServiceDiscovery;
import io.vertx.up.annotations.Worker;
import io.vertx.up.eon.em.MessageModel;
import io.vertx.up.micro.spider.EtcdOrgin;
import io.vertx.up.micro.spider.Orgin;
import io.vertx.up.tool.mirror.Instance;

import java.util.Set;

/**
 * Backend for service discovery
 */
@Worker(MessageModel.DISCOVERY_PUBLISH)
public class ZeroApiWorker extends AbstractVerticle {

    private static final Orgin ORIGIN = Instance.singleton(EtcdOrgin.class);
    private static final Set<JsonObject> SERVICES = new ConcurrentHashSet<>();

    @Override
    public void start() {
        final ServiceDiscovery discovery = ServiceDiscovery.create(this.vertx);

    }
}
