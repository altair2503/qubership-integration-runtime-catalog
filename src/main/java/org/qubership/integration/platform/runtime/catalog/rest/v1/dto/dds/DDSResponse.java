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

package org.qubership.integration.platform.runtime.catalog.rest.v1.dto.dds;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "Chain detailed design response object")
public class DDSResponse {
    @Schema(description = "Detailed design main document")
    private String document;
    @Schema(description = "Simple sequence diagram (mermaid)")
    private String simpleSeqDiagramMermaid;
    @Schema(description = "Simple sequence diagram (plantuml)")
    private String simpleSeqDiagramPlantuml;
    @Schema(description = "HTTP Trigger (Implemented) specifications")
    private List<DDSSpecificationSource> triggerSpecifications;
}
