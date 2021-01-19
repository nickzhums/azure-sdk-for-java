# Resource Coverage Report


<br/>
<details>
<summary> appplatform </summary>

* BindingsClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String serviceName, java.lang.String appName, java.lang.String bindingName)
    * updateAsync(java.lang.String resourceGroupName, java.lang.String serviceName, java.lang.String appName, java.lang.String bindingName)

* CertificatesClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String serviceName, java.lang.String certificateName)

* ConfigServersClient
    * updatePatchAsync(java.lang.String resourceGroupName, java.lang.String serviceName)
    * updatePutAsync(java.lang.String resourceGroupName, java.lang.String serviceName)

* CustomDomainsClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String serviceName, java.lang.String appName, java.lang.String domainName)
    * updateAsync(java.lang.String resourceGroupName, java.lang.String serviceName, java.lang.String appName, java.lang.String domainName)

* DeploymentsClient
    * listForClusterAsync(java.lang.String resourceGroupName, java.lang.String serviceName)

* MonitoringSettingsClient
    * updatePatchAsync(java.lang.String resourceGroupName, java.lang.String serviceName)
    * updatePutAsync(java.lang.String resourceGroupName, java.lang.String serviceName)

</details>

<br/>
<details>
<summary> appservice </summary>

* AppServiceCertificateOrdersClient
    * resendRequestEmailsAsync(java.lang.String resourceGroupName, java.lang.String certificateOrderName)

* AppServiceEnvironmentsClient
    * listUsagesAsync(java.lang.String resourceGroupName, java.lang.String name)
    * listWebAppsAsync(java.lang.String resourceGroupName, java.lang.String name)

* AppServicePlansClient
    * listUsagesAsync(java.lang.String resourceGroupName, java.lang.String name)
    * listWebAppsAsync(java.lang.String resourceGroupName, java.lang.String name)
    * restartWebAppsAsync(java.lang.String resourceGroupName, java.lang.String name)

* DiagnosticsClient
    * executeSiteAnalysisAsync(java.lang.String resourceGroupName, java.lang.String siteName, java.lang.String diagnosticCategory, java.lang.String analysisName)
    * executeSiteAnalysisSlotAsync(java.lang.String resourceGroupName, java.lang.String siteName, java.lang.String diagnosticCategory, java.lang.String analysisName, java.lang.String slot)
    * executeSiteDetectorAsync(java.lang.String resourceGroupName, java.lang.String siteName, java.lang.String detectorName, java.lang.String diagnosticCategory)
    * executeSiteDetectorSlotAsync(java.lang.String resourceGroupName, java.lang.String siteName, java.lang.String detectorName, java.lang.String diagnosticCategory, java.lang.String slot)
    * getHostingEnvironmentDetectorResponseAsync(java.lang.String resourceGroupName, java.lang.String name, java.lang.String detectorName)
    * getSiteDetectorResponseAsync(java.lang.String resourceGroupName, java.lang.String siteName, java.lang.String detectorName)
    * getSiteDetectorResponseSlotAsync(java.lang.String resourceGroupName, java.lang.String siteName, java.lang.String detectorName, java.lang.String slot)

* DomainsClient
    * checkAvailabilityAsync()

* ProvidersClient
    * listAsync()

* RecommendationsClient
    * getRuleDetailsByHostingEnvironmentAsync(java.lang.String resourceGroupName, java.lang.String hostingEnvironmentName, java.lang.String name)
    * getRuleDetailsByWebAppAsync(java.lang.String resourceGroupName, java.lang.String siteName, java.lang.String name)
    * listAsync()
    * listHistoryForHostingEnvironmentAsync(java.lang.String resourceGroupName, java.lang.String hostingEnvironmentName)
    * listHistoryForWebAppAsync(java.lang.String resourceGroupName, java.lang.String siteName)
    * listRecommendedRulesForHostingEnvironmentAsync(java.lang.String resourceGroupName, java.lang.String hostingEnvironmentName)
    * listRecommendedRulesForWebAppAsync(java.lang.String resourceGroupName, java.lang.String siteName)

* ResourceProvidersClient
    * checkNameAvailabilityAsync(java.lang.String name, com.azure.resourcemanager.appservice.models.CheckNameResourceTypes type)
    * listAsync()
    * listGeoRegionsAsync()
    * listSiteIdentifiersAssignedToHostnameAsync()

* WebAppsClient
    * analyzeCustomHostnameAsync(java.lang.String resourceGroupName, java.lang.String name)
    * analyzeCustomHostnameSlotAsync(java.lang.String resourceGroupName, java.lang.String name, java.lang.String slot)
    * listPerfMonCountersAsync(java.lang.String resourceGroupName, java.lang.String name)
    * listPerfMonCountersSlotAsync(java.lang.String resourceGroupName, java.lang.String name, java.lang.String slot)
    * listUsagesAsync(java.lang.String resourceGroupName, java.lang.String name)
    * listUsagesSlotAsync(java.lang.String resourceGroupName, java.lang.String name, java.lang.String slot)
    * startNetworkTraceAsync(java.lang.String resourceGroupName, java.lang.String name)
    * startNetworkTraceSlotAsync(java.lang.String resourceGroupName, java.lang.String name, java.lang.String slot)
    * startWebSiteNetworkTraceAsync(java.lang.String resourceGroupName, java.lang.String name)
    * startWebSiteNetworkTraceOperationAsync(java.lang.String resourceGroupName, java.lang.String name)
    * startWebSiteNetworkTraceOperationSlotAsync(java.lang.String resourceGroupName, java.lang.String name, java.lang.String slot)
    * startWebSiteNetworkTraceSlotAsync(java.lang.String resourceGroupName, java.lang.String name, java.lang.String slot)

</details>

<br/>
<details>
<summary> authorization </summary>

* ApplicationsClient
    * deleteExtensionPropertiesAsync(java.lang.String applicationId, java.lang.String extensionPropertyId)
    * deleteRefCreatedOnBehalfOfAsync(java.lang.String applicationId)
    * getCreatedOnBehalfOfAsync(java.lang.String applicationId)
    * getExtensionPropertiesAsync(java.lang.String applicationId, java.lang.String extensionPropertyId)
    * listExtensionPropertiesAsync(java.lang.String applicationId)
    * listHomeRealmDiscoveryPoliciesAsync(java.lang.String applicationId)
    * listOwnersAsync(java.lang.String applicationId)
    * listRefHomeRealmDiscoveryPoliciesAsync(java.lang.String applicationId)
    * listRefOwnersAsync(java.lang.String applicationId)
    * listRefTokenIssuancePoliciesAsync(java.lang.String applicationId)
    * listRefTokenLifetimePoliciesAsync(java.lang.String applicationId)
    * listTokenIssuancePoliciesAsync(java.lang.String applicationId)
    * listTokenLifetimePoliciesAsync(java.lang.String applicationId)

* ContactsClient
    * deleteRefManagerAsync(java.lang.String orgContactId)
    * getManagerAsync(java.lang.String orgContactId)
    * listDirectReportsAsync(java.lang.String orgContactId)
    * listMemberOfAsync(java.lang.String orgContactId)
    * listRefDirectReportsAsync(java.lang.String orgContactId)
    * listRefMemberOfAsync(java.lang.String orgContactId)
    * listRefTransitiveMemberOfAsync(java.lang.String orgContactId)
    * listTransitiveMemberOfAsync(java.lang.String orgContactId)

* ContactsOrgContactsClient
    * deleteOrgContactAsync(java.lang.String orgContactId)
    * getOrgContactAsync(java.lang.String orgContactId)
    * listOrgContactAsync()

* ContractsContractsClient
    * deleteContractAsync(java.lang.String contractId)
    * getContractAsync(java.lang.String contractId)
    * listContractAsync()

* DevicesClient
    * deleteExtensionsAsync(java.lang.String deviceId, java.lang.String extensionId)
    * getExtensionsAsync(java.lang.String deviceId, java.lang.String extensionId)
    * listExtensionsAsync(java.lang.String deviceId)
    * listMemberOfAsync(java.lang.String deviceId)
    * listRefMemberOfAsync(java.lang.String deviceId)
    * listRefRegisteredOwnersAsync(java.lang.String deviceId)
    * listRefRegisteredUsersAsync(java.lang.String deviceId)
    * listRefTransitiveMemberOfAsync(java.lang.String deviceId)
    * listRegisteredOwnersAsync(java.lang.String deviceId)
    * listRegisteredUsersAsync(java.lang.String deviceId)
    * listTransitiveMemberOfAsync(java.lang.String deviceId)

* DevicesDevicesClient
    * deleteDeviceAsync(java.lang.String deviceId)
    * getDeviceAsync(java.lang.String deviceId)
    * listDeviceAsync()

* DirectoriesClient
    * deleteAdministrativeUnitsAsync(java.lang.String administrativeUnitId)
    * deleteDeletedItemsAsync(java.lang.String directoryObjectId)
    * getAdministrativeUnitsAsync(java.lang.String administrativeUnitId)
    * getDeletedItemsAsync(java.lang.String directoryObjectId)
    * listAdministrativeUnitsAsync()
    * listDeletedItemsAsync()

* DirectoryAdministrativeUnitsClient
    * deleteExtensionsAsync(java.lang.String administrativeUnitId, java.lang.String extensionId)
    * deleteScopedRoleMembersAsync(java.lang.String administrativeUnitId, java.lang.String scopedRoleMembershipId)
    * getExtensionsAsync(java.lang.String administrativeUnitId, java.lang.String extensionId)
    * getScopedRoleMembersAsync(java.lang.String administrativeUnitId, java.lang.String scopedRoleMembershipId)
    * listExtensionsAsync(java.lang.String administrativeUnitId)
    * listMembersAsync(java.lang.String administrativeUnitId)
    * listRefMembersAsync(java.lang.String administrativeUnitId)
    * listScopedRoleMembersAsync(java.lang.String administrativeUnitId)

* DirectoryRoleTemplatesDirectoryRoleTemplatesClient
    * deleteDirectoryRoleTemplateAsync(java.lang.String directoryRoleTemplateId)
    * getDirectoryRoleTemplateAsync(java.lang.String directoryRoleTemplateId)
    * listDirectoryRoleTemplateAsync()

* DirectoryRolesClient
    * deleteScopedMembersAsync(java.lang.String directoryRoleId, java.lang.String scopedRoleMembershipId)
    * getScopedMembersAsync(java.lang.String directoryRoleId, java.lang.String scopedRoleMembershipId)
    * listMembersAsync(java.lang.String directoryRoleId)
    * listRefMembersAsync(java.lang.String directoryRoleId)
    * listScopedMembersAsync(java.lang.String directoryRoleId)

* DirectoryRolesDirectoryRolesClient
    * deleteDirectoryRoleAsync(java.lang.String directoryRoleId)
    * getDirectoryRoleAsync(java.lang.String directoryRoleId)
    * listDirectoryRoleAsync()

* DomainsClient
    * deleteServiceConfigurationRecordsAsync(java.lang.String domainId, java.lang.String domainDnsRecordId)
    * deleteVerificationDnsRecordsAsync(java.lang.String domainId, java.lang.String domainDnsRecordId)
    * getServiceConfigurationRecordsAsync(java.lang.String domainId, java.lang.String domainDnsRecordId)
    * getVerificationDnsRecordsAsync(java.lang.String domainId, java.lang.String domainDnsRecordId)
    * listDomainNameReferencesAsync(java.lang.String domainId)
    * listRefDomainNameReferencesAsync(java.lang.String domainId)
    * listServiceConfigurationRecordsAsync(java.lang.String domainId)
    * listVerificationDnsRecordsAsync(java.lang.String domainId)

* DomainsDomainsClient
    * deleteDomainAsync(java.lang.String domainId)
    * getDomainAsync(java.lang.String domainId)

* GroupLifecyclePoliciesGroupLifecyclePoliciesClient
    * deleteGroupLifecyclePolicyAsync(java.lang.String groupLifecyclePolicyId)
    * getGroupLifecyclePolicyAsync(java.lang.String groupLifecyclePolicyId)
    * listGroupLifecyclePolicyAsync()

* GroupsClient
    * deleteAcceptedSendersAsync(java.lang.String groupId, java.lang.String directoryObjectId)
    * deleteAppRoleAssignmentsAsync(java.lang.String groupId, java.lang.String appRoleAssignmentId)
    * deleteExtensionsAsync(java.lang.String groupId, java.lang.String extensionId)
    * deletePermissionGrantsAsync(java.lang.String groupId, java.lang.String resourceSpecificPermissionGrantId)
    * deletePhotoAsync(java.lang.String groupId)
    * deletePhotosAsync(java.lang.String groupId, java.lang.String profilePhotoId)
    * deleteRefCreatedOnBehalfOfAsync(java.lang.String groupId)
    * deleteRejectedSendersAsync(java.lang.String groupId, java.lang.String directoryObjectId)
    * getAcceptedSendersAsync(java.lang.String groupId, java.lang.String directoryObjectId)
    * getAppRoleAssignmentsAsync(java.lang.String groupId, java.lang.String appRoleAssignmentId)
    * getCreatedOnBehalfOfAsync(java.lang.String groupId)
    * getExtensionsAsync(java.lang.String groupId, java.lang.String extensionId)
    * getPermissionGrantsAsync(java.lang.String groupId, java.lang.String resourceSpecificPermissionGrantId)
    * getPhotoAsync(java.lang.String groupId)
    * getPhotosAsync(java.lang.String groupId, java.lang.String profilePhotoId)
    * getRejectedSendersAsync(java.lang.String groupId, java.lang.String directoryObjectId)
    * listAcceptedSendersAsync(java.lang.String groupId)
    * listAppRoleAssignmentsAsync(java.lang.String groupId)
    * listExtensionsAsync(java.lang.String groupId)
    * listMemberOfAsync(java.lang.String groupId)
    * listMembersWithLicenseErrorsAsync(java.lang.String groupId)
    * listOwnersAsync(java.lang.String groupId)
    * listPermissionGrantsAsync(java.lang.String groupId)
    * listPhotosAsync(java.lang.String groupId)
    * listRefMemberOfAsync(java.lang.String groupId)
    * listRefMembersAsync(java.lang.String groupId)
    * listRefMembersWithLicenseErrorsAsync(java.lang.String groupId)
    * listRefOwnersAsync(java.lang.String groupId)
    * listRefTransitiveMemberOfAsync(java.lang.String groupId)
    * listRefTransitiveMembersAsync(java.lang.String groupId)
    * listRejectedSendersAsync(java.lang.String groupId)
    * listTransitiveMemberOfAsync(java.lang.String groupId)
    * listTransitiveMembersAsync(java.lang.String groupId)

* OrganizationOrganizationsClient
    * deleteOrganizationAsync(java.lang.String organizationId)
    * getOrganizationAsync(java.lang.String organizationId)
    * listOrganizationAsync()

* OrganizationsClient
    * deleteExtensionsAsync(java.lang.String organizationId, java.lang.String extensionId)
    * getExtensionsAsync(java.lang.String organizationId, java.lang.String extensionId)
    * listExtensionsAsync(java.lang.String organizationId)

* ProviderOperationsMetadatasClient
    * getAsync(java.lang.String resourceProviderNamespace)
    * listAsync()

* RoleAssignmentsClient
    * listForResourceAsync(java.lang.String resourceGroupName, java.lang.String resourceProviderNamespace, java.lang.String parentResourcePath, java.lang.String resourceType, java.lang.String resourceName)
    * listForScopeAsync(java.lang.String scope)

* RoleDefinitionsClient
    * listAsync(java.lang.String scope)

* ServicePrincipalsClient
    * deleteAppRoleAssignedToAsync(java.lang.String servicePrincipalId, java.lang.String appRoleAssignmentId)
    * deleteAppRoleAssignmentsAsync(java.lang.String servicePrincipalId, java.lang.String appRoleAssignmentId)
    * deleteDelegatedPermissionClassificationsAsync(java.lang.String servicePrincipalId, java.lang.String delegatedPermissionClassificationId)
    * deleteEndpointsAsync(java.lang.String servicePrincipalId, java.lang.String endpointId)
    * getAppRoleAssignedToAsync(java.lang.String servicePrincipalId, java.lang.String appRoleAssignmentId)
    * getAppRoleAssignmentsAsync(java.lang.String servicePrincipalId, java.lang.String appRoleAssignmentId)
    * getDelegatedPermissionClassificationsAsync(java.lang.String servicePrincipalId, java.lang.String delegatedPermissionClassificationId)
    * getEndpointsAsync(java.lang.String servicePrincipalId, java.lang.String endpointId)
    * listAppRoleAssignedToAsync(java.lang.String servicePrincipalId)
    * listAppRoleAssignmentsAsync(java.lang.String servicePrincipalId)
    * listClaimsMappingPoliciesAsync(java.lang.String servicePrincipalId)
    * listCreatedObjectsAsync(java.lang.String servicePrincipalId)
    * listDelegatedPermissionClassificationsAsync(java.lang.String servicePrincipalId)
    * listEndpointsAsync(java.lang.String servicePrincipalId)
    * listHomeRealmDiscoveryPoliciesAsync(java.lang.String servicePrincipalId)
    * listMemberOfAsync(java.lang.String servicePrincipalId)
    * listOauth2PermissionGrantsAsync(java.lang.String servicePrincipalId)
    * listOwnedObjectsAsync(java.lang.String servicePrincipalId)
    * listOwnersAsync(java.lang.String servicePrincipalId)
    * listRefClaimsMappingPoliciesAsync(java.lang.String servicePrincipalId)
    * listRefCreatedObjectsAsync(java.lang.String servicePrincipalId)
    * listRefHomeRealmDiscoveryPoliciesAsync(java.lang.String servicePrincipalId)
    * listRefMemberOfAsync(java.lang.String servicePrincipalId)
    * listRefOauth2PermissionGrantsAsync(java.lang.String servicePrincipalId)
    * listRefOwnedObjectsAsync(java.lang.String servicePrincipalId)
    * listRefOwnersAsync(java.lang.String servicePrincipalId)
    * listRefTokenIssuancePoliciesAsync(java.lang.String servicePrincipalId)
    * listRefTokenLifetimePoliciesAsync(java.lang.String servicePrincipalId)
    * listRefTransitiveMemberOfAsync(java.lang.String servicePrincipalId)
    * listTokenIssuancePoliciesAsync(java.lang.String servicePrincipalId)
    * listTokenLifetimePoliciesAsync(java.lang.String servicePrincipalId)
    * listTransitiveMemberOfAsync(java.lang.String servicePrincipalId)

* SubscribedSkusSubscribedSkusClient
    * deleteSubscribedSkuAsync(java.lang.String subscribedSkuId)
    * getSubscribedSkuAsync(java.lang.String subscribedSkuId)
    * listSubscribedSkuAsync()

* UsersClient
    * deleteAppRoleAssignmentsAsync(java.lang.String userId, java.lang.String appRoleAssignmentId)
    * deleteExtensionsAsync(java.lang.String userId, java.lang.String extensionId)
    * deleteLicenseDetailsAsync(java.lang.String userId, java.lang.String licenseDetailsId)
    * deleteOutlookAsync(java.lang.String userId)
    * deletePhotoAsync(java.lang.String userId)
    * deletePhotosAsync(java.lang.String userId, java.lang.String profilePhotoId)
    * deleteRefManagerAsync(java.lang.String userId)
    * deleteScopedRoleMemberOfAsync(java.lang.String userId, java.lang.String scopedRoleMembershipId)
    * deleteSettingsAsync(java.lang.String userId)
    * deleteTodoAsync(java.lang.String userId)
    * getAppRoleAssignmentsAsync(java.lang.String userId, java.lang.String appRoleAssignmentId)
    * getExtensionsAsync(java.lang.String userId, java.lang.String extensionId)
    * getLicenseDetailsAsync(java.lang.String userId, java.lang.String licenseDetailsId)
    * getManagerAsync(java.lang.String userId)
    * getOutlookAsync(java.lang.String userId)
    * getPhotoAsync(java.lang.String userId)
    * getPhotosAsync(java.lang.String userId, java.lang.String profilePhotoId)
    * getScopedRoleMemberOfAsync(java.lang.String userId, java.lang.String scopedRoleMembershipId)
    * getSettingsAsync(java.lang.String userId)
    * getTodoAsync(java.lang.String userId)
    * listAppRoleAssignmentsAsync(java.lang.String userId)
    * listCreatedObjectsAsync(java.lang.String userId)
    * listDirectReportsAsync(java.lang.String userId)
    * listExtensionsAsync(java.lang.String userId)
    * listLicenseDetailsAsync(java.lang.String userId)
    * listMemberOfAsync(java.lang.String userId)
    * listOauth2PermissionGrantsAsync(java.lang.String userId)
    * listOwnedDevicesAsync(java.lang.String userId)
    * listOwnedObjectsAsync(java.lang.String userId)
    * listPhotosAsync(java.lang.String userId)
    * listRefCreatedObjectsAsync(java.lang.String userId)
    * listRefDirectReportsAsync(java.lang.String userId)
    * listRefMemberOfAsync(java.lang.String userId)
    * listRefOauth2PermissionGrantsAsync(java.lang.String userId)
    * listRefOwnedDevicesAsync(java.lang.String userId)
    * listRefOwnedObjectsAsync(java.lang.String userId)
    * listRefRegisteredDevicesAsync(java.lang.String userId)
    * listRefTransitiveMemberOfAsync(java.lang.String userId)
    * listRegisteredDevicesAsync(java.lang.String userId)
    * listScopedRoleMemberOfAsync(java.lang.String userId)
    * listTransitiveMemberOfAsync(java.lang.String userId)

* UsersOutlooksClient
    * deleteMasterCategoriesAsync(java.lang.String userId, java.lang.String outlookCategoryId)
    * getMasterCategoriesAsync(java.lang.String userId, java.lang.String outlookCategoryId)
    * listMasterCategoriesAsync(java.lang.String userId)

* UsersSettingsClient
    * deleteShiftPreferencesAsync(java.lang.String userId)
    * getShiftPreferencesAsync(java.lang.String userId)

* UsersTodoListsClient
    * deleteExtensionsAsync(java.lang.String userId, java.lang.String todoTaskListId, java.lang.String extensionId)
    * deleteTasksAsync(java.lang.String userId, java.lang.String todoTaskListId, java.lang.String todoTaskId)
    * getExtensionsAsync(java.lang.String userId, java.lang.String todoTaskListId, java.lang.String extensionId)
    * getTasksAsync(java.lang.String userId, java.lang.String todoTaskListId, java.lang.String todoTaskId)
    * listExtensionsAsync(java.lang.String userId, java.lang.String todoTaskListId)
    * listTasksAsync(java.lang.String userId, java.lang.String todoTaskListId)

* UsersTodoListsTasksClient
    * deleteExtensionsAsync(java.lang.String userId, java.lang.String todoTaskListId, java.lang.String todoTaskId, java.lang.String extensionId)
    * deleteLinkedResourcesAsync(java.lang.String userId, java.lang.String todoTaskListId, java.lang.String todoTaskId, java.lang.String linkedResourceId)
    * getExtensionsAsync(java.lang.String userId, java.lang.String todoTaskListId, java.lang.String todoTaskId, java.lang.String extensionId)
    * getLinkedResourcesAsync(java.lang.String userId, java.lang.String todoTaskListId, java.lang.String todoTaskId, java.lang.String linkedResourceId)
    * listExtensionsAsync(java.lang.String userId, java.lang.String todoTaskListId, java.lang.String todoTaskId)
    * listLinkedResourcesAsync(java.lang.String userId, java.lang.String todoTaskListId, java.lang.String todoTaskId)

* UsersTodosClient
    * deleteListsAsync(java.lang.String userId, java.lang.String todoTaskListId)
    * getListsAsync(java.lang.String userId, java.lang.String todoTaskListId)
    * listListsAsync(java.lang.String userId)

</details>

<br/>
<details>
<summary> cdn </summary>

* CustomDomainsClient
    * createAsync(java.lang.String resourceGroupName, java.lang.String profileName, java.lang.String endpointName, java.lang.String customDomainName)
    * enableCustomHttpsAsync(java.lang.String resourceGroupName, java.lang.String profileName, java.lang.String endpointName, java.lang.String customDomainName)

* PoliciesClient
    * updateAsync(java.lang.String resourceGroupName, java.lang.String policyName)

* ProfilesClient
    * updateAsync(java.lang.String resourceGroupName, java.lang.String profileName)

</details>

<br/>
<details>
<summary> compute </summary>

* DedicatedHostsClient
    * getAsync(java.lang.String resourceGroupName, java.lang.String hostGroupName, java.lang.String hostname)

* DiskAccessesClient
    * updateAsync(java.lang.String resourceGroupName, java.lang.String diskAccessName)

* GalleryApplicationVersionsClient
    * getAsync(java.lang.String resourceGroupName, java.lang.String galleryName, java.lang.String galleryApplicationName, java.lang.String galleryApplicationVersionName)

* ProximityPlacementGroupsClient
    * updateAsync(java.lang.String resourceGroupName, java.lang.String proximityPlacementGroupName)

* VirtualMachineExtensionImagesClient
    * listVersionsAsync(java.lang.String location, java.lang.String publisherName, java.lang.String type)

* VirtualMachineExtensionsClient
    * listAsync(java.lang.String resourceGroupName, java.lang.String vmName)

* VirtualMachineImagesClient
    * listAsync(java.lang.String location, java.lang.String publisherName, java.lang.String offer, java.lang.String skus)

* VirtualMachineRunCommandsClient
    * getByVirtualMachineAsync(java.lang.String resourceGroupName, java.lang.String vmName, java.lang.String runCommandName)
    * listByVirtualMachineAsync(java.lang.String resourceGroupName, java.lang.String vmName)

* VirtualMachineScaleSetExtensionsClient
    * getAsync(java.lang.String resourceGroupName, java.lang.String vmScaleSetName, java.lang.String vmssExtensionName)

* VirtualMachineScaleSetVMExtensionsClient
    * getAsync(java.lang.String resourceGroupName, java.lang.String vmScaleSetName, java.lang.String instanceId, java.lang.String vmExtensionName)
    * listAsync(java.lang.String resourceGroupName, java.lang.String vmScaleSetName, java.lang.String instanceId)

* VirtualMachineScaleSetVMRunCommandsClient
    * getAsync(java.lang.String resourceGroupName, java.lang.String vmScaleSetName, java.lang.String instanceId, java.lang.String runCommandName)
    * listAsync(java.lang.String resourceGroupName, java.lang.String vmScaleSetName, java.lang.String instanceId)

* VirtualMachineScaleSetVMsClient
    * powerOffAsync(java.lang.String resourceGroupName, java.lang.String vmScaleSetName, java.lang.String instanceId)
    * reimageAsync(java.lang.String resourceGroupName, java.lang.String vmScaleSetName, java.lang.String instanceId)
    * retrieveBootDiagnosticsDataAsync(java.lang.String resourceGroupName, java.lang.String vmScaleSetName, java.lang.String instanceId)

* VirtualMachineScaleSetsClient
    * convertToSinglePlacementGroupAsync(java.lang.String resourceGroupName, java.lang.String vmScaleSetName)
    * deallocateAsync(java.lang.String resourceGroupName, java.lang.String vmScaleSetName)
    * performMaintenanceAsync(java.lang.String resourceGroupName, java.lang.String vmScaleSetName)
    * powerOffAsync(java.lang.String resourceGroupName, java.lang.String vmScaleSetName)
    * redeployAsync(java.lang.String resourceGroupName, java.lang.String vmScaleSetName)
    * reimageAllAsync(java.lang.String resourceGroupName, java.lang.String vmScaleSetName)
    * reimageAsync(java.lang.String resourceGroupName, java.lang.String vmScaleSetName)
    * restartAsync(java.lang.String resourceGroupName, java.lang.String vmScaleSetName)
    * startAsync(java.lang.String resourceGroupName, java.lang.String vmScaleSetName)

* VirtualMachinesClient
    * powerOffAsync(java.lang.String resourceGroupName, java.lang.String vmName)
    * reimageAsync(java.lang.String resourceGroupName, java.lang.String vmName)
    * retrieveBootDiagnosticsDataAsync(java.lang.String resourceGroupName, java.lang.String vmName)

</details>

<br/>
<details>
<summary> containerinstance </summary>

</details>

<br/>
<details>
<summary> containerregistry </summary>

* ReplicationsClient
    * updateAsync(java.lang.String resourceGroupName, java.lang.String registryName, java.lang.String replicationName)

* RunsClient
    * updateAsync(java.lang.String resourceGroupName, java.lang.String registryName, java.lang.String runId)

</details>

<br/>
<details>
<summary> containerservice </summary>

* ManagedClustersClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String resourceName)

* OpenShiftManagedClustersClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String resourceName)

</details>

<br/>
<details>
<summary> cosmos </summary>

* CollectionPartitionsClient
    * listUsagesAsync(java.lang.String resourceGroupName, java.lang.String accountName, java.lang.String databaseRid, java.lang.String collectionRid)

* CollectionsClient
    * listUsagesAsync(java.lang.String resourceGroupName, java.lang.String accountName, java.lang.String databaseRid, java.lang.String collectionRid)

* DatabaseAccountsClient
    * listUsagesAsync(java.lang.String resourceGroupName, java.lang.String accountName)

* DatabasesClient
    * listUsagesAsync(java.lang.String resourceGroupName, java.lang.String accountName, java.lang.String databaseRid)

</details>

<br/>
<details>
<summary> dns </summary>

* RecordSetsClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String zoneName, java.lang.String relativeRecordSetName, com.azure.resourcemanager.dns.models.RecordType recordType, com.azure.resourcemanager.dns.fluent.models.RecordSetInner parameters)
    * deleteAsync(java.lang.String resourceGroupName, java.lang.String zoneName, java.lang.String relativeRecordSetName, com.azure.resourcemanager.dns.models.RecordType recordType)
    * listAllByDnsZoneAsync(java.lang.String resourceGroupName, java.lang.String zoneName)
    * listByDnsZoneAsync(java.lang.String resourceGroupName, java.lang.String zoneName)
    * updateAsync(java.lang.String resourceGroupName, java.lang.String zoneName, java.lang.String relativeRecordSetName, com.azure.resourcemanager.dns.models.RecordType recordType, com.azure.resourcemanager.dns.fluent.models.RecordSetInner parameters)

* ZonesClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String zoneName, com.azure.resourcemanager.dns.fluent.models.ZoneInner parameters)
    * updateAsync(java.lang.String resourceGroupName, java.lang.String zoneName)

</details>

<br/>
<details>
<summary> eventhubs </summary>

* ConsumerGroupsClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String namespaceName, java.lang.String eventHubName, java.lang.String consumerGroupName)

* EventHubsClient
    * createOrUpdateAuthorizationRuleAsync(java.lang.String resourceGroupName, java.lang.String namespaceName, java.lang.String eventHubName, java.lang.String authorizationRuleName)

* NamespacesClient
    * createOrUpdateAuthorizationRuleAsync(java.lang.String resourceGroupName, java.lang.String namespaceName, java.lang.String authorizationRuleName)

</details>

<br/>
<details>
<summary> keyvault </summary>

* VaultsClient
    * listAsync()
    * listByResourceGroupAsync(java.lang.String resourceGroupName)
    * listBySubscriptionAsync()

</details>

<br/>
<details>
<summary> monitor </summary>

* ActivityLogsClient
    * listAsync(java.lang.String filter)

* BaselinesClient
    * listAsync(java.lang.String resourceUri)

* MetricBaselinesClient
    * getAsync(java.lang.String resourceUri, java.lang.String metricName)

* MetricNamespacesClient
    * listAsync(java.lang.String resourceUri)

* MetricsClient
    * listAsync(java.lang.String resourceUri)

* TenantActivityLogsClient
    * listAsync()

</details>

<br/>
<details>
<summary> msi </summary>

</details>

<br/>
<details>
<summary> network </summary>

* ApplicationGatewaysClient
    * backendHealthAsync(java.lang.String resourceGroupName, java.lang.String applicationGatewayName)
    * backendHealthOnDemandAsync(java.lang.String resourceGroupName, java.lang.String applicationGatewayName, com.azure.resourcemanager.network.models.ApplicationGatewayOnDemandProbe probeRequest)
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String applicationGatewayName)

* ApplicationSecurityGroupsClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String applicationSecurityGroupName)

* AzureFirewallsClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String azureFirewallName)

* ConnectionMonitorsClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String networkWatcherName, java.lang.String connectionMonitorName)

* CustomIpPrefixesClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String customIpPrefixName)

* DdosCustomPoliciesClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String ddosCustomPolicyName)

* DdosProtectionPlansClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String ddosProtectionPlanName)

* ExpressRouteCircuitsClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String circuitName)

* ExpressRouteCrossConnectionsClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String crossConnectionName)

* ExpressRoutePortsClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String expressRoutePortName)

* FlowLogsClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String networkWatcherName, java.lang.String flowLogName)

* InboundNatRulesClient
    * getAsync(java.lang.String resourceGroupName, java.lang.String loadBalancerName, java.lang.String inboundNatRuleName)

* IpAllocationsClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String ipAllocationName)

* IpGroupsClient
    * updateGroupsAsync(java.lang.String resourceGroupName, java.lang.String ipGroupsName)

* LoadBalancersClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String loadBalancerName)

* LocalNetworkGatewaysClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String localNetworkGatewayName)

* NatGatewaysClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String natGatewayName)

* NetworkInterfacesClient
    * getCloudServiceNetworkInterfaceAsync(java.lang.String resourceGroupName, java.lang.String cloudServiceName, java.lang.String roleInstanceName, java.lang.String networkInterfaceName)
    * getVirtualMachineScaleSetIpConfigurationAsync(java.lang.String resourceGroupName, java.lang.String virtualMachineScaleSetName, java.lang.String virtualmachineIndex, java.lang.String networkInterfaceName, java.lang.String ipConfigurationName)
    * listVirtualMachineScaleSetIpConfigurationsAsync(java.lang.String resourceGroupName, java.lang.String virtualMachineScaleSetName, java.lang.String virtualmachineIndex, java.lang.String networkInterfaceName)
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String networkInterfaceName)

* NetworkManagementClient
    * deleteBastionShareableLinkAsync(java.lang.String resourceGroupName, java.lang.String bastionHostname)
    * disconnectActiveSessionsAsync(java.lang.String resourceGroupName, java.lang.String bastionHostname)
    * getBastionShareableLinkAsync(java.lang.String resourceGroupName, java.lang.String bastionHostname)
    * putBastionShareableLinkAsync(java.lang.String resourceGroupName, java.lang.String bastionHostname)

* NetworkProfilesClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String networkProfileName)

* NetworkSecurityGroupsClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String networkSecurityGroupName)

* NetworkVirtualAppliancesClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String networkVirtualApplianceName)

* NetworkWatchersClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String networkWatcherName)

* P2SVpnGatewaysClient
    * disconnectP2SVpnConnectionsAsync(java.lang.String resourceGroupName, java.lang.String p2SVpnGatewayName)
    * generateVpnProfileAsync(java.lang.String resourceGroupName, java.lang.String gatewayName)
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String gatewayName)

* PrivateLinkServicesClient
    * checkPrivateLinkServiceVisibilityAsync(java.lang.String location)
    * checkPrivateLinkServiceVisibilityByResourceGroupAsync(java.lang.String location, java.lang.String resourceGroupName)
    * getPrivateEndpointConnectionAsync(java.lang.String resourceGroupName, java.lang.String serviceName, java.lang.String peConnectionName)

* PublicIpAddressesClient
    * getCloudServicePublicIpAddressAsync(java.lang.String resourceGroupName, java.lang.String cloudServiceName, java.lang.String roleInstanceName, java.lang.String networkInterfaceName, java.lang.String ipConfigurationName, java.lang.String publicIpAddressName)
    * getVirtualMachineScaleSetPublicIpAddressAsync(java.lang.String resourceGroupName, java.lang.String virtualMachineScaleSetName, java.lang.String virtualmachineIndex, java.lang.String networkInterfaceName, java.lang.String ipConfigurationName, java.lang.String publicIpAddressName)
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String publicIpAddressName)

* PublicIpPrefixesClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String publicIpPrefixName)

* RouteFiltersClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String routeFilterName)

* RouteTablesClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String routeTableName)

* SecurityPartnerProvidersClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String securityPartnerProviderName)

* ServiceEndpointPoliciesClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String serviceEndpointPolicyName)

* SubnetsClient
    * getAsync(java.lang.String resourceGroupName, java.lang.String virtualNetworkName, java.lang.String subnetName)
    * unprepareNetworkPoliciesAsync(java.lang.String resourceGroupName, java.lang.String virtualNetworkName, java.lang.String subnetName)

* VirtualHubsClient
    * getEffectiveVirtualHubRoutesAsync(java.lang.String resourceGroupName, java.lang.String virtualHubName)
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String virtualHubName)

* VirtualNetworkGatewayConnectionsClient
    * startPacketCaptureAsync(java.lang.String resourceGroupName, java.lang.String virtualNetworkGatewayConnectionName)
    * stopPacketCaptureAsync(java.lang.String resourceGroupName, java.lang.String virtualNetworkGatewayConnectionName)
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String virtualNetworkGatewayConnectionName)

* VirtualNetworkGatewaysClient
    * disconnectVirtualNetworkGatewayVpnConnectionsAsync(java.lang.String resourceGroupName, java.lang.String virtualNetworkGatewayName)
    * getBgpPeerStatusAsync(java.lang.String resourceGroupName, java.lang.String virtualNetworkGatewayName)
    * startPacketCaptureAsync(java.lang.String resourceGroupName, java.lang.String virtualNetworkGatewayName)
    * stopPacketCaptureAsync(java.lang.String resourceGroupName, java.lang.String virtualNetworkGatewayName)
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String virtualNetworkGatewayName)

* VirtualNetworkTapsClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String tapName)

* VirtualNetworksClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String virtualNetworkName)

* VirtualWansClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String virtualWanName)

* VpnConnectionsClient
    * startPacketCaptureAsync(java.lang.String resourceGroupName, java.lang.String gatewayName, java.lang.String vpnConnectionName)
    * stopPacketCaptureAsync(java.lang.String resourceGroupName, java.lang.String gatewayName, java.lang.String vpnConnectionName)

* VpnGatewaysClient
    * startPacketCaptureAsync(java.lang.String resourceGroupName, java.lang.String gatewayName)
    * stopPacketCaptureAsync(java.lang.String resourceGroupName, java.lang.String gatewayName)
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String gatewayName)

* VpnServerConfigurationsClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String vpnServerConfigurationName)

* VpnSitesClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String vpnSiteName)

* WebCategoriesClient
    * getAsync(java.lang.String name)

</details>

<br/>
<details>
<summary> privatedns </summary>

* PrivateZonesClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String privateZoneName, com.azure.resourcemanager.privatedns.fluent.models.PrivateZoneInner parameters)
    * updateAsync(java.lang.String resourceGroupName, java.lang.String privateZoneName, com.azure.resourcemanager.privatedns.fluent.models.PrivateZoneInner parameters)

* RecordSetsClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String privateZoneName, com.azure.resourcemanager.privatedns.models.RecordType recordType, java.lang.String relativeRecordSetName, com.azure.resourcemanager.privatedns.fluent.models.RecordSetInner parameters)
    * deleteAsync(java.lang.String resourceGroupName, java.lang.String privateZoneName, com.azure.resourcemanager.privatedns.models.RecordType recordType, java.lang.String relativeRecordSetName)
    * listAsync(java.lang.String resourceGroupName, java.lang.String privateZoneName)
    * listByTypeAsync(java.lang.String resourceGroupName, java.lang.String privateZoneName, com.azure.resourcemanager.privatedns.models.RecordType recordType)
    * updateAsync(java.lang.String resourceGroupName, java.lang.String privateZoneName, com.azure.resourcemanager.privatedns.models.RecordType recordType, java.lang.String relativeRecordSetName, com.azure.resourcemanager.privatedns.fluent.models.RecordSetInner parameters)

* VirtualNetworkLinksClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String privateZoneName, java.lang.String virtualNetworkLinkName, com.azure.resourcemanager.privatedns.fluent.models.VirtualNetworkLinkInner parameters)
    * updateAsync(java.lang.String resourceGroupName, java.lang.String privateZoneName, java.lang.String virtualNetworkLinkName, com.azure.resourcemanager.privatedns.fluent.models.VirtualNetworkLinkInner parameters)

</details>

<br/>
<details>
<summary> redis </summary>

</details>

<br/>
<details>
<summary> resources </summary>

* DeploymentOperationsClient
    * listAtScopeAsync(java.lang.String scope, java.lang.String deploymentName)
    * listAtSubscriptionScopeAsync(java.lang.String deploymentName)
    * listAtTenantScopeAsync(java.lang.String deploymentName)
    * listByResourceGroupAsync(java.lang.String resourceGroupName, java.lang.String deploymentName)

* DeploymentsClient
    * listAtManagementGroupScopeAsync(java.lang.String groupId)
    * listAtScopeAsync(java.lang.String scope)
    * listAtTenantScopeAsync()

* ManagementLocksClient
    * listAtResourceLevelAsync(java.lang.String resourceGroupName, java.lang.String resourceProviderNamespace, java.lang.String parentResourcePath, java.lang.String resourceType, java.lang.String resourceName)

* PolicyAssignmentsClient
    * listForResourceAsync(java.lang.String resourceGroupName, java.lang.String resourceProviderNamespace, java.lang.String parentResourcePath, java.lang.String resourceType, java.lang.String resourceName)

* ProvidersClient
    * getAtTenantScopeAsync(java.lang.String resourceProviderNamespace)
    * listAtTenantScopeAsync()

* ResourceNamesClient
    * checkResourceNameAsync()

</details>

<br/>
<details>
<summary> search </summary>

* PrivateEndpointConnectionsClient
    * deleteAsync(java.lang.String resourceGroupName, java.lang.String searchServiceName, java.lang.String privateEndpointConnectionName)
    * getAsync(java.lang.String resourceGroupName, java.lang.String searchServiceName, java.lang.String privateEndpointConnectionName)
    * listByServiceAsync(java.lang.String resourceGroupName, java.lang.String searchServiceName)
    * updateAsync(java.lang.String resourceGroupName, java.lang.String searchServiceName, java.lang.String privateEndpointConnectionName)

* PrivateLinkResourcesClient
    * listSupportedAsync(java.lang.String resourceGroupName, java.lang.String searchServiceName)

* ServicesClient
    * updateAsync(java.lang.String resourceGroupName, java.lang.String searchServiceName, com.azure.resourcemanager.search.models.SearchServiceUpdate serviceParam)

* SharedPrivateLinkResourcesClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String searchServiceName, java.lang.String sharedPrivateLinkResourceName)
    * deleteAsync(java.lang.String resourceGroupName, java.lang.String searchServiceName, java.lang.String sharedPrivateLinkResourceName)
    * getAsync(java.lang.String resourceGroupName, java.lang.String searchServiceName, java.lang.String sharedPrivateLinkResourceName)
    * listByServiceAsync(java.lang.String resourceGroupName, java.lang.String searchServiceName)

</details>

<br/>
<details>
<summary> servicebus </summary>

* NamespacesClient
    * regenerateKeysAsync(java.lang.String resourceGroupName, java.lang.String namespaceName, java.lang.String authorizationRuleName)

* QueuesClient
    * regenerateKeysAsync(java.lang.String resourceGroupName, java.lang.String namespaceName, java.lang.String queueName, java.lang.String authorizationRuleName)

* TopicsClient
    * regenerateKeysAsync(java.lang.String resourceGroupName, java.lang.String namespaceName, java.lang.String topicName, java.lang.String authorizationRuleName)

</details>

<br/>
<details>
<summary> sql </summary>

* BackupShortTermRetentionPoliciesClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String databaseName, com.azure.resourcemanager.sql.models.ShortTermRetentionPolicyName policyName)
    * updateAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String databaseName, com.azure.resourcemanager.sql.models.ShortTermRetentionPolicyName policyName)

* DatabaseVulnerabilityAssessmentRuleBaselinesClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String databaseName, com.azure.resourcemanager.sql.models.VulnerabilityAssessmentName vulnerabilityAssessmentName, java.lang.String ruleId, com.azure.resourcemanager.sql.models.VulnerabilityAssessmentPolicyBaselineName baselineName)

* DatabasesClient
    * failoverAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String databaseName)

* InstancePoolsClient
    * updateAsync(java.lang.String resourceGroupName, java.lang.String instancePoolName)

* JobAgentsClient
    * updateAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String jobAgentName)

* JobExecutionsClient
    * listByAgentAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String jobAgentName)
    * listByJobAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String jobAgentName, java.lang.String jobName)

* JobStepExecutionsClient
    * listByJobExecutionAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String jobAgentName, java.lang.String jobName, java.util.UUID jobExecutionId)

* JobTargetExecutionsClient
    * listByJobExecutionAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String jobAgentName, java.lang.String jobName, java.util.UUID jobExecutionId)
    * listByStepAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String jobAgentName, java.lang.String jobName, java.util.UUID jobExecutionId, java.lang.String stepName)

* JobTargetGroupsClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String jobAgentName, java.lang.String targetGroupName)

* LongTermRetentionBackupsClient
    * listByDatabaseAsync(java.lang.String locationName, java.lang.String longTermRetentionServerName, java.lang.String longTermRetentionDatabaseName)
    * listByLocationAsync(java.lang.String locationName)
    * listByResourceGroupDatabaseAsync(java.lang.String resourceGroupName, java.lang.String locationName, java.lang.String longTermRetentionServerName, java.lang.String longTermRetentionDatabaseName)
    * listByResourceGroupLocationAsync(java.lang.String resourceGroupName, java.lang.String locationName)
    * listByResourceGroupServerAsync(java.lang.String resourceGroupName, java.lang.String locationName, java.lang.String longTermRetentionServerName)
    * listByServerAsync(java.lang.String locationName, java.lang.String longTermRetentionServerName)

* LongTermRetentionManagedInstanceBackupsClient
    * listByDatabaseAsync(java.lang.String locationName, java.lang.String managedInstanceName, java.lang.String databaseName)
    * listByInstanceAsync(java.lang.String locationName, java.lang.String managedInstanceName)
    * listByLocationAsync(java.lang.String locationName)
    * listByResourceGroupDatabaseAsync(java.lang.String resourceGroupName, java.lang.String locationName, java.lang.String managedInstanceName, java.lang.String databaseName)
    * listByResourceGroupInstanceAsync(java.lang.String resourceGroupName, java.lang.String locationName, java.lang.String managedInstanceName)
    * listByResourceGroupLocationAsync(java.lang.String resourceGroupName, java.lang.String locationName)

* ManagedBackupShortTermRetentionPoliciesClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String managedInstanceName, java.lang.String databaseName, com.azure.resourcemanager.sql.models.ManagedShortTermRetentionPolicyName policyName)
    * updateAsync(java.lang.String resourceGroupName, java.lang.String managedInstanceName, java.lang.String databaseName, com.azure.resourcemanager.sql.models.ManagedShortTermRetentionPolicyName policyName)

* ManagedDatabaseSensitivityLabelsClient
    * listCurrentByDatabaseAsync(java.lang.String resourceGroupName, java.lang.String managedInstanceName, java.lang.String databaseName)
    * listRecommendedByDatabaseAsync(java.lang.String resourceGroupName, java.lang.String managedInstanceName, java.lang.String databaseName)

* ManagedDatabaseVulnerabilityAssessmentRuleBaselinesClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String managedInstanceName, java.lang.String databaseName, com.azure.resourcemanager.sql.models.VulnerabilityAssessmentName vulnerabilityAssessmentName, java.lang.String ruleId, com.azure.resourcemanager.sql.models.VulnerabilityAssessmentPolicyBaselineName baselineName)

* ManagedInstanceKeysClient
    * listByInstanceAsync(java.lang.String resourceGroupName, java.lang.String managedInstanceName)

* ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String managedInstanceName, java.lang.String restorableDroppedDatabaseId, com.azure.resourcemanager.sql.models.ManagedShortTermRetentionPolicyName policyName)
    * updateAsync(java.lang.String resourceGroupName, java.lang.String managedInstanceName, java.lang.String restorableDroppedDatabaseId, com.azure.resourcemanager.sql.models.ManagedShortTermRetentionPolicyName policyName)

* ReplicationLinksClient
    * unlinkAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String databaseName, java.lang.String linkId)

* SensitivityLabelsClient
    * listCurrentByDatabaseAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String databaseName)
    * listRecommendedByDatabaseAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String databaseName)

* ServerCommunicationLinksClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String communicationLinkName)

* ServerConnectionPoliciesClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String serverName, com.azure.resourcemanager.sql.models.ConnectionPolicyName connectionPolicyName)

* ServerDnsAliasesClient
    * acquireAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String dnsAliasName)

* SyncAgentsClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String syncAgentName)

* TransparentDataEncryptionsClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String databaseName, com.azure.resourcemanager.sql.models.TransparentDataEncryptionName transparentDataEncryptionName)

* UsagesClient
    * listByInstancePoolAsync(java.lang.String resourceGroupName, java.lang.String instancePoolName)

</details>

<br/>
<details>
<summary> storage </summary>

* BlobContainersClient
    * createOrUpdateImmutabilityPolicyAsync(java.lang.String resourceGroupName, java.lang.String accountName, java.lang.String containerName)
    * extendImmutabilityPolicyAsync(java.lang.String resourceGroupName, java.lang.String accountName, java.lang.String containerName, java.lang.String ifMatch)
    * getImmutabilityPolicyAsync(java.lang.String resourceGroupName, java.lang.String accountName, java.lang.String containerName)
    * leaseAsync(java.lang.String resourceGroupName, java.lang.String accountName, java.lang.String containerName)

* FileServicesClient
    * setServicePropertiesAsync(java.lang.String resourceGroupName, java.lang.String accountName)

* FileSharesClient
    * getAsync(java.lang.String resourceGroupName, java.lang.String accountName, java.lang.String shareName)
    * listAsync(java.lang.String resourceGroupName, java.lang.String accountName)

* ManagementPoliciesClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String accountName, com.azure.resourcemanager.storage.models.ManagementPolicyName managementPolicyName)

* PrivateEndpointConnectionsClient
    * putAsync(java.lang.String resourceGroupName, java.lang.String accountName, java.lang.String privateEndpointConnectionName)

* QueueServicesClient
    * setServicePropertiesAsync(java.lang.String resourceGroupName, java.lang.String accountName)

* QueuesClient
    * createAsync(java.lang.String resourceGroupName, java.lang.String accountName, java.lang.String queueName)
    * listAsync(java.lang.String resourceGroupName, java.lang.String accountName)
    * updateAsync(java.lang.String resourceGroupName, java.lang.String accountName, java.lang.String queueName)

* TableServicesClient
    * setServicePropertiesAsync(java.lang.String resourceGroupName, java.lang.String accountName)

</details>

<br/>
<details>
<summary> trafficmanager </summary>

* HeatMapsClient
    * getAsync(java.lang.String resourceGroupName, java.lang.String profileName)

</details>
