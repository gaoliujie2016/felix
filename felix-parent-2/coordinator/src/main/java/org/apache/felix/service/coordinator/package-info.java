/*
 * Copyright (c) OSGi Alliance (2004, 2010). All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Coordinator Package Version 1.0.
 * <p>
 * Bundles wishing to use this package must list the package in the
 * Import-Package header of the bundle's manifest.
 * <p>
 * This package has two types of users: the consumers that use the API in this
 * package and the providers that implement the API in this package.
 * <p>
 * Example import for consumers using the API in this package: <blockquote>
 * <code>Import-Package: org.apache.felix.service.coordinator; version="[1.0,2.0)"; status="provisional"</code>
 * </blockquote>
 * <p>
 * Example import for providers implementing the API in this package:
 * <blockquote>
 * <code>Import-Package: org.apache.felix.service.coordinator; version="[1.0,1.1)"; status="provisional"</code>
 * </blockquote>
 *
 * @Provisional
 */
@Deprecated
package org.apache.felix.service.coordinator;