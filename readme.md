# RENIEC IDaaS SDK for JAVA
With this client you can connect with our Identity as a Service (IDaaS).

Installation from central repository:
```
https://search.maven.org/artifact/com.github.pkiep-reniec/idaas_sdk_java/
```

Integration example:
https://github.com/pkiep-reniec/integration_java_example

More project details:
https://idaas.reniec.gob.pe/site/

## Basic params
#### Scopes
- profile
    - Return: doc, first_name.
	
- email
    - Return: email, email_verified.
	
- phone
    - Return: phone_number, phone_number_verified.
	
- offline_access
    - Offline access for a month.
	

#### ACR
- one_factor
    - Access with Clave Nacional | OTP Email | OTP SMS.
	
- two_factor
    - Access with Clave Nacional + OTP Email | OTP SMS.
	
- pki_dnie
    - Access with DNIe.
	
- pki_token
    - Access with PJ digital certificate.
	
- only_password
    - Access only with Clave Nacional.
	
- only_questions
    - Access only with secret questions.
	