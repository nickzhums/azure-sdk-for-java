# Resource Coverage Report


<br/>
<details>
<summary> appplatform </summary>

* <span style="color:red"><b>Fluent Required!!!</b></span>
    * <b>OperationsClient,<br/>RuntimeVersionsClient</b>
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

* <span style="color:red"><b>Fluent Required!!!</b></span>
    * <b>AppServiceEnvironmentsClient,<br/>CertificateRegistrationProvidersClient,<br/>DeletedWebAppsClient,<br/>DiagnosticsClient,<br/>DomainRegistrationProvidersClient,<br/>ProvidersClient,<br/>RecommendationsClient,<br/>ResourceHealthMetadatasClient,<br/>StaticSitesClient</b>
* AppServiceCertificateOrdersClient
    * resendRequestEmailsAsync(java.lang.String resourceGroupName, java.lang.String certificateOrderName)

* AppServicePlansClient
    * listUsagesAsync(java.lang.String resourceGroupName, java.lang.String name)
    * listWebAppsAsync(java.lang.String resourceGroupName, java.lang.String name)
    * restartWebAppsAsync(java.lang.String resourceGroupName, java.lang.String name)

* DomainsClient
    * checkAvailabilityAsync()

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

* <span style="color:red"><b>Fluent Required!!!</b></span>
    * <b>ClassicAdministratorsClient,<br/>ContactsClient,<br/>ContactsOrgContactsClient,<br/>ContractsClient,<br/>ContractsContractsClient,<br/>DevicesClient,<br/>DevicesDevicesClient,<br/>DirectoriesClient,<br/>DirectoryAdministrativeUnitsClient,<br/>DirectoryDirectoriesClient,<br/>DirectoryRoleTemplatesClient,<br/>DirectoryRoleTemplatesDirectoryRoleTemplatesClient,<br/>DirectoryRolesClient,<br/>DirectoryRolesDirectoryRolesClient,<br/>DomainsClient,<br/>GlobalAdministratorsClient,<br/>GroupLifecyclePoliciesClient,<br/>GroupLifecyclePoliciesGroupLifecyclePoliciesClient,<br/>OrganizationOrganizationsClient,<br/>OrganizationsClient,<br/>PermissionsClient,<br/>ProviderOperationsMetadatasClient,<br/>SubscribedSkusSubscribedSkusClient,<br/>UsersClient,<br/>UsersOutlooksClient,<br/>UsersSettingsClient,<br/>UsersTodoListsClient,<br/>UsersTodoListsTasksClient,<br/>UsersTodosClient</b>
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

* DomainsDomainsClient
    * deleteDomainAsync(java.lang.String domainId)
    * getDomainAsync(java.lang.String domainId)

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

</details>

<br/>
<details>
<summary> cdn </summary>

* <span style="color:red"><b>Fluent Required!!!</b></span>
    * <b>ManagedRuleSetsClient,<br/>OriginGroupsClient,<br/>PoliciesClient</b>
* CustomDomainsClient
    * createAsync(java.lang.String resourceGroupName, java.lang.String profileName, java.lang.String endpointName, java.lang.String customDomainName)
    * enableCustomHttpsAsync(java.lang.String resourceGroupName, java.lang.String profileName, java.lang.String endpointName, java.lang.String customDomainName)

* ProfilesClient
    * updateAsync(java.lang.String resourceGroupName, java.lang.String profileName)

</details>

<br/>
<details>
<summary> compute </summary>

* <span style="color:red"><b>Fluent Required!!!</b></span>
    * <b>ContainerServicesClient,<br/>DedicatedHostGroupsClient,<br/>DedicatedHostsClient,<br/>DiskAccessesClient,<br/>DiskEncryptionSetsClient,<br/>GalleryApplicationVersionsClient,<br/>GalleryApplicationsClient,<br/>LogAnalyticsClient,<br/>OperationsClient,<br/>SshPublicKeysClient,<br/>VirtualMachineRunCommandsClient,<br/>VirtualMachineScaleSetExtensionsClient,<br/>VirtualMachineScaleSetRollingUpgradesClient,<br/>VirtualMachineScaleSetVMExtensionsClient,<br/>VirtualMachineScaleSetVMRunCommandsClient</b>
* ProximityPlacementGroupsClient
    * updateAsync(java.lang.String resourceGroupName, java.lang.String proximityPlacementGroupName)

* VirtualMachineExtensionImagesClient
    * listVersionsAsync(java.lang.String location, java.lang.String publisherName, java.lang.String type)

* VirtualMachineExtensionsClient
    * listAsync(java.lang.String resourceGroupName, java.lang.String vmName)

* VirtualMachineImagesClient
    * listAsync(java.lang.String location, java.lang.String publisherName, java.lang.String offer, java.lang.String skus)

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
<summary> containerregistry </summary>

* <span style="color:red"><b>Fluent Required!!!</b></span>
    * <b>OperationsClient,<br/>ReplicationsClient</b>
* RunsClient
    * updateAsync(java.lang.String resourceGroupName, java.lang.String registryName, java.lang.String runId)

</details>

<br/>
<details>
<summary> containerservice </summary>

* <span style="color:red"><b>Fluent Required!!!</b></span>
    * <b>OpenShiftManagedClustersClient,<br/>OperationsClient,<br/>PrivateEndpointConnectionsClient,<br/>PrivateLinkResourcesClient,<br/>ResolvePrivateLinkServiceIdsClient</b>
* ManagedClustersClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String resourceName)

</details>

<br/>
<details>
<summary> cosmos </summary>

* <span style="color:red"><b>Fluent Required!!!</b></span>
    * <b>CassandraResourcesClient,<br/>CollectionPartitionRegionsClient,<br/>CollectionPartitionsClient,<br/>CollectionRegionsClient,<br/>CollectionsClient,<br/>DatabaseAccountRegionsClient,<br/>DatabasesClient,<br/>GremlinResourcesClient,<br/>MongoDBResourcesClient,<br/>NotebookWorkspacesClient,<br/>OperationsClient,<br/>PartitionKeyRangeIdRegionsClient,<br/>PartitionKeyRangeIdsClient,<br/>PercentileSourceTargetsClient,<br/>PercentileTargetsClient,<br/>PercentilesClient,<br/>TableResourcesClient</b>
* DatabaseAccountsClient
    * listUsagesAsync(java.lang.String resourceGroupName, java.lang.String accountName)

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

* <span style="color:red"><b>Fluent Required!!!</b></span>
    * <b>OperationsClient,<br/>RegionsClient</b>
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

* <span style="color:red"><b>Fluent Required!!!</b></span>
    * <b>OperationsClient,<br/>PrivateEndpointConnectionsClient,<br/>PrivateLinkResourcesClient</b>
* VaultsClient
    * listAsync()
    * listByResourceGroupAsync(java.lang.String resourceGroupName)
    * listBySubscriptionAsync()

</details>

<br/>
<details>
<summary> monitor </summary>

* <span style="color:red"><b>Fluent Required!!!</b></span>
    * <b>AlertRuleIncidentsClient,<br/>AlertRulesClient,<br/>BaselinesClient,<br/>LogProfilesClient,<br/>MetricAlertsStatusClient,<br/>MetricBaselinesClient,<br/>MetricNamespacesClient,<br/>OperationsClient,<br/>ScheduledQueryRulesClient,<br/>VMInsightsClient</b>
* ActivityLogsClient
    * listAsync(java.lang.String filter)

* MetricsClient
    * listAsync(java.lang.String resourceUri)

* TenantActivityLogsClient
    * listAsync()

</details>

<br/>
<details>
<summary> network </summary>

* <span style="color:red"><b>Fluent Required!!!</b></span>
    * <b>ApplicationGatewayPrivateEndpointConnectionsClient,<br/>ApplicationGatewayPrivateLinkResourcesClient,<br/>AvailableDelegationsClient,<br/>AvailableEndpointServicesClient,<br/>AvailablePrivateEndpointTypesClient,<br/>AvailableResourceGroupDelegationsClient,<br/>AvailableServiceAliasesClient,<br/>AzureFirewallFqdnTagsClient,<br/>AzureFirewallsClient,<br/>BastionHostsClient,<br/>BgpServiceCommunitiesClient,<br/>CustomIpPrefixesClient,<br/>DdosCustomPoliciesClient,<br/>DefaultSecurityRulesClient,<br/>DscpConfigurationsClient,<br/>ExpressRouteCircuitAuthorizationsClient,<br/>ExpressRouteCircuitConnectionsClient,<br/>ExpressRouteConnectionsClient,<br/>ExpressRouteGatewaysClient,<br/>ExpressRouteLinksClient,<br/>ExpressRoutePortsClient,<br/>ExpressRoutePortsLocationsClient,<br/>ExpressRouteServiceProvidersClient,<br/>FirewallPoliciesClient,<br/>FirewallPolicyRuleCollectionGroupsClient,<br/>FlowLogsClient,<br/>HubRouteTablesClient,<br/>HubVirtualNetworkConnectionsClient,<br/>InboundNatRulesClient,<br/>InboundSecurityRuleOperationsClient,<br/>IpAllocationsClient,<br/>IpGroupsClient,<br/>LoadBalancerBackendAddressPoolsClient,<br/>LoadBalancerFrontendIpConfigurationsClient,<br/>LoadBalancerLoadBalancingRulesClient,<br/>LoadBalancerNetworkInterfacesClient,<br/>LoadBalancerOutboundRulesClient,<br/>LoadBalancerProbesClient,<br/>NatGatewaysClient,<br/>NetworkInterfaceIpConfigurationsClient,<br/>NetworkInterfaceLoadBalancersClient,<br/>NetworkInterfaceTapConfigurationsClient,<br/>NetworkVirtualAppliancesClient,<br/>OperationsClient,<br/>P2SVpnGatewaysClient,<br/>PeerExpressRouteCircuitConnectionsClient,<br/>PrivateDnsZoneGroupsClient,<br/>PrivateLinkServicesClient,<br/>ResourceNavigationLinksClient,<br/>RouteFilterRulesClient,<br/>RoutesClient,<br/>SecurityPartnerProvidersClient,<br/>SecurityRulesClient,<br/>ServiceAssociationLinksClient,<br/>ServiceEndpointPoliciesClient,<br/>ServiceEndpointPolicyDefinitionsClient,<br/>ServiceTagsClient,<br/>SubnetsClient,<br/>VirtualApplianceSitesClient,<br/>VirtualApplianceSkusClient,<br/>VirtualHubBgpConnectionsClient,<br/>VirtualHubIpConfigurationsClient,<br/>VirtualHubRouteTableV2SClient,<br/>VirtualHubsClient,<br/>VirtualNetworkTapsClient,<br/>VirtualRouterPeeringsClient,<br/>VirtualRoutersClient,<br/>VirtualWansClient,<br/>VpnConnectionsClient,<br/>VpnGatewaysClient,<br/>VpnLinkConnectionsClient,<br/>VpnServerConfigurationsAssociatedWithVirtualWansClient,<br/>VpnServerConfigurationsClient,<br/>VpnSiteLinkConnectionsClient,<br/>VpnSiteLinksClient,<br/>VpnSitesClient,<br/>VpnSitesConfigurationsClient,<br/>WebApplicationFirewallPoliciesClient,<br/>WebCategoriesClient</b>
* ApplicationGatewaysClient
    * backendHealthAsync(java.lang.String resourceGroupName, java.lang.String applicationGatewayName)
    * backendHealthOnDemandAsync(java.lang.String resourceGroupName, java.lang.String applicationGatewayName, com.azure.resourcemanager.network.models.ApplicationGatewayOnDemandProbe probeRequest)
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String applicationGatewayName)

* ApplicationSecurityGroupsClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String applicationSecurityGroupName)

* ConnectionMonitorsClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String networkWatcherName, java.lang.String connectionMonitorName)

* DdosProtectionPlansClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String ddosProtectionPlanName)

* ExpressRouteCircuitsClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String circuitName)

* ExpressRouteCrossConnectionsClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String crossConnectionName)

* LoadBalancersClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String loadBalancerName)

* LocalNetworkGatewaysClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String localNetworkGatewayName)

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

* NetworkWatchersClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String networkWatcherName)

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

* VirtualNetworksClient
    * updateTagsAsync(java.lang.String resourceGroupName, java.lang.String virtualNetworkName)

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
<summary> resources </summary>

* <span style="color:red"><b>Fluent Required!!!</b></span>
    * <b>AuthorizationOperationsClient,<br/>OperationsClient,<br/>PolicySetDefinitionsClient,<br/>ResourceNamesClient,<br/>TagOperationsClient</b>
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

</details>

<br/>
<details>
<summary> search </summary>

* <span style="color:red"><b>Fluent Required!!!</b></span>
    * <b>OperationsClient,<br/>PrivateEndpointConnectionsClient,<br/>PrivateLinkResourcesClient,<br/>SharedPrivateLinkResourcesClient</b>
* ServicesClient
    * updateAsync(java.lang.String resourceGroupName, java.lang.String searchServiceName, com.azure.resourcemanager.search.models.SearchServiceUpdate serviceParam)

</details>

<br/>
<details>
<summary> servicebus </summary>

* <span style="color:red"><b>Fluent Required!!!</b></span>
    * <b>OperationsClient</b>
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

* <span style="color:red"><b>Fluent Required!!!</b></span>
    * <b>BackupLongTermRetentionPoliciesClient,<br/>BackupShortTermRetentionPoliciesClient,<br/>DataMaskingPoliciesClient,<br/>DataMaskingRulesClient,<br/>DatabaseBlobAuditingPoliciesClient,<br/>DatabaseOperationsClient,<br/>DatabaseVulnerabilityAssessmentRuleBaselinesClient,<br/>DatabaseVulnerabilityAssessmentScansClient,<br/>DatabaseVulnerabilityAssessmentsClient,<br/>ElasticPoolOperationsClient,<br/>ExtendedDatabaseBlobAuditingPoliciesClient,<br/>ExtendedServerBlobAuditingPoliciesClient,<br/>GeoBackupPoliciesClient,<br/>InstanceFailoverGroupsClient,<br/>InstancePoolsClient,<br/>JobAgentsClient,<br/>JobCredentialsClient,<br/>JobExecutionsClient,<br/>JobStepExecutionsClient,<br/>JobStepsClient,<br/>JobTargetExecutionsClient,<br/>JobTargetGroupsClient,<br/>JobVersionsClient,<br/>JobsClient,<br/>LongTermRetentionBackupsClient,<br/>LongTermRetentionManagedInstanceBackupsClient,<br/>ManagedBackupShortTermRetentionPoliciesClient,<br/>ManagedDatabaseRestoreDetailsClient,<br/>ManagedDatabaseSecurityAlertPoliciesClient,<br/>ManagedDatabaseSensitivityLabelsClient,<br/>ManagedDatabaseVulnerabilityAssessmentRuleBaselinesClient,<br/>ManagedDatabaseVulnerabilityAssessmentScansClient,<br/>ManagedDatabaseVulnerabilityAssessmentsClient,<br/>ManagedDatabasesClient,<br/>ManagedInstanceAdministratorsClient,<br/>ManagedInstanceEncryptionProtectorsClient,<br/>ManagedInstanceKeysClient,<br/>ManagedInstanceLongTermRetentionPoliciesClient,<br/>ManagedInstanceOperationsClient,<br/>ManagedInstanceTdeCertificatesClient,<br/>ManagedInstanceVulnerabilityAssessmentsClient,<br/>ManagedInstancesClient,<br/>ManagedRestorableDroppedDatabaseBackupShortTermRetentionPoliciesClient,<br/>ManagedServerSecurityAlertPoliciesClient,<br/>OperationsClient,<br/>PrivateEndpointConnectionsClient,<br/>PrivateLinkResourcesClient,<br/>RecoverableDatabasesClient,<br/>RecoverableManagedDatabasesClient,<br/>RestorableDroppedManagedDatabasesClient,<br/>SensitivityLabelsClient,<br/>ServerBlobAuditingPoliciesClient,<br/>ServerCommunicationLinksClient,<br/>ServerConnectionPoliciesClient,<br/>ServerVulnerabilityAssessmentsClient,<br/>SyncAgentsClient,<br/>TdeCertificatesClient,<br/>UsagesClient,<br/>VirtualClustersClient,<br/>WorkloadClassifiersClient,<br/>WorkloadGroupsClient</b>
* DatabasesClient
    * failoverAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String databaseName)

* ReplicationLinksClient
    * unlinkAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String databaseName, java.lang.String linkId)

* ServerDnsAliasesClient
    * acquireAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String dnsAliasName)

* TransparentDataEncryptionsClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String serverName, java.lang.String databaseName, com.azure.resourcemanager.sql.models.TransparentDataEncryptionName transparentDataEncryptionName)

</details>

<br/>
<details>
<summary> storage </summary>

* <span style="color:red"><b>Fluent Required!!!</b></span>
    * <b>EncryptionScopesClient,<br/>FileServicesClient,<br/>FileSharesClient,<br/>ObjectReplicationPoliciesOperationsClient,<br/>OperationsClient,<br/>PrivateEndpointConnectionsClient,<br/>PrivateLinkResourcesClient,<br/>QueueServicesClient,<br/>QueuesClient,<br/>TableServicesClient,<br/>TablesClient</b>
* BlobContainersClient
    * createOrUpdateImmutabilityPolicyAsync(java.lang.String resourceGroupName, java.lang.String accountName, java.lang.String containerName)
    * extendImmutabilityPolicyAsync(java.lang.String resourceGroupName, java.lang.String accountName, java.lang.String containerName, java.lang.String ifMatch)
    * getImmutabilityPolicyAsync(java.lang.String resourceGroupName, java.lang.String accountName, java.lang.String containerName)
    * leaseAsync(java.lang.String resourceGroupName, java.lang.String accountName, java.lang.String containerName)

* ManagementPoliciesClient
    * createOrUpdateAsync(java.lang.String resourceGroupName, java.lang.String accountName, com.azure.resourcemanager.storage.models.ManagementPolicyName managementPolicyName)

</details>

<br/>
<details>
<summary> trafficmanager </summary>

* <span style="color:red"><b>Fluent Required!!!</b></span>
    * <b>HeatMapsClient,<br/>TrafficManagerUserMetricsKeysClient</b>
</details>
