
#!/usr/bin/env groovy

def call(){
    def script
    script.echo 'build jar stage'
    script.sh 'ls'
    script.sh ' cd MCS1'
    script.sh 'ls'
    script.sh 'mvn package -f MCS1/pom.xml'
}