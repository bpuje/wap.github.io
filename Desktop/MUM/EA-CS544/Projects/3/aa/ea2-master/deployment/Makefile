#====create static ip address (if it created then apply it to k8s env)
gcloud-apply-static-ip:
	gcloud compute addresses create  web-static-ip --region us-central1

gcloud-delete-static-ip:
	gcloud compute addresses delete web-static-ip --region us-central1

gcloud-show-static-ip:
	gcloud compute addresses describe web-static-ip --region us-central1

kubectl-apply-ingress:
	kubectl apply -f basic-ingress.yaml

kubectl-delete-ingress:
	kubectl delete -f basic-ingress.yaml

docker-push-all:
	cd ../shared && mvn clean && mvn install
	cd ../auth_service && $(MAKE) docker-push
	cd ../orders_service && $(MAKE) docker-push
	cd ../pays_ba_service && $(MAKE) docker-push
	cd ../pays_cc_service && $(MAKE) docker-push
	cd ../pays_pp_service && $(MAKE) docker-push
	cd ../pays_service && $(MAKE) docker-push
	cd ../products_service && $(MAKE) docker-push
	cd ../ship_service && $(MAKE) docker-push
	cd ../stock_service && $(MAKE) docker-push
	cd ../users_service && $(MAKE) docker-push

kubectl-apply-all-services:
	kubectl apply -f ../auth_service/manifests/
	kubectl apply -f ../orders_service/manifests/
	kubectl apply -f ../pays_ba_service/manifests/
	kubectl apply -f ../pays_cc_service/manifests/
	kubectl apply -f ../pays_pp_service/manifests/
	kubectl apply -f ../pays_service/manifests/
	kubectl apply -f ../products_service/manifests/
	kubectl apply -f ../ship_service/manifests/
	kubectl apply -f ../stock_service/manifests/
	kubectl apply -f ../users_service/manifests/

kubectl-delete-all-services:
	kubectl delete -f ../auth_service/manifests/
	kubectl delete -f ../orders_service/manifests/
	kubectl delete -f ../pays_ba_service/manifests/
	kubectl delete -f ../pays_cc_service/manifests/
	kubectl delete -f ../pays_pp_service/manifests/
	kubectl delete -f ../pays_service/manifests/
	kubectl delete -f ../products_service/manifests/
	kubectl delete -f ../ship_service/manifests/
	kubectl delete -f ../stock_service/manifests/
	kubectl delete -f ../users_service/manifests/