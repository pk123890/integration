package io.swagger.api;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;


@FeignClient(name = proxyname, url = "https://fluffy-mink.dev.with-datafire.io")
public interface Proxy {
    ProxyData
}
