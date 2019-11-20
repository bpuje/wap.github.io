# Deployment 
The deployment has several steps:

#### Step 1 
Clone the source code inside of your Google Cloud Kubernetes Engine Cluster (GKE) from GitHub link:
 [GitHub](https://github.com/Rustem-bayetov/ea2)

#### Step 2
Open google cloud shell and run following command:
```
# cd MP2/deployment
```
#### Step 3
Push all docker images for all microservices

```
make docker-push-all  
```

#### Step 4
Create static public IP address for gateway!
```
make apply-static-IP
```




#### Step last
Assign all of services which are must be connect to Internet
create ingress proxy to map path to services
- example: 
    - http://web-static-ip/orders-service 
    - --> can be point to our orders-service inside k8s

```
make apply-ingress
```