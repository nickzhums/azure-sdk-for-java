. "${PSScriptRoot}\logging.ps1"
. "${PSScriptRoot}\Rest-Methods.ps1"

$DevOpsAPIBaseURI = "https://dev.azure.com/{0}/{1}/_apis/{2}/{3}?api-version=6.0"

function Get-RestMethodHeaders ($token) {
  $headers = @{
    Authorization = "Basic $token"
  }
  return $headers
}

function Start-Build {
  param (
    $Organization="azure-sdk",
    $Project="internal",
    [Parameter(Mandatory = $true)]
    $SourceBranch,
    [Parameter(Mandatory = $true)]
    $DefinitionId,
    [ValidateNotNullOrEmpty()]
    [Parameter(Mandatory = $true)]
    $AuthToken
  )

  $uri = "$DevOpsAPIBaseURI" -F $Organization, $Project , "build" , "builds"

  $body = @{
    sourceBranch = $SourceBranch
    definition = @{ id = $DefinitionId }
  }

  return Invoke-RestMethodPost -apiURI $uri -body $body -token $AuthToken
}

function Update-Build {

}

function Get-Builds {

}
