package com.xiaomi.youpin.gwdash.bo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author wtt
 * @version 1.0
 * @description
 * @date 2021/8/25 14:44
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DockerScaleBo {
    private Long projectId;
    private Long envId;
    private String mioneEnv;
    private List<String> ips;
}