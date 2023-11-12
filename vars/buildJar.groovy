#!/usr/bin/env groovy

def call(){
   
  echo 'build jar stage'
  sh 'ls'
   sh ' cd MCS1'
   sh 'ls'
   sh 'mvn clean install -U -Dmaven.test.failure.ignore=true'
}
