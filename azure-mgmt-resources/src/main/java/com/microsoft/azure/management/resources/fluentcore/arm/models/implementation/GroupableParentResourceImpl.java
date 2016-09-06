/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.resources.fluentcore.arm.models.implementation;

import com.microsoft.azure.management.resources.fluentcore.arm.implementation.ManagerBase;
import com.microsoft.azure.management.resources.fluentcore.arm.models.GroupableResource;
import com.microsoft.azure.management.resources.fluentcore.arm.models.Resource;
import com.microsoft.rest.ServiceResponse;

import rx.Observable;

/**
 * The implementation for {@link GroupableResource}.
 * (Internal use only)
 *
 * @param <FluentModelT> The fluent model type
 * @param <InnerModelT> Azure inner resource class type
 * @param <FluentModelImplT> the implementation type of the fluent model type
 * @param <ManagerT> the service manager type
 */
public abstract class GroupableParentResourceImpl<
        FluentModelT extends Resource,
        InnerModelT extends com.microsoft.azure.Resource,
        FluentModelImplT extends GroupableParentResourceImpl<FluentModelT, InnerModelT, FluentModelImplT, ManagerT>,
        ManagerT extends ManagerBase>
        extends
            GroupableResourceImpl<FluentModelT, InnerModelT, FluentModelImplT, ManagerT>
        implements
            GroupableResource {

    protected GroupableParentResourceImpl(
            String name,
            InnerModelT innerObject,
            ManagerT manager) {
        super(name, innerObject, manager);
        initializeChildrenFromInner();
    }

    protected abstract Observable<ServiceResponse<InnerModelT>> createInner();
    protected abstract void initializeChildrenFromInner();
    protected abstract void beforeCreating();
    protected abstract void afterCreating();
}
