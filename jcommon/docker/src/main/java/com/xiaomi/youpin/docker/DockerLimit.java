/*
 *  Copyright 2020 Xiaomi
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.xiaomi.youpin.docker;

import lombok.Builder;
import lombok.Data;

/**
 * @author goodjava@qq.com
 */
@Data
@Builder
public class DockerLimit {

    /**
     * --cpuset-cpus="1,3"
     * --cpuset-cpus="0-2"
     */
    private String cpu;
    private Long mem;

    /**
     * 10-1000  默认是500
     */
    private Integer blkioWeight;


    /**
     * 不绑定cpu
     */
    private boolean useCpus;


    /**
     * cpu 的数量,可以是0.1
     */
    private float cpuNum;

}
