#!/usr/bin/env groovy
package com.example

import java.io.Serializable;

class Docker implements Serializable {
    def script

    Docker(script) {
        this.script = script
    }

    def buildDockerImage(String imageName) {
        script.sh "docker build -t $imageName . "
    }
    def DockerLogin(){
        script.withCredentials(
                [script.usernamePassword(
                        credentialsId: 'nexus_cred',
                        passwordVariable: 'PASS',
                        usernameVariable: 'USER'
                )]
        ) {
            script.sh "echo $script.PASS | docker login -u $script.USER --password-stdin 67.205.176.30:8083"
        }
    }
    def DockerPush(String imageName){
        script.sh "docker push  $imageName"
    }
}
