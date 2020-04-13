// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.

package com.azure.search.documents.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for DataSourceType.
 */
public final class DataSourceType extends ExpandableStringEnum<DataSourceType> {
    /**
     * Static value azuresql for DataSourceType.
     */
    public static final DataSourceType AZURE_SQL = fromString("azuresql");

    /**
     * Static value cosmosdb for DataSourceType.
     */
    public static final DataSourceType COSMOS = fromString("cosmosdb");

    /**
     * Static value azureblob for DataSourceType.
     */
    public static final DataSourceType AZURE_BLOB = fromString("azureblob");

    /**
     * Static value azuretable for DataSourceType.
     */
    public static final DataSourceType AZURE_TABLE = fromString("azuretable");

    /**
     * Static value mysql for DataSourceType.
     */
    public static final DataSourceType MY_SQL = fromString("mysql");

    /**
     * Creates or finds a DataSourceType from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding DataSourceType.
     */
    @JsonCreator
    public static DataSourceType fromString(String name) {
        return fromString(name, DataSourceType.class);
    }

    /**
     * @return known DataSourceType values.
     */
    public static Collection<DataSourceType> values() {
        return values(DataSourceType.class);
    }
}