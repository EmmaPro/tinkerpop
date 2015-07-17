/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.tinkerpop.gremlin.process.traversal.step.map

import org.apache.tinkerpop.gremlin.process.traversal.Traversal
import org.apache.tinkerpop.gremlin.process.traversal.util.TraversalScriptHelper
import org.apache.tinkerpop.gremlin.structure.Vertex

/**
 *
 * @author Daniel Kuppitz (http://gremlin.guru)
 */
public abstract class GroovyMapKeysTest {

    public static class Traversals extends MapKeysTest {

        @Override
        public Traversal<Vertex, Double> get_g_V_outE_valuesXweightX_groupCount_mapKeys() {
            TraversalScriptHelper.compute("g.V.outE().weight.groupCount().mapKeys()", g)
        }

        @Override
        public Traversal<Vertex, Double> get_g_V_outE_valuesXweightX_groupCount_unfold_mapKeys() {
            TraversalScriptHelper.compute("g.V.outE().weight.groupCount().unfold().mapKeys()", g)
        }
    }
}
