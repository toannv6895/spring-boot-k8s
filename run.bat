@REM Install minikube
choco install minikube

@REM Change context
docker context use default

@REM Create cluster and start with default context
minikube start --force
minikube start --driver=docker

@REM Build image
mvn clean package

@REM Build image with minikube
minikube image build -t spring-boot-k8s . --all

@REM Apply manifest to k8s
kubectl apply -f k8s.yaml

@REM Delete manifest to k8s
kubectl apply -f k8s.yaml

@REM Install dashboard for k8s
minikube dashboard

@REM Check service ip
minikube ip

@REM Get all information kubernetes
kubectl get all

@REM Change config
kubectl config get-contexts
kubectl config use-context docker-desktop

@REM Delete a service
kubectl delete service/backend-book-api

@REM Expose a nodeport deployment/service
kubectl expose deployment backend-book-api --type=NodePort

@REM Issues: ErrImageNeverPull: Rebuild docker image

@REM How to run?
@REM https://stackoverflow.com/questions/60710171/minikube-ip-is-not-reachable
minikube service book-api-service