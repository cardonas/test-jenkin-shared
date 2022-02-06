def call(){
    return """
    timeout(time: 10, unit: 'MINUTES')
    disableConcurrentBuilds()
    buildDiscarder(
            logRotator(
                    artifactNumToKeepStr: '5',
                    numToKeepStr: '5'
            )
    )"""
}