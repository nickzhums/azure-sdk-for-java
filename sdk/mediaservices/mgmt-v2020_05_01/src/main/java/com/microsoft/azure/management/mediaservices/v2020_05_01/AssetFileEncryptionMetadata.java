/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.mediaservices.v2020_05_01;

import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Asset File Storage encryption metadata.
 */
public class AssetFileEncryptionMetadata {
    /**
     * The Asset File initialization vector.
     */
    @JsonProperty(value = "initializationVector")
    private String initializationVector;

    /**
     * The Asset File name.
     */
    @JsonProperty(value = "assetFileName")
    private String assetFileName;

    /**
     * The Asset File Id.
     */
    @JsonProperty(value = "assetFileId", required = true)
    private UUID assetFileId;

    /**
     * Get the Asset File initialization vector.
     *
     * @return the initializationVector value
     */
    public String initializationVector() {
        return this.initializationVector;
    }

    /**
     * Set the Asset File initialization vector.
     *
     * @param initializationVector the initializationVector value to set
     * @return the AssetFileEncryptionMetadata object itself.
     */
    public AssetFileEncryptionMetadata withInitializationVector(String initializationVector) {
        this.initializationVector = initializationVector;
        return this;
    }

    /**
     * Get the Asset File name.
     *
     * @return the assetFileName value
     */
    public String assetFileName() {
        return this.assetFileName;
    }

    /**
     * Set the Asset File name.
     *
     * @param assetFileName the assetFileName value to set
     * @return the AssetFileEncryptionMetadata object itself.
     */
    public AssetFileEncryptionMetadata withAssetFileName(String assetFileName) {
        this.assetFileName = assetFileName;
        return this;
    }

    /**
     * Get the Asset File Id.
     *
     * @return the assetFileId value
     */
    public UUID assetFileId() {
        return this.assetFileId;
    }

    /**
     * Set the Asset File Id.
     *
     * @param assetFileId the assetFileId value to set
     * @return the AssetFileEncryptionMetadata object itself.
     */
    public AssetFileEncryptionMetadata withAssetFileId(UUID assetFileId) {
        this.assetFileId = assetFileId;
        return this;
    }

}
