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

package org.qubership.integration.platform.runtime.catalog.persistence.configs.entity.system;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;
import lombok.extern.slf4j.Slf4j;
import org.qubership.integration.platform.runtime.catalog.persistence.configs.entity.AbstractLabel;

import java.util.Objects;

@Getter
@Setter
@Slf4j
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "model_labels")
public class SystemModelLabel extends AbstractLabel {

    @JsonIgnore
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "model_id")
    private SystemModel specification;

    public SystemModelLabel(final String name, final SystemModel specification) {
        this(name, specification, false);
    }

    public SystemModelLabel(final String name, final SystemModel specification, final boolean technical) {
        super(name, technical);
        this.specification = specification;
    }


    @Override
    public boolean equals(Object object) {
        return equals(object, true);
    }

    public boolean equals(Object o, boolean strict) {
        if (!super.equals(o, strict)) {
            return false;
        }

        SystemModelLabel that = (SystemModelLabel) o;
        return Objects.equals(that.specification, this.specification);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + Objects.hash(specification == null ? null : specification.getId());
    }
}
