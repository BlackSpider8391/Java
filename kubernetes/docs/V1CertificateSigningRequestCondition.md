

# V1CertificateSigningRequestCondition

CertificateSigningRequestCondition describes a condition of a CertificateSigningRequest object
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**lastTransitionTime** | [**OffsetDateTime**](OffsetDateTime.md) | lastTransitionTime is the time the condition last transitioned from one status to another. If unset, when a new condition type is added or an existing condition&#39;s status is changed, the server defaults this to the current time. |  [optional]
**lastUpdateTime** | [**OffsetDateTime**](OffsetDateTime.md) | lastUpdateTime is the time of the last update to this condition |  [optional]
**message** | **String** | message contains a human readable message with details about the request state |  [optional]
**reason** | **String** | reason indicates a brief reason for the request state |  [optional]
**status** | **String** | status of the condition, one of True, False, Unknown. Approved, Denied, and Failed conditions may not be \&quot;False\&quot; or \&quot;Unknown\&quot;. | 
**type** | [**TypeEnum**](#TypeEnum) | type of the condition. Known conditions are \&quot;Approved\&quot;, \&quot;Denied\&quot;, and \&quot;Failed\&quot;.  An \&quot;Approved\&quot; condition is added via the /approval subresource, indicating the request was approved and should be issued by the signer.  A \&quot;Denied\&quot; condition is added via the /approval subresource, indicating the request was denied and should not be issued by the signer.  A \&quot;Failed\&quot; condition is added via the /status subresource, indicating the signer failed to issue the certificate.  Approved and Denied conditions are mutually exclusive. Approved, Denied, and Failed conditions cannot be removed once added.  Only one condition of a given type is allowed.  Possible enum values:  - &#x60;\&quot;Approved\&quot;&#x60; Approved indicates the request was approved and should be issued by the signer.  - &#x60;\&quot;Denied\&quot;&#x60; Denied indicates the request was denied and should not be issued by the signer.  - &#x60;\&quot;Failed\&quot;&#x60; Failed indicates the signer failed to issue the certificate. | 



## Enum: TypeEnum

Name | Value
---- | -----
APPROVED | &quot;Approved&quot;
DENIED | &quot;Denied&quot;
FAILED | &quot;Failed&quot;



