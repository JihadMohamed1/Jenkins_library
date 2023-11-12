#!/usr/bin/env groovy

def call(){
   
  echo 'build jar stage'

   sh 'mvn clean install -U -Dmaven.test.failure.ignore=true'
}
