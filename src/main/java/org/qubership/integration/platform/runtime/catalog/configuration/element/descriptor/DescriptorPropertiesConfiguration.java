/*
 * Copyright 2024-2025 NetCracker Technology Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.qubership.integration.platform.runtime.catalog.configuration.element.descriptor;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.PropertyPlaceholderHelper;
import org.springframework.util.SystemPropertyUtils;

@Configuration
@EnableConfigurationProperties(ElementDescriptorProperties.class)
public class DescriptorPropertiesConfiguration {

    @Bean
    public PropertyPlaceholderHelper propertyPlaceholderHelper() {
        return new PropertyPlaceholderHelper(
                SystemPropertyUtils.PLACEHOLDER_PREFIX,
                SystemPropertyUtils.PLACEHOLDER_SUFFIX
        );
    }
}
