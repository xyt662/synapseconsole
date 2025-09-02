package io.github.xyt662.synapseconsole.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/** 缓存预热定时任务骨架 */
@Component
public class CacheWarmUpJob {
    @Scheduled(cron = "0 0/10 * * * ?")
    public void warmUp(){ /* 预加载热点数据 */ }
}