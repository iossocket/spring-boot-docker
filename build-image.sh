#!/bin/bash -eu

VERSION="v$BUILD_NUMBER"

LOCAL_IMAGE_NAME=spring-boot-docker-spike

docker-compose --project-name my-app run --rm _base ./gradlew clean check build

docker build -t $LOCAL_IMAGE_NAME .
docker tag $LOCAL_IMAGE_NAME $LOCAL_IMAGE_NAME:$VERSION
